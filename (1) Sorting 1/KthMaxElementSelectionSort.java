/*
========================================================
Topic: K-th Maximum Element using Selection Sort
Source: DSA 101 – Sorting
========================================================

PROBLEM:
Given an array of size N, find the K-th maximum element.

--------------------------------------------------------
NAIVE APPROACH
--------------------------------------------------------

Sort the array completely and return:
arr[N - K]

Time: O(N log N)

--------------------------------------------------------
CLASS APPROACH (SELECTION SORT BASED)
--------------------------------------------------------

Instead of fully sorting:
- Perform selection sort passes
- Each pass places ONE maximum element at correct position
- After K passes, the K-th max is found

--------------------------------------------------------
KEY VARIABLES
--------------------------------------------------------

rightIndex:
- Initially N - 1
- Shrinks after every pass

Pass count:
- Stop after K passes

--------------------------------------------------------
DRY RUN (FROM CLASS)
--------------------------------------------------------

A = [4, 9, 1, 6, 0, -3, 2]
K = 2

Pass 1:
Max = 9 → placed at index 6

Pass 2:
Max = 6 → placed at index 5

Answer = 6

--------------------------------------------------------
ALGORITHM
--------------------------------------------------------

1. rightIndex = N - 1
2. Repeat K times:
      a) Find max element from 0 to rightIndex
      b) Swap with rightIndex
      c) rightIndex--
3. Return arr[N - K]

--------------------------------------------------------
TIME & SPACE COMPLEXITY
--------------------------------------------------------

Time Complexity:
O(K * N)

Worst case (K = N):
O(N²)

Space Complexity:
O(1)

========================================================
END OF K-TH MAX ELEMENT
========================================================
*/

public class KthMaxElementSelectionSort {

    public static int kthMax(int[] arr, int k) {

        int n = arr.length;
        int rightIndex = n - 1;

        // Perform K passes of selection sort
        for (int pass = 1; pass <= k; pass++) {

            int maxIndex = 0;

            // Find maximum in range [0, rightIndex]
            for (int i = 1; i <= rightIndex; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap max with rightIndex
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            rightIndex--;
        }

        // After K passes, K-th max is at index n - k
        return arr[n - k];
    }

    public static void main(String[] args) {

        int[] arr = {4, 9, 1, 6, 0, -3, 2};
        int k = 2;

        int result = kthMax(arr, k);

        System.out.println(k + "-th Maximum Element: " + result);
    }
}
