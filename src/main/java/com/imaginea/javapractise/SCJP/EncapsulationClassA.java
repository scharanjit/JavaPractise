package SCJP;

public class EncapsulationClassA {

	public static void main(String[] args) {
		EncapsulationClassB b = new EncapsulationClassB();
		b.setName("Helo");
		
		b.setEMail("cj@gmail.com");
		System.out.println(b.getEMail());
		System.out.println(b.getName());
	}
}
