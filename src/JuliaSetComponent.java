import java.awt.BorderLayout;

import javax.swing.JPanel;


public class JuliaSetComponent extends JPanel{
	
	private JuliaModel model;
	private JuliaSetView view;
	private SliderPanel slider;
	public JuliaSetComponent(JuliaSet julia)
	{
		super();
		this.model=new JuliaModel(julia);
		view=new JuliaSetView(model);
		slider=new SliderPanel(model,-100,100,30);
		model.addObserver(view);
		model.addObserver(slider);
		setLayout(new BorderLayout());
		add(view,BorderLayout.CENTER);
		add(slider,BorderLayout.SOUTH);
	}

}
