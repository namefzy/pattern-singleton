package com.gupao.pattern;

import com.gupao.pattern.lazy.LazySingletonInstance;

public class MyThread1 implements Runnable {
    public void run() {
//        LazySingletonInstance instance = new LazySingletonInstance();
//        LazySingletonInstance.demo();
//        LazySingletonInstance.getLazyInstance().demo1();
        System.out.println(Thread.currentThread().getName()+":"+LazySingletonInstance.getLazyInstance());
    }
}
