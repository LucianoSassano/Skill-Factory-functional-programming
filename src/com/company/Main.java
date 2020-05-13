package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        //Excersice 1

        //Write a function that receives an integer and returns its module

        Function<Integer, Integer> moduleOfNum = num -> num % 2;
        System.out.println("Modulo del numero => " + moduleOfNum.apply(55));

        //Excercise 2
        SupplierClass actualDateTime = new SupplierClass();
        actualDateTime.currentTime();

        //Excercise 3

        BiFunction<String,String,Integer> addStrings = (str1,str2) -> str1.length() + str2.length();
        System.out.println("Total amount of chars => " + addStrings.apply("java","python"));

    }
}
