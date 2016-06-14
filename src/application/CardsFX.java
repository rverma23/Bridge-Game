//RAHUL VERMA 
package application;
//STUDENT ID: 110134817
import javafx.scene.image.Image;

public class CardsFX {

	private String rank;
	private String rank2;
	private String suit;
	
	
	public CardsFX(String Rank, String Suit){
		
		rank=Rank;
		rank2 = Rank;
		if(Rank.equals("13")){
			rank2 ="13"; 
			rank="King";
		}
		if(Rank.equals("12")){
			rank2="12";
			rank="Queen";}
		if(Rank.equals("11")){
			rank2="11";		
			rank="Jack";
			}
		if(Rank.equals("1")){
			rank2="14";
			rank="Ace";
		}
		suit=Suit;
	}
		
	public String gRank2(){
		return rank2;
	}
	public String gRank(){
		return rank;
	}
	
	
	
	
	
	public String gSuit(){
		return suit;
	}
	
	
		
	
	public String toString(){
		return ( suit + "_" + rank);
	}
	
	
}