package au.edu;

public class posNeg {
    public static void main(String[] args) {
        posNeg m=new posNeg();
        System.out.println(m.posNeg(1,-1,false));
        System.out.println(m.posNeg(1,1,false));
        System.out.println(m.posNeg(-4,-5,true));
        System.out.println(m.posNeg(-4,-5,false));
        System.out.println(m.posNeg(-4,5,true));
        System.out.println(m.posNeg(1,1,false));
        System.out.println(m.posNeg(-1,-1,false));
        System.out.println(m.posNeg(1,-1,true));
        System.out.println(m.posNeg(-1,1,true));
        System.out.println(m.posNeg(1,1,true));
        System.out.println(m.posNeg(-1,-1,true));
        System.out.println(m.posNeg(5,-5,false));
        System.out.println(m.posNeg(-6,6,false));
        System.out.println(m.posNeg(-5,-6,false));
        System.out.println(m.posNeg(-2,-1,false));
        System.out.println(m.posNeg(1,2,false));
        System.out.println(m.posNeg(-5,6,true));
        System.out.println(m.posNeg(-5,-5,true));


    }
    public boolean posNeg(int a,int b, boolean negative){
        if(negative){
            return ((a<0 && b<0));
        }
        return ((a<0 && b>0)||(a>0 && b<0));
    }
}
