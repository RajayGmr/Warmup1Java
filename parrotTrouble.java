package au.edu;

public class parrotTrouble {
    public static void main(String[] args) {
       parrotTrouble m=new parrotTrouble();
        System.out.println(m.parrotTrouble(true,6));
        System.out.println(m.parrotTrouble(true,7));
        System.out.println(m.parrotTrouble(false,6));
        System.out.println(m.parrotTrouble(true,21));
        System.out.println(m.parrotTrouble(false,21));
        System.out.println(m.parrotTrouble(false,20));
        System.out.println(m.parrotTrouble(true,23));
        System.out.println(m.parrotTrouble(false,23));
        System.out.println(m.parrotTrouble(true,20));
        System.out.println(m.parrotTrouble(false,12));

    }
    public boolean parrotTrouble(boolean talking,int hour){
        return(talking&&(hour<7 || hour>20));
    }
}
