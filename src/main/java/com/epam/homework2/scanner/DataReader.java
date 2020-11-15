package com.epam.homework2.scanner;

import java.util.Scanner;

public class DataReader {

    public String enterName(){
        Scanner scanner;
        String result;

        System.out.println("Enter name, pls:");

        while(true){
            scanner = new Scanner(System.in);
            if(scanner.hasNextLine()){
                result = scanner.nextLine();
                break;
            }else{
                System.out.println("Введен неверный тип  данных, повторите попытку");
            }
        }
        return result;
    }

    public int enterIntFromConsole() {
        Scanner scanner;
        int result;

        while (true) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                break;
            } else {
                System.out.println("Введен неверный тип данных, повторите попытку");
            }
        }
        return result;
    }

    public String enterStringFromConsole() {
        Scanner scanner;
        String result;

        while (true) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                break;
            } else {
                System.out.println("Введен неверный тип данных, повторите попытку");
            }
        }
        return result;
    }

}
