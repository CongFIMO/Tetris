package Tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class NextPiece extends JPanel {
	int highscore;
	private Piece next;
	private JTetris tetris;
	private static final int tile_size = 20;
    private static final int sizePiece = 80;
    private static final int x = 40;
    private static final int y = 20;
    private static final int center_x = x + (sizePiece) / 2;
    private static final int center_y = y + (sizePiece) / 2;
    private static final int hgap = 2;
   // private static final int vgap = 2;
    
	public NextPiece(JTetris tetris) {
        next = tetris.getnextPiece();
        this.tetris = tetris;
        this.setPreferredSize(new Dimension(50, 150));

    }
	
	public void drawTitle( int x, int y, int size, Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(x, y, size, size);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		g.drawRect(x, y, sizePiece, sizePiece);
		g.setFont(new Font("Tahoma",Font.BOLD,28));
		g.drawString("Next Piece", 0, 160);
		next = tetris.getnextPiece();
		 if (next != null) {
	            int length = next.getBody().length;
	            TPoint[] x = next.getBody();
	            int xPiece = (next.getWidth() * tile_size + hgap) / 2;
	            int yPiece = (next.getHeight() * tile_size + hgap) / 2;
	            for (int i = 0; i < length; i++) {
	                drawTitle( center_x - xPiece + x[i].x * tile_size, center_y - yPiece + x[i].y * tile_size, tile_size - 2, g);
	            }
	        }
		
	}
	
}
