import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Color;
class mp extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
   
   Graphics2D g2=(Graphics2D) g;
    Dimension frameSize=getSize();
	int fw=frameSize.width;
	int fh=frameSize.height;
	double lx1=fw/8;
	double uy1=fh/8;
	double width=fw/4;
	double height=width;
	Rectangle2D Rect1=new Rectangle.Double(lx1,uy1,width,height);
	g2.setPaint(Color.green);
	g2.draw(Rect1);
	g2.fill(Rect1);
	
	double lx2=lx1+width/2;
	double uy2=uy1+height/2;
	Rectangle2D Rect2=new Rectangle.Double(lx2,uy2,width,height);
	g2.setPaint(Color.blue);
	g2.draw(Rect2);
	g2.fill(Rect2);
	
	
	
	int xpoints[]=new int[4];
	int ypoints[]=new int[4];
	xpoints[0]=(int)lx2;
	xpoints[1]=(int)(lx2+width);
	//xpoints[2]=(int)5*fw/8;
	xpoints[2]=(int)(lx2+width/2);
	xpoints[3]=(int)lx1;
	
	ypoints[0]=(int)uy2;
	ypoints[1]=(int)uy2;
	ypoints[2]=(int)(uy2-height/2);
	ypoints[3]=(int)uy1;
	Polygon p1=new Polygon(xpoints,ypoints,4);
	g2.setPaint(Color.red);
	g2.draw(p1);
	g2.fill(p1);
	
	//int xpoints[]=new int[4];
	//int ypoints[]=new int[4];
	xpoints[0]=(int)lx2;
	xpoints[1]=(int)(lx2+width);
	//xpoints[2]=(int)5*fw/8;
	xpoints[2]=(int)(lx2+width/2);
	xpoints[3]=(int)(lx2-width/2);
	
	ypoints[0]=(int)(uy2+height);
	ypoints[1]=(int)(uy2+height);
	ypoints[2]=(int)(uy2+height/2);
	ypoints[3]=(int)(uy2+height/2);
	Polygon p2=new Polygon(xpoints,ypoints,4);
	g2.setPaint(Color.red);
	g2.draw(p2);
	g2.fill(p2);
	
	g2.setPaint(Color.green);
	g2.fill(Rect1);
	g2.fill(p2);
	
	g2.setPaint(Color.red);
	g2.fill(p1);
	
	g2.setPaint(Color.black);
	g2.fill(Rect2);

        double cx=Rect2.getCenterX();
        double cy=Rect2.getCenterY();
        Ellipse2D circle=new Ellipse2D.Double();
        int r=fh/64;
        circle.setFrameFromCenter(cx,cy,cx+r,cy+r);
        g2.setPaint(Color.white);
        g2.draw(circle);
        g2.fill(circle);
        
        double cx1=cx-fw/32;
        circle.setFrameFromCenter(cx1,cy,cx1+r,cy+r);
        g2.setPaint(Color.white);
        g2.draw(circle);
        g2.fill(circle);
	
	double cx2=cx+fw/32;
        circle.setFrameFromCenter(cx2,cy,cx2+r,cy+r);
        g2.setPaint(Color.white);
        g2.draw(circle);
        g2.fill(circle);

        double cx3=Rect1.getCenterX();
        double cy3=Rect1.getCenterY();
	cx3=cx3-fw/16;
        cy3=cy3+fh/8;
	circle.setFrameFromCenter(cx3,cy3,cx3+r,cy3+r);
        g2.setPaint(Color.white);
        g2.draw(circle);
        g2.fill(circle);
        double cx4=cx3-fw/32;
        double cy4=cy3-fh/32; 
        circle.setFrameFromCenter(cx4,cy4,cx4+r,cy4+r);
        g2.setPaint(Color.white);
        g2.draw(circle);
        g2.fill(circle);
        double cx5=cx3+fw/8;
        double cy5=cy3-fh/4;
        circle.setFrameFromCenter(cx5,cy5,cx5+r,cy5+r);
        g2.setPaint(Color.white);
        g2.draw(circle);
        g2.fill(circle);
        setBackground(Color.blue);

  }
} 
class mf extends JFrame
{
  public mf()
  {
    setTitle("Hello");
	Toolkit Tk=Toolkit.getDefaultToolkit();
	Dimension d=Tk.getScreenSize();
	int sw=d.width;
	int sh=d.height;
	setSize(sw/2,sh/2);
	mp m=new mp();
	add(m);
  }
}
public class Dice
{
public static void main(String[] args)
{
   mf F=new mf();
   F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   F.setVisible(true);   
}
}
