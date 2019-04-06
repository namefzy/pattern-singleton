package com.gupao.pattern.threadlocal;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance1 = new ThreadLocal<>();
    private ThreadLocalSingleton(){}
    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
