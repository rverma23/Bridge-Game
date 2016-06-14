//RAHUL VERMA 
//STUDENT ID: 110134817
package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class DealerFX {
	
	private Deck d1;
	
	public DealerFX(){
		
		d1 = new Deck();
		d1.Shuffle();
		
		
	}
	
	public void dealCards(player1 a, player2 b, player3 c, player4 d){
		int n = 0;
		for(int i=0 ; i<13 ; i++){
			a.hand[i]=d1.DeckOfCards[n];
			n++;
			b.hand[i]=d1.DeckOfCards[n];
			n++;
			c.hand[i]=d1.DeckOfCards[n];
			n++;
			d.hand[i]=d1.DeckOfCards[n];
			n++;
			
		}		
		
	}
	

}
