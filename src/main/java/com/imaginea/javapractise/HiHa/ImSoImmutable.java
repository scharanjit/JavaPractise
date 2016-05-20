package HiHa;



public /*final*/ class  ImSoImmutable
{
  private final int field1;
  private final int field2;

  public ImSoImmutable(int field1, int field2){
     this.field1 = field1;
     this.field2 = field2;
  }

  public int add(){
     return field1+field2;
  }
}