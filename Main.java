import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter player name: ");
        String Name=sc.nextLine();
        System.out.print("Enter player age: ");
        int Age=sc.nextInt();

        Player p1= new Player(Name, Age);
        p1.displayStatus();
        
    }
    
}
