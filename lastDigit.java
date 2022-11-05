package au.edu;

public class lastDigit {
    public static void main(String[] args) {
        lastDigit m=new lastDigit();
        System.out.println(m.lastDigit(7,17));
        System.out.println(m.lastDigit(6,17));
        System.out.println(m.lastDigit(3,113));
        System.out.println(m.lastDigit(114,113));
        System.out.println(m.lastDigit(114,4));
        System.out.println(m.lastDigit(10,0));
        System.out.println(m.lastDigit(11,0));
    }
    public boolean lastDigit(int a,int b){
        return (a%10==b%10);
    }
}
