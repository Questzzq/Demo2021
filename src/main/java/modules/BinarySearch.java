package modules;

/**
 * @author EricTseng
 * @date 2021/9/25 19:01
 */
public class BinarySearch {
    public static void main(String[] args) {
        int len = 12;
        Integer[] nums = new Integer[len];
        for(int i = 0; i < len; i++) {
            nums[i] = (int) (Math.random()*100);
            System.out.print(nums[i]);
            System.out.print("  ");
        }
        System.out.println("\n");
//        nums = arraySort(nums);
//        nums = selectSort(nums);
        nums = insertSort(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print("  ");
        }
        System.out.println("\n");
        System.out.println("nuns[ " + len/2 + " ] = " + nums[len/2]);
        int index = binarySearch(nums, nums[len/2]);
        System.out.println("index " + index);

        String [] strArray = {"dfg", "aaa", "aab", "daa"};
        strArray = selectSort(strArray);
        for(int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println("\n");
        index = binarySearch(strArray, "aab");
        System.out.println(index);
    }

    // 泛型数组排序
    public static <T extends Comparable<T>> T[] arraySort(T[] array) {
        if(array.length < 2) {
            return array;
        }
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[j].compareTo(array[i]) < 0) {
                    T tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    //  泛型二分查找
    public static <T extends Comparable<T>> int binarySearch(T[] array, T target) {
        int l = 0;
        int r = array.length - 1;
        int mid, flag;
        while(l <= r) {
            mid = ((r - l) >> 1) + l;
            System.out.print(array[mid] + " ");
            flag = target.compareTo(array[mid]);
            if (flag < 0) {
                r = mid - 1;
            } else if(flag > 0){
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // 泛型交换两个数
    public static <T> void templateSwap(T []a, T []b) {
        T [] c = a;
        a = b;
        b = c;
    }

    // 泛型插入排序
    public static <T extends Comparable<T>> T[] insertSort(T [] array) {
        if(array == null)
            return null;
        if(array.length < 2)
            return array;
        T key;
        int j;
        for(int i = 1; i < array.length; i++) {
            key = array[i];
            j = i;
            for(; j > 0 && array[j-1].compareTo(key) > 0; j--) {
                array[j] = array[j-1];
            }
            array[j] = key;
        }
        return array;
    }

    // 泛型选择排序
    public static <T extends Comparable> T[] selectSort(T [] array) {
        if(array.length < 2)
            return array;
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                T tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
        return array;
    }
}
