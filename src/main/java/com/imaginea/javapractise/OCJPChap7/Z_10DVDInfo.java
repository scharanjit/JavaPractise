package OCJPChap7;

public  class Z_10DVDInfo{
    private String title;
    private String genre;
    private String leadActor;

  Z_10DVDInfo(String t,String g,String a){
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

}