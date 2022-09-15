package com.geekarchitect.patterns.united.demo01;

import com.alibaba.fastjson2.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Redis主程序
 *
 * @author 极客架构师@吴念
 * @createTime 2022/9/6
 */
public class RedisServer {
    private static final Logger LOG = LoggerFactory.getLogger(RedisServer.class);
    /**
     * undo命令堆
     */
    private final Stack<IRedisCommand> undoStack = new Stack<>();
    /**
     * redo命令堆
     */
    private final Stack<IRedisCommand> redoStack = new Stack<>();
    /**
     * redis缓存数据
     */
    private Map<String, String> valueMap = new HashMap<>();


    public RedisServer() {
    }

    public void set(String key, String value) {
        valueMap.put(key, value);
    }

    public String get(String key) {
        return valueMap.get(key);
    }

    public String del(String key) {
        return valueMap.remove(key);
    }

    /**
     * 调用命令对象
     *
     * @param redisCommand
     */
    public void doCommand(IRedisCommand redisCommand) {
        IMemento beforeMemento = createMemento();
        redisCommand.execute();
        IMemento afterMemento = createMemento();
        redisCommand.backupMemento(beforeMemento, afterMemento);
        undoStack.push(redisCommand);

    }

    public void undo() {
        if (!undoStack.empty()) {
            IRedisCommand redisCommand = undoStack.pop();
            restoreMemento(redisCommand.getBeforeMemento());
            redoStack.push(redisCommand);
        }

    }

    public void redo() {
        if (!redoStack.empty()) {
            IRedisCommand redisCommand = redoStack.pop();
            restoreMemento(redisCommand.getAfterMemento());
            undoStack.push(redisCommand);
        }
    }

    /**
     * 创建快照
     *
     * @return
     */
    public IMemento createMemento() {
        IMemento memento = new RedisMemento(this);
        LOG.info("快照创建成功");
        return memento;
    }

    /**
     * 恢复快照
     *
     * @param memento
     */
    public void restoreMemento(IMemento memento) {
        RedisMemento redisMemento = (RedisMemento) memento;
        this.valueMap = JSON.parseObject(redisMemento.value, Map.class);
        LOG.info("快照恢复成功,memento={}", redisMemento.value);
    }

    /**
     * 快照实现类
     */
    private static class RedisMemento implements IMemento {
        private final String value;

        public RedisMemento(RedisServer redisServer) {
            this.value = JSON.toJSONString(redisServer.valueMap);
        }
    }

}
