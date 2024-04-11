package java6.p30;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener{
	private Frame f;
	private Button b;

	public ButtonTest() {
		f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100,75);
		b.addActionListener(this);
		
		f.add(b);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("확인")) {
			f.setTitle("Seungjin");
		}
	}
	public static void main(String[] args) {
		new ButtonTest();
	}

}


//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ButtonTest {
//    public static void main(String[] args) {
//        Frame f = new Frame("Login");
//        f.setSize(300, 200);
//        f.setLayout(null);
//
//        Button b = new Button("확인");
//        b.setSize(100, 50);
//        b.setLocation(100, 75);
//
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setTitle("오탄");
//            }
//        });
//
//        f.add(b);
//        f.setVisible(true);
//    }
//}
