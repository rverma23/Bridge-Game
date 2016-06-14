//RAHUL VERMA 
//STUDENT ID: 110134817
package application;
public class Cards {

	private String rank;
	private String rank2;
	private String suit;
	
	
	public Cards(String Rank, String Suit){
		
		rank=Rank;
		rank2 = Rank;
		if(Rank.equals("13")){
			rank2 ="13"; 
			rank="K";
		}
		if(Rank.equals("12")){
			rank2="12";
			rank="Q";}
		if(Rank.equals("11")){
			rank2="11";		
			rank="J";
			}
		if(Rank.equals("1")){
			rank2="14";
			rank="A";
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
