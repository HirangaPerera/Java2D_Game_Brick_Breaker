import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JPanel;
import javax.swing.Timer;

import javafx.fxml.Initializable;


public class GameLogic extends JPanel  implements KeyListener,ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private int paddleposLR = 310;
	private int ballposW = 100;
	private int ballposH =  300;
	private int paddlewidth=150;
	private int BmoveR;
	private int BmoveD;
	private int delay =8;
	private int balldirW =-1;
	private int balldirH =-2;
	private Timer time;
	BricksGenerator bg;
	public GameLogic() {
		bg = new BricksGenerator(3,7);
		addKeyListener(this); 
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		time = new Timer(delay,this);
		time.start();
	}
	
	
public void paint(Graphics g) {
		
		//Background
		g.setColor(Color.white);
		g.fillRect(1, 1, 700, 600);
		bg.draw((Graphics2D) g);
		//the Paddle
		g.setColor(Color.black);
		g.fillRect(paddleposLR, 500, paddlewidth, 8);
		//the ball
		g.setColor(Color.magenta);
		g.fillOval(ballposW,ballposH, 20, 20);
	}



@Override
public void actionPerformed(ActionEvent arg0) {
	
	if(new Rectangle(ballposW,ballposH, 20, 20).intersects(paddleposLR, 500, paddlewidth, 8)) {
		balldirH = -balldirH;
	}
	 for(int i =0;i< bg.brick.length; i++) {
			for(int j=0; j<bg.brick[0].length; j++) {
				if(bg.brick[i][j]>0) {
				if(new Rectangle(ballposW,ballposH, 20, 20).intersects(j*bg.brickWidth+80, i*bg.brickHeight+50, bg.brickWidth, bg.brickHeight)){
					bg.setBrickValue(0,i, j);
				}
				
					}
			
				}
			}
	ballposW +=balldirW;
	ballposH+=balldirH;
	if(ballposW==0) {
		balldirW = -balldirW;
	}
	if(ballposH <0) {
	balldirH = -balldirH;
		
	}
	
	
	if(ballposW  > 670) {
		balldirW = -balldirW;
		
	}
	
	if(ballposW <0 && ballposH <0) {
		
		ballposW = -balldirW;
	}
	repaint();
}


//paddle
@Override
public void keyPressed(KeyEvent e) {
	try {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (paddleposLR >= 540) {
				paddleposLR = 540;
			} else {
				moveRight();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (paddleposLR <= 10) {
				paddleposLR = 10;
			} else {
				moveLeft();
			}
			
		} 
	} finally {
		// TODO: handle finally clause
	}
	repaint();
}

private void moveRight() {
	
	paddleposLR+=20;
	
}

private void moveLeft() {
	
	
	paddleposLR-=20;
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
