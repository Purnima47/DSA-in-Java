# 3163. String Compression III

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/string-compression-iii/description/?envType=daily-question&envId=2024-11-04"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given a string `word`, compress it using the following algorithm:

#### Begin with an empty string `comp`. While `word` is not empty, use the following operation:

- Remove a maximum length prefix of `word` made of a single character `c` repeating at most 9 times.

- Append the length of the prefix followed by `c` to `comp`.

Return the string `comp`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `word = "abcde"` | `"1a1b1c1d1e"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Initially, `comp = ""`. Apply the operation 5 times, choosing `"a"`, `"b"`, `"c"`, `"d"`, and `"e"` as the prefix in each operation.

For each prefix, append `"1"` followed by the character to `comp`.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `word = "aaaaaaaaaaaaaabb"` | `"9a5a2b"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Initially, `comp = ""`. Apply the operation 3 times, choosing `"aaaaaaaaa"`, `"aaaaa"`, and `"bb"` as the prefix in each operation.

- For prefix `"aaaaaaaaa"`, append `"9"` followed by `"a"` to `comp`.

- For prefix `"aaaaa"`, append `"5"` followed by `"a"` to `comp`.

- For prefix `"bb"`, append `"2"` followed by `"b"` to `comp`.



___

## Constraints 🔍

> `1 <= word.length <= 2 * 10^5`</br>

> `word` consists only of lowercase English letters.

___

## Topics 📝

1. String


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/3163%20-%20String%20Compression%20III/_3163StringCompressionIII.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/3163%20-%20String%20Compression%20III/_3163StringCompressionIII.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/3163%20-%20String%20Compression%20III/_3163StringCompressionIII.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/3163%20-%20String%20Compression%20III/_3163StringCompressionIII.py) |