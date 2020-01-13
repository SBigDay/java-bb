package com.program.shop.service;

import java.util.Arrays;
import java.util.List;

public class Lambda {


    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        String a="";
        for (Object feature : features) {
            a+=feature;
        }
        System.out.println(a);
        features.forEach(n-> System.out.println(n));
        new Thread(()-> System.out.println("执行线程")).start();
    }
}
