package entities;

public class Cronometro {
	
	private int segundo;
	private int minuto;
	private int hora;
	
	public Cronometro() {
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void contador() {
		while(hora<60) {
			while(minuto<60) {
				while(segundo<60) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
				}
					if(segundo<= 9 && minuto <=9 && hora <= 9) {
					System.out.println("0" + hora + ":0" + minuto + ":0" + segundo);
					}
						else if(segundo > 9 && minuto <=9 && hora <= 9) {
						System.out.println("0" + hora + ":0" + minuto + ":" + segundo);
						}
							else if(segundo > 9 && minuto > 9 && hora <= 9) {
							System.out.println("0" + hora + ":" + minuto + ":" + segundo);
							}
								else if(segundo<= 9 && minuto > 9 && hora <= 9) {
								System.out.println("0" + hora + ":" + minuto + ":0" + segundo);
								}
									else if(segundo<= 9 && minuto > 9 && hora > 9) {
									System.out.println(hora + ":" + minuto + ":0" + segundo);
									}
											else if(segundo<= 9 && minuto <=9 && hora > 9) {
											System.out.println(hora + ":0" + minuto + ":0" + segundo);
											}
					else {
					System.out.println(hora + ":" + minuto + ":" + segundo);
					}
					segundo++;
				}
				segundo =0;
				minuto++;
			}
			minuto = 0;
			hora++;
		}
	}
}