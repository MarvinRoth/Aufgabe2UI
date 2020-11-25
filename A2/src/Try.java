import javax.swing.*;


public class Try extends JFrame{
	public Try() {
		getContentPane().setLayout(null);
		
		JSlider slider = new JSlider();
		BoundedRangeModel model = slider.getModel();
		slider.setBounds(110, 220, 200, 15);
		getContentPane().add(slider);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(94, 178, 230, 15);
		scrollBar.setModel(model);
		getContentPane().add(scrollBar);
	}
}
