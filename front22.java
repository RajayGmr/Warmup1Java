package au.edu;

public class front22 {
    public static void main(String[] args) {
        front22 m=new front22();
        System.out.println(m.front22("Kitten"));
        System.out.println(m.front22("Ha"));
        System.out.println(m.front22("He"));
        System.out.println(m.front22("ab"));
        System.out.println(m.front22("a"));
        System.out.println(m.front22("Logic"));
        System.out.println(m.front22("-"));
        
    }
    public String front22(String str){
        String front2;
        if(str.length()>2){
            front2=str.substring(0,2);
        }else{
            front2=str;
        }
        return  front2+str+front2;
    }
}
