package com.company.singleton;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/7/23 17:22
 */
public class LazySingletonTest
{
    public static void main(String[] args) {
        LazySingleTon instance = LazySingleTon.getInstance();

    }
}

class LazySingleTon{
    private static LazySingleTon instance;
    private LazySingleTon(){
    }
    public static  LazySingleTon getInstance(){
        if (instance == null){
            instance = new LazySingleTon();
        }
        return instance;
    }
}
