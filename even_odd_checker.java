import java.util.Scanner;

class even_odd_checker {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        scanner.nextLine();
        
        if (num > 0 && num % 2 == 0){
            System.out.print("Even!");
        } else if ( num < 0){
            System.out.print("Negative!");
        } else {
            System.out.print("Odd!");
        }
        
        scanner.close();
        
    }
}
