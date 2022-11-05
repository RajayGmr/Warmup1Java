package au.edu;

public class everyNth {
    public static void main(String[] args) {
        everyNth m=new everyNth();
        System.out.println(m.everyNth("Miracle",2));
        System.out.println(m.everyNth("abcdefg",2));
        System.out.println(m.everyNth("abcdefg",3));
        System.out.println(m.everyNth("Chocolate",3));
        System.out.println(m.everyNth("Chocolates",3));
        System.out.println(m.everyNth("Chocolates",4));
        System.out.println(m.everyNth("Chocolates",100));
    }
    public String everyNth(String str,int n){
        String result=" ";
        for (int i=0;i<str.length();i=i+n){
            result=result+str.charAt(i);
        }
        return result;
    }
}
