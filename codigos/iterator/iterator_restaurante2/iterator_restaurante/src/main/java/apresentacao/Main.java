package apresentacao;

import negocio.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        printMenu(new PancakeHouseMenuIterator());
        // printMenu(new DinerMenuIteratorReverse()); 
        System.out.println("===");

        printMenu(new DinerMenuIterator());      
        System.out.println("===");

        CafeMenuIterator cafeMenuIterator = new CafeMenuIterator();
        cafeMenuIterator.add(new MenuItem("cafe 2", "feito de cafe 2", 1, false));
        printMenu(cafeMenuIterator);

        System.out.println("===");
        
    }
    // private static void printMenu(Iterator<MenuItem> iterator) {
    //     while(iterator.hasNext()){
    //         System.out.println(iterator.next());
    //     }
    // }
    private static void printMenu(IteratorDoIgor<MenuItem> iterator) {
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
}