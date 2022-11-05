package au.edu;

public class or35 {
    public static void main(String[] args) {
         or35 m=new or35();
        System.out.println(m.or35(3));
        System.out.println(m.or35(10));
        System.out.println(m.or35(8));
        System.out.println(m.or35(15));
        System.out.println(m.or35(5));
        System.out.println(m.or35(9));
        System.out.println(m.or35(4));
        System.out.println(m.or35(7));
        System.out.println(m.or35(6));

    }
    public boolean or35(int n){
        return ((n%3==0)||(n%5==0));
    }
}
