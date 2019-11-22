/*
 * 
 * Visual Wall 
 * 11/21/2019
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewApplet extends Applet 
{
JLabel directions;
    JTextField input;
    int startX=0;
    int startY=50;
    int width=50;
    int height=20;
    int spacing=2;
    
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
@Override
    public void init() {
        //getContentPane().setBackground(new Color(128,128,128));
        setLayout(new FlowLayout());
        directions=new JLabel("Enter any number between 1 and 20 and press enter");
        input=new JTextField(10);
        add(directions);
        add(input);// TODO start asynchronous download of heavy resources
    }
@Override
    public void paint(Graphics g)
    {
        super.paint(g);
        for (int row=0; row<8;row++)
        {
            int y=startY+(row*(height+spacing));
            for (int col=0; col<8;col++)
            {
             int x=startX+(col*(width+spacing));
             System.out.println(x+"x"+y);
             g.setColor (Color.RED);
             g.fillRect(x,y,width,height);
            
            }
        }
        
    }   

    // TODO overwrite start(), stop() and destroy() methods
}
