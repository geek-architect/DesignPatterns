package com.geekarchitect.patterns.command.demo04;

import com.geekarchitect.patterns.command.demo03.ICommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/30
 */
@Component
public class CommandManagerImpl implements ICommandManager {
    private static final Logger LOG = LoggerFactory.getLogger(CommandManagerImpl.class);
    private final List<ICommand> commandList = new ArrayList<>();

    public CommandManagerImpl() {
        startTimeJob();
    }

    @Override
    public void addCommand(ICommand offlineCommand) {
        LOG.info("添加命令 offlineCommand = {}", offlineCommand.toString());
        commandList.add(offlineCommand);
    }

    public void startTimeJob() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                while (commandList.size() > 0) {
                    ICommand offlineCommand = commandList.remove(0);
                    offlineCommand.execute();
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 3000, 1000);
    }
}
