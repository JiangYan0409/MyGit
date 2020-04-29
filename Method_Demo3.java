package com.itheima.demo;

public class Method_Demo3 {
    public static void main(String[] args){
        boolean bool=compare(3,8);
        System.out.println(bool);
    }
    public static boolean compare(int a,int b){
        if(a==b){
            return true;
        }else {
            return false;
        }
    }
}
