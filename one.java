import java.io.*;
import java.io.IOException;

public class one{

  public static void main(String args[]) throws IOException{
    
    System.out.println("hi five");
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name");    
    String name=br.readLine();    
    System.out.println("Welcome "+name);    
    
  }

}
