package au.edu;

public class nearHundred {
    public static void main(String[] args) {
        nearHundred m=new nearHundred();
        System.out.println(m.nearHundred(93));
        System.out.println(m.nearHundred(90));
        System.out.println(m.nearHundred(89));
        System.out.println(m.nearHundred(110));
        System.out.println(m.nearHundred(111));
        System.out.println(m.nearHundred(121));
        System.out.println(m.nearHundred(-101));
        System.out.println(m.nearHundred(-209));
        System.out.println(m.nearHundred(190));
        System.out.println(m.nearHundred(209));
        System.out.println(m.nearHundred(0));
        System.out.println(m.nearHundred(5));
        System.out.println(m.nearHundred(-50));
        System.out.println(m.nearHundred(191));
        System.out.println(m.nearHundred(189));
        System.out.println(m.nearHundred(200));
        System.out.println(m.nearHundred(210));
        System.out.println(m.nearHundred(211));
        System.out.println(m.nearHundred(290));
    }
    public boolean nearHundred(int n){
        return (((Math.abs(100-n))<=10) || (Math.abs(200-n)<=10));
    }
}
