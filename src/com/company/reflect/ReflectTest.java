package com.company.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/6 17:27
 */
public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.加载配置文件
        //1.1创建properties对象
        Properties properties = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1加载配置文件，转换为一个集合
        ClassLoader classLoader = ReflectTest.class.getClassLoader();//获取字节码文件对应的类加载器，使用类加载器加进内存
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);

        //2获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String method = properties.getProperty("method");
        System.out.println(className);
        System.out.println(method);

        //3加载该类进内存
        Class aClass = Class.forName(className);
        //4创建对象
        Object o = aClass.newInstance();
        //获取方法对象
        Method method1 = aClass.getMethod(method);
        //执行方法
        method1.invoke(o);

    }
}
