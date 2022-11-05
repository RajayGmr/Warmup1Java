package au.edu;

public class startOz {
    public static void main(String[] args) {
        startOz m=new startOz();
        System.out.println(m.startOz("ozymandis"));
        System.out.println(m.startOz("bzoo"));
        System.out.println(m.startOz("oxx"));
        System.out.println(m.startOz("oz"));
        System.out.println(m.startOz("ounce"));
        System.out.println(m.startOz("o"));
        System.out.println(m.startOz("abc"));
        System.out.println(m.startOz(""));
        System.out.println(m.startOz("zoo"));
        System.out.println(m.startOz("aztec"));
        System.out.println(m.startOz("zzzz"));
        System.out.println(m.startOz("oznic"));
        System.out.println(m.startOz("zoymandis"));

    }
    public String startOz(String str){
        String result=" ";
        if(str.length()>=1 && str.charAt(0)=='o'){
            result=result+str.charAt(0);
        }
        if (str.length()>=2 && str.charAt(1)=='z'){
            result=result+str.charAt(1);
        }
        return result;
    }
}
