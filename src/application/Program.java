package application;

import java.util.Scanner;

import entities.Cronometro;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cronometro cr = new Cronometro();

			cr.contador();

		sc.close();
	}

}
