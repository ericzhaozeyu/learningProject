package com.company.reflect;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/3 18:32
 */
public class Person1 {
    private String name;
    private int age;
    public String sex;
    public String seize;
    protected String version;
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person1() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
