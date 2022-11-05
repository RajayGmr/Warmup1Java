package au.edu;

public class in1020 {
    public static void main(String[] args) {
        in1020 m=new in1020();
        System.out.println(m.in1020(12,99));
        System.out.println(m.in1020(21,12));
        System.out.println(m.in1020(99,8));
        System.out.println(m.in1020(99,10));
        System.out.println(m.in1020(20,20));
        System.out.println(m.in1020(21,21));
        System.out.println(m.in1020(9,9));
        System.out.println(m.in1020(-12,-99));
    }
    public boolean in1020(int x,int y){
        return ((x>=10 && x<=20)||(y>=10 && y<=20));
    }
}
