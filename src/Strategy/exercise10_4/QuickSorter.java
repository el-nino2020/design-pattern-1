package Strategy.exercise10_4;

public class QuickSorter implements Sorter {
    @Override
    public void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(Comparable[] arr, int left, int right) {
        if (left >= right) return;

        Comparable pivot = arr[right];
        Comparable temp;
        int i = left;

        //循环的目的: 不断地将比pivot小的元素交换到数组的前面
        //j == i时, 如果arr[i] < pivot, 那么pivot应该放在索引为 i + 1 处
        for (int j = right - 1; j >= i; --j) {
            if (arr[j].compareTo(pivot) < 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                ++i;//i的改变是被动的，受当前if语句的影响才会改变

                ++j;//由于不知道交换到arr[j]的元素是否比pivot小，所以需要再次比较
            }
        }

        arr[right] = arr[i];
        arr[i] = pivot;

        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }
}
