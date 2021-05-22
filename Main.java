package com.company;

public class Main {

    public static void main(String[] args) {

        int Steps = 10;

        int Fibonacci = CalcFibonacci(Steps);

        System.out.println("Fibonacci number is " + Fibonacci + " for step number " + Steps);
    }

    public static int CalcFibonacci (int TotalSteps){

        int Start = 0;
        int NextNum = 1;
        int Result = 0;

        for (int i = 1; i <= TotalSteps; i++) {

            System.out.println("current result " + Start + " for step number " + i);

            Result = Start + NextNum;

            Start = NextNum;

            NextNum = Result;
        }

        return Result;

    }
}
