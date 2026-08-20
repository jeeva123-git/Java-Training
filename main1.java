class common{
    static String pm = "modi";
}

class TN{
    static String state = "Tmilnadu";
    String CM = "vijay";
    String dist;
    int population;
    public void set_dim(String a,int b)
    {
     dist = a;
     population = b;
    }
    public void display()
    {
        System.out.println("Name of the pm: " + common.pm);
        System.out.println("Name of the state: "+ state);
        System.out.println("Name of the CM: "+ CM);
        System.out.println("Name of the district: "+ dist);
        System.out.println("Population of the district: "+ population);

    }
     
}


class AP{
    static String state= "Andra";
    String CM = "Nidu";
    String dist;
    int population;
    public void set_dim(String a1,int b1)
    {
     dist = a1;
     population = b1;
    }
    public void display()
    {
        System.out.println("Name of the pm: " + common.pm);
        System.out.println("Name of the state: "+ state);
        System.out.println("Name of the CM: "+ CM);
        System.out.println("Name of the district: "+ dist);
        System.out.println("Population of the district: "+ population);

    }
     
}

public class Main2 {
    public static void main(String[] args){
     TN a = new TN();
     TN b= new TN();

     AP a1 = new AP();
     AP b1 = new AP();
     AP c = new AP();

     a.set_dim("chennai",50000);
     b.set_dim("coimbatore",40000);
     a.display();
     b.display();
     System.out.println("_____________________________________________");

     a1.set_dim("westgadabari",50450);
     b1.set_dim("eastgodabari",47800);

     a1.display();
     b1.display();


     

    }
}
