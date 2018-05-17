package Prog;

import java.util.*;
import java.io.*;

public class tr {
    void tr (double x, double y) {

        if (x >= 0 && x <= 1) {
            if (y >= 0 && y <= 1) {

                System.out.println("Да, число находится в числовом рядо от 0 до 1");
            }
        } else {

            System.out.println("Нит, не находится в числовом ряде =(");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        tr res = new tr();
        System.out.println("Введи певрое число, X");
        double x = in.nextDouble();
        System.out.println("Введи второе число, Y");
        double y = in.nextDouble();
        res.tr(x,y);
    }
}
