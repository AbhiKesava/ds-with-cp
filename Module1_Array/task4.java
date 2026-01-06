class Demo {

    public String add(int a, int b) {
        if ((a + b) % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj = new Demo();   // object creation
        String a = obj.add(10, 21);  // method call

        System.out.println(a);  // output
    }
}

