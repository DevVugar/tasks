package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,5,6,9,7,1,11};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        int a=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    a=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                }
            }
        }


        for(int i:arr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}

