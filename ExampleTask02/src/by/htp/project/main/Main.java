package by.htp.project.main;

import by.htp.project.task02.Task02;

public class Main {

	public static void main(String[] args) {

		Task02 a= new Task02();

		int[] mas={201,-20,40,-71,90,0};
		
		printmass(a.massNull(mas));
		System.out.println(a.vozrMass(mas));
		printmass(a.minMaxnumbers(mas));
		printmass(a.compareZ(mas, 40));
		printmass(a.replaceMinMaxNumbers(mas));
		a.nullPlusMinusNumber(mas);
		a.maxSumNumber(5);
	}

	public static void printmass(int[] mas) {
		for( int i=0;i<mas.length; i++) {
			System.out.println(mas[i]);
		}
	}
}
