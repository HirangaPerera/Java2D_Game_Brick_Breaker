import javax.swing.JFrame;



public class jframe {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		GameLogic gamelogic = new GameLogic();
		jf.setBounds(300, 50, 700, 600);
		jf.setTitle("Brick Breaker");
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(gamelogic);
		}
}
