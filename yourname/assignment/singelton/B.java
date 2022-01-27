package yourname.assignment.singelton;

public class B {
    public String str;
   public B(String otherStr){
        str=otherStr;
    }
    public  static B _method(String s){
         str=s;
        B sc=new B(s);
        return sc;

    }
    public void print(){
        System.out.println(str);
    }
    public static void main(String[] args){
        String str="ABCD";
        B obj=new B(str);
       obj.method(str);
        obj.print();
    }
}
