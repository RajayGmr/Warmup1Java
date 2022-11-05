package au.edu;

public class mixStart {
    public static void main(String[] args) {
        mixStart m=new mixStart();
        System.out.println(m.mixStart("mix snacks"));
        System.out.println(m.mixStart("pix snacks"));
        System.out.println(m.mixStart("nix snacks"));
        System.out.println(m.mixStart("xix snacks"));
        System.out.println(m.mixStart("mi snacks"));
        System.out.println(m.mixStart("ni "));
        System.out.println(m.mixStart("n"));
        System.out.println(m.mixStart(""));

    }
    public boolean mixStart(String str){
        if(str.length()<3){
            return false;
        }else {
            if(str.substring(1,3).equals("ix")){
                return true;
            }else {
                return false;
            }
        }
    }
}
