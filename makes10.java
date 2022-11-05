package au.edu;

public class makes10 {
    public static void main(String[] args) {
        makes10 m=new makes10();
        System.out.println(m.makes10(9,10));
        System.out.println(m.makes10(9,9));
        System.out.println(m.makes10(1,9));
        System.out.println(m.makes10(10,1));
        System.out.println(m.makes10(10,10));
        System.out.println(m.makes10(8,3));
        System.out.println(m.makes10(10,42));
        System.out.println(m.makes10(12,-2));
    }
    public boolean makes10(int a,int b){
        if(a==10 || b==10 || a+b==10){
            return true;
        }
        return false;
    }
}
