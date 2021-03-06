package strupattern.composite;

public class Client {
	
	public static void main(String[] args) {
		
		Store s1 = new Store(5000,"A");
		Store s2 = new Store(15000,"B");
		Store s3 = new Store(30000,"C");
		
		City delhi = new City("Delhi");
		
		delhi.addLeaf(s1);
		delhi.addLeaf(s2);
		delhi.addLeaf(s3);
		
		System.out.println("Total Collection " + delhi.getProfit());
		
		City gurgaon = new City("Gurgaon");
		
		gurgaon.addLeaf(s2);
		gurgaon.addLeaf(s3);
		
		System.out.println("Total Collection " + gurgaon.getProfit());
		
		State ncr = new State("Ncr");
		
		ncr.addLeaf(delhi);
		ncr.addLeaf(gurgaon);
		
		System.out.println("Total Collection " + ncr.getProfit());
	}

}
