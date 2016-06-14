//RAHUL VERMA 
package application;

//STUDENT ID: 110134817
import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class player2 extends Play {
	public String name;
	public Cards[] hand;
	public Cards[] ohand;
	public ImageView[] bhand;
	public Cards inP;
	public ImageView[] FXHand;
	
	
	public player2(String Name){
		
		name=Name;
		hand = new Cards[13];
		FXHand = new ImageView[13];
		ohand = new Cards[13];
		bhand = new ImageView[13];
		
	}
	public void reorder(){
		Cards[] newHand = new Cards[13];
		int a = 0;
		for(int i = 0; i<13;i++){
			if(hand[i].gSuit().contains("club")){
				newHand[a]=hand[i];
				a++;
			}					
		}
		
		for(int i = 0; i<13;i++){
			if(hand[i].gSuit().contains("spade")){
				newHand[a]=hand[i];
				a++;
			}
		}
		for(int i = 0; i<13;i++){
			if(hand[i].gSuit().contains("diamond")){
				newHand[a]=hand[i];
				a++;
			}
		}
		for(int i = 0; i<13;i++){
			if(hand[i].gSuit().contains("heart")){
				newHand[a]=hand[i];
				a++;
			}
		}
		hand=newHand;
		
	}

	/*public Cards play(){
		
		if(inP.equals(null)){
			int temp = Integer.parseInt(hand[0].gRank2());
			int a=0;
			for(int i = 1; i<13 ; i++){
					if(temp<Integer.parseInt(hand[i].gRank2())){
						temp = Integer.parseInt(hand[i].gRank2());
						a=i;
					}			
			}
			return hand[a];
		}
		
		
	else if(inP.gSuit().equals("Clubs")){
			int a =0;
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Clubs")){
					a=i;
				break;
				}
			}
			Cards temp = hand[a];
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Clubs")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		else if(inP.gSuit().equals("Diamonds")){
			int a =0;
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Diamonds")){
					a=i;
				break;
				}
			}
			Cards temp = hand[a];
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Diamonds")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		else if(inP.gSuit().equals("Spades")){
			int a =0;
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Spades")){
					a=i;
				break;
				}
			}
			Cards temp = hand[a];
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Spades")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		else {
			int a =0;
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Hearts")){
					a=i;
				break;
				}
			}
			Cards temp = hand[a];
			for(int i = 0; i<13; i++){
				if(hand[i].gSuit().equals("Hearts")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		
		
		
		
	}
	*/
	public void fNm(Cards x){
		int n =findCard(x);
		//System.out.print(x.toString());
		
		//System.out.print("\n");
		FXHand[n].toFront();
		FXHand[n].setLayoutX(100);
		FXHand[n].setLayoutY(FXHand[7].getLayoutY());
		PathTransition at = new PathTransition(Duration.seconds(3),
				new Line(100,50,600,50), FXHand[n]);
		
		at.setCycleCount(1);
		at.play();
	}
	public Cards play(Cards[] hand){
		
		Cards temp = super.play(hand);
		remove(temp);
		return temp;
		
	}
	
	public int  findCard(Cards x){
		int i=0;
		for(i=0; i< ohand.length; i++){
			if(ohand[i].equals(x))
				return i;
		}
		return 0;
	}
	
	private void remove(Cards x){
		for(int i=0; i<hand.length; i++){
			if(hand[i].equals(x))
				hand[i]=null;
		}
		Cards[] temp=new Cards[hand.length-1];
		for(int i = 0, a = 0; i<hand.length ; i++,a++){
			if(hand[i]!=null){
				temp[a]=hand[i];
			}
			else
				a--;						
		}
		hand = temp;
	
	}
	public void makeFXHand(){
		for(int i = 0; i<hand.length;i++){
			FXHand[i]= new ImageView(new Image("./application/images/Playing_card_"+hand[i].toString()+".jpg"));
		}
	}
	public void makeohand(){
		for(int i = 0; i<13; i++)
			ohand[i]=hand[i];
	}
	public ImageView playFX(int a){
		
		return FXHand[a];
	}
	public void makebhand(){
		for(int i =0; i<13; i++)
			bhand[i]=new ImageView(new Image("./application/images/Playing_card.jpg"));
	}

}
