package java6.p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest {
	private Frame f;
	private TextField tfMsg;
	private Button b;
	private String LOGIN_ID = "green";
	private String LOGIN_PWD = "ujb1234";
	
	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(400, 110);
		f.setLayout(new FlowLayout());
		
		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("PW : ", Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');
		
		b = new Button("Login");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inpId = id.getText();
				String inpPwd = pwd.getText();
				System.out.println(inpId + " / " + inpPwd);
				
				if(inpId.equals(LOGIN_ID) && inpPwd.equals(LOGIN_PWD)) {
					tfMsg.setText("로그인이 성공 했습니다. 추카추카");
				}else {
					tfMsg.setText("로그인이 실패 했습니다.");
				}
			}
		});
		
		tfMsg = new TextField(50);
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b);
		f.add(tfMsg);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldTest();
	}
}

//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.Label;
//import java.awt.Panel;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class TextFieldTest implements ActionListener{
//	private Frame f;
//	private Label lid, lpwd;
//	private TextField id, pwd;
//	private Button ok;
//	private Panel consol;
//	
//	public void A() {
//		f = new Frame("Login");
//		f.setSize(800, 150);
//		f.setLayout(new FlowLayout());
//		
//		lid = new Label("ID : ", Label.RIGHT);
//		lpwd = new Label("Password : ", Label.RIGHT);
//		
//		
//		id = new TextField(10);
//		pwd = new TextField(10);
//		pwd.setEchoChar('*');
//		
//		ok = new Button("OK");
//		
//		consol = new Panel();
//		
//		f.add(lid);
//		f.add(id);
//		f.add(lpwd);
//		f.add(pwd);
//		f.add(consol, BorderLayout.SOUTH);
//		f.add(ok);
//		f.setVisible(true);
//	}
//		
//		
//	public static void main(String[] args) {
//		TextFieldTest g= new TextFieldTest();
//		g.A();
//	}
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getActionCommand().equals(ok)) {
//			System.exit(0);
//		}
//		
//	}
//
//	
//
//}
