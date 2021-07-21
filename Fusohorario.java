package br.com.moacyr.trijava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fusohorario {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate niver = LocalDate.parse("2005-02-01", DateTimeFormatter.ISO_LOCAL_DATE);
		
		Integer dias = 0;
		while (niver.isBefore(hoje)) {
			niver = niver.plusDays(1);
			dias++;	
				
		}
		
		
		hoje.getMonthValue();
		hoje.getDayOfMonth();
		
		niver.getMonthValue();
		niver.getDayOfMonth();
		
		
		if (niver.isBefore(hoje)) { 
			System.out.println("Voc� ja fez aniversario");
		} else {System.out.println("Voc� ainda n�o fez aniversario");
		}
		System.out.println("Voc� viveu " + dias + " dias");	
	}
}
 