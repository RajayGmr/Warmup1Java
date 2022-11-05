package au.edu;

public class monkeyTrouble {
    public static void main(String[] args) {
        monkeyTrouble m=new monkeyTrouble();
        System.out.println(m.monkeyTrouble(true,true));
        System.out.println(m.monkeyTrouble(false,false));
        System.out.println(m.monkeyTrouble(true,false));
        System.out.println(m.monkeyTrouble(false,true));
    }
    public boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        if(aSmile && bSmile){
            return true;
        }
        if(!aSmile && !bSmile){
            return true;
        }
        return false;
    }
}
