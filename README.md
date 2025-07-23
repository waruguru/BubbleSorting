 Bubble Sort
Bubble Sort is one of the simplest sorting algorithms. It’s not very efficient for large datasets, but it's easy to understand and a great starting point for learning sorting.

 Real-World Analogy:
Imagine you have a group of 10 people of different heights. You want to arrange them from shortest to tallest. With Bubble Sort, you compare two people at a time, and if the person on the left is taller than the one on the right, you swap them.

 How Bubble Sort Works:
Start from index 0 and compare each pair of adjacent elements.

If the left value is greater than the right, swap them.

Continue comparing and swapping across the entire list.

After the first full pass, the largest value ends up at the end.

Repeat the process, but stop one element earlier each time since the largest elements "bubble up" to the end.

Continue until no swaps are needed — meaning the list is sorted.

 Example Behavior:
1st iteration: The largest element moves to the last position.

2nd iteration: The second-largest moves to the second-last.

3rd iteration: Third-largest settles in place.

...

Each pass shortens the range we need to check.

 Why It's Not Efficient:
Uses two nested loops: one to control the passes, one to compare elements.

Time complexity is O(n²) in the worst and average cases.

It's acceptable for small lists but not ideal for large datasets.
