package com.geekarchitect.patterns.command.demo03;

import com.geekarchitect.patterns.command.demo04.DegradeServiceImplV3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
public class CommandImpl implements ICommand {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeServiceImplV3.class);
    private final Map<String, String> commandPara;
    private final IAppClientV2 appClientV2;

    public CommandImpl(Map<String, String> commandPara, IAppClientV2 appClientV2) {
        this.commandPara = commandPara;
        this.appClientV2 = appClientV2;
    }

    @Override
    public void execute() {
        LOG.info("入参commandPara={}", commandPara.toString());
        this.appClientV2.offline(commandPara);
    }
}
