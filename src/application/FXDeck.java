//RAHUL VERMA 
package application;

import java.io.File;

//STUDENT ID: 110134817
import javafx.scene.image.Image;


public class FXDeck {

	
	
	public Image[] deck;
	
	
	public FXDeck(){
		deck = new Image[52];
		String currentDirectory;
		File file = new File(".");
		currentDirectory = file.getAbsolutePath();
		System.out.println("Current working directory : "+currentDirectory);
		this.CardsInDeck();
		this.Shuffle();
	}
	
	public void CardsInDeck(){
		int n=0;
		for(int a=0; a<4;a++){
			
			for(int i=0; i<13;i++){
				if(a==0){
					if(i==0){
						deck[n]=new Image("images/Playing_card_club_A.jpg");
						n++;
					}
					else if(i==10){
						deck[n]=new Image("images/Playing_card_club_J.jpg");
					}
					else if(i==11){
						deck[n]=new Image("images/Playing_card_club_Q.jpg");
					}
					else if(i==12){
						deck[n]=new Image("images/Playing_card_club_K.jpg");
					}
					else{
				deck[n]=new Image("images/Playing_card_club_"+(i+1)+".jpg");
				n++;
					}
				}
				if(a==1){
					if(i==0){
						deck[n]=new Image("images/Playing_card_heart_A.jpg");
						n++;
					}
					else if(i==10){
						deck[n]=new Image("images/Playing_card_heart_J.jpg");
					}
					else if(i==11){
						deck[n]=new Image("images/Playing_card_heart_Q.jpg");
					}
					else if(i==12){
						deck[n]=new Image("images/Playing_card_heart_K.jpg");
					}
					else{					
					deck[n]=new Image("images/Playing_card_heart_"+(i+1)+".jpg");
					n++;
					}					
					}
				if(a==2){
					if(i==0){
						deck[n]=new Image("images/Playing_card_diamond_A.jpg");
						n++;
					}
					else if(i==10){
						deck[n]=new Image("images/Playing_card_diamond_J.jpg");
					}
					else if(i==11){
						deck[n]=new Image("images/Playing_card_diamond_Q.jpg");
					}
					else if(i==12){
						deck[n]=new Image("images/Playing_card_diamond_K.jpg");
					}
					else{
					deck[n]=new Image("images/Playing_card_diamond_"+(i+1)+".jpg");
					n++;
					}
					}
				if(a==3){
					if(i==0){
						deck[n]=new Image("images/Playing_card_spade_A.jpg");
						n++;
					}
					else if(i==10){
						deck[n]=new Image("images/Playing_card_spade_J.jpg");
					}
					else if(i==11){
						deck[n]=new Image("images/Playing_card_spade_Q.jpg");
					}
					else if(i==12){
						deck[n]=new Image("images/Playing_card_spade_K.jpg");
					}
					else{
					deck[n]=new Image("images/Playing_card_spade_"+(i+1)+".jpg");
					n++;
					}
					}				
			}
		}
	}
	public void Shuffle(){
		for(int i = 0; i<52; i++){
			int n = (int)(Math.random()*52);
			Image temp = deck[i]; 
			deck[i]=deck[n];
			deck[n]=temp;
		}
	}
	
	
}
