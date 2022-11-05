package au.edu;

public class frontBack {
    public static void main(String[] args) {
        frontBack m=new frontBack();
        System.out.println(m.frontBack("code"));
       // System.out.println(m.frontBack("a"));
        System.out.println(m.frontBack("ab"));
        System.out.println(m.frontBack("abc"));
        System.out.println(m.frontBack(""));
        System.out.println(m.frontBack("Chocolate"));
        System.out.println(m.frontBack("aav"));
        System.out.println(m.frontBack("hello"));

    }
    public String frontBack(String str){
        if(str.length()<=1){
            return str;
        }
        String mid=str.substring(1,str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }
}
