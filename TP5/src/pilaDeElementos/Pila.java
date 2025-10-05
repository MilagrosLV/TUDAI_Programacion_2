package pilaDeElementos;

import java.util.ArrayList;

//Estructura de datos LIFO (Last In, First Out)
/*Se utiliza la clase java.util.Stack para crear y 
manipular pilas, empleando métodos como push() para 
añadir elementos, pop() para extraerlos y peek() 
para ver el elemento superior sin removerlo*/

public class Pila {
    //ATRIBUTOS
    private final ArrayList<Object> elementos;

    //CONSTRUCTOR
    public Pila(){
        this.elementos = new ArrayList<>();
    }

    //OTHER METHODS
    //add element to the top of the stack
    public void push(Object e){
        this.elementos.addLast(e);
    }

    //return the top element without removing it
    public Object top(){
        Object copyElement = this.elementos.getLast();
        return copyElement;
    }

    //remove the top element of the stack
    public void pop(){
        this.elementos.removeLast();
    }

    //return the number of elements in the stack
    public int size(){
        return this.elementos.size();
    }

    //make copy of the stack
    public ArrayList<Object> copy(){
        return new ArrayList<>(this.elementos);
    }

    //make reversed copy of the stack
    public ArrayList<Object> reverse() {
        return new ArrayList<>(this.elementos.reversed());
    }


}
