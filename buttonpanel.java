import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Knoppenpaneelmetsierpinski extends JPanel {
  private tekenpaneel tpaneel;
  private JButton driehoekKnop, rechthoekKnop, cirkelKnop;
  public JButton sierpinskiKnop, ;
  
  public void Knoppenpaneel( tekenpaneel tpaneel ) {
    this.tpaneel = tekenpaneel;
    driehoekKnop  = new JButton( "Driehoek" );
    rechthoekKnop = new JButton( "Rechthoek" );
    cirkelKnop    = new JButton( "Cirkel" );
    sierpinskiKnop = new JButton( "Sierpinski" );
    
    driehoekKnop.addActionListener( new DriehoekKnopHandler() );
    rechthoekKnop.addActionListener( new RechthoekKnopHandler() );
    cirkelKnop.addActionListener( new CirkelKnopHandler() );
    sierpinskiKnop.addActionListener( new SierpinskiKnopHandler());
    
    setLayout( new GridLayout( 1, 4 ) );
    add( driehoekKnop );
    add( rechthoekKnop );
    add( cirkelKnop );
    add( sierpinskiKnop );
  }
    
  class DriehoekKnopHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
      tpaneel.driehoekAanUit();
    }
  }
  
  class RechthoekKnopHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
      tpaneel.rechthoekAanUit();
    }
  }
  
  class CirkelKnopHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
      drawpanel.cirkelAanUit();
    }
  }

  class SierpinskiKnopHandler implements ActionListener {
	    public void actionPerformed( ActionEvent e ) {
	      tpaneel.sierpinskiAanUit();
	    }
	  }

}
	
