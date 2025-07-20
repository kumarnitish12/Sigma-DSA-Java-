# 📘 DSA Practice in Java

This repository contains my **Data Structures and Algorithms (DSA)** practice in Java. It serves as a personal reference and preparation tool for coding interviews and competitive programming. Problems are solved topic-wise, covering the most important patterns and techniques.

---

## 🛠️ Tech Stack

- **Language:** Java
- **IDE:** IntelliJ / VS Code / Eclipse
- **Compilation:** JDK 17+
- **Execution:** CLI or IDE-run Java classes

---

## 📑 Topics Covered

> ✅ = Completed  
> 🔄 = In Progress  
> ⏳ = Planned  

| Category                  | Status | Description                                 |
|--------------------------|--------|---------------------------------------------|
| ✅ Arrays                | ✅     | Sorting, searching, prefix sums, etc.       |
| ✅ Strings               | ✅     | Palindromes, anagrams, parsing              |
| ✅ Linked List           | ✅     | Reverse, cycle detection, merge sort        |
| ✅ Stacks & Queues       | ✅     | Valid parentheses, monotonic stack, etc.    |
| ✅ Trees                 | ✅     | DFS, BFS, diameter, balanced trees          |
| ✅ Recursion & Backtracking | ✅ | Subsets, permutations, N-Queens             |
| ✅ Hashing               | ✅     | Frequency maps, 2-sum, custom hashing       |
| ✅ Sliding Window        | ✅     | Max subarray, min window substring          |
| ✅ Binary Search         | ✅     | On arrays and answers (search space)        |
| ✅ Graphs                | 🔄     | BFS, DFS, Topo sort, Dijkstra, Union Find   |
| ⏳ Dynamic Programming   | 🔄     | Memoization, Tabulation, Patterns           |
| ⏳ Tries & Heaps         | ⏳     | PriorityQueue, Trie operations              |
| ⏳ Greedy Algorithms     | ⏳     | Intervals, Activities, Minimum Platforms    |

---

## 🧪 Sample Snippet

```java
// Example: Binary Search
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
📌 How to Run
Clone the repo:

bash
Copy
Edit
git clone https://github.com/yourusername/dsa-java-practice.git
cd dsa-java-practice
Compile:

bash
Copy
Edit
javac src/DSA.java
Run:

bash
Copy
Edit
java -cp src DSA
🎯 Goal
Crack top interview-level DSA questions

Follow a pattern-based learning approach (Striver, Neetcode, Blind 75)

Build strong Java fundamentals alongside problem-solving

📚 Resources Used
LeetCode

GeeksforGeeks

Striver Sheet

NeetCode

🙋‍♂️ Author
Nitish Kumar
GitHub • Email

📜 License
This project is licensed under the MIT License – feel free to use, modify, or contribute.

yaml
Copy
Edit

---

Let me know:
- If you're organizing by class or keeping all in one file.
- If you're using packages per topic (I can update the structure).
- If you're following a particular sheet (Striver, NeetCode, etc.).








Ask ChatGPT
