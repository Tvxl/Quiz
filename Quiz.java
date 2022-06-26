import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.util.Scanner;
import java.awt.Color;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Font;

public class Quiz extends JFrame implements ActionListener {
	// "Farben, ingesamt 255 Werte"
    /* private static Color grey = new Color(192, 200, 200); */

	private static Color lightBlueColor = new Color(137,207,240);
	
	private static final long serialVersionUID = 1L;

	JLabel kategorie1;
	JLabel kategorie2;
	JLabel kategorie3;
	JLabel kategorie4;
	
	JLabel Team1;
	JLabel Team2;
	JLabel Team3;
	JLabel Team4;
	
	JLabel Team1punkte;
	JLabel Team2punkte;
	JLabel Team3punkte;
	JLabel Team4punkte;
	
	JLabel Frage;
	
	double Team1punkteFinal = 0;
	double Team2punkteFinal = 0;
	double Team3punkteFinal = 0;
	double Team4punkteFinal = 0;
	
	JLabel punkteübersicht;
	
	JButton frage1100;
	JButton frage1200;
	JButton frage1300;
	JButton frage1400;
	JButton frage1500;
	
	JButton frage2100;
	JButton frage2200;
	JButton frage2300;
	JButton frage2400;
	JButton frage2500;
	
	JButton frage3100;
	JButton frage3200;
	JButton frage3300;
	JButton frage3400;
	JButton frage3500;
	
	JButton frage4100;
	JButton frage4200;
	JButton frage4300;
	JButton frage4400;
	JButton frage4500;
	
	JButton ueberpruefen;
	JTextField antworTextField;
	
	double ergebnisAuslesen = 0;
	
	double loesungALL;
	
	double loesungfrage1100 = 9;
	double loesungfrage1200 = 10;
	double loesungfrage1300;
	double loesungfrage1400;
	double loesungfrage1500;
	
	double loesungfrage2100;
	double loesungfrage2200;
	double loesungfrage2300;
	double loesungfrage2400;
	double loesungfrage2500;
	
	double loesungfrage3100;
	double loesungfrage3200;
	double loesungfrage3300;
	double loesungfrage3400;
	double loesungfrage3500;
	
	double loesungfrage4100;
	double loesungfrage4200;
	double loesungfrage4300;
	double loesungfrage4400;
	double loesungfrage4500;
	
	double punkteALL = 0;
	
	double punkte100 = 100;
	double punkte200 = 200;
	double punkte300 = 300;
	double punkte400 = 400;
	double punkte500 = 500;
	
	double Team1punkteVorhanden = 0;
	double Team2punkteVorhanden = 0;
	double Team3punkteVorhanden = 0;
	double Team4punkteVorhanden = 0;
	
	JPanel grau1 = new JPanel();
	JPanel grau2 = new JPanel();
	JPanel grau3 = new JPanel();
	JPanel blau1 = new JPanel();
	
	// Menue
	
	JButton teamanzahl2;
	JButton teamanzahl3;
	JButton teamanzahl4;
	JButton zurueckButton;
	
	JLabel auswahschrift;
	JLabel auswahschrift2;
	
	int teamAnzahlWert = 0;
	

	JFrame menueFrame = new JFrame();
	JFrame beantwortenFrame = new JFrame();
	

