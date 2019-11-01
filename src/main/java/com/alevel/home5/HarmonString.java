package com.alevel.home5;

import static javafx.application.Platform.exit;

//169
public class HarmonString {
    private static final double j = 0.577;
    private int ch;
    private int zn;

    public HarmonString() {
        this.ch = 1;
        this.zn = 1;
    }

    public HarmonString(int ch, int zn) {

        if (zn == 0) exit();
        this.ch = ch;
        this.zn = zn;
    }

    public HarmonString Rational(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        zn = (int) Math.pow(10, digitsDec);
        double tmpch = d * zn;
        ch = (int)tmpch;
        return this;
    }

    public HarmonString sum(int n) {
        return this.Rational(Math.log(n) + j);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        HarmonString d = (HarmonString)obj;
        return (double)d.ch/d.zn == (double)ch/zn;
    }
}
