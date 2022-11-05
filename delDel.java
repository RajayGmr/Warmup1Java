package au.edu;

public class delDel {
    public static void main(String[] args) {
        delDel m=new delDel();
        System.out.println(m.delDel("adelbc"));
        System.out.println(m.delDel("adelHello"));
        System.out.println(m.delDel("adedbc"));
        System.out.println(m.delDel("abcdel"));
        System.out.println(m.delDel("add"));
        System.out.println(m.delDel("ad"));
        System.out.println(m.delDel("a"));
        System.out.println(m.delDel("del"));
        System.out.println(m.delDel("adel"));
        System.out.println(m.delDel("aadelbb"));

    }
    public String delDel(String str){
        if(str.length()>=4 && str.substring(1,4).equals("del")){
            return str.substring(0,1)+str.substring(4);
        }
        return str;
    }
}
