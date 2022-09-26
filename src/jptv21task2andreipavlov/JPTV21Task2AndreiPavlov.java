/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task2andreipavlov;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Task2AndreiPavlov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;
        int a = (input % 10);
        int b = (input / 10 % 10);
        int c = (input / 100);
        if (input <1000){
            System.out.println("Вы ввели число = " +input);
            System.out.println("Единицы = "+a);
            System.out.println("Десятки = "+b);
            System.out.println("Сотни = "+c);
        } else if (input >= 1000){
            System.out.println("Вы ввели не трёхзначное число");
        }

    }
    
}
