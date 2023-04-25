package com.geekarchitect.patterns.proxy.demo01;

public class Client {
    private IOriginal original;
    public void service(){
        original.service();
    }

    public IOriginal getOriginal() {
        return original;
    }

    public void setOriginal(IOriginal original) {
        this.original = original;
    }
}
