import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Task0. 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
 * Распечатайте содержимое данного множества.

2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
Распечатайте содержимое данного множества.

3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
Распечатайте содержимое данного множества.
 */
public class Task0 {

  public static void main(String[] args) {
    task0();
  }

  static void task0 () {

    Integer [] arr = new Integer[] {1, 2, 3,11, 12, 6, 2, 4, 5, 6, 3};
    Set <Integer> set1 = new HashSet<>(Arrays.asList(arr));
    Set <Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
    Set <Integer> set3 = new TreeSet<>(Arrays.asList(arr));

    System.out.println(set1);
    System.out.println(set2);
    System.out.println(set3);


  }
}