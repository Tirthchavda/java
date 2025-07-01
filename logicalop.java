public class logicalop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

      // boolean result = a > b && a < b;
        boolean result = a > b || c < d;
        System.out.println(result);
    }
}

