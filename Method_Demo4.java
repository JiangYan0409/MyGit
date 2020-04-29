package com.itheima.demo;

public class Method_Demo4 {
    public static void main(String[] args){
        int sum=getSum();
        System.out.println(sum);
        double multiply=getMultiply();
        System.out.println(multiply);
        int sub=getSubtract();
        System.out.println(sub);
    }
    public static int getSum(){
        int sum=0;
        for(int i=1;i<101;i++)
            sum+=i;
        return sum;
    }
    public static double getMultiply(){
        double multiply=1.0;
        for(int i=1;i<10;i++){
            multiply *=i;
        }
        return multiply;
    }
    public static int getSubtract(){
        int sub=0;
        sub=5-3;
        return sub;
    }


}


