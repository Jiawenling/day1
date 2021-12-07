package day1;

import java.util.ArrayList;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println("Welcome to your shopping cart");
        boolean flag = false;
        List<String> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(!flag){
            String com = scan.next();
            String input = com.toLowerCase();
            String requests = scan.nextLine().trim();
            

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