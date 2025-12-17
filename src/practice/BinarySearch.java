package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 12;
        System.out.println(binarySearch(arr, target));
    }
    /// ### 二分搜索算法
    ///
    /// 现在有一个从小到大排序的数组，给你一个目标值`target`，现在我们想要找到这个值在数组中的对应下标，如果数组中没有这个数，请返回`-1`：
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            }
            if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
