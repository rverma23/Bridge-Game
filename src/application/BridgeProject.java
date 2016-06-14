package application;

//RAHUL VERMA 
//STUDENT ID: 110134817
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
public class BridgeProject extends Application {
	
	static Pane pane = new Pane();
		Dealer d1 = new Dealer();
		
		player1 a = new player1("Player 1");
		player2 b = new player2("Player 2");
		player3 c = new player3("Player 3");
		player4 d = new player4("Player 4");
		Play p = new Play();
	Button btn = new Button("Next Round");
	
		
	public void start(Stage primaryStage){
	
		
		//FXDeck deck1 = new FXDeck();
		/*Label scoreteam1 = new Label("p.team 1: 0");
		Label scoreteam2 = new Label("p.team 2: 0");
	*/
		Play.Winner.setLayoutX(750);
		Play.Winner.setLayoutY(0);
		pane.getChildren().add(Play.Winner);
		Play.scoreteam1.setLayoutY(500);
		Play.scoreteam1.setFont(new Font("Arial", 30));
		
		Play.scoreteam2.setLayoutY(550);
		Play.scoreteam2.setFont(new Font("Arial", 30));
		pane.getChildren().addAll(Play.scoreteam1,Play.scoreteam2);
		pane.getChildren().add(btn);
		pane.setStyle("-fx-background-color: #DCE4E4;");
		/*for(int i =0; i<deck1.deck.length;i++){
		pane.getChildren().add(new ImageView(deck1.deck[i]));
		}*/
		
		//pane1.setBottom(pane);
		
		/*int n=0;
		for(int i=0;i<13;i++){
			pane.add(new ImageView(deck1.deck[n]),0,1);
			n++;
			pane.add(new ImageView(deck1.deck[n]),1,0);
			n++;
			pane.add(new ImageView(deck1.deck[n]),2,1);
			n++;
			pane.add(new ImageView(deck1.deck[n]),1,2);
			n++;					
		}*/
		d1.dealCards(a, b, c, d);		
		a.reorder();
		a.makeFXHand();
		ImageView[] FXHandb = makeFXHand(b);
		c.makeFXHand();
		d.makeFXHand();
		a.makeohand();
		b.makeohand();
		c.makeohand();
		d.makeohand();
		b.makebhand();
		c.makebhand();
		d.makebhand();
		a.makecjHand();
		a.makebhand();
		Label label = new Label(a.name);
		label.setFont(new Font("Arial", 20));
		label.setLayoutX(500);
		label.setLayoutY(550);
		Label label2 = new Label(b.name);
		label2.setFont(new Font("Arial", 20));
		label2.setRotate(270);
		label2.setLayoutX(20);
		label2.setLayoutY(300);
		Label label3 = new Label(c.name);
		label3.setFont(new Font("Arial", 20));
		label3.setLayoutX(500);
		label3.setLayoutY(25);	
		Label label4 = new Label(d.name);
		label4.setFont(new Font("Arial", 20));
		label4.setRotate(90);
		label4.setLayoutX(1300);
		label4.setLayoutY(300);	
		pane.getChildren().addAll(label,label2,label3,label4);
		//pane.setStyle("-fx-background-color: #336020;");
		for(int i = 0; i<13;i++){
			ImageView imageView1 = a.bhand[i];
			imageView1.setFitHeight(100);
			imageView1.setFitWidth(100);
			imageView1.setLayoutX(500+(20*i));
			imageView1.setLayoutY(450);
			imageView1.setOpacity(0);
			pane.getChildren().add(a.bhand[i]);
			imageView1.setOnMouseClicked(e -> {
			
			});
			ImageView imageView = (a.FXHand[i]);
			imageView.setFitHeight(100);
			imageView.setFitWidth(100);	
			imageView.setLayoutX(500+(20*i));
			imageView.setLayoutY(450);			
			pane.getChildren().add(imageView);
			
			
		}
		for(int i = 0; i<13;i++){
			ImageView imageView = (FXHandb[i]);
			imageView.setFitHeight(100);
			imageView.setFitWidth(100);
			imageView.setRotate(90);
			imageView.setLayoutY(100+(20*i));
			imageView.setLayoutX(100);			
			pane.getChildren().add(FXHandb[i]);
			ImageView imageView1 = (b.bhand[i]);
			imageView1.toFront();
			imageView1.setFitHeight(100);
			imageView1.setFitWidth(100);
			imageView1.setRotate(90);
			imageView1.setLayoutY(100+(20*i));
			imageView1.setLayoutX(100);			
			pane.getChildren().add(b.bhand[i]);
		}
		for(int i = 0; i<13;i++){
			ImageView imageView = (c.FXHand[i]);
			imageView.setFitHeight(100);
			imageView.setFitWidth(100);
			imageView.setLayoutX(500+(20*i));
			imageView.setLayoutY(50);
			pane.getChildren().add(imageView);
			ImageView imageView1 = (c.bhand[i]);
			imageView1.toFront();
			imageView1.setFitHeight(100);
			imageView1.setFitWidth(100);
			imageView1.setLayoutX(500+(20*i));
			imageView1.setLayoutY(50);			
			pane.getChildren().add(c.bhand[i]);
			
		}
		for(int i = 0; i<13;i++){
			ImageView imageView = (d.FXHand[i]);			
			imageView.setFitHeight(100);
			imageView.setFitWidth(100);
			imageView.setRotate(90);
			imageView.setLayoutY(100+(20*i));
			imageView.setLayoutX(1200);
			pane.getChildren().add(imageView);
			ImageView imageView1 = (d.bhand[i]);
			imageView1.toFront();
			imageView1.setFitHeight(100);
			imageView1.setFitWidth(100);
			imageView1.setRotate(90);
			imageView1.setLayoutY(100+(20*i));
			imageView1.setLayoutX(1200);
			pane.getChildren().add(imageView1);
			
		}
	
		
		/*Button start = new Button("Start");
		
		pane.getChildren().add(start);*/
		btn.setLayoutX(1000);
		btn.setLayoutY(500);
		Label l1 = new Label();
		l1.setText("^ Click the button to start the game."
				+ "\n At the end of each round click the button to start \nthe new round." );
		l1.setLayoutX(1000);
		l1.setLayoutY(525);
		l1.setFont(new Font("Arial", 18));
		pane.getChildren().add(l1);
	//	p.printHands(a, b, c, d);
		//System.out.print("\n");
		for(int i =0; i<d.ohand.length;i++)
			//System.out.print(d.ohand[i]+", ");
		//System.out.print("\n");
	
				

		
	Play.Winner.toFront();
	play1turn(a,b,c,d,FXHandb);
			/*Cards x =b.play(b.hand);
		b.fNm(x);
			Play.p.inP=x;
			
			
			Cards y = c.play(c.hand);			
			int m = c.findCard(y);
			//System.out.print(y.toString());
			p.p.printHands(a, b, c, d);
			
			PathTransition at = new PathTransition(Duration.seconds(3),
					new Line(c.FXHand[m].getX(),c.FXHand[m].getY(),0,200), c.FXHand[m]);
			at.setDelay(Duration.seconds(3));
			at.setCycleCount(1);
			at.play();
			a.moveCard();/////WOW this actually worked!
			//System.out.print(p.p1played);
			*/
			////System.out.print(a.moveCard());
		Scene scene = new Scene(pane, 1500,600);
		primaryStage.setScene(scene);
		//primaryStage.setResizable(false);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);

	}
	public ImageView[] makeFXHand(player2 b){
		ImageView[] FXHand = new ImageView[13];
		for(int i = 0; i<b.hand.length;i++){
			FXHand[i]= new ImageView(new Image("./application/images/Playing_card_"+b.hand[i].toString()+".jpg"));
		}
		return FXHand;
	}
	
