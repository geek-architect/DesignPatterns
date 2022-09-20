package com.geekarchitect.patterns.cor.demo04;

import com.geekarchitect.patterns.cor.demo02.Activity;
import com.geekarchitect.patterns.cor.demo02.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Controller
public class ActivityControllerV3 {
    private static final Logger LOG = LoggerFactory.getLogger(ActivityControllerV3.class);
    @Autowired
    private IVerificationServiceV3 verificationServiceV3;

    public String verification(Long memberId, Long activityId) {
        LOG.info("Controller层");
        Member member = new Member();
        member.setId(memberId);
        Activity activity = new Activity();
        activity.setId(activityId);
        Boolean result = verificationServiceV3.isLegalMember(member, activity);
        LOG.info("会员{},活动{},是否有资格参与该活动{}", memberId, activityId, result);
        return "";
    }
}
