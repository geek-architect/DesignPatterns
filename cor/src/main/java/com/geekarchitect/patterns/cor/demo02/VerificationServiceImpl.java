package com.geekarchitect.patterns.cor.demo02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Service
public class VerificationServiceImpl implements IVerificationService {
    private static final Logger LOG = LoggerFactory.getLogger(VerificationServiceImpl.class);
    @Autowired
    private IVerification verification;

    @Override
    public Boolean isLegalMember(Member member, Activity activity) {
        LOG.info("Service层");
        Boolean result = true;
        if (!verification.isPlus(member) || !verification.hasFollowedShop(member, activity) || !verification.HasBought(member, activity)) {
            result = false;
        }
        LOG.info("result={}", result);
        return result;
    }
}
