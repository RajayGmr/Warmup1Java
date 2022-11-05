package au.edu;

public class notString {
    public static void main(String[] args) {
        notString m=new notString();
        System.out.println(m.notString("candy"));
        System.out.println(m.notString("x"));
        System.out.println(m.notString("not bad"));
        System.out.println(m.notString("bad"));
        System.out.println(m.notString("not"));
        System.out.println(m.notString("is not"));
        System.out.println(m.notString("no"));

    }
    public String notString(String str){
        if(str.length()>=3 && str.substring(0,3).equals("not")){
            return str;
        }else {
            return "not "+str;
        }
    }
}
