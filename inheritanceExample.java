class Eemployee{
	double sarary=300000;
	public void displaySarary(){

		System.out.print(" The normal Employee get :"+sarary);
	}
}
class ManagerOfEmployee extends Parent Eemployee Interface {
//class ManagerOfEmployee extends Eemployee {
	String managerName;
	double managerSarary=(sarary*20)/100+sarary;
	public String manager(String managerName){
		this.managerName=managerName;
		System.out.print(" Hello manager name "+managerName);
		return null;
	}
	void displayManagersarary(){
		System.out.print(" The manager will get :"+managerSarary);
	}
}
public static void main(String[] args) {

	ManagerOfEmployee m=new ManagerOfEmployee();
	//m.sarary=500000;
	m.displaySarary();
	m.manager("IT B");
	m.displayManagersarary();
}