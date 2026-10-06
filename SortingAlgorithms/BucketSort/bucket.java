package BucketSort;

import java.util.*;

class BucketSort {

    static void bucketSort(float arr[]) {
        int n = arr.length;

        ArrayList<Float>[] bucket = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int index = (int)(arr[i] * n);
            bucket[index].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(bucket[i]);
        }

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                arr[k] = bucket[i].get(j);
                k++;
            }
        }
    }


    public static void main(String[] args) {

        float arr[] = {0.42f, 0.32f, 0.23f, 0.52f,
                0.25f, 0.47f, 0.51f};

        bucketSort(arr);

        System.out.println("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
