package au.edu;

public class front3 {
    public static void main(String[] args) {
        front3 m=new front3();
        System.out.println(m.front3("java"));
        System.out.println(m.front3("Chocolate"));
        System.out.println(m.front3("abc"));
        System.out.println(m.front3("abcxyz"));
        System.out.println(m.front3("ab"));
        System.out.println(m.front3("a"));
        System.out.println(m.front3("-"));

    }
    public String front3(String str){
        String front;
        if(str.length()>=3){
            front=str.substring(0,3);
        }else {
            front=str;
        }
        return front+front+front;
    }
}
