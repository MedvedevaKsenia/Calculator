package ru.kseniamedvedeva.calcapp._main;

import ru.kseniamedvedeva.calcapp.service.ResultWriterService;
import ru.kseniamedvedeva.calcapp.util.Calculator;

public class _Main {
    public static void main(String[] args) {

       int a = 333;
       int b = 33;

       ResultWriterService.printResult(a,b,Calculator.add(a,b),"plus");
       ResultWriterService.printResult(a,b,Calculator.subtract(a,b),"minus");
       ResultWriterService.printResult(a,b,Calculator.multiply(a,b),"x");
    }

}

