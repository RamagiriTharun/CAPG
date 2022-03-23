package com.capgemini.packg;

public class AccessSpecifer {
    public int i;
    private int j;
    protected int k;
    int l;
}
class ABC{
    public static void main(String[] args) {
        AccessSpecifer obj = new AccessSpecifer();
        obj.i = 0;// public can be accessed globally
        obj.k = 9; // protected can be accessed outside the class also
//        obj.j = 2;// private can't be accessed outside the class

    }
}
