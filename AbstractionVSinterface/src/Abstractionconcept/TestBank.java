package Abstractionconcept;

public class TestBank {

	public static void main(String[] args) {
			

			HDFCbank hb = new HDFCbank();
			
			hb.credit();
			hb.debit();
			hb.loan();
			hb.fund();
			
			Bank b= new HDFCbank();
			b.credit();
			b.debit();
			b.loan();
			
		
	}

}
