import java.io.*;

class File1{
public static void main(String args[]){
File f=new File("file1.txt");
try{

   if(f.createNewFile()){
             System.out.println("File created successfully !");      
        }
   else{
         System.out.println("File Already Exist!");
       }
}
catch(Exception e){
System.out.println("Message : "+ e.getMessage());
}
}
System.out.println("Exit from main");
}