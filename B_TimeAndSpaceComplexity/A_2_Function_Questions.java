//! Example Questions on Time Complexity For Practise

//? Rules For Time Complexity:
// 1. Always find the worst case time complexity (Big O).
// 2. Avoid Constants (1, 2, 3)
// 3. Avoid Lower Values
// Take the higher degree when there is +


//* Q1. f(n) -> 2n^2 + 3n
// Here, 2n^2 have higher complexity
// Time Complexity =  O(n^2)

//* Q2. f(n) -> 4n^4 + 3n^3 
// Here, 4n^4 have higher complexity
// Time Complexity = O(n^4)

//* Q3. f(n) -> N^2 + logN
// Here, n^2 have higher complexity
// Time Complexity = O(N^2)

//* Q4. 1201
// Time Complexity = O(1)

//* Q5. f(n) -> 3n^3 + 2n^2 + 5
// Here, 2n^3 have highest Complexity
// Time Complexity = O(n^3)

//* Q6. f(n) -> n^3 / 300
// ignore 300 
// Time Complexity = O(n^3)

//* Q7. f(n) -> 5n^2 + logn
// 5n^2 have the higher complexity
// Time Complexity = O(n^2)

//* Q8. f(n) -> n/4
// ignore 4
// Time Complexity = O(n)

//* Q9. f(n) -> n + 4 / 4
// Here, Ignore the 4s
// Time Complexity = O(n)