package ru.kseniamedvedeva.calcapp.service;

public class ResultWriterService {

    public static void printResult(int num1, int num2, int result, String operationName) {
        System.out.println(num1 + " " + operationName + " " + num2 + " = " + result);
    }
}
