package OCJP;

public class pointsToRemember {

}
/*
 *In method definition,. varialble arg has least priority even wrt through Object 
 * 
 * this()--> calls default constructor of same class
 * super()--> call default constructor of super class...if dont exist..then does nothing
 * 
 * Coupling(LOW) & Cohesion(high) preferrable
 * 
 * parent throwing exception but child don't--> No effect but opposite will create problem
 * 
 * 
 * Dont change the return type of method in overriding
 * 
 * Reason of compilation error in override & overload...
 * 
 * though constructor type method type change is allowed..see OverrideBeta.java
 * 
 *primitive types(boolean,char,byte,short,int,float,double,long) can be converted just be assigning return type.
 char c='c';
 int i = c; //auto type conversion
 now i will return 99 which is an integer
 We need to add cast where hirarchy is high
 float f=1.4f;
 int i1=(int)f
 So we can primitye type converions depends upon hirarchy
 
 
 *Use of Static keyword ...check StaticCity.java
 *
 *Must check class useAnimal.java,UsegetSet.java, ZooKeeper.java
 *
 *identifiers--> class varaibles..declared after class definition
 *
 *
 *
 *
 */
 
 