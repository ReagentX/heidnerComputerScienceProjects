//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GraphicsRunner()
    {
        super("Graphics Runner");
        setSize(WIDTH,HEIGHT);
                        
        //getContentPane().add(new WhileLoopCircles());
        getContentPane().add(new DoWhileLoopCircles());
                
        setVisible(true);
    }
    
    public static void main( String args[] )
    {
        GraphicsRunner run = new GraphicsRunner();
    }
}