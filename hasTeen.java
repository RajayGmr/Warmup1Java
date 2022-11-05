package au.edu;

public class hasTeen {
    public static void main(String[] args) {
        hasTeen m=new hasTeen();
        System.out.println(m.hasTeen(13,20,10));
        System.out.println(m.hasTeen(20,19,10));
        System.out.println(m.hasTeen(20,10,13));
        System.out.println(m.hasTeen(1,20,12));
        System.out.println(m.hasTeen(19,20,12));
        System.out.println(m.hasTeen(12,20,19));
        System.out.println(m.hasTeen(12,9,20));
        System.out.println(m.hasTeen(12,18,20));
        System.out.println(m.hasTeen(14,2,20));
        System.out.println(m.hasTeen(4,2,20));
        System.out.println(m.hasTeen(11,22,22));

    }
    public boolean hasTeen(int a,int b,int c){
        return (a>=13 && a<=19)||(b>=13 && b<=19)||(c>=13 && c<=19);
    }
}
