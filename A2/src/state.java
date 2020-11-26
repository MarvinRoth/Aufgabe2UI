import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ChangeListener;

public class state extends JFrame {
    	public state() {
    	setSize(500,500);
		getContentPane().setLayout(null);
		
		String[] items= {"Eins", "Zwei", "Drei", "Vier"};
		JList list = new JList(items);
		ListSelectionModel lModel= list.getSelectionModel();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()) {
					System.out.println("Auswahl Geaendert: " + e.getFirstIndex());
				}
			}
		});
		list.setBounds(10, 11, 129, 286);
		getContentPane().add(list);
		
		JSlider slider = new JSlider();
		BoundedRangeModel model = slider.getModel();
		model.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				BoundedRangeModel m = (BoundedRangeModel) e.getSource();
				System.out.println("Modell aenderugn: " +m.getValue());
			}
		});
		slider.setBounds(209, 23, 200, 15);
		getContentPane().add(slider);
		
	}
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					state statefull = new state();
					statefull.setVisible(true);
					//Try kek = new Try();
					//kek.setVisible(true);
				}
			});
		}
}

