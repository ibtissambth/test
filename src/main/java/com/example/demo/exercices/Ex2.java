package com.example.demo.exercices;

public class Ex2 {

    /*
    * Print a String without using a loop data structure
    * Instead we are using recursion (a method that calls itself n times)
    * */
    public String printString(int n) {
        if (n > 0) {
            return "a" + printString(n-1) + "b";
        }
        return "";
    }
}
