package au.edu;

public class icyHot {
    public static void main(String[] args) {
        icyHot m=new icyHot();
        System.out.println(m.icyHot(120,-1));
        System.out.println(m.icyHot(-1,120));
        System.out.println(m.icyHot(2,120));
        System.out.println(m.icyHot(-1,100));
        System.out.println(m.icyHot(-2,-2));
        System.out.println(m.icyHot(120,120));

    }
    public boolean icyHot(int tem1,int tem2){
        if((tem1<0 && tem2 >100)||(tem1>100 && tem2<0)){
            return true;
        }else {
            return false;
        }
    }
}