	public void fNm(Cards x, player2 b, ImageView[] FXHandb){
		int n =b.findCard(x);
		//System.out.print(x.toString());
		
		pane.getChildren().remove(b.bhand[n]);
		//System.out.print("\n");
		FXHandb[n].toFront();
		
		
		FXHandb[n].setLayoutX(100);
		FXHandb[n].setLayoutY(FXHandb[7].getLayoutY());
		
		
		
		
		
		PathTransition at = new PathTransition(Duration.seconds(3),
				new Line(100,50,570,50), FXHandb[n]);
		at.setDelay(Duration.seconds(3));
		at.setCycleCount(1);
		at.play();
	}
	

public void roundFX(player1 a, player2 b, player3 c, player4 d, ImageView[] FXHandb){

		
		
		Play.inP=null;
		Cards q,w,e;
		p.printHands(a,b,c,d);
		if(p.team1score==0 && p.team2score==0){
			//System.out.print("\n");
			Play.inP=b.play(b.hand);
			 q=Play.inP;
			fNm(q,b, FXHandb);
			////System.out.println(b.name+ " played" + " " + q.toString());
			w=c.play(c.hand);
			c.fNm(w);
			pane.getChildren().remove(c.bhand[c.findCard(w)]);
			
			e=d.play(d.hand);			
			d.fNm(e);
			pane.getChildren().remove(d.bhand[d.findCard(e)]);
			////System.out.println(c.name+ " played" + " " + w.toString());
			
			////System.out.println(d.name+ " played" + " " + e.toString());
		/*	boolean alpha=false;;
			for(int i=0; i<a.FXHand.length;i++){
				if(!Play.inP.gSuit().equals(a.hand[i].gSuit()))
						a.FXHand[i].setDisable(true);
				else
					alpha = true;
			}
			if(!alpha){
				for(int i=0; i<a.FXHand.length;i++)
					
							a.FXHand[i].setDisable(false);
			}*/
			
			if(Play.inP.gSuit().equals(a.ohand[0].gSuit())){
				
				
				
				
				PathTransition pt = new PathTransition(Duration.seconds(2),
						new Line(100,0,100,-100), a.FXHand[0]);
				pt.setCycleCount(1);
				
				
				a.FXHand[0].setOnMouseClicked(oo -> {
					a.FXHand[0].toFront();
				a.FXHand[0].setLayoutX(a.FXHand[7].getLayoutX());	
					
					
				pt.play();
				
				
				
				//System.out.print(a.ohand[0]);
			Floor floor = new Floor(q,w,e,a.ohand[0]);
			//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
			p.printHands(a,b,c,d);
			
			
			p.whoNext(floor.inPlay, q,w,e,a.ohand[0]);
			if(p.z.equals("player 2"))
				play2turn(a,b,c,d,FXHandb);
			else if (p.z.equals("player 3"))
				play3turn(a,b,c,d,FXHandb);
			else if(p.z.equals("player 4"))
				play4turn(a,b,c,d,FXHandb);
			else
				play1turn(a,b,c,d,FXHandb);
				
				});
		
					}
			if(Play.inP.gSuit().equals(a.ohand[1].gSuit())){
				
				PathTransition pt = new PathTransition(Duration.seconds(2),
						new Line(100,0,100,-100), a.FXHand[1]);
				pt.setCycleCount(1);
				
				
				a.FXHand[1].setOnMouseClicked(oo -> {a.FXHand[1].toFront();
				a.FXHand[1].setLayoutX(a.FXHand[7].getLayoutX());	 
					pt.play();
					//System.out.print(a.ohand[1]);
					
					
					Floor floor = new Floor(q,w,e,a.ohand[1]);
					//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
					p.printHands(a,b,c,d);
					p.whoNext(floor.inPlay, q,w,e,a.ohand[1]);
					if(p.z.equals("player 2"))
						play2turn(a,b,c,d,FXHandb);
					else if (p.z.equals("player 3"))
						play3turn(a,b,c,d,FXHandb);
					else if(p.z.equals("player 4"))
						play4turn(a,b,c,d,FXHandb);
					else
						play1turn(a,b,c,d,FXHandb);
					
				
				});
					}
					
					
					if(Play.inP.gSuit().equals(a.ohand[2].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[2]);
						pt.setCycleCount(1);
						
						
						a.FXHand[2].setOnMouseClicked(oo -> {a.FXHand[2].toFront();
						a.FXHand[2].setLayoutX(a.FXHand[7].getLayoutX());	
					
					pt.play();
					//System.out.print(a.ohand[2]);
					
					Floor floor = new Floor(q,w,e,a.ohand[2]);
					//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
					p.printHands(a,b,c,d);
					p.whoNext(floor.inPlay, q,w,e,a.ohand[2]);
					if(p.z.equals("player 2"))
						play2turn(a,b,c,d,FXHandb);
					else if (p.z.equals("player 3"))
						play3turn(a,b,c,d,FXHandb);
					else if(p.z.equals("player 4"))
						play4turn(a,b,c,d,FXHandb);
					else
						play1turn(a,b,c,d,FXHandb);
				
				});
					}
					
					
					if(Play.inP.gSuit().equals(a.ohand[3].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[3]);
						pt.setCycleCount(1);
						
						
						a.FXHand[3].setOnMouseClicked(oo -> {a.FXHand[3].toFront();
						a.FXHand[3].setLayoutX(a.FXHand[7].getLayoutX());	
						pt.play();
					//System.out.print(a.ohand[3]);
					
					Floor floor = new Floor(q,w,e,a.ohand[3]);
					//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
					p.printHands(a,b,c,d);
					p.whoNext(floor.inPlay, q,w,e,a.ohand[3]);
					if(p.z.equals("player 2"))
						play2turn(a,b,c,d,FXHandb);
					else if (p.z.equals("player 3"))
						play3turn(a,b,c,d,FXHandb);
					else if(p.z.equals("player 4"))
						play4turn(a,b,c,d,FXHandb);
					else
						play1turn(a,b,c,d,FXHandb);
				
				});
					}
					
					
					if(Play.inP.gSuit().equals(a.ohand[4].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[4]);
						pt.setCycleCount(1);
						
						
						a.FXHand[4].setOnMouseClicked(oo -> {a.FXHand[4].toFront();
						a.FXHand[4].setLayoutX(a.FXHand[7].getLayoutX());	
							pt.play();
							//System.out.print(a.ohand[4]);
							
							Floor floor = new Floor(q,w,e,a.ohand[4]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[4]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
						
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[5].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[5]);
						pt.setCycleCount(1);
						
						
						a.FXHand[5].setOnMouseClicked(oo -> {a.FXHand[5].toFront();
						a.FXHand[5].setLayoutX(a.FXHand[7].getLayoutX());	
							pt.play();
							//System.out.print(a.ohand[5]);
							
							Floor floor = new Floor(q,w,e,a.ohand[5]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[5]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
						
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[6].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[6]);
						pt.setCycleCount(1);
						
						
						a.FXHand[6].setOnMouseClicked(oo -> {a.FXHand[6].toFront();
						a.FXHand[6].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
							//System.out.print(a.ohand[6]);
							
							Floor floor = new Floor(q,w,e,a.ohand[6]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[6]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
					
						});
							}
					
					
					
					if(Play.inP.gSuit().equals(a.ohand[7].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[7]);
						pt.setCycleCount(1);
						
						
						a.FXHand[7].setOnMouseClicked(oo -> {a.FXHand[7].toFront();
						a.FXHand[7].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
							//System.out.print(a.ohand[7]);
							
							Floor floor = new Floor(q,w,e,a.ohand[7]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[7]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
					
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[8].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[8]);
						pt.setCycleCount(1);
						
						
						a.FXHand[8].setOnMouseClicked(oo -> {a.FXHand[8].toFront();
						a.FXHand[8].setLayoutX(a.FXHand[7].getLayoutX());	
							pt.play();
							//System.out.print(a.ohand[8]);
							
							Floor floor = new Floor(q,w,e,a.ohand[8]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[8]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
						
						});
							}
					if(Play.inP.gSuit().equals(a.ohand[9].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[9]);
						pt.setCycleCount(1);
						
						
						a.FXHand[9].setOnMouseClicked(oo -> {a.FXHand[9].toFront();
						a.FXHand[9].setLayoutX(a.FXHand[7].getLayoutX());	 
							pt.play();
							//System.out.print(a.ohand[9]);
							
							Floor floor = new Floor(q,w,e,a.ohand[9]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[9]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
						
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[10].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[10]);
						pt.setCycleCount(1);
						
						
						a.FXHand[10].setOnMouseClicked(oo -> {a.FXHand[10].toFront();
						a.FXHand[10].setLayoutX(a.FXHand[7].getLayoutX());	
						pt.play();
							//System.out.print(a.ohand[10]);
							
							Floor floor = new Floor(q,w,e,a.ohand[10]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[10]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
					
						});
							}
					
					if(Play.inP.gSuit().equals(a.ohand[11].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[11]);
						pt.setCycleCount(1);
						
						
						a.FXHand[11].setOnMouseClicked(oo -> {a.FXHand[11].toFront();
						a.FXHand[11].setLayoutX(a.FXHand[7].getLayoutX());	
							pt.play();
							//System.out.print(a.ohand[11]);
							
							Floor floor = new Floor(q,w,e,a.ohand[11]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[11]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
						
						});
							}
					
					
					if(Play.inP.gSuit().equals(a.ohand[12].gSuit())){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[12]);
						pt.setCycleCount(1);
						
						
						a.FXHand[12].setOnMouseClicked(oo -> {a.FXHand[12].toFront();
						a.FXHand[12].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
							//System.out.print(a.ohand[12]);
							
							Floor floor = new Floor(q,w,e,a.ohand[12]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[12]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
					
						});
							}		
		}
	}
			

public void play2turn(player1 a, player2 b, player3 c, player4 d, ImageView[] FXHandb){
				for(int i=0; i<13;i++){
					
					a.FXHand[i].setDisable(true);
	
		}
				btn.setDisable(false);
				btn.setOnAction( tt -> {
					for(int i=0; i<13;i++){
						btn.setDisable(true);
						a.FXHand[i].setDisable(false);
		
			}
				Play.inP=null;
				Cards q,w,e;
				p.printHands(a,b,c,d);
				
					//System.out.print("\n");
					Play.inP=b.play(b.hand);
					 q=Play.inP;
					fNm(q,b, FXHandb);
					////System.out.println(b.name+ " played" + " " + q.toString());
					w=c.play(c.hand);
					c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
					////System.out.println(c.name+ " played" + " " + w.toString());
					e=d.play(d.hand);
					d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
					////System.out.println(d.name+ " played" + " " + e.toString());
					/*
					boolean alpha=false;;
					for(int i=0; i<a.hand.length;i++){
						if(!Play.inP.gSuit().equals(a.hand[i].gSuit()))
								a.FXHand[i].setDisable(true);
						else
							alpha = true;
					}
					if(!alpha){
						for(int i=0; i<13;i++){							
									a.FXHand[i].setDisable(false);
					}}*/
			for(int i = 0; i<13 ; i++){
				if(a.cjHand[i]==null){
					
				}
				else if(!a.cjHand[i].gSuit().equals(Play.inP.gSuit())){
					a.FXHand[i].setDisable(true);
				}
			}
			boolean t=true;
			for(int i = 0; i<13;i++){
				if(a.cjHand[i]==null)
				{
					
				}
				else{
				if(!a.cjHand[i].equals(Play.inP.gSuit())){
					t=true;
				}
				if(a.cjHand[i].gSuit().equals(Play.inP.gSuit())){
					t=false;
					break;
				}
				}
				
			}
			if(t){
				for(int i = 0; i<13;i++)
					a.FXHand[i].setDisable(false);
			}
					if(Play.inP.gSuit().equals(a.ohand[0].gSuit())||t){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[0]);
						pt.setCycleCount(1);
						
						
						a.FXHand[0].setOnMouseClicked(oo -> {
							pane.getChildren().remove(a.bhand[0]);
							a.playcj(a.cjHand[0]);
							a.FXHand[0].toFront();
						a.FXHand[0].setLayoutX(a.FXHand[7].getLayoutX());	
						pt.play();
						//System.out.print(a.ohand[0]);
						
						
						Floor floor = new Floor(q,w,e,a.ohand[0]);
					//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
					p.printHands(a,b,c,d);
					p.whoNext(floor.inPlay, q,w,e,a.ohand[0]);
					if(p.z.equals("player 2"))
						play2turn(a,b,c,d,FXHandb);
					else if (p.z.equals("player 3"))
						play3turn(a,b,c,d,FXHandb);
					else if(p.z.equals("player 4"))
						play4turn(a,b,c,d,FXHandb);
					else
						play1turn(a,b,c,d,FXHandb);
						
						
						});

							}
					if(Play.inP.gSuit().equals(a.ohand[1].gSuit())||t){
						
						PathTransition pt = new PathTransition(Duration.seconds(2),
								new Line(100,0,100,-100), a.FXHand[1]);
						pt.setCycleCount(1);
						
						
						a.FXHand[1].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[1]);a.playcj(a.cjHand[1]);
						a.FXHand[1].toFront();
						a.FXHand[1].setLayoutX(a.FXHand[7].getLayoutX());	
							pt.play();
							//System.out.print(a.ohand[1]);
							
							Floor floor = new Floor(q,w,e,a.ohand[1]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[1]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
							
							
						
						});
							}
							
							
							if(Play.inP.gSuit().equals(a.ohand[2].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[2]);
								pt.setCycleCount(1);
								
								
								a.FXHand[2].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[2]);
									a.playcj(a.cjHand[2]);
									a.FXHand[2].toFront();
								a.FXHand[2].setLayoutX(a.FXHand[7].getLayoutX());	 
							pt.play();
							//System.out.print(a.ohand[2]);
							
							Floor floor = new Floor(q,w,e,a.ohand[2]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[2]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
						
						});
							}
							
							
							if(Play.inP.gSuit().equals(a.ohand[3].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[3]);
								pt.setCycleCount(1);
								
								
								a.FXHand[3].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[3]);
									a.playcj(a.cjHand[3]);
									a.FXHand[3].toFront();
								a.FXHand[3].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
							//System.out.print(a.ohand[3]);
							
							Floor floor = new Floor(q,w,e,a.ohand[3]);
							//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
							p.printHands(a,b,c,d);
							p.whoNext(floor.inPlay, q,w,e,a.ohand[3]);
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
					
						});
							}
							
							
							if(Play.inP.gSuit().equals(a.ohand[4].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[4]);
								pt.setCycleCount(1);
								
								
								a.FXHand[4].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[4]);
									a.playcj(a.cjHand[4]);
									a.FXHand[4].toFront();
								a.FXHand[4].setLayoutX(a.FXHand[7].getLayoutX());	
									pt.play();
									//System.out.print(a.ohand[4]);
									
									Floor floor = new Floor(q,w,e,a.ohand[4]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[4]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[5].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[5]);
								pt.setCycleCount(1);
								
								
								a.FXHand[5].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[5]);
									a.playcj(a.cjHand[5]);
									a.FXHand[5].toFront();
								a.FXHand[5].setLayoutX(a.FXHand[7].getLayoutX());	
									pt.play();
									//System.out.print(a.ohand[5]);
									
									Floor floor = new Floor(q,w,e,a.ohand[5]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[5]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[6].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[6]);
								pt.setCycleCount(1);
								
								
								a.FXHand[6].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[6]);
									a.playcj(a.cjHand[6]);
									a.FXHand[6].toFront();
								a.FXHand[6].setLayoutX(a.FXHand[7].getLayoutX());	
									pt.play();
									//System.out.print(a.ohand[6]);
									
									
									Floor floor = new Floor(q,w,e,a.ohand[6]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[6]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							
							
							
							if(Play.inP.gSuit().equals(a.ohand[7].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[7]);
								pt.setCycleCount(1);
								
								
								a.FXHand[7].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[7]);
									a.playcj(a.cjHand[7]);
									a.FXHand[7].toFront();
								a.FXHand[7].setLayoutX(a.FXHand[7].getLayoutX());	 
									pt.play();
									//System.out.print(a.ohand[7]);
									
									
									Floor floor = new Floor(q,w,e,a.ohand[7]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[7]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[8].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[8]);
								pt.setCycleCount(1);
								
								
								a.FXHand[8].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[8]);
									a.playcj(a.cjHand[8]);
									a.FXHand[8].toFront();
								a.FXHand[8].setLayoutX(a.FXHand[7].getLayoutX());	
									pt.play();
									//System.out.print(a.ohand[8]);
									
									Floor floor = new Floor(q,w,e,a.ohand[8]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[8]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							if(Play.inP.gSuit().equals(a.ohand[9].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[9]);
								pt.setCycleCount(1);
								
								
								a.FXHand[9].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[9]);
									a.playcj(a.cjHand[0]);
									a.FXHand[9].toFront();
								a.FXHand[9].setLayoutX(a.FXHand[7].getLayoutX());	 
									pt.play();
									//System.out.print(a.ohand[9]);
									
									
									Floor floor = new Floor(q,w,e,a.ohand[9]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[9]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[10].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[10]);
								pt.setCycleCount(1);
								
								
								a.FXHand[10].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[10]);
									a.playcj(a.cjHand[10]);
									a.FXHand[10].toFront();
								a.FXHand[10].setLayoutX(a.FXHand[7].getLayoutX());	 
										pt.play();
									//System.out.print(a.ohand[10]);
									
									Floor floor = new Floor(q,w,e,a.ohand[10]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[10]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
							
								});
									}
							
							if(Play.inP.gSuit().equals(a.ohand[11].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[11]);
								pt.setCycleCount(1);
								
								
								a.FXHand[11].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[11]);
									a.playcj(a.cjHand[11]);
									a.FXHand[11].toFront();
								a.FXHand[11].setLayoutX(a.FXHand[7].getLayoutX());	 
									pt.play();
									//System.out.print(a.ohand[11]);
									
									Floor floor = new Floor(q,w,e,a.ohand[11]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[11]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}
							
							
							if(Play.inP.gSuit().equals(a.ohand[12].gSuit())||t){
								
								PathTransition pt = new PathTransition(Duration.seconds(2),
										new Line(100,0,100,-100), a.FXHand[12]);
								pt.setCycleCount(1);
								
								
								a.FXHand[12].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[12]);
									a.playcj(a.cjHand[12]);
									a.FXHand[12].toFront();
								a.FXHand[12].setLayoutX(a.FXHand[7].getLayoutX());	 
									pt.play();
									//System.out.print(a.ohand[12]);
									
									Floor floor = new Floor(q,w,e,a.ohand[12]);
									//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
									p.printHands(a,b,c,d);
									p.whoNext(floor.inPlay, q,w,e,a.ohand[12]);
									if(p.z.equals("player 2"))
										play2turn(a,b,c,d,FXHandb);
									else if (p.z.equals("player 3"))
										play3turn(a,b,c,d,FXHandb);
									else if(p.z.equals("player 4"))
										play4turn(a,b,c,d,FXHandb);
									else
										play1turn(a,b,c,d,FXHandb);
								
								});
									}		
			});
				}
			
			public void play3turn(player1 a, player2 b, player3 c, player4 d, ImageView[] FXHandb){
				btn.setDisable(false);
				for(int i=0; i<13;i++){
					
					a.FXHand[i].setDisable(true);
	
		}
				btn.setOnAction(tt ->{
					btn.setDisable(true);
					for(int i=0; i<13;i++){
						
						a.FXHand[i].setDisable(false);
		
			}
				boolean y = true;
				Cards w,e;
				Play.inP=null;
				Play.inP=c.play(c.hand);
				w=Play.inP;
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				////System.out.println(c.name+ " played" + " " + w.toString());
				e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				////System.out.println(d.name+ " played" + " " + e.toString());
			/* alpha=false;;
				for(int i=0; i<a.hand.length;i++){
					if(!Play.inP.gSuit().equals(a.hand[i].gSuit()))
							a.FXHand[i].setDisable(true);
					else
						alpha = true;
				}
				if(!alpha){
					for(int i=0; i<13;i++){						
								a.FXHand[i].setDisable(false);
				}
				}*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				if(y){
					for(int i = 0; i<13 ; i++){
						if(a.cjHand[i]==null){
							
						}
						else if(!a.cjHand[i].gSuit().equals(Play.inP.gSuit())){
							a.FXHand[i].setDisable(true);
						}
					}
					boolean t=true;
					for(int i = 0; i<13;i++){
						if(a.cjHand[i]==null)
						{
							
						}
						else{
						if(!a.cjHand[i].equals(Play.inP.gSuit())){
							t=true;
						}
						if(a.cjHand[i].gSuit().equals(Play.inP.gSuit())){
							t=false;
							break;
						}
						}
						
					}
					if(t){
						for(int i = 0; i<13;i++)
							a.FXHand[i].setDisable(false);
					}
				if(Play.inP.gSuit().equals(a.ohand[0].gSuit())||t){
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[0]);
					pt.setCycleCount(1);
					
					
					a.FXHand[0].setOnMouseClicked(oo -> {
						pane.getChildren().remove(a.bhand[0]);
						
						a.playcj(a.cjHand[0]);
						a.FXHand[0].toFront();
					a.FXHand[0].setLayoutX(a.FXHand[7].getLayoutX());	
						
						
					pt.play();
					//System.out.print(a.ohand[0]);
					
					Cards q=b.play(b.hand);
					fNm(q,b, FXHandb);
											
					Floor floor = new Floor(w,e,a.ohand[0],q);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[0]);
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
					
					});

						}
				if(Play.inP.gSuit().equals(a.ohand[1].gSuit())||t){
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[1]);
					pt.setCycleCount(1);
					
					
					a.FXHand[1].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[1]);
						a.playcj(a.cjHand[1]);
						a.FXHand[1].toFront();
					a.FXHand[1].setLayoutX(a.FXHand[7].getLayoutX());	 
						pt.play();
						//System.out.print(a.ohand[1]);
						Cards q=b.play(b.hand);
						fNm(q,b, FXHandb);
						
						Floor floor = new Floor(w,e,a.ohand[1],q);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[1]);
						if(p.z.equals("player 2"))
							play2turn(a,b,c,d,FXHandb);
						else if (p.z.equals("player 3"))
							play3turn(a,b,c,d,FXHandb);
						else if(p.z.equals("player 4"))
							play4turn(a,b,c,d,FXHandb);
						else
							play1turn(a,b,c,d,FXHandb);
						
					
						
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[2].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[2]);
							pt.setCycleCount(1);
							
							
							a.FXHand[2].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[2]);
								a.playcj(a.cjHand[2]);
								a.FXHand[2].toFront();
							a.FXHand[2].setLayoutX(a.FXHand[7].getLayoutX());	
						pt.play();
						//System.out.print(a.ohand[2]);
						Cards q=b.play(b.hand);
						fNm(q,b, FXHandb);
						Floor floor = new Floor(w,e,a.ohand[2],q);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[2]);
						if(p.z.equals("player 2"))
							play2turn(a,b,c,d,FXHandb);
						else if (p.z.equals("player 3"))
							play3turn(a,b,c,d,FXHandb);
						else if(p.z.equals("player 4"))
							play4turn(a,b,c,d,FXHandb);
						else
							play1turn(a,b,c,d,FXHandb);
					
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[3].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[3]);
							pt.setCycleCount(1);
							
							
							a.FXHand[3].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[3]);
								a.playcj(a.cjHand[3]);
								a.FXHand[3].toFront();
							a.FXHand[3].setLayoutX(a.FXHand[7].getLayoutX());	 
						pt.play();
							//System.out.print(a.ohand[3]);
						
						
						Cards q=b.play(b.hand);
						fNm(q,b, FXHandb);
						Floor floor = new Floor(w,e,a.ohand[3],q);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[3]);
						if(p.z.equals("player 2"))
							play2turn(a,b,c,d,FXHandb);
						else if (p.z.equals("player 3"))
							play3turn(a,b,c,d,FXHandb);
						else if(p.z.equals("player 4"))
							play4turn(a,b,c,d,FXHandb);
						else
							play1turn(a,b,c,d,FXHandb);
					
					
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[4].gSuit())||t){
							
							
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[4]);
							pt.setCycleCount(1);
							
							
							a.FXHand[4].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[4]);
								a.playcj(a.cjHand[4]);
								a.FXHand[4].toFront();
							a.FXHand[4].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[4]);
								
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[4],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[4]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
							
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[5].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[5]);
							pt.setCycleCount(1);
							
							
							a.FXHand[5].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[5]);
								a.playcj(a.cjHand[5]);
								a.FXHand[5].toFront();
							a.FXHand[5].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[5]);
								
								
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[5],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[5]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[6].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[6]);
							pt.setCycleCount(1);
							
							
							a.FXHand[6].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[6]);
								a.playcj(a.cjHand[6]);
								a.FXHand[6].toFront();
							a.FXHand[6].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[6]);
								
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[6],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[6]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						
						
						if(Play.inP.gSuit().equals(a.ohand[7].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[7]);
							pt.setCycleCount(1);
							
							
							a.FXHand[7].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[7]);
								a.playcj(a.cjHand[7]);
								a.FXHand[7].toFront();
							a.FXHand[7].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[7]);
								
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[7],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[7]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[8].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[8]);
							pt.setCycleCount(1);
							
							
							a.FXHand[8].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[8]);
								a.playcj(a.cjHand[8]);
								a.FXHand[8].toFront();
							a.FXHand[8].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[8]);
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[8],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[8]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						if(Play.inP.gSuit().equals(a.ohand[9].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[9]);
							pt.setCycleCount(1);
							
							
							a.FXHand[9].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[9]);
								a.playcj(a.cjHand[9]);
								a.FXHand[9].toFront();
							a.FXHand[9].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[9]);
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[9],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[9]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[10].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[10]);
							pt.setCycleCount(1);
							
							
							a.FXHand[10].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[10]);
								a.playcj(a.cjHand[10]);
								a.FXHand[10].toFront();
							a.FXHand[10].setLayoutX(a.FXHand[7].getLayoutX());	
									pt.play();
								//System.out.print(a.ohand[10]);
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[10],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[10]);
						
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[11].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[11]);
							pt.setCycleCount(1);
							
							
							a.FXHand[11].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[11]);
								a.playcj(a.cjHand[11]);
								a.FXHand[11].toFront();
							a.FXHand[11].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[11]);
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								Floor floor = new Floor(w,e,a.ohand[11],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[11]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						
						if(Play.inP.gSuit().equals(a.ohand[12].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[12]);
							pt.setCycleCount(1);
							
							
							a.FXHand[12].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[12]);
								a.playcj(a.cjHand[12]);
								a.FXHand[12].toFront();
							a.FXHand[12].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[12]);
								
								Cards q=b.play(b.hand);
								fNm(q,b, FXHandb);
								
								Floor floor = new Floor(w,e,a.ohand[12],q);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[12]);
							
							if(p.z.equals("player 2"))
								play2turn(a,b,c,d,FXHandb);
							else if (p.z.equals("player 3"))
								play3turn(a,b,c,d,FXHandb);
							else if(p.z.equals("player 4"))
								play4turn(a,b,c,d,FXHandb);
							else
								play1turn(a,b,c,d,FXHandb);
								
							});
								}	
				}
				});
			}
public void play4turn(player1 a, player2 b, player3 c, player4 d, ImageView[] FXHandb){
	for(int i=0; i<13;i++){
		
		a.FXHand[i].setDisable(true);

}
	btn.setDisable(false);
	btn.setOnAction(tt -> {	
		btn.setDisable(true);
		for(int i=0; i<13;i++){
			
			a.FXHand[i].setDisable(false);

}
				Cards e;
				Play.inP=new Cards("A","spade");
				Play.inP=d.play(d.hand);
				e=Play.inP;
				//System.out.print("\n");
				//System.out.print(d.findCard(e));
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				////System.out.println(d.name+ " played" + " " + e.toString());
				/*boolean alpha=false;;
				for(int i=0; i<a.hand.length;i++){
					if(!Play.inP.gSuit().equals(a.hand[i].gSuit()))
							a.FXHand[i].setDisable(true);
					else
						alpha = true;
				}
				if(!alpha){
					for(int i=0; i<13;i++){						
								a.FXHand[i].setDisable(false);
				}}*/
				
				for(int i = 0; i<13 ; i++){
					if(a.cjHand[i]==null){
						
					}
					else if(!a.cjHand[i].gSuit().equals(Play.inP.gSuit())){
						a.FXHand[i].setDisable(true);
					}
				}
				boolean t=true;
				for(int i = 0; i<13;i++){
					if(a.cjHand[i]==null)
					{
						
					}
					else{
					if(!a.cjHand[i].equals(Play.inP.gSuit())){
						t=true;
					}
					if(a.cjHand[i].gSuit().equals(Play.inP.gSuit())){
						t=false;
						break;
					}
					}
					
				}
				if(t){
					for(int i = 0; i<13;i++)
						a.FXHand[i].setDisable(false);
				}
				
				if(Play.inP.gSuit().equals(a.ohand[0].gSuit())||t){
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[0]);
					pt.setCycleCount(1);
					
					
					a.FXHand[0].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[0]);
						a.playcj(a.cjHand[0]);
						a.FXHand[0].toFront();
					a.FXHand[0].setLayoutX(a.FXHand[7].getLayoutX());	
					pt.play();
					//System.out.print(a.ohand[0]);
					Cards q=b.play(b.hand); fNm(q,b, FXHandb);
					//System.out.println(b.name+ " played" + " " + q.toString());
					Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
					//System.out.println(c.name+ " played" + " " + w.toString());
					
					
				Floor floor = new Floor(e,a.ohand[0],q,w);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[0]);
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
					
					});

						}
				if(Play.inP.gSuit().equals(a.ohand[1].gSuit())||t){
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[1]);
					pt.setCycleCount(1);
					
					
					a.FXHand[1].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[1]);
						a.playcj(a.cjHand[1]);
						a.FXHand[1].toFront();
					a.FXHand[1].setLayoutX(a.FXHand[7].getLayoutX());	
						pt.play();
						//System.out.print(a.ohand[1]);
						Cards q=b.play(b.hand); fNm(q,b, FXHandb);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
						//System.out.println(c.name+ " played" + " " + w.toString());
						Floor floor = new Floor(e,a.ohand[1],q,w);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[1]);
						if(p.z.equals("player 2"))
							play2turn(a,b,c,d,FXHandb);
						else if (p.z.equals("player 3"))
							play3turn(a,b,c,d,FXHandb);
						else if(p.z.equals("player 4"))
							play4turn(a,b,c,d,FXHandb);
						else
							play1turn(a,b,c,d,FXHandb);
						
					
						
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[2].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[2]);
							pt.setCycleCount(1);
							
							
							a.FXHand[2].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[2]);
								a.playcj(a.cjHand[2]);
								a.FXHand[2].toFront();
							a.FXHand[2].setLayoutX(a.FXHand[7].getLayoutX());	
							pt.play();
							//System.out.print(a.ohand[2]);
							
						Cards q=b.play(b.hand); fNm(q,b, FXHandb);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
						//System.out.println(c.name+ " played" + " " + w.toString());
						Floor floor = new Floor(e,a.ohand[2],q,w);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[2]);
				
					if(p.z.equals("player 2"))
						play2turn(a,b,c,d,FXHandb);
					else if (p.z.equals("player 3"))
						play3turn(a,b,c,d,FXHandb);
					else if(p.z.equals("player 4"))
						play4turn(a,b,c,d,FXHandb);
					else
						play1turn(a,b,c,d,FXHandb);
					
						
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[3].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[3]);
							pt.setCycleCount(1);
							
							
							a.FXHand[3].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[3]);
								a.playcj(a.cjHand[3]);
								a.FXHand[3].toFront();
							a.FXHand[3].setLayoutX(a.FXHand[7].getLayoutX());	 
						pt.play();
						//System.out.print(a.ohand[3]);
						Cards q=b.play(b.hand); fNm(q,b, FXHandb);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
						//System.out.println(c.name+ " played" + " " + w.toString());
						Floor floor = new Floor(e,a.ohand[3],q,w);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[3]);
					
					if(p.z.equals("player 2"))
						play2turn(a,b,c,d,FXHandb);
					else if (p.z.equals("player 3"))
						play3turn(a,b,c,d,FXHandb);
					else if(p.z.equals("player 4"))
						play4turn(a,b,c,d,FXHandb);
					else
						play1turn(a,b,c,d,FXHandb);
					
						
					});
						}
						
						
						if(Play.inP.gSuit().equals(a.ohand[4].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[4]);
							pt.setCycleCount(1);
							
							
							a.FXHand[4].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[4]);
							a.playcj(a.cjHand[4]);
								a.FXHand[4].toFront();
							a.FXHand[4].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[4]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[4],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[4]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[5].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[5]);
							pt.setCycleCount(1);
							
							
							a.FXHand[5].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[5]);
							a.playcj(a.cjHand[5]);
								a.FXHand[5].toFront();
							a.FXHand[5].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();

								//System.out.print(a.ohand[5]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[5],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[5]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[6].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[6]);
							pt.setCycleCount(1);
							
							
							a.FXHand[6].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[6]);
								a.playcj(a.cjHand[6]);
								a.FXHand[6].toFront();
							a.FXHand[6].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[6]);
								
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[6],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[6]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						
						
						if(Play.inP.gSuit().equals(a.ohand[7].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[7]);
							pt.setCycleCount(1);
							
							
							a.FXHand[7].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[7]);
								a.playcj(a.cjHand[7]);
								a.FXHand[7].toFront();
							a.FXHand[7].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[7]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[7],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[7]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[8].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[8]);
							pt.setCycleCount(1);
							
							
							a.FXHand[8].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[8]);
							a.playcj(a.cjHand[8]);
								a.FXHand[8].toFront();
							a.FXHand[8].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[8]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[8],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[8]);
								
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
							
								
							});
								}
						if(Play.inP.gSuit().equals(a.ohand[9].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[9]);
							pt.setCycleCount(1);
							
							
							a.FXHand[9].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[9]);
								a.playcj(a.cjHand[9]);
								a.FXHand[9].toFront();
							a.FXHand[9].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[9]);
								
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[9],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[9]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[10].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[10]);
							pt.setCycleCount(1);
							
							
							a.FXHand[10].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[10]);
								a.playcj(a.cjHand[10]);
								a.FXHand[10].toFront();
							a.FXHand[10].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[10]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[10],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[10]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						if(Play.inP.gSuit().equals(a.ohand[11].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[11]);
							pt.setCycleCount(1);
							
							
							a.FXHand[11].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[11]);
								a.playcj(a.cjHand[11]);
								a.FXHand[11].toFront();
							a.FXHand[11].setLayoutX(a.FXHand[7].getLayoutX());	 
								pt.play();
								//System.out.print(a.ohand[11]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[11],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[11]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							});
								}
						
						
						if(Play.inP.gSuit().equals(a.ohand[12].gSuit())||t){
							
							PathTransition pt = new PathTransition(Duration.seconds(2),
									new Line(100,0,100,-100), a.FXHand[12]);
							pt.setCycleCount(1);
							
							
							a.FXHand[12].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[12]);
								a.playcj(a.cjHand[12]);
								a.FXHand[12].toFront();
							a.FXHand[12].setLayoutX(a.FXHand[7].getLayoutX());	
								pt.play();
								//System.out.print(a.ohand[12]);
								Cards q=b.play(b.hand); fNm(q,b, FXHandb);
								//System.out.println(b.name+ " played" + " " + q.toString());
								Cards w=c.play(c.hand); c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
								//System.out.println(c.name+ " played" + " " + w.toString());
								Floor floor = new Floor(e,a.ohand[12],q,w);
								//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
								p.printHands(a,b,c,d);
								p.whoNext(floor.inPlay, q,w,e,a.ohand[12]);
								if(p.z.equals("player 2"))
									play2turn(a,b,c,d,FXHandb);
								else if (p.z.equals("player 3"))
									play3turn(a,b,c,d,FXHandb);
								else if(p.z.equals("player 4"))
									play4turn(a,b,c,d,FXHandb);
								else
									play1turn(a,b,c,d,FXHandb);
								
							
								
							});
								}	
	});
			}
			
			public void play1turn(player1 a, player2 b, player3 c, player4 d, ImageView[] FXHandb){
				for(int i=0; i<13;i++){
					
					a.FXHand[i].setDisable(true);
	
		}
				btn.setDisable(false);
btn.setOnAction(tt ->{
	btn.setDisable(true);
				Play.inP=null;
				
			
					for(int i=0; i<13;i++){
						
								a.FXHand[i].setDisable(false);
				
					}
				
				
				
				
				a.FXHand[0].setOnMouseClicked(oo -> {	
					pane.getChildren().remove(a.bhand[0]);
					a.playcj(a.cjHand[0]);
					a.FXHand[0].setLayoutX(a.FXHand[7].getLayoutX());	
				a.FXHand[0].toFront();	
				PathTransition pt = new PathTransition(Duration.seconds(2),
						new Line(100,0,100,-100), a.FXHand[0]);
				
				
				
					//System.out.print(a.ohand[0]);
					
					
					pt.setCycleCount(1);
				pt.play();
				
						Play.inP=a.ohand[0];
						Cards q=b.play(b.hand);
						fNm(q,b, FXHandb);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
						//System.out.println(c.name+ " played" + " " + w.toString());	
						Cards e=d.play(d.hand);
						d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
						//System.out.println(d.name+ " played" + " " + e.toString());
							
						Floor floor = new Floor(a.ohand[0],q,w,e);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[0]);
						
						if(p.z.equals("player 2"))
							play2turn(a,b,c,d,FXHandb);
						else if (p.z.equals("player 3"))
							play3turn(a,b,c,d,FXHandb);
						else if(p.z.equals("player 4"))
							play4turn(a,b,c,d,FXHandb);
						else
							play1turn(a,b,c,d,FXHandb);								
							
							
						
						
				
				
				});

					
				
				a.FXHand[1].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[1]);	a.playcj(a.cjHand[1]);			
					a.FXHand[1].setLayoutX(a.FXHand[7].getLayoutX());	
					a.FXHand[1].toFront();		
				PathTransition pt = new PathTransition(Duration.seconds(2),
						new Line(100,0,100,-100), a.FXHand[1]);
					
					
					
					//System.out.print(a.ohand[1]);
					
					
				
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[1];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[1],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[1]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
					
				});
					
				
				a.FXHand[2].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[2]);	a.playcj(a.cjHand[2]);
					a.FXHand[2].setLayoutX(a.FXHand[7].getLayoutX());	
					a.FXHand[2].toFront();	
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[2]);
					
					//System.out.print(a.ohand[2]);
					
					
					pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[2];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[2],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[2]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
					
				});
					
					
					
				
				
				a.FXHand[3].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[3]);		a.playcj(a.cjHand[3]);
					a.FXHand[3].setLayoutX(a.FXHand[7].getLayoutX());	
					a.FXHand[3].toFront();	
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[3]);
					//System.out.print(a.ohand[3]);
					
					
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[3];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[3],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[3]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
				
					
				});
					
					

				a.FXHand[4].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[4]);	
					a.playcj(a.cjHand[4]);
					a.FXHand[4].toFront();	
					
					//System.out.print(a.ohand[4]);
					a.FXHand[4].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[4]);
					
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[4];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[4],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[4]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
					
					});
					
					
								
				a.FXHand[5].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[5]);	a.playcj(a.cjHand[5]);	
					//System.out.print(a.ohand[5]);
					a.FXHand[5].toFront();	
					a.FXHand[5].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[5]);
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[5];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[5],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[5]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
				
						
						});	
						
						
				a.FXHand[6].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[6]);	a.playcj(a.cjHand[6]);
					//System.out.print(a.ohand[6]);
					a.FXHand[6].toFront();	
					a.FXHand[6].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[6]);
					pt.setCycleCount(1);
					
				pt.play();
				Play.inP=a.ohand[6];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[6],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[6]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
						
						});
							


				a.FXHand[7].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[7]);	a.playcj(a.cjHand[7]);
					//System.out.print(a.ohand[7]);
					a.FXHand[7].toFront();	
					a.FXHand[7].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[7]);
					pt.setCycleCount(1);
								
					
				pt.play();
				Play.inP=a.ohand[7];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[7],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[7]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
						
						});
											
					

				
				a.FXHand[8].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[8]);		a.playcj(a.cjHand[8]);
					a.FXHand[8].toFront();	
					//System.out.print(a.ohand[8]);
					a.FXHand[8].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[8]);
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[8];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[8],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[8]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
				
						
						});





						
						
				a.FXHand[9].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[9]);	a.playcj(a.cjHand[9]);
					//System.out.print(a.ohand[9]);
					a.FXHand[9].toFront();	
					a.FXHand[9].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[9]);
					pt.setCycleCount(1);
					
				pt.play();
				
				Play.inP=a.ohand[9];
				
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[9],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[9]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
				
						
						});
							
					


						
				a.FXHand[10].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[10]);		a.playcj(a.cjHand[10]);
					a.FXHand[10].toFront();	
					//System.out.print(a.ohand[10]);
					a.FXHand[10].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[10]);
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[10];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[10],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[10]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
						
						});
							

						
				a.FXHand[11].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[11]);		a.playcj(a.cjHand[11]);
					a.FXHand[11].toFront();	
					//System.out.print(a.ohand[11]);
					a.FXHand[11].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[11]);
				pt.setCycleCount(1);
				pt.play();
				Play.inP=a.ohand[11];
				Cards q=b.play(b.hand);
				fNm(q,b, FXHandb);
				//System.out.println(b.name+ " played" + " " + q.toString());
				Cards w=c.play(c.hand);
				c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
				//System.out.println(c.name+ " played" + " " + w.toString());	
				Cards e=d.play(d.hand);
				d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
				//System.out.println(d.name+ " played" + " " + e.toString());
					
				Floor floor = new Floor(a.ohand[11],q,w,e);
				//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
				p.printHands(a,b,c,d);
				p.whoNext(floor.inPlay, q,w,e,a.ohand[11]);	
				if(p.z.equals("player 2"))
					play2turn(a,b,c,d,FXHandb);
				else if (p.z.equals("player 3"))
					play3turn(a,b,c,d,FXHandb);
				else if(p.z.equals("player 4"))
					play4turn(a,b,c,d,FXHandb);
				else
					play1turn(a,b,c,d,FXHandb);
						
						});
							
				
				a.FXHand[12].setOnMouseClicked(oo -> {pane.getChildren().remove(a.bhand[12]);		a.playcj(a.cjHand[12]);
					a.FXHand[12].toFront();	
					//System.out.print(a.ohand[12]);
					a.FXHand[12].setLayoutX(a.FXHand[7].getLayoutX());	
					
					PathTransition pt = new PathTransition(Duration.seconds(2),
							new Line(100,0,100,-100), a.FXHand[12]);
				pt.setCycleCount(1);
						pt.play();
						Play.inP=a.ohand[12];
						Cards q=b.play(b.hand);
						fNm(q,b, FXHandb);
						//System.out.println(b.name+ " played" + " " + q.toString());
						Cards w=c.play(c.hand);
						c.fNm(w);pane.getChildren().remove(c.bhand[c.findCard(w)]);
						//System.out.println(c.name+ " played" + " " + w.toString());	
						Cards e=d.play(d.hand);
						d.fNm(e);pane.getChildren().remove(d.bhand[d.findCard(e)]);
						//System.out.println(d.name+ " played" + " " + e.toString());
							
						Floor floor = new Floor(a.ohand[12],q,w,e);
						//System.out.print("The p.biggest card is : " + p.biggest(floor.inPlay));
						p.printHands(a,b,c,d);
						p.whoNext(floor.inPlay, q,w,e,a.ohand[12]);	
						if(p.z.equals("player 2"))
							play2turn(a,b,c,d,FXHandb);
						else if (p.z.equals("player 3"))
							play3turn(a,b,c,d,FXHandb);
						else if(p.z.equals("player 4"))
							play4turn(a,b,c,d,FXHandb);
						else
							play1turn(a,b,c,d,FXHandb);
						
						});
});
			}
	












}
