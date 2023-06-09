package homework;

public class Program_25 {//Java program to overload constructors

        int id;
        String name;
        int age;

        //creating two arg constructor
        Program_25(int i, String n) {
            id = i;
            name = n;
        }

        //creating three arg constructor
        Program_25(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        public void display() {
            System.out.println(id + " " + name + " " + age);
        }

        public static void main(String args[]) {
            Program_25 s1 = new Program_25(111, "Karan");
            Program_25 s2 = new Program_25(222, "Aryan", 25);
            s1.display();
            s2.display();
        }
    }


