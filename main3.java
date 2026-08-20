import java.util.Scanner;

class student {
    int a, b, c;
    String name;

    student(int m1, int m2, int m3, String n) {
        a = m1;
        b = m2;
        c = m3;
        name = n;
    }

    public void display() {
        double percentage = (a + b + c) / 3.0;

        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {

        int m1, m2, m3;
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        student[] s = new student[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Enter name: ");
            name = sc.next();

            System.out.print("Enter mark 1: ");
            m1 = sc.nextInt();

            System.out.print("Enter mark 2: ");
            m2 = sc.nextInt();

            System.out.print("Enter mark 3: ");
            m3 = sc.nextInt();

            s[i] = new student(m1, m2, m3, name);
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        sc.close();
    }
}
