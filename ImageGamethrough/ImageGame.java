import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ImageGame{
	JFrame frame;
	JButton up;
	JButton right;
	JButton left;
	JButton back;
	Container container;    //Holds the image icons
	ImageIcon firstStage = new ImageIcon("firstStage.png");    // The stage pictures
	ImageIcon secondStage = new ImageIcon("secondStage.png");
	ImageIcon thirdStage = new ImageIcon("thirdStage.png");
	JLabel helper;         // used to set the image icons
	public JFrame callConstructor(){
		frame.setVisible(false);
		frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // so that frame doest run when we close the frame in background saves processor
		frame.setLocationRelativeTo(null);					//   Frames Location Center . . .
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // to maximize the size of the frame
		container = frame.getContentPane();
		container.setLayout(null);


		JLabel text = new JLabel();
			//The Label
		frame.setTitle("Haupteingang");
		text.setText("Warum willst du wieder raus? Jetzt kommst du ganz zu spät! Du hast verloren!");
		
		helper = new JLabel();
		helper.setIcon(firstStage);
		helper.setBounds(400,180,firstStage.getIconWidth(),firstStage.getIconHeight());
		
		container.add(helper);
		text.setBounds(80,100,1450,50);

		frame.add(text);
		frame.setVisible(true);        // Frames Visibility
		

		return frame;
	}
	ImageGame(){
		frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // so that frame doest run when we close the frame in background saves processor
		frame.setLocationRelativeTo(null);					//   Frames Location Center . . .
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // to maximize the size of the frame
		container = frame.getContentPane();
		container.setLayout(null);


		JLabel text = new JLabel();
			//The Label
		frame.setTitle("Haupteingang");
		text.setText("Nach einer ausgeruhten Nacht begibst du dich pünktlich um 7:49 am Morgen zuunserer Schule. Dein Ziel ist es jetzt, zum Unterricht zu gehen!");
		
		helper = new JLabel();
		helper.setIcon(firstStage);
		helper.setBounds(400,180,firstStage.getIconWidth(),firstStage.getIconHeight());
		
		container.add(helper);




		//////// Actions
		

		back = new  JButton("Back");
		back.setBounds(620,640,80,30);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(!frame.getTitle().toString().equals("Haupteingang")){
					if(frame.getTitle().toString().equals("Pausenhalle")){
						//new ImageGame();
						frame = callConstructor();

						try{
						Thread.sleep(500);   // To hold for 500 mili secs (sometime)
						}catch(Exception ee){
							ee.printStackTrace();
						}


						JOptionPane.showMessageDialog(null,"Game Ended"); // Back from Main Stage to Stage 1
						try{
						Thread.sleep(500);   // To hold for 500 mili secs (sometime)
						}catch(Exception ee){
							ee.printStackTrace();
						}

						for(int i=0; i<4; i++){
							try{
						Thread.sleep(500);   // To hold for 500 mili secs
						}catch(Exception ee){
							ee.printStackTrace();
						}
						// Game Ends Here Automatically

						}



						JOptionPane.showMessageDialog(null,"You Lose"); // Back from Main Stage to Stage 1
						
						System.exit(0);
					}
					else{
						if(frame.getTitle().toString().equals("Lehrerzimmer")){
							// Back to P
							frame.setTitle("Pausenhalle");
						text.setText("");
						text.setText("Du befindest dich in den Korridoren, wohin möchtest du dich begeben?");
						//text.setBounds(200,100,1000,50);

						//frame.add(text);

						helper.setIcon(null);

						helper = new JLabel();
						
						helper.setIcon(secondStage);
						
						helper.setBounds(400,180,secondStage.getIconWidth(),secondStage.getIconHeight());
						
						container.add(helper);
						frame.setVisible(true);
						}
						else{
							new ImageGame();
						}
					}
					
				}

			}
		});



		up = new JButton("Up");               // Next Stage
		up.setBounds(620,520,80,30);
		up.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(frame.getTitle().toString().equals("Haupteingang")){
					
						frame.setTitle("Pausenhalle");
						text.setText("");
						text.setText("Du befindest dich in den Korridoren, wohin möchtest du dich begeben?");
						//text.setBounds(200,100,1000,50);

						//frame.add(text);

						helper.setIcon(null);

						helper = new JLabel();
						
						helper.setIcon(secondStage);
						
						helper.setBounds(400,180,secondStage.getIconWidth(),secondStage.getIconHeight());
						
						container.add(helper);
					

				}

				else if(frame.getTitle().toString().equals("Pausenhalle")){
						
					frame.setTitle("Lehrerzimmer");
					text.setText("");
					text.setText("Du betrittst das Lehrerzimmer. Komplett unerwartet, wirst du nicht sofort rausgeschmissen sondern ein Herrn Scholz begrüßt dich mit seinem Morgenkaffee in der Hand");
					helper.setIcon(null);
					container.add(helper);
					// 3'1 Stage Nothing will happen  
				}
			





			}
		});

		left = new JButton("Left");
		left.setBounds(410,580,80,30);
		left.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

					if(frame.getTitle().toString().equals("Pausenhalle")){
						text.setText("");
						// First Frmae ADdition
						frame.setVisible(false);
						frame = new JFrame("");
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // so that frame doest run when we close the frame in background saves processor
						frame.setLocationRelativeTo(null);					//   Frames Location Center . . .
						frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // to maximize the size of the frame
						container = frame.getContentPane();
						container.setLayout(null);


						JLabel text = new JLabel();
							//The Label
						frame.setTitle("Haupteingang");
						text.setText("Du gehst zum Computerraum aber keiner ist da. Nur ein PC läuft auf dem jemand Solitaire an lies. Plötzlich hörst du ein seufzen. Du drehst dich um und siehst Herr Scholz, der dich verärgert anguckt, weil du nicht im Unterricht bist. Du hast verloren!");

						
						helper = new JLabel();
						helper.setIcon(firstStage);
						helper.setBounds(400,180,firstStage.getIconWidth(),firstStage.getIconHeight());
						
						container.add(helper);
						text.setBounds(80,100,1450,50);

						frame.add(text);
						frame.setVisible(true);


						//text.setText("Du gehst zum Computerraum aber keiner ist da. Nur ein PC läuft auf dem jemand Solitaire an lies. Plötzlich hörst du ein seufzen. Du drehst dich um und siehst Herr Scholz, der dich verärgert anguckt, weil du nicht im Unterricht bist. Du hast verloren! ");
						//frame.add(text);
						

						// 2nd call
						//secStageShift();

						frame.setVisible(true);

						//text.setText("Du gehst zum Computerraum aber keiner ist da. Nur ein PC läuft auf dem jemand Solitaire an lies. Plötzlich hörst du ein seufzen. Du drehst dich um und siehst Herr Scholz, der dich verärgert anguckt, weil du nicht im Unterricht bist. Du hast verloren! ");
						
						//objj.frame.add(text);

						
						setTextEmpty();

						try{
						Thread.sleep(800);   // To hold for 500 mili secs
						frame.setVisible(true);
						
						}catch(Exception ee){
							ee.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Game Ended");
						

						for(int i=0; i<4; i++){
							try{
						Thread.sleep(500);   // To hold for 500 mili secs
						}catch(Exception ee){
							ee.printStackTrace();
						}
						// Game Ends Here Automatically

						}
						JOptionPane.showMessageDialog(null, "You Lose");
						System.exit(0);
						

					}


			}
		});


		
		right = new JButton("Right"); 
		right.setBounds(830,580,80,30);
		right.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(frame.getTitle().toString().equals("Pausenhalle")){
					frame.setTitle("Klassenraum");
					
					text.setText("");
					text.setText("Du setzt sich pünktlich auf deinen Platz und nimmst am Unterricht teil. Du hast gewonnen");
					//text.setBounds(200,100,1000,50);

					//frame.add(text);

					helper.setIcon(null);

					helper = new JLabel();
					
					helper.setIcon(thirdStage);
					
					helper.setBounds(400,180,thirdStage.getIconWidth(),thirdStage.getIconHeight());
					
					container.add(helper);
					frame.setVisible(true);
					try{
						Thread.sleep(500);   // To hold for 500 mili secs
						}catch(Exception ee){
							ee.printStackTrace();
						}
						// Game Ends Here Automatically


						
					JOptionPane.showMessageDialog(null,"Game Ended");
					/*
					JOptionPane.showMessageDialog(null," You Win");
					frame.setVisible(false);
					*/
					for(int i=0; i<4; i++){
						try{
						Thread.sleep(500);   // To hold for 500 mili secs
						}catch(Exception ee){
							ee.printStackTrace();
						}
						// Game Ends Here Automatically

					}
					JOptionPane.showMessageDialog(null,"You win");
					
					System.exit(0);
						
				}
				




			}
		});




		frame.add(up);
		frame.add(left);
		frame.add(right);
		frame.add(back);	

		text.setBounds(80,100,1450,50);

		frame.add(text);
		frame.setVisible(true);        // Frames Visibility
		

	}
	public void setTextEmpty(){
		JLabel text = new JLabel("");
		text.setText("");
		text.setBounds(100,100,1000,50);

		frame.add(text);

	}
	public void beginGame(){

		JLabel text = new JLabel();
			//The Label
		frame.setTitle("Haupteingang");
		text = new JLabel("");

		text.setText("Du gehst zum Computerraum aber keiner ist da. Nur ein PC läuft auf dem jemand Solitaire an lies. Plötzlich hörst du ein seufzen. Du drehst dich um und siehst Herr Scholz, der dich verärgert anguckt, weil du nicht im Unterricht bist. Du hast verloren!");
		text.setBounds(100,100,1450,50);

		frame.add(text);

		helper = new JLabel();
		helper.setIcon(firstStage);
		helper.setBounds(400,180,firstStage.getIconWidth(),firstStage.getIconHeight());
		
		container.add(helper);
		frame.setVisible(true);


		//frame.validate();
	}

	public static void main(String[] args){
		ImageGame object = new ImageGame();
				
	}
}