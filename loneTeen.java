package au.edu;

public class loneTeen {
    public static void main(String[] args) {
        loneTeen m=new loneTeen();
        System.out.println(m.loneTeen(13,99));
        System.out.println(m.loneTeen(21,19));
        System.out.println(m.loneTeen(13,13));
        System.out.println(m.loneTeen(14,20));
        System.out.println(m.loneTeen(20,15));
        System.out.println(m.loneTeen(16,17));
        System.out.println(m.loneTeen(16,9));
        System.out.println(m.loneTeen(16,18));
        System.out.println(m.loneTeen(13,19));
        System.out.println(m.loneTeen(13,20));
        System.out.println(m.loneTeen(6,18));
        System.out.println(m.loneTeen(99,13));
        System.out.println(m.loneTeen(99,99));
    }
    public boolean loneTeen(int a,int b){
//        boolean aTeen=(a>=13 && a<=19) &&(b>=13 && b<=19);
//        boolean bTeen=(a>=13 && a<=19) &&(b>=13 && b<=19);
        return (((a>=13 && a<=19) &&!(b>=13 && b<=19))|| (!(a>=13 && a<=19) &&(b>=13 && b<=19)));
    }
}
