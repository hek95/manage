package com.qf;

/**
 * @author liuq
 * @Date 2019/9/27
 */
public class A {
    public static int i;
    public static A a = new A();
    public static int j=5;

    public A (){
        i++;
        j++;
    }
    public static A getInstance(){
        return a;
    }
    public void m(){
        System.out.println("i="+i+",j="+j);
    }

    public static void main(String[] args) {
        A a = A.getInstance();
        a.m();
    }


}
