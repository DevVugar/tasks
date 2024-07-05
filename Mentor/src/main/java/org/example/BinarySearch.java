package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 13, 35, 56, 67, 68, 85, 89};
        int a = Binary(arr, 35);

        System.out.println(a);
    }

    public static int Binary(int[] arr, int target) {
        int begin = 0;
        int end = arr.length - 1;
        int mid;
        while (end >= begin) {
            mid = (end + begin) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }
}
