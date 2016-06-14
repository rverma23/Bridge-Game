//RAHUL VERMA 
package application;

//STUDENT ID: 110134817
import java.util.Scanner;

import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class player1 extends Play {
	
	public String name;
	public Cards[] hand;
	public ImageView[] FXHand;
	public 
	Cards[] ohand;
	public Cards[] cjHand;
	public Cards played;
	public ImageView[] bhand;
	public static boolean t;
	
	public player1(String Name){
		
		name=Name;
		hand = new Cards[13];
		FXHand = new ImageView[13];
		ohand = new Cards[13];
		cjHand = new Cards[13];
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
	
	public Cards play(Cards[] hand1){
		boolean alpha = true;
		
		Cards e=hand1[0];
		while(alpha){
		 e = read();
		 if(inP==null)
			 alpha=false;
		 else if(e.gSuit().equals(inP.gSuit())||suitCondition(hand))
			 alpha=false;
		 else
			 alpha=true;		
		}
		String z = e.toString();
		for(int i=0; i<hand1.length; i++){
			if(hand1[i].toString().equals(z)){
				e=hand[i];
				hand1[i]=null;
			}
		}
		Cards[] temp=new Cards[hand1.length-1];
		for(int i = 0, a = 0; i<hand1.length ; i++,a++){
			if(hand1[i]!=null){
				temp[a]=hand1[i];
			}
			else
				a--;						
		}
		
		hand = temp;
	return e;
	}
	public Cards read(){
		
		Scanner input = new Scanner(System.in);
		//System.out.print("\n" +"What card do you want to play?");
		
		String z=input.nextLine();
				
		for(int i=0; i<hand.length; i++){
			if(hand[i].toString().equals(z))
				return hand[i];
		}
		return hand[0];
	}
	
	public boolean suitCondition(Cards[] a){
		boolean truth;
		for(int i=0;i<a.length;i++){
			if(a[i].gSuit().equals(inP.gSuit()))
				return false;
		}
		return true;
		
	}
	public void makeFXHand(){
		for(int i = 0; i<hand.length;i++){
			FXHand[i]=new ImageView(new Image("./application/images/Playing_card_"+hand[i].toString()+".jpg"));
		}
	}
	public void makeohand(){
		for(int i = 0; i<13; i++)
			ohand[i]=hand[i];
	}
	
	public void makecjHand(){
		for(int i = 0; i<13; i++)
			cjHand[i]=hand[i];

	}
	public void playcj(Cards x){
		for(int i = 0; i<13; i++){
			if(cjHand[i]==null){
				
			}
			else if(cjHand[i].equals(x))
				cjHand[i]=null;
		}
	}
	
	
	public void moveCard(){
		
		if(Play.inP.gSuit().equals(ohand[0].gSuit())){
			
	PathTransition pt = new PathTransition(Duration.millis(5000),
			new Line(200,-10,150,-150), FXHand[0]);
	pt.setCycleCount(1);
	
	
	FXHand[0].setOnMouseClicked(e -> {
	pt.play();
			
	
	//System.out.print(ohand[0]);
	});

		}
		
		
		
		if(Play.inP.gSuit().equals(ohand[1].gSuit())){
			
	PathTransition pt = new PathTransition(Duration.millis(5000),
			new Line(200,-10,150,-150), FXHand[1]);
	pt.setCycleCount(1);
	
	
	FXHand[1].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
	pt.play();
		//System.out.print(ohand[1]);
	});
		}
		
		
		if(Play.inP.gSuit().equals(ohand[2].gSuit())){
			
	PathTransition pt = new PathTransition(Duration.millis(5000),
			new Line(200,-10,150,-150), FXHand[2]);
	pt.setCycleCount(1);
	
	
	FXHand[2].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
	pt.play();
		//System.out.print(ohand[2]);
	});
		}
		
		
		if(Play.inP.gSuit().equals(ohand[3].gSuit())){
			
	PathTransition pt = new PathTransition(Duration.millis(5000),
			new Line(200,-10,150,-150), FXHand[3]);
	pt.setCycleCount(1);
	
	
	FXHand[3].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
	pt.play();
		//System.out.print(ohand[3]);
	});
		}
		
		
		if(Play.inP.gSuit().equals(ohand[4].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[4]);
			pt.setCycleCount(1);
			
			
			FXHand[4].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[4]);
			});
				}
		
		if(Play.inP.gSuit().equals(ohand[5].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[5]);
			pt.setCycleCount(1);
			
			
			FXHand[5].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[5]);
			});
				}
		
		if(Play.inP.gSuit().equals(ohand[6].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[6]);
			pt.setCycleCount(1);
			
			
			FXHand[6].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[6]);
			});
				}
		
		
		
		if(Play.inP.gSuit().equals(ohand[7].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[7]);
			pt.setCycleCount(1);
			
			
			FXHand[7].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[7]);
			});
				}
		
		if(Play.inP.gSuit().equals(ohand[8].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[8]);
			pt.setCycleCount(1);
			
			
			FXHand[8].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[8]);
			});
				}
		if(Play.inP.gSuit().equals(ohand[9].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[9]);
			pt.setCycleCount(1);
			
			
			FXHand[9].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[9]);
			});
				}
		
		if(Play.inP.gSuit().equals(ohand[10].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[10]);
			pt.setCycleCount(1);
			
			
			FXHand[10].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[10]);
			});
				}
		
		if(Play.inP.gSuit().equals(ohand[11].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[11]);
			pt.setCycleCount(1);
			
			
			FXHand[11].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[11]);
			});
				}
		
		
		if(Play.inP.gSuit().equals(ohand[12].gSuit())){
			
			PathTransition pt = new PathTransition(Duration.millis(5000),
					new Line(200,-10,150,-150), FXHand[12]);
			pt.setCycleCount(1);
			
			
			FXHand[12].setOnMouseClicked(e -> {pt.setDelay(Duration.seconds(3));
			pt.play();
				//System.out.print(ohand[12]);
			});
				}
	}
	
	public void play(Cards x){
		boolean alpha = true;
		
		
		
		
		for(int i=0; i<hand.length; i++){
			if(hand[i].toString().equals(x)){
				
				hand[i]=null;
			}
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
	public void makebhand(){
		for(int i =0; i<13; i++)
			bhand[i]=new ImageView(new Image("./application/images/Playing_card.jpg"));
	}
	

}
