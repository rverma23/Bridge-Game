//RAHUL VERMA 
package application;

//STUDENT ID: 110134817
import javafx.animation.PathTransition;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.shape.Line;
import javafx.util.Duration;


public class Play {
static	Label scoreteam1 = new Label("Team 1: 0");
static	Label scoreteam2 = new Label("Team 2: 0");
static  Label Winner = new Label("");
	public static Cards inP;
	public static Cards p1played;
	public static int p1index;
	public Cards[] hand;
	public Image[] FXHand;
	public int team1score=0;
	public int team2score=0;
	public String z;
	
	public Play(){
		
	}
	
	public Cards play(Cards[] hand){
		
		if(inP==null){
			Cards e = regPlay(hand);			
			return e;
		}
		
		
	else if(inP.gSuit().equals("club")){
			boolean t=false;
			int a =0;
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("club")){
					t=true;
					a=i;
				break;
				}
				
				
			}
			if(t==false)
					return regPlay(hand);			
			Cards temp = hand[a];
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("club")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		else if(inP.gSuit().equals("diamond")){
			boolean t = false;
			int a =0;
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("diamond")){
					t=true;
					a=i;
				break;
				}
			}
			if(t==false)
				return regPlay(hand);		
			Cards temp = hand[a];
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("diamond")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		else if(inP.gSuit().equals("spade")){
			boolean t = false;
			int a =0;
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("spade")){
					t = true;
					a=i;
				break;				
				}
			}
			if(t==false)
				return regPlay(hand);		
			Cards temp = hand[a];
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("spade")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		else {
			boolean t = false;
			int a =0;
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("heart")){
					t = true;
					a=i;
				break;
				}
				
			}
			if(t==false)
				return regPlay(hand);		
			Cards temp = hand[a];
			for(int i = 0; i<hand.length; i++){
				if(hand[i].gSuit().equals("heart")&&(Integer.parseInt(temp.gRank2())<Integer.parseInt(hand[i].gRank2()))){
					a=i;
					
				}
			}
			return hand[a];			
		}
		
		
		
		
	}
	
	public Cards regPlay(Cards[] hand){
		
			int temp = Integer.parseInt(hand[0].gRank2());
			int a=0;
			for(int i = 1; i<hand.length ; i++){
					if(temp<Integer.parseInt(hand[i].gRank2())){
						temp = Integer.parseInt(hand[i].gRank2());
						a=i;
					}			
			}
			return hand[a];
		}
	/*
	public void round(player1 a, player2 b, player3 c, player4 d){
		
		int i = 0;
		
		Cards q,w,e,r;
		printHands(a,b,c,d);
		if(team1score==0 && team2score==0){
			//System.out.print("\n");
			inP=b.play(b.hand);
			q=inP;			
			//System.out.println(b.name+ " played" + " " + q.toString());
			w=c.play(c.hand);
			//System.out.println(c.name+ " played" + " " + w.toString());
			e=d.play(d.hand);
			//System.out.println(d.name+ " played" + " " + e.toString());
			r=a.play(a.hand);
			Floor floor = new Floor(q,w,e,r);
			//System.out.print("The biggest card is : " + biggest(floor.inPlay));
			printHands(a,b,c,d);
			whoNext(floor.inPlay, q,w,e,r);
		while(i<12){
				if(z.equals("player 2")){
					inP=null;
					inP=b.play(b.hand);
					q=inP;
					//System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());
					e=d.play(d.hand);
					//System.out.println(d.name+ " played" + " " + e.toString());
					r=a.play(a.hand);
					
					floor = new Floor(q,w,e,r);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;
				}
				else if(z.equals("player 3")){
					inP=null;
					inP=c.play(c.hand);
					w=inP;
					//System.out.println(c.name+ " played" + " " + w.toString());
					e=d.play(d.hand);
					//System.out.println(d.name+ " played" + " " + e.toString());
					r=a.play(a.hand);
					q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					
					floor = new Floor(w,e,r,q);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;
				}
				else if(z.equals("player 4")){
					inP=null;
					inP=d.play(d.hand);
					e=inP;
					//System.out.println(d.name+ " played" + " " + e.toString());
					r=a.play(a.hand);
					q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());			
					
					floor = new Floor(e,r,q,w);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;
				}
				else{
					inP=null;
					inP=a.play(a.hand);
					r=inP;
					q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());	
					e=d.play(d.hand);
					//System.out.println(d.name+ " played" + " " + e.toString());
					
					floor = new Floor(r,q,w,e);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;					
				}
				
				
			}
	}
			if(team2score>team1score)
				//System.out.print("You lost!");
			else
				//System.out.print("You won!");
	}*/
	
	public void roundFX(player1 a, player2 b, player3 c, player4 d){
		
		
		
		Cards q,w,e;
		printHands(a,b,c,d);
		if(team1score==0 && team2score==0){
			//System.out.print("\n");
			inP=b.play(b.hand);
			 q=inP;
			b.fNm(q);
			////System.out.println(b.name+ " played" + " " + q.toString());
			w=c.play(c.hand);
			c.fNm(w);
			////System.out.println(c.name+ " played" + " " + w.toString());
			e=d.play(d.hand);
			d.fNm(e);
			////System.out.println(d.name+ " played" + " " + e.toString());
			if(Play.inP.gSuit().equals(a.ohand[0].gSuit())){
				
				PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[0]);
				pt.setCycleCount(1);
				
				
				a.FXHand[0].setOnMouseClicked(oo -> {
				pt.play();
				
			Floor floor = new Floor(q,w,e,a.ohand[0]);
			//System.out.print("The biggest card is : " + biggest(floor.inPlay));
			printHands(a,b,c,d);
			whoNext(floor.inPlay, q,w,e,a.ohand[0]);
			if(z.equals("player 2"))
				play2turn(a,b,c,d);
			else if (z.equals("player 3"))
				play3turn(a,b,c,d);
			else if(z.equals("player 4"))
				play4turn(a,b,c,d);
			else
				play1turn(a,b,c,d);
				//System.out.print(a.ohand[0]);
				});

					}
			if(Play.inP.gSuit().equals(a.ohand[1].gSuit())){
				
				PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[1]);
				pt.setCycleCount(1);
				
				
				a.FXHand[1].setOnMouseClicked(oo -> { 
					Floor floor = new Floor(q,w,e,a.ohand[1]);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,a.ohand[1]);
					if(z.equals("player 2"))
						play2turn(a,b,c,d);
					else if (z.equals("player 3"))
						play3turn(a,b,c,d);
					else if(z.equals("player 4"))
						play4turn(a,b,c,d);
					else
						play1turn(a,b,c,d);
					
				pt.play();
					//System.out.print(a.ohand[1]);
				});
					}
					
					
					if(Play.inP.gSuit().equals(a.ohand[2].gSuit())){
						
				PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[2]);
				pt.setCycleCount(1);
				
				
				a.FXHand[2].setOnMouseClicked(oo -> { 
					Floor floor = new Floor(q,w,e,a.ohand[2]);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,a.ohand[2]);
					if(z.equals("player 2"))
						play2turn(a,b,c,d);
					else if (z.equals("player 3"))
						play3turn(a,b,c,d);
					else if(z.equals("player 4"))
						play4turn(a,b,c,d);
					else
						play1turn(a,b,c,d);
				pt.play();
					//System.out.print(a.ohand[2]);
				});
					}
					
					
					if(Play.inP.gSuit().equals(a.ohand[3].gSuit())){
						
				PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[3]);
				pt.setCycleCount(1);
				
				
				a.FXHand[3].setOnMouseClicked(oo -> { 
					Floor floor = new Floor(q,w,e,a.ohand[3]);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,a.ohand[3]);
					if(z.equals("player 2"))
						play2turn(a,b,c,d);
					else if (z.equals("player 3"))
						play3turn(a,b,c,d);
					else if(z.equals("player 4"))
						play4turn(a,b,c,d);
					else
						play1turn(a,b,c,d);
				pt.play();
					//System.out.print(a.ohand[3]);
				});
					}
					
					
					if(Play.inP.gSuit().equals(a.ohand[4].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[4]);
						pt.setCycleCount(1);
						
						
						a.FXHand[4].setOnMouseClicked(oo -> {
							Floor floor = new Floor(q,w,e,a.ohand[4]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[4]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[4]);
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[5].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[5]);
						pt.setCycleCount(1);
						
						
						a.FXHand[5].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[5]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[5]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[5]);
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[6].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[6]);
						pt.setCycleCount(1);
						
						
						a.FXHand[6].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[6]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[6]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[6]);
						});
							}
					
					
					
					if(Play.inP.gSuit().equals(a.ohand[7].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[7]);
						pt.setCycleCount(1);
						
						
						a.FXHand[7].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[7]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[7]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[7]);
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[8].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[8]);
						pt.setCycleCount(1);
						
						
						a.FXHand[8].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[8]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[8]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[8]);
						});
							}
					if(Play.inP.gSuit().equals(a.ohand[9].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[9]);
						pt.setCycleCount(1);
						
						
						a.FXHand[9].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[9]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[9]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[9]);
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[10].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[10]);
						pt.setCycleCount(1);
						
						
						a.FXHand[10].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[10]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[10]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[10]);
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[11].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[11]);
						pt.setCycleCount(1);
						
						
						a.FXHand[11].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[11]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[11]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[11]);
						});
							}
					
					
					if(Play.inP.gSuit().equals(a.ohand[12].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[12]);
						pt.setCycleCount(1);
						
						
						a.FXHand[12].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[12]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[12]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[12]);
						});
							}		
		}
	}
			public void play2turn(player1 a, player2 b, player3 c, player4 d){

				
				
				Cards q,w,e;
				printHands(a,b,c,d);
				
					//System.out.print("\n");
					inP=b.play(b.hand);
					 q=inP;
					b.fNm(q);
					////System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					c.fNm(w);
					////System.out.println(c.name+ " played" + " " + w.toString());
					e=d.play(d.hand);
					d.fNm(e);
					////System.out.println(d.name+ " played" + " " + e.toString());
					if(Play.inP.gSuit().equals(a.ohand[0].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[0]);
						pt.setCycleCount(1);
						
						
						a.FXHand[0].setOnMouseClicked(oo -> {
						pt.play();
						//System.out.print(a.ohand[0]);
						Floor floor = new Floor(q,w,e,a.ohand[0]);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,a.ohand[0]);
					if(z.equals("player 2"))
						play2turn(a,b,c,d);
					else if (z.equals("player 3"))
						play3turn(a,b,c,d);
					else if(z.equals("player 4"))
						play4turn(a,b,c,d);
					else
						play1turn(a,b,c,d);
						
						
						});

							}
					if(Play.inP.gSuit().equals(a.ohand[1].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[1]);
						pt.setCycleCount(1);
						
						
						a.FXHand[1].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[1]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[1]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
							
							
						pt.play();
							//System.out.print(a.ohand[1]);
						});
							}
							
							
							if(Play.inP.gSuit().equals(a.ohand[2].gSuit())){
								
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[2]);
						pt.setCycleCount(1);
						
						
						a.FXHand[2].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[2]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[2]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[2]);
						});
							}
							
							
							if(Play.inP.gSuit().equals(a.ohand[3].gSuit())){
								
						PathTransition pt = new PathTransition(Duration.millis(5000),
								new Line(200,-10,150,-150), a.FXHand[3]);
						pt.setCycleCount(1);
						
						
						a.FXHand[3].setOnMouseClicked(oo -> { 
							Floor floor = new Floor(q,w,e,a.ohand[3]);
							//System.out.print("The biggest card is : " + biggest(floor.inPlay));
							printHands(a,b,c,d);
							whoNext(floor.inPlay, q,w,e,a.ohand[3]);
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
						pt.play();
							//System.out.print(a.ohand[3]);
						});
							}
							
							
							if(Play.inP.gSuit().equals(a.ohand[4].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[4]);
								pt.setCycleCount(1);
								
								
								a.FXHand[4].setOnMouseClicked(oo -> {
									Floor floor = new Floor(q,w,e,a.ohand[4]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[4]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[4]);
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[5].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[5]);
								pt.setCycleCount(1);
								
								
								a.FXHand[5].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[5]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[5]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[5]);
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[6].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[6]);
								pt.setCycleCount(1);
								
								
								a.FXHand[6].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[6]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[6]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[6]);
								});
									}
							
							
							
							if(Play.inP.gSuit().equals(a.ohand[7].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[7]);
								pt.setCycleCount(1);
								
								
								a.FXHand[7].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[7]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[7]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[7]);
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[8].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[8]);
								pt.setCycleCount(1);
								
								
								a.FXHand[8].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[8]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[8]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[8]);
								});
									}
							if(Play.inP.gSuit().equals(a.ohand[9].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[9]);
								pt.setCycleCount(1);
								
								
								a.FXHand[9].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[9]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[9]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[9]);
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[10].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[10]);
								pt.setCycleCount(1);
								
								
								a.FXHand[10].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[10]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[10]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[10]);
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[11].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[11]);
								pt.setCycleCount(1);
								
								
								a.FXHand[11].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[11]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[11]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[11]);
								});
									}
							
							
							if(Play.inP.gSuit().equals(a.ohand[12].gSuit())){
								
								PathTransition pt = new PathTransition(Duration.millis(5000),
										new Line(200,-10,150,-150), a.FXHand[12]);
								pt.setCycleCount(1);
								
								
								a.FXHand[12].setOnMouseClicked(oo -> { 
									Floor floor = new Floor(q,w,e,a.ohand[12]);
									//System.out.print("The biggest card is : " + biggest(floor.inPlay));
									printHands(a,b,c,d);
									whoNext(floor.inPlay, q,w,e,a.ohand[12]);
									if(z.equals("player 2"))
										play2turn(a,b,c,d);
									else if (z.equals("player 3"))
										play3turn(a,b,c,d);
									else if(z.equals("player 4"))
										play4turn(a,b,c,d);
									else
										play1turn(a,b,c,d);
								pt.play();
									//System.out.print(a.ohand[12]);
								});
									}		
				
				}
			
			public void play3turn(player1 a, player2 b, player3 c, player4 d){
				boolean t = true;
				Cards w,e;
				inP=null;
				inP=c.play(c.hand);
				w=inP;
				c.fNm(w);
				////System.out.println(c.name+ " played" + " " + w.toString());
				e=d.play(d.hand);
				d.fNm(e);
				////System.out.println(d.name+ " played" + " " + e.toString());
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(t){
				if(Play.inP.gSuit().equals(a.ohand[0].gSuit())){
					
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[0]);
					pt.setCycleCount(1);
					
					
					a.FXHand[0].setOnMouseClicked(oo -> {
					pt.play();
					
					
					Cards q=b.play(b.hand);
					b.fNm(q);
									
					Floor floor = new Floor(q,w,e,a.ohand[0]);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[0]);
				if(z.equals("player 2"))
					play2turn(a,b,c,d);
				else if (z.equals("player 3"))
					play3turn(a,b,c,d);
				else if(z.equals("player 4"))
					play4turn(a,b,c,d);
				else
					play1turn(a,b,c,d);
					//System.out.print(a.ohand[0]);
					});

						}
				if(Play.inP.gSuit().equals(a.ohand[1].gSuit())){
					
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[1]);
					pt.setCycleCount(1);
					
					
					a.FXHand[1].setOnMouseClicked(oo -> { 
						pt.play();
						
						Cards q=b.play(b.hand);
						b.fNm(q);
						
						Floor floor = new Floor(q,w,e,a.ohand[1]);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[1]);
						if(z.equals("player 2"))
							play2turn(a,b,c,d);
						else if (z.equals("player 3"))
							play3turn(a,b,c,d);
						else if(z.equals("player 4"))
							play4turn(a,b,c,d);
						else
							play1turn(a,b,c,d);
						
					
						//System.out.print(a.ohand[1]);
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[2].gSuit())){
							
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[2]);
					pt.setCycleCount(1);
					
					
					a.FXHand[2].setOnMouseClicked(oo -> { 
						
						Cards q=b.play(b.hand);
						b.fNm(q);
						Floor floor = new Floor(q,w,e,a.ohand[2]);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[2]);
						if(z.equals("player 2"))
							play2turn(a,b,c,d);
						else if (z.equals("player 3"))
							play3turn(a,b,c,d);
						else if(z.equals("player 4"))
							play4turn(a,b,c,d);
						else
							play1turn(a,b,c,d);
					pt.play();
						//System.out.print(a.ohand[2]);
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[3].gSuit())){
							
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[3]);
					pt.setCycleCount(1);
					
					
					a.FXHand[3].setOnMouseClicked(oo -> { 
						pt.play();
						Cards q=b.play(b.hand);
						b.fNm(q);
						Floor floor = new Floor(q,w,e,a.ohand[3]);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[3]);
						if(z.equals("player 2"))
							play2turn(a,b,c,d);
						else if (z.equals("player 3"))
							play3turn(a,b,c,d);
						else if(z.equals("player 4"))
							play4turn(a,b,c,d);
						else
							play1turn(a,b,c,d);
					
						//System.out.print(a.ohand[3]);
						
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[4].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[4]);
							pt.setCycleCount(1);
							
							
							a.FXHand[4].setOnMouseClicked(oo -> {
								pt.play();
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[4]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[4]);
								if(z.equals("player 2"))
									play2turn(a,b,c,d);
								else if (z.equals("player 3"))
									play3turn(a,b,c,d);
								else if(z.equals("player 4"))
									play4turn(a,b,c,d);
								else
									play1turn(a,b,c,d);
							
								//System.out.print(a.ohand[4]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[5].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[5]);
							pt.setCycleCount(1);
							
							
							a.FXHand[5].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[5]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[5]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[5]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[6].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[6]);
							pt.setCycleCount(1);
							
							
							a.FXHand[6].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[6]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[6]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[6]);
							});
								}
						
						
						
						if(Play.inP.gSuit().equals(a.ohand[7].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[7]);
							pt.setCycleCount(1);
							
							
							a.FXHand[7].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[7]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[7]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[7]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[8].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[8]);
							pt.setCycleCount(1);
							
							
							a.FXHand[8].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[8]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[8]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[8]);
							});
								}
						if(Play.inP.gSuit().equals(a.ohand[9].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[9]);
							pt.setCycleCount(1);
							
							
							a.FXHand[9].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[9]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[9]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[9]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[10].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[10]);
							pt.setCycleCount(1);
							
							
							a.FXHand[10].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[10]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[10]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[10]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[11].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[11]);
							pt.setCycleCount(1);
							
							
							a.FXHand[11].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								Floor floor = new Floor(q,w,e,a.ohand[11]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[11]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[11]);
							});
								}
						
						
						if(Play.inP.gSuit().equals(a.ohand[12].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[12]);
							pt.setCycleCount(1);
							
							
							a.FXHand[12].setOnMouseClicked(oo -> { 
								
								Cards q=b.play(b.hand);
								b.fNm(q);
								
								Floor floor = new Floor(q,w,e,a.ohand[12]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[12]);
							pt.play();
							if(z.equals("player 2"))
								play2turn(a,b,c,d);
							else if (z.equals("player 3"))
								play3turn(a,b,c,d);
							else if(z.equals("player 4"))
								play4turn(a,b,c,d);
							else
								play1turn(a,b,c,d);
								//System.out.print(a.ohand[12]);
							});
								}	
				}































