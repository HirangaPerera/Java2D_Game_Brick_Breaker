import java.awt.BasicStroke;
	import java.awt.Color;
	import java.awt.Graphics2D;
public class BricksGenerator {
	

	
		public int brick[][];
		public int brickWidth;
		public int brickHeight;
		public int row;
		public int colmn;
		
		public BricksGenerator(int r,int c) {
			brick =new  int[r][c];
			for(  row=0;row<brick.length;row++) {
				for( colmn=0;colmn<brick[0].length;colmn++) {
					brick[row][colmn]=1;
					
				}
				
			}
			brickWidth=540/c;
			brickHeight =150/r;
		}
		
		public void draw(Graphics2D g) {
			
			for( int row=0;row<brick.length;row++) {
				
				for(int colmn=0;colmn<brick[0].length;colmn++) {
					if(brick[row][colmn]>0) {
						g.setColor(Color.WHITE);
						g.fillRect(colmn*brickWidth+80, row*brickHeight+50, brickWidth, brickHeight);
						g.setStroke(new BasicStroke(3));
						g.setColor(Color.BLACK);
						g.drawRect(colmn*brickWidth+80, row*brickHeight+50, brickWidth, brickHeight);
						
					}
				
				}   
			
			}
			
		}
		public void setBrickValue(int value,int row,int col) {
			brick[row][col] =  value;
		}				
	}
		
				
		




