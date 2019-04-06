package com.gupao.pattern;

import com.gupao.pattern.MyThread;
import com.gupao.pattern.MyThread1;

public class TestLazySingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread1());
        thread1.start();
        thread2.start();
    }
}
