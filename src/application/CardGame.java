//RAHUL VERMA 
//STUDENT ID: 110134817
package application;
import java.util.Scanner;
public class CardGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String z;
		Dealer d1 = new Dealer();
	
		player1 a = new player1("Diophantus");
		player2 b = new player2("Aristotle");
		player3 c = new player3("Socrates");
		player4 d = new player4("Plato");
		Play p = new Play();
		d1.dealCards(a, b, c, d);		
		a.reorder();
		
		
		
		/*System.out.println("\nWhat card would you like to play?");
		z=input.nextLine();
		a.play(z);		
		for(int i=0; i<a.hand.length; i++){
			System.out.print(a.hand[i] + ",   ");
		}
		/*
		for(int i=0; i<13; i++){
			System.out.print(b.hand[i] + "   ");
		}
		f.inPlay[0]=b.play(b.hand);
		System.out.println("\n" + f.inPlay[0]);
		
		//b.remove(b.regPlay(b.hand));
		for(int i=0; i<b.hand.length; i++){
			System.out.print(b.hand[i] + "   ");
		}
		*/
		
		//p.round(a, b, c, d);
		
		
		
		
	}

}
