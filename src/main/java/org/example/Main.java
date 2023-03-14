package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int count =0;

        for (int i=0;i < 10 ;i++){
            if (x<=y){
                x*=3;
                y*=2;
                count++;
            }
        }
        System.out.println(count);
    }
}