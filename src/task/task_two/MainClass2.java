package task.task_two;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		
		String number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		
		number = input.next();
		
		char [] newNumber = number.toCharArray() ;
		
		if(newNumber.length<=3) {
			System.out.println(number);
		}
		if(newNumber.length==4) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==0) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==5) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==1) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==6) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==2) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==7) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==3) {
				System.out.print(".");
			}
			if (i==0) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==8) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==4) {
				System.out.print(".");
			}
			if(i==1) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==9) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==5) {
				System.out.print(".");
			}
			if(i==2) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==10) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==6) {
				System.out.print(".");
			}
			if(i==3) {
				System.out.print(".");
			}
			if(i==0) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==11) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==7) {
				System.out.print(".");
			}
			if(i==4) {
				System.out.print(".");
			}
			if(i==1) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==12) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==8) {
				System.out.print(".");
			}
			if(i==5) {
				System.out.print(".");
			}
			if(i==2) {
				System.out.print(".");
			}
			}
		}
		
		if(newNumber.length==13) {
			for(int i = 0; i<newNumber.length;i++) {
			System.out.print(newNumber[i]);
			if(i==9) {
				System.out.print(".");
			}
			if(i==6) {
				System.out.print(".");
			}
			if(i==3) {
				System.out.print(".");
			}
			if(i==0) {
				System.out.print(".");
			}
			}
		}
		
		
//		int counter=0;
//		// reverse loop
//		for(int i=newNumber.length-1;i>=0;i--) {
//			System.out.print(newNumber[i]);
//			if(counter%3 == 2) {
//				System.out.print(",");
//				}
//			counter++;
//			
//		}
//		
//		System.out.println();
//		
//		int counter2=0;
//		int counterIn=0;
//		
//		for(int i = 0; i<newNumber.length;i++) {
//			System.out.print(newNumber[i]);
//			if(counter2%3 == 2) {			
//				counterIn++;
//				if(counterIn==2) {
//					
//				}else {
//					System.out.print(",");
//				}
//			}
//			counter2++;
//		}
	}
}
