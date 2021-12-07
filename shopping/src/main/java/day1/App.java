package day1;

import java.util.ArrayList;
import java.io.File;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){

         //creating directory
         String directory = args[0];
         if(directory.isEmpty()){
             directory = "db";   
         } 
         File f1 = new File(directory);
         boolean bool = f1.mkdir();
         if(bool){  
             System.out.printf("Directory is created successfully");  
         }else{  
         System.out.println("Error Found!");   
         }
        
         
        System.out.println("Welcome to your shopping cart");
        boolean flag = false;
        List<String> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(!flag){
            String com = scan.next();
            String input = com.toLowerCase();
            String requests = scan.nextLine().trim();   

             //creating user db
             if(input.equals("login")){
                
                File file = new File("%s/%s", directory, requests);

                if (file.createNewFile()) {
                    System.out.println("File has been created.");
                } else {
                    System.out.println("File already exists.");
                }
            }
            

        
            

            if(input.equals("list")){
                if(cart.size()==0){
                    System.out.println("Your cart is empty");
                } else{
                    for (int i = 0; i<cart.size(); i++){
                        System.out.println((i+1)+". " + cart.get(i));
                    }
                }
            }

            if(input.startsWith("add")){
                
                String[] items = requests.split(", ");
                for(int i = 0; i < items.length; i++){
                    if(cart.contains(items[i])){
                        System.out.println("You have" + items[i] + " in your cart");
                    }else{
                        cart.add(items[i]);
                        System.out.println(items[i] + " added to cart");
                    }
                    
                }
            }    

            if(input.startsWith("delete")){
                
                int indexInCart = Integer.parseInt(requests);
                int actualIndex = indexInCart -1;
                if(actualIndex>= cart.size()|| actualIndex<0){
                    System.out.println("Incorrect item index");
                } else if(cart.isEmpty()){
                    System.out.println("Cart is empty");
                } else{
                    System.out.println(cart.get(actualIndex) + " removed from cart");
                    cart.remove(actualIndex);
                    
                }
            }
                    
            if(input.startsWith("exit")){
                System.out.println("Exiting shopping cart.");
                break;
            }
            
        }
            scan.close();
            
    }

        
}