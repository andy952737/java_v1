package com.staticlesion;

class AccessStaticVariable {
    int age;
    String name;

    // This is an instance method
    void disp() {
        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);
    } 

    // This is a static method
    public static void main(String args[]) {
        AccessStaticVariable instance = new AccessStaticVariable();
        instance.age = 30;
        instance.name = "Steve";
        instance.disp();
    }
}
