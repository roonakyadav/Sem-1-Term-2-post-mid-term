/*
========================================================
Topic: Stable Sorting vs In-Place Sorting
Source: DSA 101 – Sorting
========================================================

--------------------------------------------------------
1. STABLE SORTING
--------------------------------------------------------

Definition:
A sorting algorithm is STABLE if it preserves
the RELATIVE ORDER of equal elements.

Example:
Input:
[3a, 5, 2, 5b, 1]

Stable Sorted Output:
[1, 2, 3a, 5, 5b]

Here:
5a comes BEFORE 5b in input
→ order preserved in output

--------------------------------------------------------
STABLE SORT EXAMPLES
--------------------------------------------------------

• Insertion Sort
• Bubble Sort
• Merge Sort
• Tim Sort (Java default)

--------------------------------------------------------
UNSTABLE SORT EXAMPLES
--------------------------------------------------------

• Selection Sort
• Quick Sort (standard)
• Heap Sort

--------------------------------------------------------
2. IN-PLACE SORTING
--------------------------------------------------------

Definition:
A sorting algorithm is IN-PLACE if it uses
CONSTANT extra memory.

Extra Space ≤ O(1)

--------------------------------------------------------
IN-PLACE SORT EXAMPLES
--------------------------------------------------------

• Insertion Sort
• Selection Sort
• Bubble Sort
• Quick Sort (average case)

--------------------------------------------------------
NOT IN-PLACE SORT EXAMPLES
--------------------------------------------------------

• Merge Sort (uses extra array)
• Counting Sort
• Radix Sort

--------------------------------------------------------
IMPORTANT CLASS OBSERVATIONS
--------------------------------------------------------

Insertion Sort:
• Stable
• In-place

Selection Sort:
• In-place
• NOT stable

--------------------------------------------------------
INTERVIEW RULE
--------------------------------------------------------

If asked:
"Which sort should I use?"

Answer depends on:
• Stability requirement
• Memory constraint
• Input size
• Input order (nearly sorted?)

========================================================
END OF STABLE VS IN-PLACE SORTING
========================================================
*/

public class StableVsInPlaceSorting {

    public static void main(String[] args) {

        /*
         This class is THEORY-BASED.
         No algorithm implementation required here.

         Purpose:
         - Understand classification of sorting algorithms
         - Answer conceptual interview questions
        */

        System.out.println("Refer comments for Stable vs In-Place Sorting concepts.");
    }
}
