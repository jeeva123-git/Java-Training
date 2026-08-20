import java.util.Scanner;

class Rect {
    int a, c;

    Rect(int l, int b) {
        a = l;
        c = b;
    }

    public void display() {
        System.out.println("Area is: " + (a * c));
    }
}

public class Main3 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        int n = a.nextInt();

        Rect[] r = new Rect[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter the length of rectangle " + (i + 1));
            int l = a.nextInt();

            System.out.println("Enter the breadth of rectangle " + (i + 1));
            int b = a.nextInt();

            r[i] = new Rect(l, b);
        }

        System.out.println("Let's see all Area of all Rectangles:");

        for (int i = 0; i < n; i++) {
            System.out.println("Area of Rectangle " + (i + 1));
            r[i].display();
        }

        a.close();
    }
}
