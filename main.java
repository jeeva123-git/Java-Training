import java.util.*;

public class Main {
    public static void main (String[] args){
        int a = 206456;
        int d ,e=0,o=0;
        while(a != 0 )
            {
            d = a % 10;
            if(d%2==0){
            e++;
                      
         }
         else 
            o++;
         a = a / 10;
        }
        System.out.println("ODD:" +0);
        System.out.println("EVEN:" +e);
       
    }
}
