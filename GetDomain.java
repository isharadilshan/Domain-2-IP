
package middleware;
  
import java.net.*; 
import java.util.Scanner;

public class GetDomain{ 
    
    public static void main(String[] args){  
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter Domain correctly\nExample :- www.facebook.com\n");
        String domain = scan.nextLine();
        try{  
            InetAddress ip=InetAddress.getByName(domain);  
            System.out.println("Host Name: "+ip.getHostName());  
            System.out.println("IP Address: "+ip.getHostAddress());  
        }catch(UnknownHostException e){
            System.out.println(e);
        }  
    }  
}  
