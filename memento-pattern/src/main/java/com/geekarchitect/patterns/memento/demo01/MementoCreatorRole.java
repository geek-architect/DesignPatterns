package com.geekarchitect.patterns.memento.demo01;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/9/6
 */
public class MementoCreatorRole {
    private String state="";
    public IMementoRole createMementoRole(){
        return new MementoRoleImpl(this.state);
    }
    public void setMementoRole(IMementoRole mementoRole){
        MementoRoleImpl mementoRoleImpl=(MementoRoleImpl)mementoRole;
        this.state= mementoRoleImpl.state;
    }
    private static class MementoRoleImpl implements IMementoRole{
        private String state;

        public MementoRoleImpl(String state) {
            this.state = state;
        }
    }
}
