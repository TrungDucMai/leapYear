package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Năm: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100==0 || year%100==0 && year%400==0){
            System.out.println(year + "Là năm nhuận");
        }else{
            System.out.println(year + "Là năm không nhuận");
        }
    }
}