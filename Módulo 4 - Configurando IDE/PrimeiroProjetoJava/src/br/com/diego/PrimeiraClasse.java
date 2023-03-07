package br.com.diego;

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		String ambiente = args[0];
		
		if (ambiente.equals("DEV")) {
			System.out.println(ambiente);			
		}		
		
		int i = 0;
		while(i<5) {
			i++;
			if(i==3) {continue;}
			System.out.println(i);
		}
		

	}

}
