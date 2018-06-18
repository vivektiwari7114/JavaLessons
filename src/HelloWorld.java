public class HelloWorld {
    public static void main(String args[]) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.add(5,6));
        System.out.println(hw.multiply(5,6));
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {return a*b; }
    public double divide(int divident, int divisor) {
        if ( divisor == 0) {
            return 0.0d;
        }
        return divident / divisor;
    }
}
