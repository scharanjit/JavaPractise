package immutableFinal;

public class finalKeyWordInMethodCalls {
    private String name;
    
    public finalKeyWordInMethodCalls()
    {}

    public finalKeyWordInMethodCalls (String s) {
        this.name = s;
    }

    public void setName(String s) {
        this.name = s;
    }


private void test (final finalKeyWordInMethodCalls n) {
    n.setName("test");
}


public static void main(String[] args) {
	finalKeyWordInMethodCalls v = new finalKeyWordInMethodCalls();
	v.test(v);
}
}
