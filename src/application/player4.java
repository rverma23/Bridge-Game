//RAHUL VERMA 
package application;

//STUDENT ID: 110134817
import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class player4 extends Play{
	public String name;
	public Cards[] hand;
	public ImageView[] FXHand;
	public Cards inP;
	public Cards[] ohand;
	public ImageView[] bhand;
	
	public player4(String Name){
		
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
	
	
public Cards play(Cards[] hand){
		
		Cards temp = super.play(hand);
		remove(temp);
		return temp;
		
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
	public void makeohand(){
		for(int i = 0; i<13; i++)
			ohand[i]=hand[i];
	}
	public void makeFXHand(){
		for(int i = 0; i<hand.length;i++){
			FXHand[i]=new ImageView(new Image("./application/images/Playing_card_"+hand[i].toString()+".jpg"));
		}
	}
public ImageView playFX(int a){
		
		return FXHand[a];
	}
	public int  findCard(Cards x){
		int i=0;
		for(i=0; i< ohand.length; i++){
			if(ohand[i].equals(x))
				return i;
		}
		return 0;
	}
	public void fNm(Cards x){
		int n =findCard(x);
		//System.out.print(x.toString());
		
		//System.out.print("\n");
		FXHand[n].toFront();
		FXHand[n].setLayoutX(1200);
		FXHand[n].setLayoutY(FXHand[7].getLayoutY());
		PathTransition at = new PathTransition(Duration.seconds(3),
				new Line(0,50,-450,50), FXHand[n]);
		at.setDelay(Duration.seconds(3));
		at.setCycleCount(1);
		at.play();
	}
	
	public void makebhand(){
		for(int i =0; i<13; i++)
			bhand[i]=new ImageView(new Image("./application/images/Playing_card.jpg"));
	}
}
