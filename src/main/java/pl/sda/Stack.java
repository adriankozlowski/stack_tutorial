package pl.sda;

public class Stack {

    private Integer[] stack = new Integer[10];
    private int currentIndex = -1;

    public Integer pop(){
        //odczytujemy wartość
        Integer peek = peek();
        //usuwamy odczytane miejsce
        stack[currentIndex--] = null;
        //zwracamy wartość
        return peek;
    }

    public Integer peek(){
        //zwracamy wartość
        if(currentIndex < 0){
            throw new RuntimeException("Stack is empty");
        }
        return stack[currentIndex];
    }

    public void push(Integer value){
        //sprawdzamy czy możemy inkrementować index
        if(++currentIndex > 9){
            currentIndex--;
//            jeżeli chcemy dodać coś do stosu, ale nie ma miejsca - wyjątek.
            throw new RuntimeException("Out of stack room!");
        }
        //dodajemy do stosu
        stack[currentIndex] = value;
    }
}
