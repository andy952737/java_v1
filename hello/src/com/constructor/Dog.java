package com.constructor;

import define.DefineMethod;

public class Dog {
    String breed;
    String size;
    int age;
    String color;

    // 有參數的建構子
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    // 沒有參數的建構子
    public Dog() {
        // 可以在這裡初始化默認值，或者保持屬性為 null 或 0
    }

    // 另一個有參數的建構子
    public Dog(String breed) {
        this.breed = breed;
    }

    // setBreed 方法
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // setAge 方法
    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "Breed: " + breed + ", Size: " + size + ", Age: " + age + ", Color: " + color;
    }

    public static void main(String[] args) {
        Dog maltese = new Dog();
        maltese.setBreed("Maltese");
        maltese.setAge(2);
        System.out.println("Dog 1: " + maltese.getInfo());

        Dog goldenRetriever = new Dog("Golden Retriever", "Large", 5, "Golden");
        System.out.println("Dog 2: " + goldenRetriever.getInfo());

        Dog blacksmall = new Dog("Pit Bull", "Small", 5, "Black");
        System.out.println("Dog 3: " + blacksmall.getInfo());
    }
}



