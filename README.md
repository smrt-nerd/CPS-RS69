## Assignment 01 | Solutions
### Problem 1(a) 
There are 2 loops, one inside another. At first we need to work with the inner loop. For inner loop, the value of $j$ is initially 2. After each iteration the value doubles like this.

| no of iterations | $j$       |
| ---------------- | --------- |
| $1$              | $2 = 2^1$ |
| $2$              | $4 = 2^2$ |
| $3$              | $8 = 2^3$ |
| ...              | ...       |
| $x$              | $2^x$     |

But $j$ ends at the value of $n$ for the worst case. That means $2^x$ is equal to $n$ . $2^x = n$ That is, $log{_2}{n} = x$.
For a very large input we can write $log{n} = x$. That's how the time complexity of inner loop is $O(log{n})$.
For outter loop, we can consider the inner loop as a constant operation. So complexity is $O(n)$

Overall complexity is `outter loop * inner loop`, that means,
**Total Time Complexity: $O(nlogn)$.**
### Problem 1(b)
For the worst case program goes to the while loop. The while loop continues as long as $i*i <= x$. Each iteration increments $i$ by 1.
The loop stops as soon as $i*i > x$. So, $i$ grows up to the value where $i^2$ just surpasses $x$, which means $i$ can be about $\sqrt{x}$.

**Total Time Complexity: $O(\sqrt{x})$**

### Problem 2: Container With Most Water : Coding Problem

Here, two pointers have been used at the start and end of the height array. Then we calculate the area between them, then we move the pointer at the shorter height inward to try for a higher area. This continues until the pointers meet and the while loop breaks. This method checks all possible containers in one pass, making it very fast compared to the loop inside loop method.


## Assignment 02 | Solutions
1. **addLast()**  
    To put a new value at the end, I made a new node and linked it after the last node using the tail pointer.
    
2. **removeLast()**  
    To take away the last value, I moved through the list to find the second last node and set its next link to null.
    
3. **removeFirst()**  
    To remove the first value, I simply pointed head to the next node, so the first is skipped.
    
4. **reverse()**  
    To turn the list backwards, I changed each node’s next link to point to the previous node as I moved through the list.
    
5. **removeKthNodeFromEnd()**  
    To remove the k-th item from the end, I used two pointers: moved one forward by k steps, then moved both together until the first pointer finished. The second pointer helped skip the right node.