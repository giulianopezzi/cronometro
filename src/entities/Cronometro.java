package entities;

public class Cronometro {
	
	private int segundo = 1;
	private int paraSegundo;
	private int minuto;
	private int paraMinuto;
	private int hora;
	private int paraHora;
	private boolean para = false;
	
	public Cronometro() {
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public int getParaSegundo() {
		return paraSegundo;
	}

	public void setParaSegundo(int paraSegundo) {
		this.paraSegundo = paraSegundo;
	}
	
	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public int getParaMinuto() {
		return paraMinuto;
	}

	public void setParaMinuto(int paraMinuto) {
		this.paraMinuto = paraMinuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getParaHora() {
		return paraHora;
	}

	public void setParaHora(int paraHora) {
		this.paraHora = paraHora;
	}

	public boolean getPara() {
		return para;
	}

	public void setPara(boolean para) {
		this.para = para;
	}
	
	public void paraCronometro(int paraHora, int paraMinuto, int paraSegundo) {
		this.paraHora = paraHora;
		this.paraMinuto = paraMinuto;
		this.paraSegundo = paraSegundo;
	}

	public void cronometro() {
		System.out.println("00:00:00");
		while(hora<60 && !para) {
			while(minuto<60 && !para) {
				while(segundo<60 && !para) {
					if(paraHora == hora && paraMinuto == minuto && paraSegundo == segundo) {
						para = true;
					}
					else {
						para = false;
					}
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
				segundo = 0;
				minuto++;
			}
			minuto = 0;
			hora++;
		}
	}
}