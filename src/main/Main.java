package src.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        System.out.println("Введите первое число:");
        int one = inputInt();
        System.out.println("Введите знак математической операции (+, -, /, *):");
        String operator = inputOperator();
        System.out.println("Введите второе число:");
        int two = inputInt();
        if (operator.equals("+"))
            plus(one, two);
        else if (operator.equals("-"))
            minus(one, two);
        else if (operator.equals("*"))
            multiplication(one, two);
        else if (operator.equals("/"))
        division(one, two);

    }

    public static int inputInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(reader.readLine());
        return data;
    }

    public static String inputOperator() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String operator = reader.readLine();
        return operator;
    }

    public void comparerOperator() {

    }
    public static void plus(int one, int two) {
        int result = one + two;
        System.out.println("Ответ: " + result);
    }
    public static void minus(int one, int two) {
        int result = one - two;
        System.out.println("Ответ: " + result);
    }
    public static void division(int one, int two) {
        int result = one / two;
        System.out.println("Ответ: " + result);
    }
    public static void multiplication(int one, int two) {
        int result = one * two;
        System.out.println("Ответ: " + result);
    }
}
