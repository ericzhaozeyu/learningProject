package com.company.reflect;

import com.company.domain.Person;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/3 18:38
 */
public class ReflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //CLass.forName("全类名")
        Class aClass = Class.forName("com.company.domain.Person");
        System.out.println(aClass);

        //类名.class
        Class personClass = Person.class;
        System.out.println(personClass);
        //对象.getClass
        Person person = new Person();
        Class aClass1 = person.getClass();
        System.out.println(aClass1);

        Person per = new Person("赵哥", 18);
        Class aClass2 = per.getClass();
        System.out.println(aClass2);

        //==比较
        System.out.println(aClass == personClass);
        System.out.println(aClass1 == aClass2);
    }
}
