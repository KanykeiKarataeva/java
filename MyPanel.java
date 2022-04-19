import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class MyPanel extends JPanel{
	public int index=0;
	public void paint(Graphics g){
		super.paint(g);
		coordinates(g);
		switch(index){
			case 0: break;
			case 1: function1(g); break;
			case 2: function2(g); break;
			case 3: function3(g); break;
		}
	}
	public void coordinates(Graphics g){
		Graphics2D graphic=(Graphics2D) g;
		graphic.setStroke(new BasicStroke(1f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 10.0f, new float[] {16.0f,0f}, 0.0f));
		graphic.setPaint(Color.blue);
		
		graphic.drawRect(20,20,400,400);
		graphic.drawLine(20, 220, 420, 220);
		graphic.drawLine(220, 20, 220, 420);
		
		Font font=new Font("Tahoma",Font.BOLD, 14);
		graphic.setFont(font);
		graphic.drawString("x",410,215);
		graphic.drawString("y",225,35);
		graphic.drawString("0",225,235);
	}
	
	public void function1(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2f));
        g2.setPaint(Color.blue);
        g2.drawLine(25, 415, 415, 25);
	}
	
	public void function2(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2f));
        g.setColor(Color.red);
        Path2D func2 = new Path2D.Double();
        func2.moveTo(120,25);
        func2.quadTo(215,415, 330,25);
        g2.draw(func2);
	}
	
	public void function3(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(2f));
        g.setColor(Color.green);
        Path2D func3 = new Path2D.Double();
        func3.moveTo(225,25);
        func3.quadTo(220,230, 415,215);
		func3.moveTo(25,225);
        func3.quadTo(220,230, 215,415);
        g2.draw(func3);
	}
	
	public void Change(int i){
		index=i;
		repaint();
	}
}