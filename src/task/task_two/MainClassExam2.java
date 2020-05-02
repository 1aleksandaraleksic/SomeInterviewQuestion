package task.task_two;

import java.util.Scanner;

public class MainClassExam2 {

	public static void main(String[] args) {

		String number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		
		number = input.next();
		
		char [] newNumber = number.toCharArray() ;
		
		for(int i=0;i<newNumber.length;i++) {
			System.out.println(newNumber[i]);
			for(int j = newNumber.length;j>=0;j--) {
				System.out.println(newNumber[i]);
			}
			System.out.println();
		}

	}

}