/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						
			}
				
		/*			
		while(i<12){
				if(z.equals("player 2")){
					inP=null;
					inP=b.play(b.hand);
					q=inP;
					//System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());
					e=d.play(d.hand);
					//System.out.println(d.name+ " played" + " " + e.toString());
					r=a.play(a.hand);
					
					Floor floor = new Floor(q,w,e,r);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;
				}
				else if(z.equals("player 3")){
					inP=null;
					inP=c.play(c.hand);
					w=inP;
					//System.out.println(c.name+ " played" + " " + w.toString());
					e=d.play(d.hand);
					//System.out.println(d.name+ " played" + " " + e.toString());
					r=a.play(a.hand);
					q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					
					Floor floor = new Floor(w,e,r,q);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;
				}
				else if(z.equals("player 4")){
					inP=null;
					inP=d.play(d.hand);
					e=inP;
					//System.out.println(d.name+ " played" + " " + e.toString());
					r=a.play(a.hand);
					q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());			
					
					Floor floor = new Floor(e,r,q,w);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;
				}
				else{
					inP=null;
					inP=a.play(a.hand);
					r=inP;
					q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());	
					e=d.play(d.hand);
					//System.out.println(d.name+ " played" + " " + e.toString());
					
					Floor floor = new Floor(r,q,w,e);
					//System.out.print("The biggest card is : " + biggest(floor.inPlay));
					printHands(a,b,c,d);
					whoNext(floor.inPlay, q,w,e,r);		
					i++;					
				}
		
							
			}*/
	
			//if(team2score>team1score)
				////System.out.print("You lost!");
			//else
				////System.out.print("You won!");
			
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			
			public void play4turn(player1 a, player2 b, player3 c, player4 d){
				
				Cards e;
				inP=null;
				inP=d.play(d.hand);
				e=inP;
				d.fNm(e);
				////System.out.println(d.name+ " played" + " " + e.toString());
				
				
				
				if(Play.inP.gSuit().equals(a.ohand[0].gSuit())){
					
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[0]);
					pt.setCycleCount(1);
					
					
					a.FXHand[0].setOnMouseClicked(oo -> {
					pt.play();
					
					Cards q=b.play(b.hand);
					//System.out.println(b.name+ " played" + " " + q.toString());
					Cards w=c.play(c.hand);
					//System.out.println(c.name+ " played" + " " + w.toString());
					
					
				Floor floor = new Floor(q,w,e,a.ohand[0]);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[0]);
				if(z.equals("player 2"))
					play2turn(a,b,c,d);
				else if(z.equals("player 3"))
					play3turn(a,b,c,d);
					//System.out.print(a.ohand[0]);
					});

						}
				if(Play.inP.gSuit().equals(a.ohand[1].gSuit())){
					
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[1]);
					pt.setCycleCount(1);
					
					
					a.FXHand[1].setOnMouseClicked(oo -> { 
						pt.play();
						
						Cards q=b.play(b.hand);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						//System.out.println(c.name+ " played" + " " + w.toString());
						Floor floor = new Floor(q,w,e,a.ohand[1]);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[1]);
						
						
					
						//System.out.print(a.ohand[1]);
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[2].gSuit())){
							
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[2]);
					pt.setCycleCount(1);
					
					
					a.FXHand[2].setOnMouseClicked(oo -> { 
						Cards q=b.play(b.hand);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						//System.out.println(c.name+ " played" + " " + w.toString());
						Floor floor = new Floor(q,w,e,a.ohand[2]);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[2]);
					pt.play();
						//System.out.print(a.ohand[2]);
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[3].gSuit())){
							
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[3]);
					pt.setCycleCount(1);
					
					
					a.FXHand[3].setOnMouseClicked(oo -> { 
						Cards q=b.play(b.hand);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						//System.out.println(c.name+ " played" + " " + w.toString());
						Floor floor = new Floor(q,w,e,a.ohand[3]);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[3]);
					pt.play();
						//System.out.print(a.ohand[3]);
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[4].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[4]);
							pt.setCycleCount(1);
							
							
							a.FXHand[4].setOnMouseClicked(oo -> {
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[4]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[4]);
							pt.play();
								//System.out.print(a.ohand[4]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[5].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[5]);
							pt.setCycleCount(1);
							
							
							a.FXHand[5].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[5]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[5]);
							pt.play();
								//System.out.print(a.ohand[5]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[6].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[6]);
							pt.setCycleCount(1);
							
							
							a.FXHand[6].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[6]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[6]);
							pt.play();
								//System.out.print(a.ohand[6]);
							});
								}
						
						
						
						if(Play.inP.gSuit().equals(a.ohand[7].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[7]);
							pt.setCycleCount(1);
							
							
							a.FXHand[7].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[7]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[7]);
							pt.play();
								//System.out.print(a.ohand[7]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[8].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[8]);
							pt.setCycleCount(1);
							
							
							a.FXHand[8].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[8]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[8]);
							pt.play();
								//System.out.print(a.ohand[8]);
							});
								}
						if(Play.inP.gSuit().equals(a.ohand[9].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[9]);
							pt.setCycleCount(1);
							
							
							a.FXHand[9].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[9]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[9]);
							pt.play();
								//System.out.print(a.ohand[9]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[10].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[10]);
							pt.setCycleCount(1);
							
							
							a.FXHand[10].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[10]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[10]);
							pt.play();
								//System.out.print(a.ohand[10]);
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[11].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[11]);
							pt.setCycleCount(1);
							
							
							a.FXHand[11].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[11]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[11]);
							pt.play();
								//System.out.print(a.ohand[11]);
							});
								}
						
						
						if(Play.inP.gSuit().equals(a.ohand[12].gSuit())){
							
							PathTransition pt = new PathTransition(Duration.millis(5000),
									new Line(200,-10,150,-150), a.FXHand[12]);
							pt.setCycleCount(1);
							
							
							a.FXHand[12].setOnMouseClicked(oo -> { 
								Cards q=b.play(b.hand);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(q,w,e,a.ohand[12]);
								//System.out.print("The biggest card is : " + biggest(floor.inPlay));
								printHands(a,b,c,d);
								whoNext(floor.inPlay, q,w,e,a.ohand[12]);
							pt.play();
								//System.out.print(a.ohand[12]);
							});
								}	
			}
			
			public void play1turn(player1 a, player2 b, player3 c, player4 d){

				inP=null;
				
				
				
				a.FXHand[0].setOnMouseClicked(oo -> {
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[0]);
					pt.setCycleCount(1);
				pt.play();
				
						inP=a.ohand[0];
						Cards q=b.play(b.hand);
						b.fNm(q);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						c.fNm(w);
						//System.out.println(c.name+ " played" + " " + w.toString());	
						Cards e=d.play(d.hand);
						d.fNm(e);
						//System.out.println(d.name+ " played" + " " + e.toString());
							
						Floor floor = new Floor(a.ohand[0],q,w,e);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[0]);	
						
				
				//System.out.print(a.ohand[0]);
				});

					
				
				a.FXHand[1].setOnMouseClicked(oo -> {
				PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[1]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[1];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[1],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[1]);	
					//System.out.print(a.ohand[1]);
				});
					
				
				a.FXHand[2].setOnMouseClicked(oo -> {
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[2]);
					pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[2];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[2],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[2]);	
				
				
					//System.out.print(a.ohand[2]);
				});
					
					
					
				
				
				a.FXHand[3].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[3]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[3];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[3],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[3]);	
				
				
				
					//System.out.print(a.ohand[3]);
				});
					
					

				a.FXHand[4].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[4]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[4];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[4],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[4]);	
				
				
					//System.out.print(a.ohand[4]);
					});
					
					
								
				a.FXHand[5].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[5]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[5];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[5],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[5]);	
				
				
				
						//System.out.print(a.ohand[5]);
						});	
						
						
				a.FXHand[6].setOnMouseClicked(oo -> {
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[6]);
					pt.setCycleCount(1);
					
				pt.play();
				inP=a.ohand[6];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[6],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[6]);	
				
						//System.out.print(a.ohand[6]);
						});
							


				a.FXHand[7].setOnMouseClicked(oo -> {
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[7]);
					pt.setCycleCount(1);
								
					
				pt.play();
				inP=a.ohand[7];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[7],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[7]);	
				
				
						//System.out.print(a.ohand[7]);
						});
											
					

				
				a.FXHand[8].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[8]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[8];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[8],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[8]);	
				
				
				
						//System.out.print(a.ohand[8]);
						});





						
						
				a.FXHand[9].setOnMouseClicked(oo -> {
					PathTransition pt = new PathTransition(Duration.millis(5000),
							new Line(200,-10,150,-150), a.FXHand[8]);
					pt.setCycleCount(1);
					
				pt.play();
				
				inP=a.ohand[9];
				
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[9],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[9]);	
				
				
						//System.out.print(a.ohand[9]);
						});
							
					


						
				a.FXHand[10].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[10]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[10];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[10],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[10]);	
				
						//System.out.print(a.ohand[10]);
						});
							

						
				a.FXHand[11].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[11]);
				pt.setCycleCount(1);
				pt.play();
				inP=a.ohand[11];
				Cards q=b.play(b.hand);
				b.fNm(q);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[11],q,w,e);
				//System.out.print("The biggest card is : " + biggest(floor.inPlay));
				printHands(a,b,c,d);
				whoNext(floor.inPlay, q,w,e,a.ohand[11]);	
				
						//System.out.print(a.ohand[11]);
						});
							
				
				a.FXHand[12].setOnMouseClicked(oo -> {	PathTransition pt = new PathTransition(Duration.millis(5000),
						new Line(200,-10,150,-150), a.FXHand[12]);
				pt.setCycleCount(1);
						pt.play();
						inP=a.ohand[12];
						Cards q=b.play(b.hand);
						b.fNm(q);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						c.fNm(w);
						//System.out.println(c.name+ " played" + " " + w.toString());	
						Cards e=d.play(d.hand);
						d.fNm(e);
						//System.out.println(d.name+ " played" + " " + e.toString());
							
						Floor floor = new Floor(a.ohand[12],q,w,e);
						//System.out.print("The biggest card is : " + biggest(floor.inPlay));
						printHands(a,b,c,d);
						whoNext(floor.inPlay, q,w,e,a.ohand[12]);	
						
						//System.out.print(a.ohand[12]);
						});
			}
	
	public Cards biggest(Cards[] a){
		int temp = Integer.parseInt(a[0].gRank2());
		int b=0;
		for(int i = 1; i<a.length ; i++){
			if(a[0].gSuit().equals(a[i].gSuit())){
				if(temp<Integer.parseInt(a[i].gRank2())){
					temp = Integer.parseInt(a[i].gRank2());
					b=i;
				}			
			}
		}
		return a[b];
		
	}
	
	public void whoNext(Cards[] floor, Cards q, Cards w, Cards e, Cards r){
		
		
		if(biggest(floor).equals(q)||biggest(floor).equals(e)){
			team2score++;
			scoreteam2.setText("Team2: " + team2score);
			
		}
		if(biggest(floor).equals(r)||biggest(floor).equals(w)){
		team1score++;
		scoreteam1.setText("Team 1: " + team1score);
		}
		//System.out.print("\n Team 1 score: " + team1score);
		//System.out.println("\n Team 2 score: " + team2score);	
				winner();
		if((biggest(floor).gRank2().equals(q.gRank2()))&&(biggest(floor).gSuit().equals(q.gSuit()))){
			z= ("player 2");
			//System.out.println(z);
		}
			else if ((biggest(floor).gRank2().equals(w.gRank2()))&&(biggest(floor).gSuit().equals(w.gSuit()))){
			z= ("player 3");
			//System.out.println(z);
			}
			else if((biggest(floor).gRank2().equals(e.gRank2()))&&(biggest(floor).gSuit().equals(e.gSuit()))){
						z= ("player 4");
						//System.out.println(z);
						}
			else{
				z= ("Your turn next");
				//System.out.println(z);
				}
				
	}
	public void winner(){
		if(team1score+team2score==13){
			if(team1score>team2score)
				Winner.setText("Your Team Wins");
			if(team2score>team1score)
				Winner.setText("You Lose, Team 2 wins");
		}
			
	}
	
	public void printHands(player1 a, player2 b, player3 c, player4 d){
		//System.out.print("\n");
		for(int i=0; i<a.hand.length; i++){
			//System.out.print(a.hand[i] + ", ");
		}
		//System.out.print("\n");
		for(int i=0; i<b.hand.length; i++){
			//System.out.print(b.hand[i] + ", ");
		}
		//System.out.print("\n");
		for(int i=0; i<c.hand.length; i++){
			//System.out.print(c.hand[i] + ", ");
		}
		//System.out.print("\n");
		for(int i=0; i<d.hand.length; i++){
			//System.out.print(d.hand[i] + ", ");
		}
	}
	

	
}
