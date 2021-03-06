/*Part Ilyes*/

package UmlEditor;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JPanel {
	
   
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel labelWelcome;
   private ImageIcon iconBackground;
   private Image picture;
	
	private int xFond;
	
	public MainWindow(){
		
		super();
		this.proprietesEditeur();
		
		this.xFond = -50;
		
		iconBackground = new ImageIcon(getClass().getResource("/image/background.png"));
		this.picture=this.iconBackground.getImage();

	}
	
	
private void proprietesEditeur(){
		
		this.setLayout(null);
		this.proprietesEtiquette();
	}
	
	
	private void proprietesEtiquette(){
		
		labelWelcome = new JLabel();
		JLabel labelWelcome2 = new JLabel();
		
		this.labelWelcome.setBounds(200, 200, 700, 50);
		labelWelcome2.setBounds(200,250,700,50);
		this.labelWelcome.setText("Bienvenue dans votre editeur UML Pour commencer un nouveau projet,cliquer sur File,New,New UML project ");
		labelWelcome2.setText("Obligatroire !! Veuillez cliquer sur le menu '?' puis sur help, afin de savoir comment utiliser le programme ");
		this.add(labelWelcome);
		this.add(labelWelcome2);
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.picture, this.xFond, 0, null);
	}
}
