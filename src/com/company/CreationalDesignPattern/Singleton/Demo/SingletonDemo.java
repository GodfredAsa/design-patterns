package com.company.CreationalDesignPattern.Singleton.Demo;

public class SingletonDemo {
    public static void main(String[] args) {
        DbSingleton firstInstance = DbSingleton.getInstance();

        System.out.println(firstInstance);

        DbSingleton secondInstance = DbSingleton.getInstance();
        System.out.println(secondInstance);

        if(firstInstance==secondInstance){
            System.out.println("they are the same ");
        }
    }
}
