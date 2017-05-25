package sorting;

import java.util.*;

/**
 * Created by admin on 24.05.2017.
 */
public class Sorter {
    public static int[] bubbleSortIncrease(int[] array) {
        System.out.println("Current array is" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted arrays is" + Arrays.toString(array));
        return array;
    }

    public static int[] bubbleSortDecrease(int[] array) {
        System.out.println("Current array is" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted arrays is" + Arrays.toString(array));
        return array;
    }

    public static String[] stringSortedByAlpabet(String[] array) {

        List<String> lst = new ArrayList<String>();
        // initialise UNSORTED array
        Collections.addAll(lst, array);
//        System.out.println("Initial List");
//        for (String s : lst)
//            System.out.println(s);
        Collections.sort(lst);
//        System.out.println("\nSorted List");
//        for (String s : lst)
//            System.out.println(s);
        Collections.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
//        System.out.println("\nSorted Ignoring Case List");
//        for (String s : lst)
//            System.out.println(s);

        String[] newarray = new String[lst.size()];
        lst.toArray(newarray); // fill the array
        System.out.println(Arrays.toString(newarray));

        return newarray;

    }

    public static String[] stringSortedByAlphabetReverse(String[] array) {
        String[] newArray = stringSortedByAlpabet(array);
        List<String> list=new ArrayList<String>();

        for (int i = newArray.length - 1; i >= 0; i--) {
            list.add(newArray[i]);
            //System.out.println(newArray[i]);
        }
        list.toArray(array);
        System.out.println(Arrays.toString(array));
        return array;
    }

    public int[] shellSortIncrease(int[] array) {
        return null;
    }

    public int[] shellSortDecrease(int[] array) {
        return null;
    }

    public int[] pyramidSortIncrease(int[] array) {
        return null;
    }

    public int[] pyramidSortDecrease(int[] array) {
        return null;
    }

    public int[] digitSortIncrease(int[] array) {
        return null;
    }

    public int[] digitSortDecrease(int[] array) {
        return null;
    }

    public int[] gnomeSortIncrease(int[] array) {
        return null;
    }

    public int[] gnomeSortDecrease(int[] array) {
        return null;
    }

    public int[] chooseSortIncrease(int[] array) {
        return null;
    }

    public int[] chooseSortDecrease(int[] array) {
        return null;
    }

    public int[] mergeSortIncrease(int[] array) {
        return null;
    }

    public int[] mergeSortDecrease(int[] array) {
        return null;
    }

    public int[] insertSortIncrease(int[] array) {
        return null;
    }

    public int[] insertSortDecrease(int[] array) {
        return null;
    }

    public int[] mixSortIncrease(int[] array) {
        return null;
    }

    public int[] mixSortDecrease(int[] array) {
        return null;
    }

    public int[] blockSortIncrease(int[] array) {
        return null;
    }

    public int[] blockSortDecrease(int[] array) {
        return null;
    }

    public int[] countSortIncrease(int[] array) {
        return null;
    }

    public int[] countSortDecrease(int[] array) {
        return null;
    }

    public int[] combSortIncrease(int[] array) {
        return null;
    }

    public int[] combSortDecrease(int[] array) {
        return null;
    }


    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 7, 3, 2, 9, 4, 8, 3};
        String[] array = {"test", "Victor", "Alexa", "aa", "azimut", "zex"};
        Sorter.stringSortedByAlphabetReverse(array);
    }


}
