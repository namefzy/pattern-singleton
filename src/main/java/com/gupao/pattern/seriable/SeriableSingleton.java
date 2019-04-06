package com.gupao.pattern.seriable;

import java.io.Serializable;

/**
 * 序列化实现单例
 * 序列化将内存中的状态转换成字节码；
 * 反序列化将字节码转换成io流，将读取的内容转换成java对象
 */
public class SeriableSingleton implements Serializable {
    private final static SeriableSingleton instance = new SeriableSingleton();
    private SeriableSingleton(){}
    public static SeriableSingleton getInstance(){
        return instance;
    }
}
