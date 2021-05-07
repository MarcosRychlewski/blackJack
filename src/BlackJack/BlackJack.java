package BlackJack;

import game.Deck;
import game.Hand;
import java.io.*;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) throws IOException{
		
		
		
		Deck d = new Deck();
		d.createCards();
		
		Hand handComputer = new Hand();
		Hand handHuman = new Hand();
		
		handComputer.addCard(d.getCard());
		handComputer.addCard(d.getCard());
		
		handHuman.addCard(d.getCard());
		handHuman.addCard(d.getCard());
		
		
			
			
			
			
		
		while(handComputer.getValue() <= 16) {
			handComputer.addCard(d.getCard());
		}
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Suas cartas: " + handHuman.toString());
		System.out.println("Deseja fazer outra jogada[o] ou parar[p] ");
		
		String teclado = "";
		while((teclado = br.readLine()) != null) {
			
			if(teclado.equalsIgnoreCase("o")) {
				handHuman.addCard(d.getCard());
				System.out.println("Suas cartas: " + handHuman.toString());
			}else {
				break;
			}
		}
		
		System.out.println("Cartas computador: " + handComputer.toString());

	}

	
		
}
