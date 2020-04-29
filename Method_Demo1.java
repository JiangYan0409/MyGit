package com.itheima.demo;

public class Method_Demo1 {
    public static void main(String[] args){
        print();
    }
  private static void print(){
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                System.out.print("*");
            }
            System.out.println();
        }
  }
}
