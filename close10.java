package au.edu;

public class close10 {
    public static void main(String[] args) {
        close10 m=new close10();
        System.out.println(m.close10(8,13));
        System.out.println(m.close10(13,8));
        System.out.println(m.close10(13,7));
        System.out.println(m.close10(7,13));
        System.out.println(m.close10(9,13));
        System.out.println(m.close10(13,8));
        System.out.println(m.close10(10,12));
        System.out.println(m.close10(11,10));
        System.out.println(m.close10(5,21));
        System.out.println(m.close10(0,20));
        System.out.println(m.close10(10,10));

    }
    public int close10(int a,int b){
       int aDiff=Math.abs(a-10);
       int bDiff=Math.abs(b-10);

       if (aDiff<bDiff){
           return a;
       }else if(aDiff>bDiff) {
           return b;
       }
       return  0;
    }
}
