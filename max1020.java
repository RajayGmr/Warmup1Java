package au.edu;

public class max1020 {
    public static void main(String[] args) {
        max1020 m=new max1020();
        System.out.println(m.max1020(11,19));
        System.out.println(m.max1020(19,11));
        System.out.println(m.max1020(11,9));
        System.out.println(m.max1020(9,21));
        System.out.println(m.max1020(10,21));
        System.out.println(m.max1020(9,10));
        System.out.println(m.max1020(10,11));
        System.out.println(m.max1020(21,10));
        System.out.println(m.max1020(9,11));
        System.out.println(m.max1020(23,10));
        System.out.println(m.max1020(20,10));
        System.out.println(m.max1020(7,20));
        System.out.println(m.max1020(17,16));

    }
    public int max1020(int a,int b){
        if (b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        if (a>=10 && a<=20){
            return a;
        }
        if (b>=10 && b<=20){
            return b;
        }
        return 0;
    }
}
