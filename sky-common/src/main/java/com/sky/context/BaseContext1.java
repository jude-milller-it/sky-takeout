package com.sky.context;

/**
 * ApplicationContext是 Spring 的全局容器，管 Bean 的生命周期，和 “请求” 无关；
 * BaseContext是基于ThreadLocal的线程/请求级数据工具类，用于传递当前请求的业务数据（如用户 ID）；
 */
public class BaseContext1 {
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    public static void setThreadLocal(Long id){
        threadLocal.set(id);
    }
    public static Long getThreadLocal(){
        return threadLocal.get();
    }
    public static void removeThreadLocal(){
        threadLocal.remove();
    }
}
