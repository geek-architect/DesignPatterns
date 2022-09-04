package com.geekarchitect.patterns.command.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Service
public class DegradeServiceImpl implements IDegradeService {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeServiceImpl.class);
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void offline(int appCode) {
        LOG.info("Service层——DegradeServiceImpl");
        switch (AppCodeEnum.getEnumByCode(appCode)) {
            case REVIEW: {
                IAppClient appClient = (IAppClient) applicationContext.getBean("reviewApp");
                appClient.offline();
                break;
            }
            case RECOMMEND: {
                IAppClient appClient = (IAppClient) applicationContext.getBean("recommendApp");
                appClient.offline();
                break;
            }
            default: {
                LOG.info("appCode {} 不存在");
            }
        }
    }

}
