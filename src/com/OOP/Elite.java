package com.OOP;

public class Elite extends Student {

    private String GPAA;

    public Elite() {
    }

    public Elite(String GPAA) {
        this.GPAA = GPAA;
    }

    public Elite(Long id, String name, String GPAA) {
        super(id, name);
        this.GPAA = GPAA;
    }

    public String getGPAA() {
        return GPAA;
    }

    public void setGPAA(String GPAA) {
        this.GPAA = GPAA;
    }
}