	public Quiz() {
		
		//Menue
		
		setupMenue();
		
		 //Menue
		 auswahschrift = new JLabel("Wähle aus wie viele Teams ");
		 auswahschrift2 = new JLabel("es geben soll:");
		 
		 auswahschrift.setBounds(15, -100, 600, 250);
		 menueFrame.add(auswahschrift);
		 
		 auswahschrift2.setBounds(15, -80, 600, 250);
		 menueFrame.add(auswahschrift2);
		 
		 
		 teamanzahl2 = new JButton("- 2 -");
		 teamanzahl2.setBounds(30, 70, 65, 30);
		 menueFrame.add(teamanzahl2);
		 
		 teamanzahl3 = new JButton("- 3 -");
		 teamanzahl3.setBounds(105, 70, 65, 30);
		 menueFrame.add(teamanzahl3);
		 
		 teamanzahl4 = new JButton("- 4 -");
		 teamanzahl4.setBounds(180, 70, 65, 30);
		 menueFrame.add(teamanzahl4);
		 
		 zurueckButton = new JButton("zurück");
		 zurueckButton.setBounds(190, 110, 73, 30);
		 menueFrame.add(zurueckButton);
		
		// 2 Fenster
		beantwortenFrame.setTitle("Beantworte die Frage");
		beantwortenFrame.setSize(375, 150);
		beantwortenFrame.setLocation(645, 280);
		beantwortenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		beantwortenFrame.setAlwaysOnTop(true);
		beantwortenFrame.setResizable(false);
		beantwortenFrame.setLayout(null);
		beantwortenFrame.setVisible(false);
		
		// Quiz
		this.setTitle("Quiz");
		this.setSize(675, 480);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.setLayout(null);

		frage1100= new JButton("100");
		frage1200= new JButton("200");
		frage1300= new JButton("300");
		frage1400= new JButton("400");
		frage1500= new JButton("500");
		
		frage2100= new JButton("100");
		frage2200= new JButton("200");
		frage2300= new JButton("300");
		frage2400= new JButton("400");
		frage2500= new JButton("500");
		
		frage3100= new JButton("100");
		frage3200= new JButton("200");
		frage3300= new JButton("300");
		frage3400= new JButton("400");
		frage3500= new JButton("500");
		
		frage4100= new JButton("100");
		frage4200= new JButton("200");
		frage4300= new JButton("300");
		frage4400= new JButton("400");
		frage4500= new JButton("500");
		
		ueberpruefen = new JButton("Überprüfen");
		
		
        // "ActionListener"
		frage1100.addActionListener(this);
		frage1200.addActionListener(this);
		frage1300.addActionListener(this);
		frage1400.addActionListener(this);
		frage1500.addActionListener(this);
		
		frage2100.addActionListener(this);
		frage2200.addActionListener(this);
		frage2300.addActionListener(this);
		frage2400.addActionListener(this);
		frage2500.addActionListener(this);
		
		frage3100.addActionListener(this);
		frage3200.addActionListener(this);
		frage3300.addActionListener(this);
		frage3400.addActionListener(this);
		frage3500.addActionListener(this);
		
		frage4100.addActionListener(this);
		frage4200.addActionListener(this);
		frage4300.addActionListener(this);
		frage4400.addActionListener(this);
		frage4500.addActionListener(this);
		
		ueberpruefen.addActionListener(this);
		
		
		teamanzahl2.addActionListener(this);
		teamanzahl3.addActionListener(this);
		teamanzahl4.addActionListener(this);
		zurueckButton.addActionListener(this);
		
		 
		
		// "JLabelss (Text)"
		 kategorie1 = new JLabel("kategorie1");
		 kategorie2 = new JLabel("kategorie2");
		 kategorie3 = new JLabel("kategorie3");
		 kategorie4 = new JLabel("kategorie4");
		 
		 
		 
		 Team1 = new JLabel("Team1");
		 Team2 = new JLabel("Team2");
		 Team3 = new JLabel("Team3");
		 Team4 = new JLabel("Team4");
		 
		 punkteübersicht = new JLabel("Punkteuebersicht:");
		 
		 Team1punkte = new JLabel("0");
		 Team2punkte = new JLabel("0");
		 Team3punkte = new JLabel("0");
		 Team4punkte = new JLabel("0");
		 
		 
		// 2tes fenster stuff
		 
		 antworTextField = new JTextField();
		 antworTextField.setBounds(50, 50, 100, 40);
		 beantwortenFrame.add(antworTextField);
		 
		 Frage = new JLabel("Hier würde eine lange frage stehen"); 
		 Frage.setBounds(50, -125, 300, 300);
		 beantwortenFrame.add(Frage);
		 
		 ueberpruefen.setBounds(200, 50, 100, 40);
		 beantwortenFrame.add(ueberpruefen);
		 
		// kategorien
		 kategorie1.setBounds(45, -40, 120, 120);
		 this.add(kategorie1); 
	      
	      kategorie2.setBounds(195, -40, 120, 120);
	      this.add(kategorie2); 
	      
	      kategorie3.setBounds(345, -40, 120, 120);
	      this.add(kategorie3); 
	      
	      kategorie4.setBounds(495, -40, 120, 120);
	      this.add(kategorie4); 
	      
	     // Teams + Punkte
	     Team1.setBounds(240, 350, 110, 50);
	     this.add(Team1); 
	      
		 Team2.setBounds(340, 350, 110, 50);
		 this.add(Team2); 
		    
		 Team3.setBounds(440, 350, 110, 50);
		 this.add(Team3); 
		    
		 Team4.setBounds(540, 350, 110, 50);
		 this.add(Team4); 
		 
		 punkteübersicht.setBounds(40, 350, 310, 50);
		 this.add(punkteübersicht); 
		 
		 Team1punkte.setBounds(240, 365, 110, 50);
		 this.add(Team1punkte); 
	      
		 Team2punkte.setBounds(340, 365, 110, 50);
		 this.add(Team2punkte); 
		    
		 Team3punkte.setBounds(440, 365, 110, 50);
		 this.add(Team3punkte); 
		    
		 Team4punkte.setBounds(540, 365, 110, 50);
		 this.add(Team4punkte);
		 
		 
	      
	      
		// Fragen
		//frage3500.setVisible(false);
		//frage3500.setVisible(true); 
		
	    frage1100.setBounds(43, 40, 110, 50);
	    this.add(frage1100); 
	    
	    
	    frage1200.setBounds(43, 100, 110, 50);
	    this.add(frage1200); 
	    
	    frage1300.setBounds(43, 160, 110, 50);
	    this.add(frage1300); 
	    
	    frage1400.setBounds(43, 220, 110, 50);
	    this.add(frage1400); 
	    
	    frage1500.setBounds(43, 280, 110, 50);
	    this.add(frage1500); 
	    
	    
	    
	    frage2100.setBounds(196, 40, 110, 50);
	    this.add(frage2100); 
	    
	    frage2200.setBounds(196, 100, 110, 50);
	    this.add(frage2200); 
	    
	    frage2300.setBounds(196, 160, 110, 50);
	    this.add(frage2300); 
	    
	    frage2400.setBounds(196, 220, 110, 50);
	    this.add(frage2400); 
	    
	    frage2500.setBounds(196, 280, 110, 50);
	    this.add(frage2500); 
	    
	    
	    
	    frage3100.setBounds(345, 40, 110, 50);
	    this.add(frage3100); 
	    
	    frage3200.setBounds(345, 100, 110, 50);
	    this.add(frage3200); 
	    
	    frage3300.setBounds(345, 160, 110, 50);
	    this.add(frage3300); 
	    
	    frage3400.setBounds(345, 220, 110, 50);
	    this.add(frage3400); 
	    
	    frage3500.setBounds(345, 280, 110, 50);
	    this.add(frage3500); 
	    
	    
	    
	    frage4100.setBounds(494, 40, 110, 50);
	    this.add(frage4100); 
	    
	    frage4200.setBounds(494, 100, 110, 50);
	    this.add(frage4200); 
	    
	    frage4300.setBounds(494, 160, 110, 50);
	    this.add(frage4300); 
	    
	    frage4400.setBounds(494, 220, 110, 50);
	    this.add(frage4400); 
	    
	    frage4500.setBounds(494, 280, 110, 50);
	    this.add(frage4500);
	    
	 // Team stuff
		 
	    blau1.setBackground(lightBlueColor); // Position 1
	 	blau1.setBounds(230, 360, 70, 45);
	 	this.add(blau1);
	 	
	 	grau2.setBackground(Color.LIGHT_GRAY); // Position 2
	 	grau2.setBounds(333, 360, 70, 45);
	 	this.add(grau2);
	 	
	 	grau3.setBackground(Color.LIGHT_GRAY); // Position 3
	 	grau3.setBounds(430, 360, 70, 45);
	 	this.add(grau3);
	 	
	    grau1.setBackground(Color.LIGHT_GRAY); // Position 4
	    grau1.setBounds(530, 360, 70, 45);
	    this.add(grau1);

		
		
		// "schriftart"
	    Font schriftart1 = new Font("Arial", Font.BOLD + Font.ITALIC, 24);    // Schriftart,Schriftstil,Schriftgroesse 
	    kategorie1.setFont(schriftart1);
	    kategorie2.setFont(schriftart1);
	    kategorie3.setFont(schriftart1);
	    kategorie4.setFont(schriftart1);
	    
	    
	    Font schriftart2 = new Font("Arial", Font.BOLD + Font.ITALIC, 16);
	    Team1.setFont(schriftart2);
	    Team2.setFont(schriftart2);
	    Team3.setFont(schriftart2);
	    Team4.setFont(schriftart2);
	    Frage.setFont(schriftart2);
	    
	    Font schriftart3 = new Font("Arial", Font.BOLD + Font.ITALIC, 18);
	    punkteübersicht.setFont(schriftart3);
	    auswahschrift.setFont(schriftart3);
	    auswahschrift2.setFont(schriftart3);
	    
		
		

	}

