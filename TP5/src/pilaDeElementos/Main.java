
package pilaDeElementos;

public class Main {
    public static void main(String[] args) {
        //ITERATION TEST
        Pila pila = new Pila();

        pila.push(5); pila.push(10); pila.push(15);
        System.out.println("Top element: " + pila.top()); // Should print 15
        System.out.println("Stack size: " + pila.size()); // Should print 3

        pila.pop();
        System.out.println("Top element after pop: " + pila.top()); // Should print 10
        System.out.println("Stack size after pop: " + pila.size()); // Should print 2
        System.out.println("Stack copy: " + pila.copy()); // Should print [5, 10]
        System.out.println("Reversed stack copy: " + pila.reverse()); // Should print [10, 5]
    }
}
