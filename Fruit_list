import java.util.Scanner;

class Fruit_list{
    public static void main(String[] args){
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many fruits do you want to enter? ");
        
        int amt_fruits = scanner.nextInt();
        
        scanner.nextLine();

        
        String[] fruits = new String[amt_fruits];
        
        for(int i = 0; i < amt_fruits; i++){
            
            System.out.print("Enter fruit: ");
            
            String fruit = scanner.nextLine();
            
            fruits[i] = fruit;
            
        }
        
        System.out.println("\n ============ FRUIT LIST ============\n");
        for(int i = 0; i < fruits.length; i++){
            
            
            System.out.println(i+ 1 + ". " + fruits[i]);
        }
    }
}