	private void setupMenue() {
		menueFrame.setTitle("Menue");
		menueFrame.setSize(300, 300);
		menueFrame.setLocation(185, 180);
		menueFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menueFrame.setAlwaysOnTop(true);
		menueFrame.setResizable(false);
		menueFrame.setLayout(null);
		menueFrame.setVisible(true);
	}
	
	

	// Methode die Events enthalten
	public void actionPerformed(ActionEvent ae) { // void bedutet das in der Methode nur etwas ausgegeben wird. Es wird nichts veraendert durch z.B. eingaben
	// "If-Anweisungen"
		
		//Menue
		
		
		 if (ae.getSource() == teamanzahl2) {
			teamanzahl3.setVisible(false);
			teamanzahl4.setVisible(false);
			
			Team3.setVisible(false);
			Team4.setVisible(false);
			Team3punkte.setVisible(false);
			Team4punkte.setVisible(false);
			grau3.setVisible(false);
			grau1.setVisible(false);
			
			teamAnzahlWert = 2;
		}
		 
		 if (ae.getSource() == teamanzahl3) {
			 teamanzahl2.setVisible(false);
			 teamanzahl4.setVisible(false);
			 
			 Team4.setVisible(false);
			 Team4punkte.setVisible(false);
			 
			 teamAnzahlWert = 3;
			}
		 
		 if (ae.getSource() == teamanzahl4) {
			 teamanzahl2.setVisible(false);
			 teamanzahl3.setVisible(false);
			 
			 teamAnzahlWert = 4;
			}
		 

		 if (ae.getSource() == zurueckButton) {
			 teamanzahl2.setVisible(true);
			 teamanzahl3.setVisible(true);
			 teamanzahl4.setVisible(true);
			 
			 Team1.setVisible(true);
			 Team2.setVisible(true);
			 Team3.setVisible(true);
			 Team4.setVisible(true);
			 Team1punkte.setVisible(true);
			 Team2punkte.setVisible(true);
			 Team3punkte.setVisible(true);
			 Team4punkte.setVisible(true);
			 grau1.setVisible(true);
			 grau2.setVisible(true);
			 grau3.setVisible(true);
			 blau1.setVisible(true);
			 
			 teamAnzahlWert = 0;

		}
		
		// ueberpruefen stuff
		 
		if (ae.getSource() == ueberpruefen) {
		ergebnisAuslesen = Double.parseDouble(antworTextField.getText());	
		

		// 2 Teams
				
	
		if (ergebnisAuslesen == loesungALL) {
			JOptionPane.showMessageDialog(Quiz.this, " Richtig! ", "Lösung", JOptionPane.INFORMATION_MESSAGE);

			
		}else {
			JOptionPane.showMessageDialog(Quiz.this, " Falsch :( ", "Lösung", JOptionPane.INFORMATION_MESSAGE);
			
			Team1punkteFinal = Team1punkteFinal + Team1punkteVorhanden - punkteALL;
			Team1punkte.setText(Double.toString(Team1punkteFinal));
		}
		 	
		// 2 Teams am Steuer
		if (teamAnzahlWert == 2) {
			
			int i = 1;
			/*
			for (int j = 1; j > 0; j++) {
			if (ergebnisAuslesen == loesungALL || ergebnisAuslesen != loesungALL) {
					i = i + 1;
					System.out.println(i);
				}	
			}
			*/	
				
				if (i == 1 ) {
		Team1punkteFinal = Team1punkteFinal + Team1punkteVorhanden + punkteALL;
		Team1punkte.setText(Double.toString(Team1punkteFinal));				
		blau1.setBounds(230, 360, 70, 45); // 1
		grau2.setBounds(333, 360, 70, 45); // 2	
		System.out.println(i);
		i = 2;
		System.out.println(i);
		
		}
				punkteALL = 0;
				loesungALL = 0;
				antworTextField.setText(" ");
				beantwortenFrame.setVisible(false); 
				
		if (i == 2 ) {
		Team2punkteFinal = Team2punkteFinal + Team2punkteVorhanden + punkteALL;
		Team2punkte.setText(Double.toString(Team2punkteFinal));	
		blau1.setBounds(333, 360, 70, 45); // 2
		grau2.setBounds(230, 360, 70, 45); // 1	
		System.out.println(i);
		i = 2;
		System.out.println(i);
		}
		
		punkteALL = 0;
		loesungALL = 0;
		antworTextField.setText(" ");
		beantwortenFrame.setVisible(false); 
			
		}

		
		
		
		
		} 
		

		
		// Kategori 1
		 if (ae.getSource() == frage1100) {
			 beantwortenFrame.setVisible(true);
			 Frage.setText(" 4 + 5 = ");
			 
			 punkteALL = punkteALL + punkte100;
			 loesungALL = loesungfrage1100;

			frage1100.setVisible(false);
		}
		 
		 if (ae.getSource() == frage1200) {
				beantwortenFrame.setVisible(true); 
				Frage.setText(" 5 + 5 = ");
				 
				 punkteALL = punkteALL + punkte200;
				 loesungALL = loesungfrage1200;

				frage1200.setVisible(false);
		}
		 
		 if (ae.getSource() == frage1300) {
				beantwortenFrame.setVisible(true);
				Frage.setText(" 5 + 5 = ");
				 
				 punkteALL = punkteALL + punkte300;
				 loesungALL = loesungfrage1300;

				frage1300.setVisible(false);
		}
		 
		 if (ae.getSource() == frage1400) {
				beantwortenFrame.setVisible(true);
				Frage.setText(" 5 + 5 = ");
				 
				 punkteALL = punkteALL + punkte400;
				 loesungALL = loesungfrage1400;

				frage1400.setVisible(false);
		}
		 
		 if (ae.getSource() == frage1500) {
				beantwortenFrame.setVisible(true);
				Frage.setText(" 5 + 5 = ");
				 
				 punkteALL = punkteALL + punkte500;
				 loesungALL = loesungfrage1500;

				frage1500.setVisible(false);
		}
		 
		// Kategori 2
				 if (ae.getSource() == frage2100) {
					 beantwortenFrame.setVisible(true);
					 Frage.setText(" 4 + 5 = ");
					 
					 punkteALL = punkteALL + punkte100;
					 loesungALL = loesungfrage2100;

					 frage2100.setVisible(false);
				}
				 
				 if (ae.getSource() == frage2200) {
						beantwortenFrame.setVisible(true); 
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte200;
						 loesungALL = loesungfrage2200;

						 frage2200.setVisible(false);
				}
				 
				 if (ae.getSource() == frage2300) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte300;
						 loesungALL = loesungfrage2300;

						 frage2300.setVisible(false);
				}
				 
