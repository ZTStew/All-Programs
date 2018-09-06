public class VectorTest{
    public static void main(String[] args){
        // Vector1 test1 = new Vector1();
        // int value1 = test1.Vector(10);
        // System.out.println("X: " + value1);

        // Vector2 test2 = new Vector2();
        // int value2 = test2.Vector(5);
        // System.out.println("Y: " + value2);

        // Vector3 test3 = new Vector3();
        // int value3 = test3.Vector(7);
        // System.out.println("Z: " + value3);

        Vector2 a = new Vector2(10, 10);
        Vector2 b = new Vector2(20, 20);
        a.add(b);
        System.out.println(a.x);
        System.out.println(a.y);

        // System.out.println(test1.x);
    }
}