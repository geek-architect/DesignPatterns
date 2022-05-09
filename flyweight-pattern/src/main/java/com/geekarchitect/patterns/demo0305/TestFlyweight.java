package com.geekarchitect.patterns.demo0305;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/9
 */
public class TestFlyweight {
    public static void main(String[] args) {
        TestFlyweight testFlyweight=new TestFlyweight();
        testFlyweight.fineGrainedRolePlayLeadTest();
        testFlyweight.flyweightPlayLeadTest();

    }
    public void fineGrainedRolePlayLeadTest(){
        ClientRole clientRole=new ClientRole();
        clientRole.fineGrainedRolePlayLead();
    }
    public void flyweightPlayLeadTest(){
        ClientRole clientRole=new ClientRole();
        clientRole.flyweightPlayLead();
    }

}
