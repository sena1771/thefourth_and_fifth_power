package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner inp= new Scanner(System.in);

	    System.out.print("The number: ");
	    int number= inp.nextInt();
for(int i = 1; i<=number; i*=4) {
	System.out.println(i);
}
System.out.println("---");
for( int i=1;i<=number;i*=5) {
	System.out.println(i);
}




    }
}
