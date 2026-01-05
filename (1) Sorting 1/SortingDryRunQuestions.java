/*
========================================================
Topic: Sorting Dry-Run & Output-Based Questions
Source: DSA 101 – Sorting
========================================================

THIS FILE IS VERY IMPORTANT FOR EXAMS & INTERVIEWS

--------------------------------------------------------
1. COUNT NUMBER OF PASSES (BUBBLE SORT)
--------------------------------------------------------

Array:
[3, 7, 2, 5, 8]

Bubble Sort passes:

Pass 1:
3 2 5 7 8

Pass 2:
2 3 5 7 8

Pass 3:
No swap → STOP

Total Passes = N - 1 (worst case)

--------------------------------------------------------
2. IDENTIFY SORTING ALGORITHM FROM OUTPUT
--------------------------------------------------------

Clues:
• Shifting → Insertion Sort
• Swapping max to right → Selection Sort
• Adjacent swaps → Bubble Sort

--------------------------------------------------------
3. NUMBER OF COMPARISONS (SELECTION SORT)
--------------------------------------------------------

If N elements:

Comparisons:
(N - 1) + (N - 2) + ... + 1
= N(N - 1) / 2

Time Complexity:
O(N²)

--------------------------------------------------------
4. NUMBER OF SWAPS (SELECTION SORT)
--------------------------------------------------------

• At most N - 1 swaps
• One swap per pass

--------------------------------------------------------
5. INSERTION SORT DRY RUN (KEY PATTERN)
--------------------------------------------------------

Array:
[5, 3, 2, 1]

i = 1 → shift 5
i = 2 → shift 5, 3
i = 3 → shift 5, 3, 2

Worst Case:
Reverse sorted array

--------------------------------------------------------
6. BEST CASE VS WORST CASE QUESTIONS
--------------------------------------------------------

Insertion Sort:
Best Case:
Already sorted → O(N)

Worst Case:
Reverse sorted → O(N²)

Selection Sort:
Best = Worst = O(N²)

--------------------------------------------------------
7. VERY COMMON TRICK QUESTION
--------------------------------------------------------

Q: Which sort is both STABLE and IN-PLACE?

Answer:
Insertion Sort

--------------------------------------------------------
EXAM TIP
--------------------------------------------------------

If question involves:
• Minimum swaps → Selection Sort
• Nearly sorted → Insertion Sort
• Stability required → Insertion / Bubble

========================================================
END OF SORTING DRY-RUN QUESTIONS
========================================================
*/

public class SortingDryRunQuestions {

    public static void main(String[] args) {

        /*
         No executable logic required.
         This file is meant for:
         - Reading
         - Revising before exams
         - Quick interview prep
        */

        System.out.println("Sorting dry-run notes loaded. Refer comments.");
    }
}
