package java6.p24;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest implements WindowListener, ActionListener{


		private Frame frame;
		private Button button1, button2, button3;
		
		public FlowTest() {
			frame = new Frame("adapter example");
			button1 = new Button("Ok");
			button2 = new Button("Open");
			button3 = new Button("Close");
			
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		public void windowClosed(WindowEvent e) {  }
		public void windowActivated(WindowEvent e) {  }
		public void windowDeactivated(WindowEvent e) {  }
		public void windowDeiconified(WindowEvent e) {  }
		public void windowIconified(WindowEvent e) {  }
		public void windowOpened(WindowEvent e) {  }
		
		public void startFrame() {
			frame.addWindowListener(this);
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			
			frame.setLayout(new FlowLayout());
			
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.setSize(300,300);
			frame.setVisible(true);
		}
		public static void main(String[] args) {
			FlowTest g = new FlowTest();
			g.startFrame();
	}
	    public void actionPerformed(ActionEvent e) {
	    	if(e.getActionCommand().equals("Ok")) {
	    		System.out.println("Ok!");
	    	}
	    	if(e.getActionCommand().equals("Open")) {
	    		System.out.println("Open");
	    	}
	    	if(e.getActionCommand().equals("Close")) {
	    		System.exit(0);
	    	}

	}


		

}

//2nd case
package adapterExample;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FlowTest implements WindowListener {
   private JFrame jf;
   private Button b1, b2, b3;

   public FlowTest() {
      jf = new JFrame("adapter example");
      b1 = new Button("Ok");
      b2 = new Button("Open");
      b3 = new Button("Close");

      b1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(b1, "Ok");
         }
      });

      b2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(b2, "Open");
         }
      });

      b3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            jf.dispose();
         }
      });
   }

   @Override
   public void windowClosing(WindowEvent e) {
      // TODO Auto-generated method stub
      System.exit(0);
   }

   @Override
   public void windowOpened(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void windowClosed(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void windowIconified(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void windowDeiconified(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void windowActivated(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void windowDeactivated(WindowEvent e) {
      // TODO Auto-generated method stub

   }

   public void StartFrame() {
      jf.addWindowListener(this);
      jf.setLayout(new FlowLayout());

      jf.add(b1);
      jf.add(b2);
      jf.add(b3);
      jf.setSize(300, 300);
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      FlowTest f = new FlowTest();
      f.StartFrame();
   }

}
