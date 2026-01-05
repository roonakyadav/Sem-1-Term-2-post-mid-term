/*
========================================================
Topic: Insertion Sort
Source: DSA 101 – Sorting
========================================================

CORE IDEA (PLAYING CARDS ANALOGY):
- Left part of the array is always SORTED
- Pick one element from the right (unsorted part)
- Insert it into the correct position in the left part
- Shift elements instead of swapping repeatedly

--------------------------------------------------------
WHEN TO USE INSERTION SORT
--------------------------------------------------------

• Best for NEARLY SORTED arrays
• Very low overhead
• Stable sorting algorithm
• In-place

--------------------------------------------------------
STEP-BY-STEP DRY RUN
--------------------------------------------------------

Array:
[4, 1, 5, 10]

i = 1
temp = 1
Shift 4 to right
Insert 1 at index 0
Array: [1, 4, 5, 10]

i = 2
temp = 5
Already in correct position
Array unchanged

i = 3
temp = 10
Already in correct position

--------------------------------------------------------
ALGORITHM
--------------------------------------------------------

for i = 1 to N-1:
    temp = arr[i]
    j = i - 1

    while j >= 0 AND arr[j] > temp:
        arr[j + 1] = arr[j]
        j--

    arr[j + 1] = temp

--------------------------------------------------------
IMPORTANT OBSERVATIONS
--------------------------------------------------------

• Shifting is cheaper than swapping
• Stable: equal elements preserve order
• Works extremely fast on nearly sorted arrays

--------------------------------------------------------
TIME & SPACE COMPLEXITY
--------------------------------------------------------

Best Case (already sorted):
O(N)

Worst Case (reverse sorted):
O(N²)

Space Complexity:
O(1)

========================================================
END OF INSERTION SORT
========================================================
*/

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // Start from second element
        for (int i = 1; i < n; i++) {

            int temp = arr[i];
            int j = i - 1;

            // Shift elements greater than temp to the right
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert temp at its correct position
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 5, 10};

        insertionSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
