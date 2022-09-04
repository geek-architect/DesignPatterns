package com.geekarchitect.patterns.command.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Controller
public class DegradeControllerV2 {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeControllerV2.class);
    @Autowired
    private IDegradeServiceV2 degradeServiceV2;

    public void offline(int appCode) {
        LOG.info("Controller层——DegradeController");
        degradeServiceV2.offline(appCode);
    }
}
