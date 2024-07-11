//! Time complexity:
//* Time Complexity != Time Taken (Because it depends on the system power)
//* Defination 1: It is the rate at which the time taken by a program increases with respect to the input size
//* Defination 2: It is the amount of computational time taken by a algorithm to run.
//* Higher the input size, higher will be the time complexity.

//? Why Time Complexity?
// Industry Standard
// For Making better programs with good execution time.
// Comparion of algorithms, to check which algorithm is optimal and faster.

//? Types of Time Complexity in a program:
//   1) Best Case     -> Ω(1)        (Omega) | Lower Bound
//   2) Average Case  -> θ(n+1/2)    (Theta) | Avg-case complexity
//   3) Worst Case    -> O(n)        (Big O) | Upper Bound (Mostly Used, Learn this in Depth for every algoritm)
//* 1) Best Case: 1 operation 
//     Numbers = 1, 2, 3, 4, 5
//     Search : 1
//     It will take just 1 operation to find 1, so this is best case Ω(1). 
//* 2) Average Case: avg opearations
//     Numbers = 2, 1, 3, 4, 5
//     => 1 + 2 + 3 + 4 + 5 / 5
//     => n(n+1)/2xn
//     => (n+1 / 2)
//* 3) Worst Case: n operations
//     Numbers =  1, 2, 3, 4, 5
//     Search : 5
//     Here, we have to perform n operations to get the value 5, so this is worst case O(n) OR O(5).

//! Big O Notation (Worst Cases): O(n)
//* Big O notation describes the complexity of your code using algebraic terms.
//* Big O notation is one of the most fundamental tools for computer scientists to analyze an algorithm. 
//* It is a good practice for software engineers to understand.
//? Time complexity can increase in: Constant, Linear, Quadratic, Cubic, Log, Square. 
// Constant Time : O(1)
// Linear Time : O(n)
// Logarithmic Time : O(log n)
// Quadratic Time : O(n^2)
// Cubic Time : O(n^3)

//? Complexity Table
// O(N!)            (Highest Time Complexity)
// O(2^N) 
// O(N^2) 
// O(N^3) 
// O(N log N)
// O(N)
// O(log N)
// O(1)             (Lowest Time Complexity)


//? Rules For Time Complexity:
// 1. Always find the worst case time complexity (Big O).
// 2. Avoid Constants
// 3. Avoid Lower Values