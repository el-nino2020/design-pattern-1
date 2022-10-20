package Strategy.exercise10_4;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        sortAndShow(new QuickSorter());
        System.out.println("===========================================================");
        sortAndShow(new SelectionSorter());
    }

    public static void sortAndShow(Sorter sorter) {
        String[] arr = {"Theta", "Beta", "Alpha", "Gamma", "Eta", "Sigma", "Epsilon", "Delta"};
        System.out.println(Arrays.toString(arr));
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
