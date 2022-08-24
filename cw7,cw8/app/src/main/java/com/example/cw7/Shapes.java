package com.example.cw7;

import java.io.Serializable;

public class Shapes implements Serializable {
 private String SS1;
 private int SS2;
 private int SS3;

    public String getSS1() {
        return SS1;
    }

    public void setSS1(String SS1) {
        this.SS1 = SS1;
    }

    public int getSS2() {
        return SS2;
    }

    public void setSS2(int SS2) {
        this.SS2 = SS2;
    }

    public int getSS3() {
        return SS3;
    }

    public void setSS3(int SS3) {
        this.SS3 = SS3;
    }

    public Shapes(String SS1, int SS2, int SS3) {
        this.SS1 = SS1;
        this.SS2 = SS2;
        this.SS3 = SS3;
    }
}
