# UCSD-CSE11-DI3
**OBJECTIVE**: The point of this exercise is to give you more practice with creating classes, creating methods inside these classes, and performing recursion.

**OVERVIEW**: Create a class named RecursionManager that contains the following:

**METHOD**: ```void triangleSum(int[] nums, int k)``` - this method will take as input a list of integers and calculate the sums for each window of size k starting from the end of the array and going to the front. It will store all the sums in an array, format a string of the array's contents using the ```printFormattedArray()``` method you will also write, and print the returned string from the ```printFormattedArray()``` method. This process will repeat again using the sum array as input for the next ```triangleSum()``` call, and repeat over again until an array of size < k is used as input for a triangleSum() call. Use recursion to write this method. **PLEASE READ THE EXAMPLE BELOW BEFORE CODING!!!**  

**METHOD**: ```String printFormattedArray(int[] nums)``` - this method will take as input a list of integers and format a string that starts with an ```'_'```, contains an ```'_'``` between each number, and ends with an ```'_'```. For example an input array of ```{1, 2, 3}``` should result in a string that is ```"_1_2_3_"```.  

**INSTANCE VARIABLE**: ```int k``` - this k will be used as the argument when calling ```triangleSum()```  

**CONSTRUCTOR**: ```RecursionManager(int k)``` - this constructor will set the instance variable k to the parameter k's value.  
Example:

Input array = ```{1, 2, 3, 4, 5, 6}```

Input ```k = 2```

What gets printed:
```
_11_9_7_5_3_

_8_12_16_20_

_36_28_20_

_48_64_

_112_
```

Explanation of results:
```
_11_9_7_5_3_ 
```
 Since input array is ```{1, 2, 3, 4, 5, 6}```, the sums of windows of size 2 going backwards is 6 + 5, 5 + 4, 4 + 3, 3 + 2, 2 + 1. This is 11, 9, 7, 5, 3. Pass these numbers as an integer array into ```printFormattedArray()``` to be formatted.
```
_8_12_16_20_
```
 Since input array is ```{11, 9, 7, 5, 3}```, the sums of windows of size 2 going backwards is 3 + 5, 5 + 7, 7 + 9, 9 + 11. This is 8, 12, 16, 20. Pass these numbers as an integer array into ```printFormattedArray()``` to be formatted.
```
_36_28_20_
```
 Since input array is ```{8, 12, 16, 20}```, the sums of windows of size 2 going backwards is 20 + 16, 16 + 12, 12 + 8. This is 36, 28, 20. Pass these numbers as an integer array into ```printFormattedArray()``` to be formatted.
```_48_64_```
 Since input array is ```{36, 28, 20}```, the sums of windows of size 2 going backwards is 20 + 28, 28 + 36. This is 48, 64. Pass these numbers as an integer array into ```printFormattedArray()``` to be formatted.
```_112_```
 Since input array is ```{48, 64}```, the sums of windows of size 2 going backwards is 64 + 48. This is 112. Pass these numbers as an integer array into ```printFormattedArray()``` to be formatted.
