//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       printMessage("hello World");

       printHeader();
       System.out.println("New thing");

       printHeader();

       System.out.print("making an additional change");
    }


    public static void printMessage(String message){
        System.out.println(message);
    }

    private static void printHeader() {
        System.out.println("*******************************");
    }
}