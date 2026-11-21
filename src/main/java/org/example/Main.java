package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int min = sc.nextInt();
        System.out.println("The total seconds is: ");
        System.out.println(((n*60)+min)*60);
        sc.close();
    }
}
