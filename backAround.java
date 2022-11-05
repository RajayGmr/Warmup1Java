package au.edu;

public class backAround {
    public static void main(String[] args) {
        backAround m=new backAround();
        System.out.println(m.backAround("cat"));
        System.out.println(m.backAround("Hello"));
        System.out.println(m.backAround("a"));
        System.out.println(m.backAround("abc"));
        System.out.println(m.backAround("ab"));
        System.out.println(m.backAround("read"));

    }
    public String backAround(String str){
        String back=str.substring(str.length()-1);
        return back+str+back;
    }
}
