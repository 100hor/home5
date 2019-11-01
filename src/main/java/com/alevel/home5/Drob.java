package com.alevel.home5;

import javax.security.auth.callback.TextInputCallback;

import static javafx.application.Platform.exit;

//OneHundredEightyfour
public class Drob {
    private int ch;
    private int zn;

    public int getCh() {
        return ch;
    }

    public int getZn() {
        return zn;
    }


    public Drob() {
        this.ch = 1;
        this.zn = 1;
    }

    public Drob(Drob d) {
        this.ch = d.ch;
        this.zn = d.zn;
    }

    public Drob(int ch, int zn) {
        if (zn == 0) exit();
        this.ch = ch;
        this.zn = zn;
    }

    public Drob sum(Drob d) {
        Drob res = new Drob();
        res.ch = ch * d.zn + d.ch * zn;
        res.zn = zn * d.zn;
        return res;
    }

    public Drob sub(Drob d) {
        Drob res = new Drob();
        res.ch = ch * d.zn - d.ch * zn;
        res.zn = zn * d.zn;
        return res;
    }

    public Drob mult(Drob d) {
        Drob res = new Drob();
        res.ch = ch * d.ch;
        res.zn = zn * d.zn;
        return res;
    }

    public Drob div(Drob d) {
        Drob res = new Drob();
        res.ch = ch * d.zn;
        res.zn = zn * d.ch;
        return res;
    }

    public Drob reduction() {

        for (long i = 2; i <= Math.min(ch, zn); i++) {
            if (ch % i == 0 && zn % i == 0) {
                ch /= i;
                zn /= i;
            }

        }
        return this;
    }

    public Drob powDrob(int n) {
        ch = (int) Math.pow(ch, n);
        zn = (int) Math.pow(zn, n);
        return this;
    }

    public boolean equalDrob(Drob d) {
        if ((double) ch / zn == (double) d.ch / d.zn)
            return true;
        else return false;

    }

    public boolean moreThen(Drob d) {
        if ((double) ch / zn > (double) d.ch / d.zn)
            return true;
        else return false;

    }

    static public Drob[] sortMassDrob(Drob[] arr) {
        Drob tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].moreThen(arr[j])) {
                    tmp = new Drob(arr[j]);
                    arr[j] = new Drob(arr[i]);
                    arr[i] = new Drob(tmp);
                }
            }
        }
        return arr;
    }

    public void print() {
        System.out.println(ch + "/" + zn);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Drob d = (Drob)obj;
        return (double)d.ch/d.zn == (double)ch/zn;
    }

    public static void main(String[] args) {
        Drob[] result = sortMassDrob(new Drob[]{new Drob(1, 2), new Drob(3, 5), new Drob(4, 7), new Drob(8, 9)});

        for (int i = 0; i < result.length; i++) {
            result[i].print();
        }
    }

}


