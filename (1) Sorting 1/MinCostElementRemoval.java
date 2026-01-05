/*
========================================================
Topic: Minimum Cost to Remove Elements
Source: DSA 101 – Sorting
========================================================

PROBLEM STATEMENT:
Given an array of N elements.
At every step, remove ONE element.

Cost of removal at any step =
    Sum of all elements currently present in the array.

NOTE:
First ADD the cost, then REMOVE the element.

Goal:
Find the MINIMUM total cost to remove all elements.

--------------------------------------------------------
KEY OBSERVATION (MOST IMPORTANT INSIGHT)
--------------------------------------------------------

If you remove a LARGE element early,
it contributes to the sum for MANY future steps.

To minimize total cost:
→ Remove LARGER elements FIRST
→ Remove SMALLER elements LAST

So:
1. Sort array in DECREASING order
2. Accumulate cost smartly

--------------------------------------------------------
DRY RUN (FROM CLASS)
--------------------------------------------------------

Example:
A = [2, 1, 4]

Correct strategy (remove largest first):
Sorted (descending): [4, 2, 1]

Step 1:
Array = [4, 2, 1]
Cost = 4 + 2 + 1 = 7
Remove 4

Step 2:
Array = [2, 1]
Cost = 2 + 1 = 3
Remove 2

Step 3:
Array = [1]
Cost = 1
Remove 1

Total Cost = 7 + 3 + 1 = 11

--------------------------------------------------------
MATHEMATICAL OPTIMIZATION
--------------------------------------------------------

After sorting in DESC order:

Index:   0   1   2   3
Array:   a   b   c   d

Total Cost =
(1 * a) + (2 * b) + (3 * c) + (4 * d)

General Formula:
cost += (i + 1) * arr[i]

--------------------------------------------------------
ALGORITHM
--------------------------------------------------------

1. Sort array in DECREASING order
2. Initialize cost = 0
3. Traverse array:
       cost += (i + 1) * arr[i]
4. Return cost

--------------------------------------------------------
TIME & SPACE COMPLEXITY
--------------------------------------------------------

Time Complexity:
Sorting → O(N log N)

Space Complexity:
O(1) extra space (in-place, ignoring sort internals)

========================================================
END OF MIN COST ELEMENT REMOVAL
========================================================
*/

import java.util.Arrays;

public class MinCostElementRemoval {

    public static long minCostToRemove(int[] arr) {

        // Step 1: Sort array in increasing order
        Arrays.sort(arr);

        // Step 2: Traverse from the end (largest to smallest)
        long cost = 0;

        for (int i = 0; i < arr.length; i++) {
            cost += (long) (i + 1) * arr[arr.length - 1 - i];
        }

        return cost;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 4};

        long result = minCostToRemove(arr);

        System.out.println("Minimum Cost: " + result);
    }
}
