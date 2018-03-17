package com.company;

public class MatrixPrint {
    public static void main(String args[]){
    int m [][] = new int[5][5];

    int a = 1;

    for(int i = 0;i < m.length;i++){
        for(int j = 0;j < m.length;j++){
            if(i == j |(i + j == m.length - 1)){
                System.out.print("*"+" ");
            }

            else if( a < 10 ){

                System.out.print(" "+a+" ");

            }
            else{
                System.out.print(a+" ");
            }
            a+=1;
        }
        System.out.println();
    }

    }
}
