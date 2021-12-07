package day1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadUser {
    
    public void userlogin(String name, String directory) throws IOException{
        //login Fred
        //check from map if Fred is inside
        // if no, create Fred.txt and insert Fred and directory

        Map<String , String > userList = new HashMap<>();
        if (userList.containsKey(name)){
            File file = new File("G:\\My Drive\\NUSISS\\Day 1\\GitFolder1\\day1\\shopping\\src"+"\\"+userList.get(name));
            //open file
        } else {
            userList.put(name, directory);
            // create file + directory
            File file = new File("G:\\My Drive\\NUSISS\\Day 1\\GitFolder1\\day1\\shopping\\src"+"\\"+directory);
            Boolean success = file.mkdir(); 
            if (success) { 
                System.out.printf("Successfully created new directory : %s%n", directory); 
            } else { 
                System.out.printf("Failed to create new directory: %s%n", directory); 
            }

            File file1 = new File("G:\\My Drive\\NUSISS\\Day 1\\GitFolder1\\day1\\shopping\\src"+"\\"+directory+"\\"+name+".txt");
            Boolean successFile = file1.createNewFile(); 
            if (successFile) { 
                System.out.printf("Successfully created new user : %s%n", name); 
            } else { 
                System.out.printf("Failed to create new user: %s%n", name); 
            }


            
        }
        

    }
}
