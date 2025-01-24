import java.util.Scanner;
class test02{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=scanner.nextInt();
    for(int i=1;i<=n;i++){
        if(i==98){
            continue;
        }
            System.out.println(i);
        }
    }
}