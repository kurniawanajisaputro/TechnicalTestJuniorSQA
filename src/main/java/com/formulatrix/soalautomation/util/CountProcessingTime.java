package com.formulatrix.soalautomation.util;/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-223.8214.52, built on March 21, 2024
@Author MSI a.k.a. Kurniawan Adji Saputro
Java Developer
Created on 15/12/2024 20:24
@Last Modified 15/12/2024 20:24
Version 1.0
*/

public class CountProcessingTime {
    private static long startProcessing = 1L;
    private static long startProcessingTwo = 1L;
    private static long endProcessing = 1L;
    private static long endProcessingTwo = 1L;

    public static void start (String processName) {
        System.out.println("Proses "+processName+" Dimulai");
        startProcessing = System.currentTimeMillis();
    }

    public static long startWithReturn () {
        startProcessingTwo = System.currentTimeMillis();
        return startProcessingTwo;
    }

    public static void end(){
//        endProcessing = (System.currentTimeMillis()-startProcessing)/1000;
        endProcessing = (System.currentTimeMillis()-startProcessing);
        System.out.println("Selesai Dalam "+endProcessing+" ms");
    }

    public static long endWithReturn(){
        return endProcessingTwo = (System.currentTimeMillis()-startProcessingTwo);
    }
}
