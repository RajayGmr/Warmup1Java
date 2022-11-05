package au.edu;

public class startHi {
    public static void main(String[] args) {
        startHi m=new startHi();
        System.out.println(m.startHi("hi there"));
        System.out.println(m.startHi("hi"));
        System.out.println(m.startHi("hello hi"));
        System.out.println(m.startHi("he"));
        System.out.println(m.startHi("h"));
        System.out.println(m.startHi(""));
        System.out.println(m.startHi("ho hi"));
        System.out.println(m.startHi("hi ho"));
        System.out.println(m.startHi("Hi there"));

    }
    public boolean startHi(String str){
        if(str.length()<2){
            return false;
        }else {
            String first2=str.substring(0,2);
            if (first2.equals("hi")){
                return true;
            }else {
                return false;
            }
        }
    }
}
