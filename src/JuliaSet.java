
/** this class represents a julia set for a given a and b
 * 
 * @author cxs412
 *
 */
public class JuliaSet
{

	private double a;
	private double b;
	private int iterations;
	
	/** this constructor just initialises the attributes in the class
	 * 
	 * @param iterations the number of tests carried out
	 * @param a the a value
	 * @param b the b value
	 */
	public JuliaSet(int iterations, double a, double b)
	{
		this.a = a;
		this.b = b;
		this.iterations = iterations;
		
	}
	/** given a point the method returns if a point is in a set
	 * 
	 * @param i the i coordinate
	 * @param j the j coordinate
	 * @return a boolean whether the point is in a set
	 */
	public int isInSet(double i, double j)
	{
			int count=0;
			double first = i;
			double second = j;
			for(int k = 0; k < iterations; k++)
			{
				if (Math.pow(first,2)+Math.pow(second,2) > 4)
				{					
					return count;
				}
				else
				{
					count++;
					double nx = first;
					double ny = second;
					second = (double)(2*nx*ny + this.b);
					first = (double)(Math.pow(nx,2)-Math.pow(ny,2) + this.a);
				}
			}

			return this.iterations;

				
	}
	/** returns the value of a
	 * 
	 * @return a
	 */
	public double getA()
	{
		return this.a;
	}
	
	/** returns the value of b
	 * 
	 * @return b
	 */
	public double getB()
	{
		return this.b;
	}
	
	/** sets a new value to a
	 * 
	 * @param a the new value of a
	 */
	public void setA(double a)
	{
		this.a = a;
	}
	
	/** sets a new value to b
	 * 
	 * @param b the new value of b
	 */
	public void setB(double b)
	{
		this.b = b;
	}
	public int getIterations()
	{
		return this.iterations;
	}
	
	
	
}
