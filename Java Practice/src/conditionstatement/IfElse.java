package conditionstatement;

public class IfElse {
    public static void main(String[]args){
        int age =18;

        if (age>=20) {
         //   System.out.println("Eligible for drive");
            System.out.println("I m in true body");
        }else{
            System.out.println(" I m in false body");
        }
        int a=10;
        int b=20;
        if(a==b){
            System.out.println("a is smaller number");
        }
        System.out.println("I am outside if body");
    }
}
