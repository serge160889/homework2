package com.company;

public class Main {

    public static void main(String[] args) {
        int month = 5;
        if (month == 12) {
            System.out.println("Зима");
        } else if (month == 1) {
            System.out.println("Зима");
        } else if (month == 2) {
            System.out.println("Зима");
        } else if (month == 3) {
            System.out.printf("Весна");
        } else if (month == 4) {
            System.out.printf("Весна");
        } else if (month == 5) {
            System.out.printf("Весна");
        } else if (month == 6) {
            System.out.printf("Лето");
        } else if (month == 7) {
            System.out.printf("Лето");
        } else if (month <= 8) {
            System.out.printf("Лето");
        } else if (month == 9) {
            System.out.printf("Осень");
        } else if (month == 10) {
            System.out.println("Осень");
        } else if (month <= 11) {
            System.out.printf("Осень");
        } else {
            System.out.printf("Вы ввели неправильное число");
        }
        System.out.println();
        switch (month){
            case 1:
                System.out.println("Зима");break;
            case 2:
                System.out.println("Зима");break;
            case 3:
                System.out.println("Весна");break;
            case 4:
                System.out.println("Весна");break;
            case 5:
                System.out.println("Весна");break;
            case 6:
                System.out.println("Лето");break;
            case 7:
                System.out.println("Лето");break;
            case 8:
                System.out.println("Лето");break;
            case 9:
                System.out.println("Осень");break;
            case 10:
                System.out.println("Осень");break;
            case 11:
                System.out.println("Осень");break;
            case 12:
                System.out.println("Зима");break;
            default:
                System.out.println("Вы ввели неправильное значение");
        }
    }
}