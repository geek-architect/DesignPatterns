package com.geekarchitect.patterns.cor.demo04;

import com.geekarchitect.patterns.cor.demo02.Activity;
import com.geekarchitect.patterns.cor.demo02.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Service
public class VerificationServiceImplV3 implements IVerificationServiceV3 {
    private static final Logger LOG = LoggerFactory.getLogger(VerificationServiceImplV3.class);

    @Autowired
    private ActivityCommandChainA activityCommandChainA;

    @Override
    public Boolean isLegalMember(Member member, Activity activity) {
        LOG.info("Service层");
        //封装请求对象
        ActivityContext activityContext = new ActivityContext();
        activityContext.setMember(member);
        activityContext.setActivity(activity);
        boolean result = false;
        try {
            activityCommandChainA.execute(activityContext);
        } catch (Exception e) {
            LOG.info("异常信息 {}", e);
        }
        //获取处理结果
        result = activityContext.isResult();
        LOG.info("result={}", result);
        return result;
    }
}
