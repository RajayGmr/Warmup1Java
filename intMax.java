package au.edu;

public class intMax {
    public static void main(String[] args) {
        intMax m=new intMax();
        System.out.println(m.intMax(1,2,3));
        System.out.println(m.intMax(1,3,2));
        System.out.println(m.intMax(3,2,1));
        System.out.println(m.intMax(9,3,3));
        System.out.println(m.intMax(3,9,3));
        System.out.println(m.intMax(3,3,9));
        System.out.println(m.intMax(8,2,3));
        System.out.println(m.intMax(-3,-1,-2));
        System.out.println(m.intMax(6,2,5));
        System.out.println(m.intMax(5,6,2));
        System.out.println(m.intMax(5,2,6));
        System.out.println(m.intMax(1,3,3));
    }
    public int intMax(int a,int b, int c){
        if(a>b && a>c){
            return a;
        }else if(a<b && b<c){
            return c;
        }
        else {
            return b;
        }
    }
}
