# 121. Best Time to Buy and Sell Stock

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

#### You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

#### Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return `0`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `prices = [7,1,5,3,6,4]` | `5` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. <br>
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `prices = [7,6,4,3,1]` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

In this case, no transactions are done and the max profit = 0.


___

## Constraints 🔍

> `1 <= prices.length <= 10^5`</br>

> `0 <= prices[i] <= 10^4`

___

## Topics 📝

1. Array
2. Dynamic Programming


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python]() |