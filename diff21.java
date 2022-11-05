package au.edu;

public class diff21 {
    public static void main(String[] args) {
        diff21 m=new diff21();
        System.out.println(m.diff21(19));
        System.out.println(m.diff21(10));
        System.out.println(m.diff21(21));
        System.out.println(m.diff21(22));
        System.out.println(m.diff21(25));
        System.out.println(m.diff21(30));
        System.out.println(m.diff21(0));
        System.out.println(m.diff21(1));
        System.out.println(m.diff21(2));
        System.out.println(m.diff21(-1));
        System.out.println(m.diff21(-2));
        System.out.println(m.diff21(50));

    }
    public int diff21(int n){
        if(n<=21){
            return 21-n;
        }else{
            return (n-21)*2;
        }
    }
}
