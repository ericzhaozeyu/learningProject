package com.company.domain;

/**
 * @author EricZhao
 * @version 1.0
 * @Description
 * @date 2021/8/3 18:32
 */
public class Person {
    private String name;
    private int age;
    public String sex;
    public String seize;
    private String version;
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


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person() {
    }
    public void eat(String food){
        System.out.println("吃"+food);
    }

    public void eatFood(){
        System.out.println("吃");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", seize='" + seize + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
