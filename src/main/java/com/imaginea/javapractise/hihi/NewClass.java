package hihi;

public class NewClass {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,1,2,3,4,5};   //  get 1 5 2 6 3 7 4 8
        int[] newarr=new int[nums.length];
        int count=0,m=0;
        for(int i=0;i<nums.length/2;i++){
            newarr[count]=nums[i];
            count+=2;
           // System.out.println(count);
            newarr[count-1]=nums[nums.length/2+i];
        }
        for(int i=0;i<newarr.length;i++)
            System.out.print(newarr[i]+" ");
    }
}