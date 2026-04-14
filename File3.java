import java.io.*;

class File3{
  public static void main(String args[]){
   try{ 
    FileReader fr = new FileReader("file1.txt");
    FileWriter fis = new FileWriter("file2.txt");
       
       int ch;
       while((ch=fr.read()) !=-1){
              
            fis.write(ch);
}
         System.out.println("Data successfully copied on file!");
        fis.close();
        fr.close();
        System.out.println("File Closed ! ");
    }
catch(IOException i){
System.out.println("Message: "+i);
}
    }
}