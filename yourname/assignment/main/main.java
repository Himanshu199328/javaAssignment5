package yourname.assignment.main;
import yourname.assignment.data.A;
import yourname.assignment.singelton.B;

public class main {
    public static void main(String[] args){
        A obj=new A();
        obj.disp();
       // obj.show();
        B obj1=new B("str");
        obj1.print();
        //obj1._method();

    }
}
