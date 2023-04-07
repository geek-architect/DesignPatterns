package com.geekarchitect.patterns.bridge.demo02;


public class Client {
    private IMutiDimensional mutiDimensional;
    public void service(){
        mutiDimensional.service();
    }

    public void setMutiDimensional(IMutiDimensional mutiDimensional) {
        this.mutiDimensional = mutiDimensional;
    }
}
