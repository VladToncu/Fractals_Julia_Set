import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SliderPanel extends JPanel implements Observer{
	
	private JSlider aSlider;
	private JSlider bSlider;
	private JuliaModel model;
	public SliderPanel(JuliaModel model, int min, int max, int value){
		super();
		this.model=model;
		aSlider = new JSlider(min, max, value);
		bSlider = new JSlider(min, max, value);
		
		aSlider.addChangeListener(e -> model.setA(aSlider.getValue()/100.0));
		bSlider.addChangeListener(e -> model.setB(bSlider.getValue()/100.0));
		
		add(aSlider);
		add(bSlider);
		
	
	}

	
	public void update(Observable arg0, Object arg1) {
		aSlider.setValue((int)(model.getA()*100));
		bSlider.setValue((int)(model.getB()*100));
		repaint();
	}
}
