public class HelloWorld {
    public static void main(String args[]) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.add(5,6));
    }
    
    public int add(int a, int b) {
        return a + b;
    }
}
