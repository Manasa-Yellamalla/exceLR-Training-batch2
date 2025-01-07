import java.util.Scanner;
class demo6{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Username:");
        String username=scanner.next();
        System.out.println("Password:");
        String password=scanner.next();
        while(username.equals("manasa")&& password.equals("manasa23")){
        System.out.println("Hello manu");
        break;
        }
        if((username != "mounika")&&(password != "mounika@123")){
            System.out.println("invalid");
        }
    }
}
