package com.company.reflect;

import com.company.domain.Person;

import java.lang.reflect.Field;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/3 18:38
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //CLass.forName("全类名")
        Class person = Class.forName("com.company.domain.Person");
        Class person1 = Class.forName("com.company.reflect.Person1");
        //getFields只可以获取公共成员变量
        Field[] fields = person.getFields();
        System.out.println(fields);
        System.out.println(fields.toString());
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------");
        Field sex = person.getField("sex");
        System.out.println(sex);
        Person person2 = new Person();
        Object o = sex.get(person2);
        System.out.println(o);
        sex.set(person2,"女");
        Object o1 = sex.get(person2);
        Field version = person.getDeclaredField("version");
        version.setAccessible(true);//忽略访问权限修饰符的安全检查（暴力反射）
        System.out.println("暴力反射");
        Object o2 = version.get(person2);
        System.out.println(o2);
        version.set(person2,"私有成员变量版本");
        System.out.println(person2);
        System.out.println(o1);
//        Field version1 = person1.getField("version");
//        System.out.println(version1);
//        Field version = person.getField("version");
//        System.out.println(version);
        //不考虑修饰符，获取所有成员变量
        Field[] declaredFields = person.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

    }
}
