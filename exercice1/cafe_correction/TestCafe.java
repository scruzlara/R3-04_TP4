package cafe_correction;

public class TestCafe {

	public static void main(String[] args) {
		Boisson b = new BoissonChantilly
				        (new BoissonChantilly
				             (new BoissonCreme
				                  (new Deca())));
		System.out.println(b);
		
		Boisson c=new Deca();
		System.out.println(c);
	}

}

