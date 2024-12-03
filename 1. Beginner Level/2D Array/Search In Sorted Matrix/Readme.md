# 240. Search a 2D Matrix II

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/search-a-2d-matrix-ii/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`. This matrix has the following properties:

- Integers in each row are sorted in ascending from left to right.

- Integers in each column are sorted in ascending from top to bottom.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![searchgrid2](https://github.com/user-attachments/assets/6725e3e1-9750-438a-96b7-09caf193b495)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5` | `true` |

</h3>


____
<h3>

<ins>**Example 2**:</ins> </br>

![searchgrid](https://github.com/user-attachments/assets/551580e2-f028-4331-ae68-ebee04aa12cd)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20` | `false` |

</h3>


___

## Constraints 🔍

> `m == matrix.length`</br>

> `n == matrix[i].length` <br>

> `1 <= n, m <= 300` <br>

> `-10^9 <= matrix[i][j] <= 10^9` <br>

> All the integers in each row are sorted in ascending order.

> All the integers in each column are sorted in ascending order.

> `-10^9 <= target <= 10^9`

___

## Topics 📝

1. Array
2. Binary Search
3. Divide and Conquer
4. Matrix



## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/240%20-%20Search%20a%202D%20Matrix%20II/_240SearchA2DMatrixII.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/240%20-%20Search%20a%202D%20Matrix%20II/_240SearchA2DMatrixII.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/240%20-%20Search%20a%202D%20Matrix%20II/_240SearchA2DMatrixII.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/240%20-%20Search%20a%202D%20Matrix%20II/_240SearchA2DMatrixII.py) |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/240%20-%20Search%20a%202D%20Matrix%20II/_240SearchA2DMatrixII.c) |