package au.edu;

public class stringE {
    public static void main(String[] args) {
        stringE m=new stringE();
        System.out.println(m.stringE("Hello"));
        System.out.println(m.stringE("Heelle"));
        System.out.println(m.stringE("Heelele"));
        System.out.println(m.stringE("Hiii"));
        System.out.println(m.stringE("e"));
        System.out.println(m.stringE(""));
        System.out.println(m.stringE("Heeeeeeeeeeello"));

    }
    public boolean stringE(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='e'){
                count++;
            }
        }
        return (count>=1 && count<=3);
    }
}
