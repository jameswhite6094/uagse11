import java.util.Scanner;

public class ass1{
    public static void main(String[] args){
        String s = "";
        String r = "";
        while (!(s.equals("exit"))){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        s = in.nextLine();
            if (!(s.equals("exit"))){
                r = r + " " + s;
            }
            
        }
        System.out.println(r);
    }
}