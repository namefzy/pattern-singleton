package com.gupao.pattern;

import com.gupao.pattern.lazy.LazySingletonInstance;

public class MyThread implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+LazySingletonInstance.getLazyInstance());
    }
}
