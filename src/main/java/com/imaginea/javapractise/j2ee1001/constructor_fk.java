package j2ee1001;

class ek{ int x;
 
ek(int p){x = p;}
public ek() {
	// TODO Auto-generated constructor stub
}
void show(){ System.out.println("i'm inside e");
}}
public class constructor_fk{ public static void main(String args[]){
ek e1 = new ek();
  e1.show(); 
	}}