				 if (ae.getSource() == frage2400) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte400;
						 loesungALL = loesungfrage2400;

						 frage2400.setVisible(false);
				}
				 
				 if (ae.getSource() == frage2500) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte500;
						 loesungALL = loesungfrage2500;

						 frage2500.setVisible(false);
				}
				 
				// Kategori 3
				 if (ae.getSource() == frage3100) {
					 beantwortenFrame.setVisible(true);
					 Frage.setText(" 4 + 5 = ");
					 
					 punkteALL = punkteALL + punkte100;
					 loesungALL = loesungfrage3100;

					 frage3100.setVisible(false);
				}
				 
				 if (ae.getSource() == frage3200) {
						beantwortenFrame.setVisible(true); 
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte200;
						 loesungALL = loesungfrage3200;

						 frage3200.setVisible(false);
				}
				 
				 if (ae.getSource() == frage3300) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte300;
						 loesungALL = loesungfrage3300;

						 frage3300.setVisible(false);
				}
				 
				 if (ae.getSource() == frage3400) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte400;
						 loesungALL = loesungfrage3400;

						 frage3400.setVisible(false);
				}
				 
				 if (ae.getSource() == frage3500) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte500;
						 loesungALL = loesungfrage3500;

						 frage3500.setVisible(false);
				}
				 
				// Kategori 4
				 if (ae.getSource() == frage4100) {
					 beantwortenFrame.setVisible(true);
					 Frage.setText(" 4 + 5 = ");
					 
					 punkteALL = punkteALL + punkte100;
					 loesungALL = loesungfrage4100;

					 frage4100.setVisible(false);
				}
				 
				 if (ae.getSource() == frage4200) {
						beantwortenFrame.setVisible(true); 
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte200;
						 loesungALL = loesungfrage4200;

						 frage4200.setVisible(false);
				}
				 
				 if (ae.getSource() == frage4300) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte300;
						 loesungALL = loesungfrage4300;

						 frage4300.setVisible(false);
				}
				 
				 if (ae.getSource() == frage4400) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte400;
						 loesungALL = loesungfrage4400;

						 frage4400.setVisible(false);
				}
				 
				 if (ae.getSource() == frage4500) {
						beantwortenFrame.setVisible(true);
						Frage.setText(" 5 + 5 = ");
						 
						 punkteALL = punkteALL + punkte500;
						 loesungALL = loesungfrage4500;

						 frage4500.setVisible(false);
				}
		 
			 
			
		 
	
		
		
	
	}


	public static void main(String[] args) {

		Quiz q = new Quiz();
		q.setVisible(true);
		
		
	}
	
}