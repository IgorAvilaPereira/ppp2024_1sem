package apresentacao;

import negocio.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        printMenu(new PancakeHouseMenuIterator(pancakeHouseMenu));
        printMenu(new DinerMenuIteratorReverse(dinerMenu));      
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