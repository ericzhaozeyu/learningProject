package com.company.reflect;

import com.company.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/3 18:38
 */
public class ReflectDemo4 {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //CLass.forName("全类名")
        Class personClass = Class.forName("com.company.domain.Person");
        //该方法的第一个参数name是要获得方法的名字，第二个参数parameterTypes是按声明顺序标识该方法的形参类型。
        Method eat = personClass.getMethod("eat",String.class);
        Person o = (Person) personClass.newInstance();
        Object o1 = personClass.newInstance();
        Person person = new Person();
        Method eatFood = personClass.getMethod("eatFood");
        eat.invoke(person,"粑粑");
        eatFood.invoke(person);
        eatFood.invoke(o);
        eatFood.invoke(o1);

    }
}
