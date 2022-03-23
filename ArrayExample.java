package com.capgemini.packg;

public class ArrayExample {
    static void muldim(){
        int b[][] = {{1,2,3},
                {4,5},
                {6,7,8,9}
                };
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
//        for(int i : a) {
//            System.out.println(i);
//        }
        int b[] = {1,2,3,4,5};//size is automatically initialized.
        muldim();
    }
}
