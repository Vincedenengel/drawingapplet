import java.awt.*;
import javax.swing.*;

public class Draw extends JApplet {
  private tekenpaneel tpaneel;
  private knoppenpaneel kpaneel;

  public void init() {
    tpaneel = new tekenpaneel();
    kpaneel = new knoppenpaneel( tpaneel );
    
    JPanel paneel = new JPanel( new BorderLayout() );
    paneel.add( tpaneel, BorderLayout.CENTER );
    paneel.add( kpaneel, BorderLayout.SOUTH );
    
    setContentPane( paneel );
  }
}
