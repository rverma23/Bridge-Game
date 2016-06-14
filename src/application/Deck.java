//RAHUL VERMA 
//STUDENT ID: 110134817
package application;

public class Deck {
	
	
	public Cards[] DeckOfCards;
	
	public Deck(){
		DeckOfCards=new Cards[52];
		this.PutCardsInDeck();
		this.Shuffle();
	}
	
	
	
	public void PutCardsInDeck(){
		int n=0;
		for(int a=0; a<4;a++){
			
			for(int i=0; i<13;i++){
				if(a==0){
				DeckOfCards[n]=new Cards(String.valueOf(i+1),"club");
				n++;
				}
				if(a==1){
					DeckOfCards[n]=new Cards(String.valueOf(i+1),"heart");
					n++;
					}
				if(a==2){
					DeckOfCards[n]=new Cards(String.valueOf(i+1),"diamond");
					n++;
					}
				if(a==3){
					DeckOfCards[n]=new Cards(String.valueOf(i+1),"spade");
					n++;
					}				
			}
		}
		
	}
	
	
	public void Shuffle(){
		for(int i = 0; i<52; i++){
			int n = (int)(Math.random()*52);
			Cards temp = DeckOfCards[i]; 
			DeckOfCards[i]=DeckOfCards[n];
			DeckOfCards[n]=temp;
		}
	}
	
	

}
