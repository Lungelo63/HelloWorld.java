import java.util.Scanner;

class helloWorld{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message to be printed");
        String user = input.nextLine();

       System.out.println(user);
    }


}