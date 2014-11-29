import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Color;
//import java.awt.geom.Line2D;
class IndianFlagResizePanel extends JPanel
{
  public void paintComponent(Graphics g)
  {
    
    super.paintComponent(g);
    
	Graphics2D g2=(Graphics2D) g;
	Dimension frameSize=getSize();
	int fw=frameSize.width;
	int fh=frameSize.height;
	//coding for pole
	//double polew=3*fw/256;
	double polew=fw/128;
	double poleh=3*fh/4;
	double pleft=fw/4;
	double pupper=fh/16;
	
	Rectangle2D Rect=new Rectangle.Double(pleft,pupper,polew,poleh);
	g2.setPaint(Color.black);
	g2.draw(Rect);
	g2.fill(Rect);
	
	//coding for orange rectangle
	double fRwidth=3*fw/16;
	double fRheight=3*fh/32;
	//double fRectL=67*fw/256;
	double fRectL=33*fw/128;
	Rectangle2D rect=new Rectangle.Double(fRectL,pupper,fRwidth,fRheight);
	g2.setPaint(Color.orange.darker());
	g2.draw(rect);
	g2.fill(rect);
	
	//coding for white rectangle 
    double SRupper=5*fh/32;
    Rectangle2D rect1=new Rectangle.Double(fRectL,SRupper,fRwidth,fRheight);
	g2.setPaint(Color.white);
	g2.draw(rect1);
	g2.fill(rect1); 	
	
	//coding for green rectangle 
	double TRupper=8*fh/32;
	 Rectangle2D rect2=new Rectangle.Double(fRectL,TRupper,fRwidth,fRheight);
	g2.setPaint(Color.green.darker());
	g2.draw(rect2);
	g2.fill(rect2); 
	
	
	double cx=rect1.getCenterX();
	double cy=rect1.getCenterY();
	g2.setPaint(Color.blue);
	Ellipse2D circle=new Ellipse2D.Double();
	int r=3*fh/64;
	circle.setFrameFromCenter(cx,cy,cx+r,cy+r);
	g2.draw(circle);
	for(int i=0;i<24;i++)
	{
	  double angle=Math.toRadians(360*i/24);
	  Line2D line=new Line2D.Double(cx,cy,cx+r*Math.cos(angle),cy+r*Math.sin(angle));
	  g2.draw(line);
	 } 
	
	/*//coding for three lowest rectangles
	double frleft=15*fw/64;
	double frwidth=fw/32;
	double frupper=13*fh/16;
	double frheight=fh/32;
	 Rectangle2D rect3=new Rectangle.Double(frleft,frupper,frwidth,frheight);
	g2.setPaint(Color.black);
	g2.draw(rect3);
	g2.fill(rect3); 
	
   /* double srleft=*fw/256;
	double srupper=115*fh/128;
	double srwidth=9*fw/128;
	double srheight=3*fh/128;
	
	 Rectangle2D rect4=new Rectangle.Double(srleft,srupper,srwidth,srheight);
	g2.setPaint(Color.black);
	g2.draw(rect4);
	g2.fill(rect4); */
   }
}  
class IndianFlagResizeFrame extends JFrame
{
public IndianFlagResizeFrame()
{
  setTitle("INDIAN FLAG");
  Toolkit tk=Toolkit.getDefaultToolkit();
  Dimension d=tk.getScreenSize();
  int scrwidth=d.width;
  int scrheight=d.height;
  setSize(scrwidth/2,scrheight/2);
  setLocation(scrwidth/4,scrheight/4);
  Image img=tk.getImage("images.jpg");
  setIconImage(img);
  //Container contentPane=getContentPane();
 //contentPane.add(new MyPanel());
  IndianFlagResizePanel IF=new IndianFlagResizePanel();
  add(IF);
  }
 }
 
    
 public class IndiaFlag
 {
   public static void main(String[] args)
   {
    IndianFlagResizeFrame F=new IndianFlagResizeFrame();
	 F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 F.setVisible(true);
	 
   }
  }
