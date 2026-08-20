public class Main
{
    public static void main(String[] args)
    {
        int a = 6666;
        int l,p;
        boolean f=true;
        while((a/10)!=0){
            l=a%10;
            p=(a/10)%10;
            if(p<=l){
                f=false;
                break;
            }
            a=a/10;
        }
        if(f){
            System.out.println("descending");

        }
        else{
            System.out.println("not descending");
        }


    }
}
