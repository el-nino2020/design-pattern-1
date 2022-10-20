package Strategy.exercise10_4;

public class SelectionSorter implements Sorter {
    @Override
    public void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;//一开始假定第i个元素为最小的
            Comparable val = arr[i];

            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(val) < 0) {
                    val = arr[j];
                    index = j;
                }
            }
            //将第i小的元素交换到索引为i处
            arr[index] = arr[i];
            arr[i] = val;
        }
    }
}
