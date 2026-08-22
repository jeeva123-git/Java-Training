
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int[][] a = {{2,4,5},{3,7,6},{4,9,8},{7,6,5}};
        int r = a.length;
        int c = a[0].length;
        int x=0;
        int[] b = new int[r*c];
        for(int i =0;i<r;i++)
        {
            
            for (int j = 0;j<c;j++)
            {
                b[x]=a[i][j];
                x++;
            }
        }
        System.out.print(Arrays.toString(b));
        int lt=0;
        int rt=11;
        while(lt<rt){
            System.out.println(b[lt]+b[rt]);
            lt++;
            rt--;
        }
    }
    
}
