package com.geekarchitect.patterns.command.demo03;

import com.geekarchitect.patterns.command.demo02.AppCodeEnum;
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
public class DegradeServiceImplV2 implements IDegradeServiceV2 {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeServiceImplV2.class);
    @Autowired
    private ApplicationContext applicationContext;

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
        offlineCommand.execute();
    }

}
