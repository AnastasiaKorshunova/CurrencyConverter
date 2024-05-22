package com.ursus;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter currency from:");
            Currency currencyFrom = Currency.valueOf(scanner.nextLine());
            System.out.println("Enter currency to:");
            Currency currencyTo = Currency.valueOf(scanner.nextLine());

            System.out.println("Enter currency value:");
            BigDecimal value =  new BigDecimal(scanner.nextLine());

            Converter converter = new ConverterImpl();
            System.out.println(converter.convert(value, currencyFrom, currencyTo));
        }
    }
}
