package au.edu;

public class missingChar {
    public static void main(String[] args) {
        missingChar m=new missingChar();
        System.out.println(m.missingChar("kitten",0));
        System.out.println(m.missingChar("kitten",1));
        System.out.println(m.missingChar("kitten",2));
        System.out.println(m.missingChar("kitten",3));
        System.out.println(m.missingChar("kitten",4));
        System.out.println(m.missingChar("kitten",5));
    }
    public String missingChar(String str, int n){
        String front=str.substring(0,n);
        String back=str.substring(n+1,str.length());
        return front+back;
    }
}
