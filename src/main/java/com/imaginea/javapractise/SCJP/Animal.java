package SCJP;

public class Animal {
		String name;
		Animal(String name) {
			this.name = name;
		}

		Animal() {
			this(makeRandomName());
		}

		static String makeRandomName() {
			System.out.println(Math.random());
			int x = (int) (Math.random() * 5);
			System.out.println(x);
			String name = new String[] {"Fluffy", "Fido","Rover", "Spike","Gigi"}[x];
			return name;
		}

		public static void main (String [] args) {
				Animal a = new Animal();
				System.out.println(a.name);
				Animal b = new Animal("Zeusi");
				System.out.println(b.name);
		}
 }