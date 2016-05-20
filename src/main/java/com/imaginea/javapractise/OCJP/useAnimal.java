package OCJP;

class Animal {
}

class horse extends Animal {
}

//see see...useAnimal does not extends Animal or horse 
public class useAnimal {

    public void doStuff(Animal a) {
        System.out.println("in animal version");
    }

    public void doStuff(horse a) {
        System.out.println("in horse version");
    }

    public static void main(String[] args) {
        Animal A = new Animal();
        horse h = new horse();

        useAnimal ua = new useAnimal();

        ua.doStuff(A);
        ua.doStuff(h);

        Animal A1 = new horse();

        ua.doStuff(A1);

    }

}
