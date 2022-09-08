package com.geekarchitect.patterns.memento.demo02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootTest
class RedisServerTest {
    private static final Logger LOG = LoggerFactory.getLogger(RedisServerTest.class);
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void redisBackupRestoreMock() {
        RedisServer redisServer = new RedisServer();
        RDB rdb = new RDB(redisServer);
        ClientThread clientThreadA=new ClientThread(redisServer);
        BackupThread backupThreadA=new BackupThread(redisServer,rdb);
        RestoreThread restoreThreadA=new RestoreThread(redisServer,rdb);
        clientThreadA.start();
        backupThreadA.start();
        restoreThreadA.start();
        try {
            LOG.info("等待中... ");
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 客户线程：每隔1秒钟，随机写入缓存
 */
class ClientThread extends Thread {
    private static final Logger LOG = LoggerFactory.getLogger(ClientThread.class);
    private final RedisServer redisServer;

    public ClientThread(RedisServer redisServer) {
        this.redisServer = redisServer;
    }

    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String key = String.valueOf(calendar.getTimeInMillis());
                String value = dateFormat.format(calendar.getTime());
                redisServer.set(key, value);
                LOG.info("客户端写入： key={} value={}", key, value);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 1000, 500);
    }
}

/**
 * 备份线程
 */
class BackupThread extends Thread {
    private static final Logger LOG = LoggerFactory.getLogger(BackupThread.class);
    private final RedisServer redisServer;
    private final RDB rdb;

    public BackupThread(RedisServer redisServer, RDB rdb) {
        this.redisServer = redisServer;
        this.rdb = rdb;
    }

    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                rdb.backup();
                LOG.info("数据备份成功");
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 2000, 1000);
    }
}

/**
 * 恢复线程
 */
class RestoreThread extends Thread {
    private static final Logger LOG = LoggerFactory.getLogger(RestoreThread.class);
    private final RedisServer redisServer;
    private final RDB rdb;

    private final Random random = new Random();

    public RestoreThread(RedisServer redisServer, RDB rdb) {
        this.redisServer = redisServer;
        this.rdb = rdb;
    }

    public boolean isRestore(){
       return random.nextInt(5)==3;
    }

    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (isRestore()) {
                    LOG.info("条件成熟：恢复数据");
                    rdb.restore();
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 3000, 1000);
    }
}
