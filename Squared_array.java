import java.util.Scanner;


class Squared_array{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers would you like to enter? ");
        
        int amt_nums = scanner.nextInt();
        
        scanner.nextLine();
        
        int[] numbers = new int[amt_nums];
        
        for(int i = 0; i < amt_nums; i++){
            System.out.print("Enter a number: ");
            int x = scanner.nextInt();
            
            numbers[i] = x;
        }
        
        for(int i = 0; i < amt_nums; i++){
            System.out.println(numbers[i] * numbers[i]);
        }
    }
}
