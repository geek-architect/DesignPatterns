package com.geekarchitect.patterns.cor.demo03;

import com.geekarchitect.patterns.cor.demo02.Activity;
import com.geekarchitect.patterns.cor.demo02.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/16
 */
@Service
public class VerificationServiceImplV2 implements IVerificationServiceV2, InitializingBean {
    private static final Logger LOG = LoggerFactory.getLogger(VerificationServiceImplV2.class);

    private IVerificationHandler verificationHandler;
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Boolean isLegalMember(Member member, Activity activity) {
        LOG.info("Service层");
        //封装请求对象
        Request request = new Request();
        request.setMember(member);
        request.setActivity(activity);
        //发送请求
        Boolean result = verificationHandler.handleRequest(request).getIsOk();
        LOG.info("result={}", result);
        return result;
    }

    /**
     *将请求处理者串联起来，创建请求处理者链
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        IsPlusHandler isPlusHandler = (IsPlusHandler) applicationContext.getBean("isPlusHandler");
        HasFollowedShopHandler hasFollowedShopHandler = (HasFollowedShopHandler) applicationContext.getBean("hasFollowedShopHandler");
        HasBoughtHandler hasBoughtHandler = (HasBoughtHandler) applicationContext.getBean("hasBoughtHandler");
        isPlusHandler.setSuccessor(hasFollowedShopHandler);
        hasFollowedShopHandler.setSuccessor(hasBoughtHandler);
        this.verificationHandler = isPlusHandler;
    }
}
