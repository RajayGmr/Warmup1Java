package au.edu;

public class SumDouble {
    public static void main(String[] args) {
        SumDouble m=new SumDouble();
        System.out.println(m.sumDouble(1,2));
        System.out.println(m.sumDouble(3,2));
        System.out.println(m.sumDouble(2,2));
        System.out.println(m.sumDouble(-1,0));
        System.out.println(m.sumDouble(3,3));
        System.out.println(m.sumDouble(0,0));
        System.out.println(m.sumDouble(0,1));
        System.out.println(m.sumDouble(3,4));

    }
    public int sumDouble(int a,int b){
        int sum=a+b;
        if(a==b){
            sum+=sum;
        }
        return sum;
    }

}
