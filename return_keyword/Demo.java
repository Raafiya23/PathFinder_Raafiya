public class Demo{
    String getname(){
        return "Raafiya";
    }

    int getphone(){
        return 1234567890;
    }

    public static void main(String[] args){
        Demo obj = new Demo();
        String myname = obj.getname();
        System.out.println(myname);
        int mynum = obj.getphone();
        System.out.println(mynum);
    } 
}
