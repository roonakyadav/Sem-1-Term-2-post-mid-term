/*
========================================================
Topic: Sorting Basics
Source: DSA 101 – Sorting (Class Notes)
========================================================

Sorting means arranging elements based on some ORDER
and some BASIS.

--------------------------------------------------------
1. TYPES OF ORDER
--------------------------------------------------------

1) Increasing (Strictly Increasing)
   Every next element is GREATER than the previous one.

   Example:
   [1, 4, 9, 13, 19]

2) Decreasing (Strictly Decreasing)
   Every next element is SMALLER than the previous one.

   Example:
   [19, 13, 9, 4, 1]

3) Non-Increasing
   Elements can be equal or decreasing.

   Example:
   [19, 13, 13, 13, 4]

4) Non-Decreasing
   Elements can be equal or increasing.

   Example:
   [1, 4, 4, 4, 9]

--------------------------------------------------------
2. BASIS OF SORTING
--------------------------------------------------------

Sorting is NOT always based on direct value comparison.

We can sort based on:
- Value
- Count of factors
- Last digit
- Custom logic

Example 1: Sort by COUNT OF FACTORS
Input:
[1, 13, 4, 12]

Factor counts:
1  -> 1 factor
13 -> 2 factors
4  -> 3 factors
12 -> 6 factors

Sorted by increasing factor count:
[1, 13, 4, 12]

Example 2: Sort by LAST DIGIT
Input:
[10, 24, 22, 20, 30]

Last digits:
10 -> 0
24 -> 4
22 -> 2
20 -> 0
30 -> 0

Sorting rule:
If last digit is larger → element comes first.

--------------------------------------------------------
3. STRICT vs NON-STRICT SORTING
--------------------------------------------------------

Strictly Increasing:
No duplicates allowed
[1, 2, 3, 4]

Non-Decreasing:
Duplicates allowed
[1, 2, 2, 3, 4]

--------------------------------------------------------
4. JAVA IN-BUILT SORTING METHODS
--------------------------------------------------------

1) Arrays.sort()
   - Used for arrays
   - Sorts in INCREASING order by default

2) Collections.sort()
   - Used for ArrayList
   - Sorts in INCREASING order by default
   - Can be reversed using Collections.reverseOrder()

--------------------------------------------------------
5. IMPORTANT OBSERVATIONS
--------------------------------------------------------

• Sorting always depends on:
  - Order (inc / dec)
  - Basis (value, digit, custom rule)

• In interviews:
  - Always ASK what type of order
  - Always ASK what basis of sorting

--------------------------------------------------------
6. TIME & SPACE (Intro Level)
--------------------------------------------------------

Sorting algorithms generally aim for:
- Lower Time Complexity
- Constant or minimal Space Complexity

Details of this will be covered in later topics.

========================================================
END OF SORTING BASICS
========================================================
*/

public class SortingBasics {

    public static void main(String[] args) {

        // Example: Default sorting in Java
        int[] arr = {5, 1, 4, 2, 3};

        // Sorts in increasing order
        java.util.Arrays.sort(arr);

        // Printing sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
