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
	
	g2.setPaint(Color.yellow);
	g2.fill(Rect2);

        //coding for lines on rectangle 2 
        //coding for vertical lines
        double x1=lx2+width/3;
        double x2=x1;
        double y1=uy2;
        double y2=y1+height;
        
        double px2=x1;
        double py2=y1;
       
        Line2D line=new Line2D.Double(x1,y1,x2,y2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line);  
        g2.fill(line);
        double x3=x1+width/3;
        Line2D line1=new Line2D.Double(x3,y1,x3,y2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line1);  
        g2.fill(line1);
        
        //coding for horizantal lines
        x1=lx2;
        y1=uy2+height/3;
        x2=lx2+width;
        Line2D line2=new Line2D.Double(x1,y1,x2,y1);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line2);  
        g2.fill(line2);

        y1=y1+height/3;
        Line2D line3=new Line2D.Double(x1,y1,x2,y1);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line3);  
        g2.fill(line3);
        
        //coding for lines on rectangle 1
        double px1=lx1+width/3;
        double py1=uy1;
         Line2D line4=new Line2D.Double(px1,py1,px2,py2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line4);  
        g2.fill(line4);
        px1=px1+width/3;
        px2=px2+width/3;
        Line2D line5=new Line2D.Double(px1,py1,px2,py2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line5);  
        g2.fill(line5);
 
        double q1=lx1+width/6;
        double q2=uy1+height/6;
        double q3=q1+width;
         Line2D line8=new Line2D.Double(q1,q2,q3,q2);
        g2.setPaint(Color.black);
         g2.setStroke(new BasicStroke(3));
        g2.draw(line8);  
        g2.fill(line8);

        q1=lx1+width/3;
        q2=uy1+height/3;
        q3=q1+width;
        Line2D line9=new Line2D.Double(q1,q2,q3,q2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line9);  
        g2.fill(line9);


        px1=lx1;
        py1=uy1+height/3;  
        px2=x1;
        py2=uy2+width/3; 
        Line2D line6=new Line2D.Double(px1,py1,px2,py2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line6);  
        g2.fill(line6);
 
        py1=py1+height/3;
        py2=py2+height/3;
        Line2D line7=new Line2D.Double(px1,py1,px2,py2);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line7);  
        g2.fill(line7);

        double q4=lx1+width/6;
        double q5=uy1+height/6;
        double q6=q5+height;
        Line2D line10=new Line2D.Double(q4,q5,q4,q6);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line10);  
        g2.fill(line10);
        
        q4=lx1+width/3;
        q5=uy1+height/3;
        q6=q5+height;
         Line2D line11=new Line2D.Double(q4,q5,q4,q6);
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.draw(line11);  
        g2.fill(line11);
        
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
public class Qube
{
public static void main(String[] args)
{
   mf F=new mf();
   F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   F.setVisible(true);   
}
}
