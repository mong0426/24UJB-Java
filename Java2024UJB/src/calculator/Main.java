package calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	private Frame f;
	private Panel p2;
	private TextField tmsg;
	private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, bt10, bt11, bt12;

	public Main() {
		f = new Frame("Calculator");
		f.setSize(800, 800);
		f.setLayout(new FlowLayout());
		p2 = new Panel();
		tmsg = new TextField(50);

		f.add(tmsg, BorderLayout.NORTH);
		f.add(p2, BorderLayout.CENTER);
//		f.add(bt12, "p2");
//		f.add(bt11, "p2");
//		f.add(bt10, "p2");
//		f.add(bt9, "p2");
//		f.add(bt8, "p2");
//		f.add(bt7, "p2");
//		f.add(bt6, "p2");
//		f.add(bt5, "p2");
//		f.add(bt4, "p2");
//		f.add(bt3, "p2");
//		f.add(bt2, "p2");
//		f.add(bt1, "p2");
//		f.add(bt0, "p2");
		


		f.setVisible(true);

	}
	public void startFrame() {

		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		bt0.addActionListener(this);
		bt11.addActionListener(this);
		bt12.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Button1")) {
			System.out.println("1");
		}
		if (e.getActionCommand().equals("Button2")) {
			System.out.println("2");
		}
		if (e.getActionCommand().equals("Button3")) {
			System.out.println("3");
		}
		if (e.getActionCommand().equals("Button4")) {
			System.out.println("4");
		}
		if (e.getActionCommand().equals("Button5")) {
			System.out.println("5");
		}
		if (e.getActionCommand().equals("Button6")) {
			System.out.println("6");
		}
		if (e.getActionCommand().equals("Button7")) {
			System.out.println("7");
		}
		if (e.getActionCommand().equals("Button8")) {
			System.out.println("8");
		}
		if (e.getActionCommand().equals("Button9")) {
			System.out.println("9");
		}
		if (e.getActionCommand().equals("Button10")) {
			System.out.println("+");
		}
		if (e.getActionCommand().equals("Button11")) {
			System.out.println("-");
		}
		if (e.getActionCommand().equals("Button12")) {
			System.out.println("*");
		}
		if (e.getActionCommand().equals("Button0")) {
			System.out.println("0");
		}

	}

	public static void main(String[] args) {
		Main d = new Main();
		d.startFrame();
	}

}
