package dp;

import java.util.ArrayList;

public class Lecture1 {

    public static void mergeSort(int []arr,int s,int e) {
        if(s < e) {
            int m = (s+ (e-1)) /2;

            mergeSort(arr,s,m);
            mergeSort(arr,m+1,e);

            merge(arr,s,e,m);
        }
    }

    private static void merge(int [] arr,int s,int e,int m) {

        int l = m-s +1;
        int r = e-m;

        int[] arr1 = new int [l];
        int[] arr2 = new int[r];

        for(int i = 0; i <l;++i) {
            arr1[i] = arr[i+s];
        }
        for(int i = 0; i < r;++i) {
            arr2[i] = arr[i+m+1];
        }
        int i=0, j = 0;
        int k = s;
        while(i< l && j<r) {
            if(arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                ++i;
            }
            else if(arr2[j] < arr1[i]) {
                arr[k] = arr2[j];
                ++j;
            }
            ++k;
        }

        while(i<l) {
            arr[k] = arr1[i];
            ++i;++k;
        }

        while(j<r) {
            arr[k] = arr2[j];
            ++j;++k;
        }

    }

}
