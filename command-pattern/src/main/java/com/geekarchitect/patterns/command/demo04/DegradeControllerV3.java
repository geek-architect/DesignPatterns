package com.geekarchitect.patterns.command.demo04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Controller
public class DegradeControllerV3 {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeControllerV3.class);
    @Autowired
    private IDegradeServiceV3 degradeServiceV3;

    public void offline(int appCode) {
        LOG.info("Controller层——DegradeController");
        degradeServiceV3.offline(appCode);
    }
}
