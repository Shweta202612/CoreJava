import java.io.*;

class File2{
  public static void main(String args[]){
   try{ 
    FileWriter fis = new FileWriter("file1.txt");
       String s;
       Console c =System.console();
        s =c.readLine("Enter data to write on the file:");
       
            fis.write(s);
         System.out.println("Data successfully written on file!");
        fis.close();
        System.out.println("File Closed ! ");
    }
catch(IOException i){
System.out.println("Message: "+i);
}
    }
}