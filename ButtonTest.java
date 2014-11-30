import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonTest
{
  public static void main(String[] args)
  {
    ButtonFrame frame=new ButtonFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
  }
}
 class ButtonFrame extends JFrame
{
  public ButtonFrame()
  {
    setTitle("ButtonTest");
    setSize(WIDTH,HEIGHT);
    
    ButtonPanel panel=new ButtonPanel();
    Container contentPane=getContentPane();
    contentPane.add(panel);
  }
  public static final int WIDTH=300;
  public static final int HEIGHT=200;
}  

class ButtonPanel extends JPanel
{
   public ButtonPanel()
   {
   JButton yellowButton=new JButton("Yellow");
   JButton blueButton=new JButton("Blue");
   JButton redButton=new JButton("Red");
   
   add(yellowButton);
   add(blueButton);
   add(redButton);
   
   ColorAction yellowAction=new ColorAction(Color.yellow);
   ColorAction blueAction=new ColorAction(Color.blue);
   ColorAction redAction=new ColorAction(Color.red);
   
   yellowButton.addActionListener(yellowAction);
   blueButton.addActionListener(blueAction);
   redButton.addActionListener(redAction);
   
   }
   private class ColorAction implements ActionListener
   {
      public ColorAction(Color c)
	  {
	    backgroundColor=c;
	  }
      public void actionPerformed(ActionEvent event)
      {
        setBackground(backgroundColor);
		repaint();
      }
	  private Color backgroundColor;
	}
   }	
  	  
   
   