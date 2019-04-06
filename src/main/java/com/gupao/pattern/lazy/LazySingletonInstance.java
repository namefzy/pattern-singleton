package com.gupao.pattern.lazy;

/**
 * 懒汉模式
 * 调用的时候才去拿
 */
public class LazySingletonInstance {
    private static  LazySingletonInstance instance;


    private LazySingletonInstance(){}

    /**
     * 问题：线程不安全
     * @return
     */
//    public  static LazySingletonInstance getLazyInstance(){
//        if(null == instance){
//            instance = new LazySingletonInstance();
//        }
//        return instance;
//    }

    /**
     *问题：单例的对象锁是同一个，影响其他方法调用，性能差
     *
     * @return
     */
//    public synchronized static LazySingletonInstance getLazyInstance(){
//        if(null == instance){
//            instance = new LazySingletonInstance();
//        }
//        return instance;
//    }

    /**
     *双重check:
     * 版本1：只有外层判断
     *  线程A和线程B同时进入synchronized代码块上，此时A B 中instance皆为null；
     *  当线程A执行完毕后，由于instance为null，依然会重新创建对象
     * 坂本2：只有内层判断
     *  消耗性能
     *
     *  弊端：
     *      由于线程可见性，在线程A初始化完毕后，线程B读到的可能不为null，直接返回instance,
     *  此时instance还没有指向内存地址
     *  产生原因：
     *  jvm创建对象（线程可见性、创建对象没有实现原子性操作）
     *      1.分配内存给这个对象
     *      2.初始化对象（第三步还没有执行，就执行了线程B的逻辑）
     *      3.设置lazy指向刚分配的内存地址
     * @return
     */
    public  static LazySingletonInstance getLazyInstance(){
        if(null == instance){
            synchronized(LazySingletonInstance.class){
                if(null == instance){
                    instance = new LazySingletonInstance();
                }
                return instance;
            }
        }
        return instance;
    }

}
