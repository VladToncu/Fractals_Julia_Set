import javax.swing.JFrame;


public class JuliaGUI {

	public static void main(String[] args) {
		JuliaSet set = new JuliaSet(200, 0.3, 0.3);
		JuliaSetComponent view = new JuliaSetComponent(set);
		JFrame frame = new JFrame("Julia Set");
		
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.add(view);
		
		frame.setVisible(true);
	}

}
