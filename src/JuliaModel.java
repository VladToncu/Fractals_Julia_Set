import java.util.Observable;


public class JuliaModel extends Observable {
	
	private JuliaSet set;
	public JuliaModel(JuliaSet set){
		this.set = set;
	}
	
	public void setA(double a){
		set.setA(a);
		setChanged();
		notifyObservers();
	}
	
	public void setB(double b){
		set.setB(b);
		setChanged();
		notifyObservers();
	}
	
	public double getA(){
		return set.getA();
	}
	
	public double getB(){
		return set.getB();
	}
	
	
	public int isInSet(double i, double j )
	{
		return set.isInSet(i, j);
		
	}
	public int getIterations()
	{
		return set.getIterations();
	}
}
