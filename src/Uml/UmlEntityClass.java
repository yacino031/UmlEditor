/*Part Yacine*/

/*This class represent a Entity for uml class*/
package Uml;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import UmlOption.UmlOptionClass;
import WindowUml.PanelCenter;

/**
 * Author Yacine
 * This class represent a entity Class
 */

public class UmlEntityClass extends Uml{
	
	private static final long serialVersionUID = 1L;
	private JLabel nameClass = new JLabel("Class");	
	private DefaultListModel<String> modelAttribute = new DefaultListModel<String>();	
	private DefaultListModel<String> modelMethod = new DefaultListModel<String>();	
	
	private JList<String> listAttribute = new JList<String>(modelAttribute);  
	private JList<String> listMethod = new JList<String>(modelMethod);  
	
	 public UmlEntityClass(PanelCenter panel){
		super(panel);
		this.setSize(180,160);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
	    listAttribute.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	    listAttribute.setVisibleRowCount(-1);
	    
	    listMethod .setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
	    listMethod .setVisibleRowCount(-1);

	  setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	  
	    add (nameClass);

       add(new JSeparator(SwingConstants.HORIZONTAL));
       
	    add(listAttribute,BorderLayout.LINE_START);	
	   add(new JSeparator(SwingConstants.HORIZONTAL));
	    add(listMethod,BorderLayout.LINE_START);
	 
		this.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) { 
		    	  if(e.getClickCount()==2){
		             new UmlOptionClass(nameClass,modelAttribute,modelMethod);  
		         }
		    }
		});
		
	}
	 public String getTitle(){
		 return nameClass.getText();
	 }
}
