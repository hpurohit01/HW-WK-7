package constructor;

public class ConstructorExample1 {
    // This is a constructor
    public ConstructorExample1(){
        System.out.println("I m a Constructor");

    }
    //This is one args construtor
    public ConstructorExample1(int a){
        System.out.println("Im one args constructor");

    }
    public  ConstructorExample1(String name){

    }
    public ConstructorExample1(int a,int b){
        System.out.println("I m two args constructor");

    }






    public void myMethod(){
        System.out.println("I m a method");
    }


    public static void main(String[]args){
        ConstructorExample1 obj =new ConstructorExample1();// I m a constructor
        ConstructorExample1 obj1= new ConstructorExample1(10);
        ConstructorExample1 obj2=new ConstructorExample1(10,20);

            }
        };




