package au.edu;

public class endUp {
    public static void main(String[] args) {
        endUp m=new endUp();
        System.out.println(m.endUp("Hello"));
        System.out.println(m.endUp("hi there"));
        System.out.println(m.endUp("hi"));
        System.out.println(m.endUp("woo hoo"));
        System.out.println(m.endUp("xyz12"));
        System.out.println(m.endUp("x"));
        System.out.println(m.endUp(""));

    }
    public String endUp(String str){
        if(str.length()<=3){
            return str.toUpperCase();
        }
        int cut=str.length()-3;
        String front=str.substring(0,cut);
        String back=str.substring(cut);
        return front+back.toUpperCase();
    }
}
