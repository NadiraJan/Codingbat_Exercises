package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	for(int k=0;k<=10;k++) {
        System.out.println("3x"+" "+k+ " = "+ 3*k);
    }

    for(int i=1;i<=5;i++) {
        System.out.println(i+ "");
    }
    for(int j=0;j<=10;j++){
        System.out.print(j + "");
    }
    Scanner kbd = new Scanner(System.in);
        System.out.println("Enter your number:  ");

        int z = kbd.nextInt();
        int x; int result = 0;
        for(x=1; x<=z;x++) {
            result = result +x;
            System.out.println(result);}

        int s=0; int t=0;
        boolean negative;
        boolean positive;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter s: ");
        System.out.println("Enter t: ");
        s  = scan.nextInt();
        t= scan.nextInt();

        if((s<0 && t>0)||(s>0 && t<0)){
            System.out.println("negative");}
        else { if(s>0 &&t>0) {
            System.out.println("positive");
        }

} }}
