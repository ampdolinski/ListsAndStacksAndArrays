package _2zadankoNaStos;

import java.util.Stack;

public class Tuba<T> {

    private Stack<T> stosik = new Stack<T>();

    public void dodajElement(T element){
//        stosik.addElement(element); - to samo, co niżej
        stosik.push(element);
        System.out.println("Włożyłem element: " + element.toString());
    }

    public T wyciagnijElement(){
        System.out.println("Wyciągnąłem element: " + stosik.peek().toString());
       return stosik.pop();

    }

    public Stack<T> getStosik() {
        return stosik;
    }

    public void setStosik(Stack<T> stosik) {
        this.stosik = stosik;
    }
}
