package com.company.reflect;

import com.company.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/3 18:38
 */
public class ReflectDemo3 {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //CLass.forName("全类名")
        Class personClass = Class.forName("com.company.domain.Person");
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person18 = constructor.newInstance("构造对象", 18);
        System.out.println(person18);

        System.out.println("class空参对照");
        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
