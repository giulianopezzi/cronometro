package application;

import java.util.Scanner;

import entities.Cronometro;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int paraHora = 0;
		int paraMinuto = 0;
		int paraSegundo = 0;
		boolean formatoTempoCorreto = false;
		
		do {
			System.out.print("Configure o tempo (xx:xx:xx): ");
			String tempo = sc.next();
			try {
				paraHora = Integer.parseInt(tempo.substring(0,2));
				paraMinuto = Integer.parseInt(tempo.substring(3,5));
				paraSegundo = Integer.parseInt(tempo.substring(6,8));
				formatoTempoCorreto = true;
			} catch(Exception e)
			{
				System.out.println("Formato errado de entrada!");
				System.out.println("Exemplo de entrada de dados: 01:45:50, 00:02:30, 00:00:40, 00:85:00, 00:00:80");
				System.out.println();
			}
			
			}while(!formatoTempoCorreto);
		
			if(paraSegundo >= 60) {
				paraMinuto = paraSegundo/60;
				paraSegundo = paraSegundo -60; 
			}
			
			if(paraMinuto >= 60) {
				paraHora = paraMinuto/60;
				paraMinuto = paraMinuto -60; 
			}
		
			Cronometro cr = new Cronometro();
			cr.paraCronometro(paraHora, paraMinuto, paraSegundo);
			cr.cronometro();
			
		sc.close();
	}

}
