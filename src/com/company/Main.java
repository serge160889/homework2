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
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Вы ввели неправильное значение");
        }
        System.out.println(   );
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int z=arr.length-1; z >=0; z=z-1) {
            System.out.print( arr[z]);
            System.out.print("  ");
        }
        System.out.println("  ");
        System.out.println("  ");
        int[][]squareArray=new int[3][2];
        squareArray[0][0]=8;
        squareArray[0][1]=9;
        squareArray[1][0]=7;
        squareArray[1][1]=4;
        squareArray[2][0]=11;
        squareArray[2][1]=13;
        for(int m=0;m<squareArray.length;m++) {
            for (int n = 0; n < squareArray[m].length; n++) {
                System.out.print("  "+squareArray[m][n]+"["+m+"]"+"["+n+"]");
            }
            System.out.println( );

        }
        System.out.println("");

//        Расчет факториала 5!
        int[] fam =new int[5];
        fam[0]=1;
        fam[1]=2;
        fam[2]=3;
        fam[3]=4;
        fam[4]=5;
        int s=1;
        for(int i=0;i<fam.length;i++) {
            s=s*fam[i];
            }
        System.out.print("5!="+s);
        }
    }


