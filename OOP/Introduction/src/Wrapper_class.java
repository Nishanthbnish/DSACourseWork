public class Wrapper_class
{
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");

        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }

    }
    //swap the Integer
    //it is not going to performe because of java pass by value reference
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }
    //garbage Collection Example
    //to take the object which is created if it is not using anymore.
    //using finalize keyword
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
