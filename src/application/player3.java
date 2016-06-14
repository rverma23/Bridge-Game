//RAHUL VERMA 
package application;

import java.io.File;

//STUDENT ID: 110134817
import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class player3 extends Play {
	public String name;
	public Cards[] hand;
	public Cards[] ohand;
	public Cards inP;
	public ImageView[] FXHand;
	public ImageView[] bhand;
	
	public player3(String Name){
		
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
		FXHand[n].setLayoutX(500);
		FXHand[n].setLayoutY(FXHand[7].getLayoutY());
		PathTransition at = new PathTransition(Duration.seconds(3),
				new Line(200,50,200,200), FXHand[n]);
		at.setDelay(Duration.seconds(3));
		at.setCycleCount(1);
		at.play();
	}
	public void makebhand(){
		for(int i =0; i<13; i++)
			bhand[i]=new ImageView(new Image("./application/images/Playing_card.jpg"));
	}

}
