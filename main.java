import java.awt.*;
import javax.swing.*;

public class Draw extends JApplet {
  private tekenpaneel tpaneel;
  private knoppenpaneel kpaneel;

  public void init() {
    tpaneel = new drawingpanel();
    kpaneel = new buttonpanel( tpaneel );
    
    JPanel panel = new JPanel( new BorderLayout() );
    panel.add( tpaneel, BorderLayout.CENTER );
    panel.add( kpaneel, BorderLayout.SOUTH );
    
    setContentPane( panel );
  }
}
