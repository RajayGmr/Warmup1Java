package au.edu;

public class in3050 {
    public static void main(String[] args) {
        in3050 m=new in3050();
        System.out.println(m.in3050(30,31));
        System.out.println(m.in3050(30,41));
        System.out.println(m.in3050(40,50));
        System.out.println(m.in3050(40,51));
        System.out.println(m.in3050(39,50));
        System.out.println(m.in3050(50,39));
        System.out.println(m.in3050(40,39));
        System.out.println(m.in3050(49,48));
        System.out.println(m.in3050(50,40));
        System.out.println(m.in3050(50,51));
        System.out.println(m.in3050(35,36));
        System.out.println(m.in3050(35,45));

    }
    public boolean in3050(int a,int b){
        if(a>=30 && a<=40 && b>=30 && b<=40){
            return true;
        }
        if(a>=40 && a<=50 && b>=40 && b<=50){
            return true;
        }
        return false;
    }
}
