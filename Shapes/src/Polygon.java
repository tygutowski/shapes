
public interface Polygon {
	public void setName(String name);
	public String getName();
	public double getBase();
	public double getHeight();
	public double getPerimeter();
	public int numSides();
	public boolean isRegular();
	public boolean congruentDiag();
	public boolean isParrallelogram();
}
