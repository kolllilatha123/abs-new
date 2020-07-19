package org.abs;

public  class Icici  extends Rbi {

	@Override
	public void Saving() {
		// TODO Auto-generated method stub
		System.out.println("saving is 8%");	
	}
	
	public void Deposite() {
		
		System.out.println("Deposite is 100000");
	};
	
	public static void main(String[] args) {
		
		Icici c=new Icici();
		c.Saving();
		c.Deposite();
		
				
		
	}
}
