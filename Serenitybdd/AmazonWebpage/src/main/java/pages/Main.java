package pages;

public class Main {

    public static String method(String input){
       String s = input+"Test";
        return s;
    }
    public static void main(String[] args){
        System.out.println("my name is "+ Main.method("Some"));
    }
}
