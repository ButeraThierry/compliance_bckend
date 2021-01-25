package package_2;
import package_1;
public class Package_2{
String  college;
public void display(){
	System.out.println("college name:"+college);
}

	 public static void main(String[] args) {
Package_2  d=new  Package_2();
Package_1 c=new Package_1();
d.college="Tumba";
d.display();
c.compute(20,50);
	}
}
