package OCJPChap7;
/*
 * 
 * The Comparable interface is used by the Collections.sort() method and
the java.util.Arrays.sort() method to sort Lists and arrays of objects,
respectively. To implement Comparable, a class must implement a single method,
compareTo().
 * */
public  class Z_12DVDInfo  implements Comparable<Z_12DVDInfo> {
    private String title;
    private String genre;
    private String leadActor;

  Z_12DVDInfo(String t,String g,String a){
     this.title = t;
     this.genre =g;
     this.leadActor=a;
 }

 public String getTitle() {
   return title;
 }

 public void setTitle(String title) {
   this.title = title;
 }

 public String getGenre() {
    return genre;
 }

 public void setGenre(String genre) {
    this.genre = genre;
 }

 public String getLeadActor() {
  return leadActor;
 }

 public void setLeadActor(String leadActor) {
   this.leadActor = leadActor;
 }

 @Override
 public String toString() {
   return "DVDInfo [title=" + title + ", genre=" + genre + ", leadActor=" + leadActor + "]\n";
   
 }
 
 
 public int compareTo(Z_12DVDInfo d) {
	 return title.compareTo(d.getTitle()); // #2
	 }

}