package com.geekarchitect.patterns.command.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/8/29
 */
@Controller
public class DegradeController {
    private static final Logger LOG = LoggerFactory.getLogger(DegradeController.class);
    @Autowired
    private IDegradeService degradeService;

    public void offline(int appCode) {
        LOG.info("Controller层——DegradeController");
        degradeService.offline(appCode);
    }
}
