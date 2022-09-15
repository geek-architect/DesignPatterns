package com.geekarchitect.patterns.united.demo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static org.junit.jupiter.api.Assertions.*;

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
    void doCommand() {
        RedisServer redisServer=new RedisServer();
        RedisClient redisClient=new RedisClient(redisServer);
        UndoRedoThread undoRedoThread=new UndoRedoThread(redisServer);
        redisClient.start();
        undoRedoThread.start();
        try {
            LOG.info("等待中... ");
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/**
 * undo redo线程
 */
class UndoRedoThread extends Thread {
    private static final Logger LOG = LoggerFactory.getLogger(UndoRedoThread.class);
    private final RedisServer redisServer;
    private final Random random = new Random();

    public UndoRedoThread(RedisServer redisServer) {
        this.redisServer = redisServer;
    }

    @Override
    public void run() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                int randomNum=random.nextInt(10);
                if (randomNum<3) {
                    LOG.info("条件成熟：undo");
                    redisServer.undo();
                }else if(randomNum>7){
                    LOG.info("条件成熟：redo");
                    redisServer.redo();
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 2000, 1000);
    }
}