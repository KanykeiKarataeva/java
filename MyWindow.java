import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyWindow extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private MyPanel panel;
	private JLabel label;
	Container contain; 
	
	MyWindow(){
		super("Graphics window");
		this.setBounds(20,20,800,600);
		contain = this.getContentPane();
		contain.setLayout(null);
		label = new JLabel("Select function:");
		label.setBounds(55, 55, 100, 20);
		contain.add(label);

		MyListener listener = new MyListener();
		
		button4 = new JButton("Just button");
		button4.setBounds(20, 80, 120, 30);
		contain.add(button4);
		
		
		button1 = new JButton("f(x) = x");
		button1.addActionListener(listener);
		button1.setBounds(55, 80, 120, 30);
		contain.add(button1);

		button2 = new JButton("f(x) = x^2");
		button2.addActionListener(listener);
		button2.setBounds(55, 120, 120, 30);
		contain.add(button2);

		button3 = new JButton("f(x) = 1/x");
		button3.addActionListener(listener);
		button3.setBounds(55, 160, 120, 30);
		contain.add(button3);

		panel = new MyPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(200, 50, 450, 450);
		contain.add(panel);
	}
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == button1){
				panel.Change(1);
			}
			else if(e.getSource() == button2){
				panel.Change(2);
			}
			else if(e.getSource() == button3){
				panel.Change(3);
			}
		}
	}
}

class Example11{
	public static void main(String[] args){
		MyWindow window=new MyWindow();
		window.repaint();
		window.setVisible(true);
	}
}