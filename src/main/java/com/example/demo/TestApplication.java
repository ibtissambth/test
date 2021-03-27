package com.example.demo;

import com.example.demo.exercices.Ex1;
import com.example.demo.exercices.Ex2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);

        int[] array = { 1, 2, 1, 3, 5, 1};
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.findFirstDuplicatedNumber(array));

        Ex2 ex2 = new Ex2();
        System.out.println(ex2.printString(2));

    }

}
