package WindowUml;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Uml.Uml;
import Uml.UmlTool.EnumRelation;
import Uml.UmlTool.UmlRelation;

/**
*Author Yacine
*This class represent a Panel center, in this, we can add a component Uml etc ... , and be dragged it
*/
public class PanelCenter extends JPanel{
	
	private static final long serialVersionUID = 1L;
public ArrayList<UmlRelation> relation = new ArrayList<UmlRelation>();

	public PanelCenter(){
		super();
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public  void addDraw(Uml uml1, Uml uml2,EnumRelation typeRelation,boolean cardinality) {
		relation.add(new UmlRelation(uml1,uml2,typeRelation,this,cardinality));
        repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		  super.paintComponent(g);
		   for (UmlRelation e : relation) {
	            e.draw(g);
	        }
		}
	public void removeRelation(){
		relation.clear();
	}
}



