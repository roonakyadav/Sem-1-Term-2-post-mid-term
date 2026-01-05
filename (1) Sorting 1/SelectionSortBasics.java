/*
========================================================
Topic: Selection Sort – Core Idea
Source: DSA 101 – Sorting
========================================================

SELECTION SORT (MAX-BASED APPROACH USED IN CLASS)

Core Idea:
- Repeatedly find the MAX element in the UNSORTED part
- Place it at its correct position from the RIGHT side
- Shrink the unsorted range

--------------------------------------------------------
WHY MAX ELEMENT?
--------------------------------------------------------

In this class, selection sort is taught as:
→ Find MAX
→ Swap with RIGHT index
→ Decrease right index

(This is equivalent to finding MIN and placing on left,
but logic here is RIGHT-side based.)

--------------------------------------------------------
TERMINOLOGY
--------------------------------------------------------

rightIndex:
- Last index of the UNSORTED part
- Initially = N - 1
- Decreases after every pass

maxIndex:
- Index of maximum element found in current pass

--------------------------------------------------------
STEP-BY-STEP DRY RUN
--------------------------------------------------------

Array:
[4, 2, 1, 6, 0, -3, 9]

Initial:
rightIndex = 6

Pass 1:
Max = 9 (index 6)
Swap with arr[6]
Array unchanged
rightIndex = 5

Pass 2:
Search from index 0 to 5
Max = 6
Swap with arr[5]
Array becomes:
[4, 2, 1, -3, 0, 6, 9]
rightIndex = 4

Continue until rightIndex = 0

--------------------------------------------------------
ALGORITHM
--------------------------------------------------------

1. Set rightIndex = N - 1
2. While rightIndex >= 1:
      a) Find index of maximum element from 0 to rightIndex
      b) Swap maxIndex with rightIndex
      c) rightIndex--

--------------------------------------------------------
IMPORTANT NOTES
--------------------------------------------------------

• Selection sort is:
  - NOT stable
  - In-place
  - Comparison-based

• Number of swaps ≤ N - 1
• Comparisons are many → O(N²)

--------------------------------------------------------
TIME & SPACE COMPLEXITY
--------------------------------------------------------

Time Complexity:
O(N²) in all cases

Space Complexity:
O(1)

========================================================
END OF SELECTION SORT BASICS
========================================================
*/

public class SelectionSortBasics {

    public static void selectionSort(int[] arr) {

        int n = arr.length;
        int rightIndex = n - 1;

        // Continue until only one element remains
        while (rightIndex >= 1) {

            int maxIndex = 0;

            // Find index of maximum element in range [0, rightIndex]
            for (int i = 1; i <= rightIndex; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap max element with element at rightIndex
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            // Reduce the unsorted range
            rightIndex--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 6, 0, -3, 9};

        selectionSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
