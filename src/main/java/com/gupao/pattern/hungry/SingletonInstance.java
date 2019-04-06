package com.gupao.pattern.hungry;

/**
 * 饿汉模式
 * 1.隐藏构造方法
 * 2.提供一个全局的访问点
 * 缺点：资源浪费
 */
public class SingletonInstance {
    private static SingletonInstance instance = new SingletonInstance();

    private SingletonInstance(){

    }
    public static SingletonInstance getInstance(){
        return instance;
    }
}
