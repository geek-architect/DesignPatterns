package com.geekarchitect.patterns.command.demo04;

import com.geekarchitect.patterns.command.demo02.AppCodeEnum;
import com.geekarchitect.patterns.command.demo03.CommandImpl;
import com.geekarchitect.patterns.command.demo03.IAppClientV2;
import com.geekarchitect.patterns.command.demo03.ICommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Service
public class DegradeServiceImplV3 implements IDegradeServiceV3 {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeServiceImplV3.class);
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private ICommandManager commandManager;

    @Override
    public void offline(int appCode) {
        LOG.info("Service层——DegradeServiceImpl");
        Map<String, String> commandPara = new HashMap<String, String>();
        commandPara.put("appCode", String.valueOf(appCode));
        IAppClientV2 appClientV2 = null;
        switch (AppCodeEnum.getEnumByCode(appCode)) {
            case REVIEW: {
                appClientV2 = (IAppClientV2) applicationContext.getBean("reviewAppImplV2");
                break;
            }
            case RECOMMEND: {
                appClientV2 = (IAppClientV2) applicationContext.getBean("recommendAppImplV2");
                break;
            }
            default: {
                LOG.info("appCode {} 不存在");
            }
        }
        ICommand offlineCommand = new CommandImpl(commandPara, appClientV2);
        commandManager.addCommand(offlineCommand);
    }

}
