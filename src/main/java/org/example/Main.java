package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String [] city = {"Харків", "Амстердам", "Варшава", "Лондон", "Київ"};

        boolean[] usedCity = new boolean[city.length]; // доп.массив для отметки использованных городов
        // изначально все значения false, при использовании будут стоновиться true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Давай пограємо у «Міста». Ти перший називай: ");

        while (true) {

            String enteredCity = scanner.nextLine();

            boolean foundedCity = false;
            for (int i = 0; i < city.length; i++) {
                if (city[i].equalsIgnoreCase(enteredCity) && !usedCity[i]) { //проверка что такой город не вводили
                    //и проверка по доп.массиву не использовался ли
                    usedCity[i] = true;
                    foundedCity = true;
                    break;
                }
            }

            //далее проверяет чтоб пользователь не вводил город который уже был но и нельзя ввести город не из массива,
            // как исправить это? в условиях задания это не было оговорено так что можно и не реализовать

            //if (!foundedCity) {
            //    System.out.println("Таке місто невідоме або вже використано. Спробуйте інше.");
            //    continue;
            //}

            char lastChar = enteredCity.charAt(enteredCity.length() - 1); // Находим город на нужную букву
            boolean found = false;
            for (int i = 0; i < city.length; i++) {
                if (city[i].charAt(0) == Character.toUpperCase(lastChar) && !usedCity[i]) {
                    System.out.println("Я називаю: " + city[i]);
                    usedCity[i] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Я програв, ти знаєш більше міст!");
                break;
            }
        }

        scanner.close();


    }
}