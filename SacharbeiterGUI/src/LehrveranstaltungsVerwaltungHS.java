import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class LehrveranstaltungsVerwaltungHS{
	
	public static void oeffnen() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		//Declaration & Initialization
        JFrame frame = new JFrame();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setTitle("LehrveranstaltungsVerwaltung");
        JPanel LV = new JPanel();
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menuLogin = new JMenu("Login");
        JMenu menuExit = new JMenu("Beenden");
        JMenuItem menuItemLogin, menuItemExit;
        JToolBar tbar;
        JButton LoginB, ExitB;
        
        menuBar.add(menuLogin);
        menuBar.add(menuExit);
        
        //Login
        menuItemLogin = new JMenuItem("Login");
        menuLogin.add(menuItemLogin);
        
        //Beenden
        menuItemExit = new JMenuItem("Beenden");
        menuExit.add(menuItemExit);
        
        
        //Toolbar
        tbar = new JToolBar();
        tbar.setSize(screenSize.width, 30);
        
        LoginB = new JButton("Login");
        ExitB = new JButton("Beenden");
        tbar.add(LoginB);
        tbar.add(ExitB);
        
        //Auf Frame einfügen
        frame.setJMenuBar(menuBar);
        frame.add(tbar);
        frame.add(LV);
        frame.setVisible(true);
        
        //Fenster größe veränderbar
        frame.setResizable(true);
        
        //Programm bei schließen Beenden
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Login
        LoginB.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//frame.dispose();
        		//LoginAAS.getInstance().login();
        		frame.add(LoginAAS.getInstance().login());
        	}
        });
        
        Action loginAction = new AbstractAction("Login") {
			@Override
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				//LoginAAS.getInstance().login();
        		frame.add(LoginAAS.getInstance().login());
			}
        };
        loginAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_L);
        LoginB.setAction(loginAction);
        
        //Menu Login
        menuItemLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//frame.dispose();
        		frame.add(LoginAAS.getInstance().login());
        	}
        });
        
        //Beenden
        Action closeAction = new AbstractAction("Exit") {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
        	
        };
        
        closeAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_B);
        ExitB.setAction(closeAction);
        
        //Menu Beenden
        menuItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
        	
        });
        

	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
