package src.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Введите первое число:");
            double one = inputInt();
            System.out.println("Введите знак математической операции (+, -, /, *):");
            String operator = inputOperator();
            System.out.println("Введите второе число:");
            double two = inputInt();
            switch (operator) {
                case "+" -> plus(one, two);
                case "-" -> minus(one, two);
                case "*" -> multiplication(one, two);
                case "/" -> division(one, two);
            }
        }

    }

    public static Double inputInt() throws IOException {
        double data;
        while (true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                data = Double.parseDouble(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число. Повторите ввод:");
            }
        }
        return data;
    }


    public static String inputOperator() throws IOException {
        String operator;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            operator = reader.readLine();
            List<String> data = new ArrayList<>();
            data.add("+");
            data.add("-");
            data.add("*");
            data.add("/");
            if (data.contains(operator))
                break;
            else
                System.out.println("Введенный символ не является знаком. Повторите ввод:");
        }
        return operator;

    }

    public static void plus(double one, double two) {
        double result = one + two;
        System.out.println("Ответ: " + result);
    }

    public static void minus(double one, double two) {
        double result = one - two;
        System.out.println("Ответ: " + result);
    }

    public static void division(double one, double two) {
        double result = one / two;
        System.out.println("Ответ: " + result);
    }

    public static void multiplication(double one, double two) {
        double result = one * two;
        System.out.println("Ответ: " + result);
    }
}