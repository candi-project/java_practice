package interfaceConcept;

public class Developing implements BankingClients, DomainClients{
//Now this class is responsible to implement ALL methods of BankingClients.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Developing d = new Developing();
	d.paycreditcard();
	d.checkingbalance();
	d.login();
	
	BankingClients dr = new Developing(); 
	dr.transferbalance();
	
	DomainClients dm = new Developing();
	dm.investment();
	
	
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard implemented.");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance implemented.");
		
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance implemented.");
	}
    
	public void login() {
		System.out.println("logined implemented.");
		
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("investment implemented.");
	}
}
