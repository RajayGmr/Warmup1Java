package au.edu;

public class sleepIn {
    public static void main(String[] args) {
        sleepIn m=new sleepIn();
        System.out.println(m.SleepIn(false,false));
        System.out.println(m.SleepIn(true,false));
        System.out.println(m.SleepIn(false,true));
        System.out.println(m.SleepIn(true,true));
    }
    public boolean SleepIn(boolean weekday,boolean vactaion){
        if (!weekday||vactaion){
            return true;
        }else {
            return false;
        }
    }
}
