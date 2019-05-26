package com.sda.algorytmy;

import java.util.HashMap;

public class HashExample {
    public static void main(String[] args) {

        Student studen1 = new Student("Mateusz", "Erdman", 1);
        Student studen2 = new Student("Mateusz", "Erdman", 1);
        System.out.println(studen1.equals(studen2));

        System.out.println(studen1.hashCode());
        System.out.println(studen2.hashCode());


    }
}
