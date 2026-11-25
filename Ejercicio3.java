public class Ejercicio3 {
    static void m(int a, int[] v) { a++; v[1] += a; }

    
    public static void main (String[] args) {
        main: int a=5;
         int[] v = {1, 2, 3}; m(a, v); 
         System.out.println(a + " " + v[1]);

    }
    
}
