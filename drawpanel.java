import java.awt.*;
import javax.swing.*;

public class drawpanel extends JPanel {
  private boolean isDriehoekZichtbaar,
                  isRechthoekZichtbaar,
                  isCirkelZichtbaar,
                  isSierpinskiZichtbaar;
  
  public void paintComponent( Graphics g ) {
    super.paintComponent( g );

    if( isDriehoekZichtbaar )
      tekenDriehoek( g, 20, 20, 100, 200, 150, 50 );
      
    if( isRechthoekZichtbaar )
      g.drawRect( 200, 40, 150, 100 );
    
    if( isCirkelZichtbaar )
      g.drawOval( 400, 50, 160, 160 );

    if( isSierpinskiZichtbaar )
      tekenSierpinski(g,20,20,100,200,150,50);

  }
  
  public void tekenDriehoek( Graphics g, 
            int x1, int y1, int x2, int y2, int x3, int y3 ) {
    g.drawLine( x1, y1, x2, y2 );
    g.drawLine( x2, y2, x3, y3 );
    g.drawLine( x3, y3, x1, y1 );
  }
  
  public void tekenSierpinski( Graphics g, 
          int x1, int y1, int x2, int y2, int x3, int y3 ) {
	
  double lx=x1;
  double ly=y1;
  double a,b;
  int i=0;
  while (i<10000)
  {
	  i=i+1;
	  
	  double k = Math.random();
	  if (k<0.33333) { a=x1; b=y1; }
	  else if (k<0.66666) { a=x2; b=y2; }
	  else { a=x3; b=y3; };
	  
	  lx = a + 0.5*(lx-a);
	  ly = b + 0.5*(ly-b);
	  int xx = (int)lx;
	  int yy = (int)ly;
      g.drawLine(xx,yy,xx,yy);
  }
}
  
  public void driehoekAanUit() {
    isDriehoekZichtbaar = !isDriehoekZichtbaar;
    repaint();
  }
  
  public void rechthoekAanUit() {
    isRechthoekZichtbaar = !isRechthoekZichtbaar;
    repaint();
  }
  
  public void cirkelAanUit() {
    isCirkelZichtbaar = !isCirkelZichtbaar;
    repaint();
  }
  public void sierpinskiAanUit() {
	    isSierpinskiZichtbaar = !isSierpinskiZichtbaar;
	    repaint();
  }
}
	
