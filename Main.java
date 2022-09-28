package org.example;
import java.util.Arrays;

public class Main {

    //функция смены мест(для сортировки)
    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    //Факториал
    public static int fact(int n){
        if (n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    //таблица умножения
    public static void table(){
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.print( i * j + " ");
            }
            System.out.println("");
        }
    }

    //посчитать сумму цифр числа
    public static int sum(int n){
        int summa = 0;
        while (n>0){
            summa += n%10;
            n/=10;
        }
        return summa;
    }

    //високосный год
    public static boolean isLeapYear(int year) {
        if ((year%400==0)||((year%4==0)&&(year%100!=0))){
            return true;
        }
        return false;
    }

    //колл-во дней в году
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }
    }

    //день недели
    public static int dayOfTheWeek(String n){
        if (n == "Понедельник") {
            return 1;
        }
        else if (n == "Вторник") {
            return 2;
        }
        else if (n == "Среда") {
            return 3;
        }
        else if (n == "Четверг") {
            return 4;
        }
        else if (n == "Пятница") {
            return 5;
        }
        else if (n == "Суббота") {
            return 6;
        }
        return 7;
    }
    //вывести массив на экран
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    //вывести двойной массив
    public static void printArray(int[][] array){
        for (int i = 0; i < 7; i++) {
            System.out.print('[');
            for (int j = 0; j < 7; j++) {
                System.out.print("," + array[i][j] + ",");
            }
            System.out.println(']');
        }
    }

    //сортировка массива
    public static int[] sort(int[] array){
        boolean need = true;
        while (need) {
            need = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    need = true;
                }
            }
        }
        return array;
    }


    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2000));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Воскресенье"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}
