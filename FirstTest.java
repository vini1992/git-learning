//First Method
/*import javax.swing.*;
class FirstFrame extends JFrame
{
  public FirstFrame()
  {
  setTitle("First Frame");
  setSize(300,200);
  }
 } 
public class FirstTest
{
 public static void main(String[] args)
 {
   FirstFrame F=new FirstFrame();
   
   F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   F.setVisible(true);
 }
}*/
// Second Method
/*import javax.swing.JFrame;
public class FirstTest
{
  public static void main(String[] args)
  {
    JFrame F=new JFrame("First Frame");
	F.setSize(300,300);
	
    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	F.setVisible(true);
  }
 }*/
// Third Method according to the window size
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
class FirstFrame extends JFrame
{
public FirstFrame()
{
  setTitle("First Frame");
  Toolkit tk=Toolkit.getDefaultToolkit();
  Dimension d=tk.getScreenSize();
  int scrwidth=d.width;
  int scrheight=d.height;
  setSize(scrwidth/2,scrheight/2);
  }
 }
 public class FirstTest
 {
   public static void main(String[] args)
   {
     FirstFrame F=new FirstFrame();
	 F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 F.setVisible(true);
   }
  }
  
  
	