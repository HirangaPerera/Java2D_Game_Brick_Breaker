import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class GameLogic extends JPanel  implements KeyListener,ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private int paddleposW = 310;
	private int ballposW = 100;
	private int ballposH =  300;
	private int paddlewidth=150;

	
public void paint(Graphics g) {
		
		//Background
		g.setColor(Color.white);
		g.fillRect(1, 1, 700, 600);
		//the Paddle
		g.setColor(Color.black);
		g.fillRect(paddleposW, 500, paddlewidth, 8);
		//the ball
		g.setColor(Color.magenta);
		g.fillOval(ballposW,ballposH, 20, 20);
	}



@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
