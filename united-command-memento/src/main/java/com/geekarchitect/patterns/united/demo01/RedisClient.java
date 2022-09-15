package com.geekarchitect.patterns.united.demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/10
 */
public class RedisClient extends Thread {
    private static final Logger LOG = LoggerFactory.getLogger(RedisClient.class);
    private final RedisServer redisServer;


    public RedisClient(RedisServer redisServer) {
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
                IRedisCommand redisCommand = new SetCommand(redisServer);
                redisCommand.setKey(key);
                redisCommand.setValue(value);
                redisServer.doCommand(redisCommand);
                LOG.info("客户端写入： key={} value={}", key, value);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 1000, 500);
    }
}
