class Rectangle{
	int length;
	int width;
int surface;
	void area()
	{
		surface=length*width;
		System.out.println("The area of rectangle is:"+" "+surface);
	}
}
public class PrintArea{
	public static void main(String[] args) {
		Rectangle recta = new Rectangle();
		recta.length=5;
		 recta.width=4;
		recta.display();

	}
}