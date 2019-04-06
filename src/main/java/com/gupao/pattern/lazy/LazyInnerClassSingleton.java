package com.gupao.pattern.lazy;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){}

    /**
     * static 为了使单例的空间共享
     * final 保证方法不会被重写
     * 返回结果前，一定会先加载内部类
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    /**
     * 1.内部类和静态内部类都是延时加载的，也就是说只有在明确用到内部类时才加载。只使用外部类时不加载。
     * 2.非静态内部类不能拥有 静态变量 静态语句 静态方法
     * 3.静态内部类无需外部类实例即可调用
     * 4.非静态内部类需要外部类实例调用
     */
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
