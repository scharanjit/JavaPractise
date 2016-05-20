package OCJPChap7;

public class ZZ_6 {

}

interface Hungry<E>
{
	void munch(E x);
}

interface Carnivore<E extends Animaal> extends Hungry<E> {}

//interface Herbivore<E extends Plant> extends Hungry<E> {}
interface Herbivore<E extends Animaal> extends Hungry<E> {}   // the type shud be same obj 6.4 yaad kro

abstract class Plant {}
class Grass extends Plant {}
abstract class Animaal {}

class Sheep extends Animaal implements Herbivore<Sheep>
{
	//Look:- Sheep extends Animal
	//All ships are animal therefore
	//replce E with Sheep....in commneted part it will bcm dem Sheep extends Plant
	//but just now above..we declare Sheep extends Animal
	//therfore its generic only extends Animal
	public void munch(Sheep x) {}
}
class Wolf extends Animaal implements Carnivore<Sheep> 
{
	//Wolf extends Animaal
	//in Carnivore<Sheep>...E extends Animal
	//earlier we declare Sheep Extends Animal
	//therefore it ran
	
	//u can test via change Wolf to sheep
	//And change implmented method..it will run
	public void munch(Sheep x) {}
}



/*
 * B is correct. The problem with the original code is that Sheep tries to implement
Herbivore<Sheep> and Herbivore declares that its type parameter E can be any type that
extends Plant. Since a Sheep is not a Plant, Herbivore<Sheep> makes no sense—
the type Sheep is outside the allowed range of Herbivore's parameter E. Only solutions
that either alter the definition of a Sheep or alter the definition of Herbivore will be able
to fix this. So A, E, and F are eliminated. B works, changing the definition of an Herbivore
to allow it to eat Sheep solves the problem. C doesn't work because an Herbivore<Plant>
must have a munch(Plant) method, not munch(Grass). And D doesn't work, because
in D we made Sheep extend Plant, now the Wolf class breaks because its munch(Sheep)
method no longer fulfills the contract of Carnivore. (Objective 6.4)


A. Change the Carnivore interface to
interface Carnivore<E extends Plant> extends Hungry<E> {}
B. Change the Herbivore interface to
interface Herbivore<E extends Animaal> extends Hungry<E> {}
C. Change the Sheep class to
class Sheep extends Animaal implements Herbivore<Plant> {
public void munch(Grass x) {}
}
D. Change the Sheep class to
class Sheep extends Plant implements Carnivore<Wolf> {
public void munch(Wolf x) {}
}
E. Change the Wolf class to
class Wolf extends Animaal implements Herbivore<Grass> {
public void munch(Grass x) {}
}  
 * */

