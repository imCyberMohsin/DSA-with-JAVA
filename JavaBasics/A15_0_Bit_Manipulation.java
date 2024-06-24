//! Bit Manipulation in Java. 
//? It can be used to optimize the time complexity of an algorithm. 
// 1 = ON
// 0 = OFF

/* 
    Left Shift
    N << 1
    3 << 1
    010 << 1
    = 100

    Right Shift
    N >> 1
    3 >> 1
    010 >> 1
    = 001
 */

//? Bit Manipulation Operations:
// 1. Get  : Get info of a bit from a binary number.
// 2. Set  : Make a bit '1' in a Binary Number.
// 3. Clear: Make a bit '0' in Binary Number.
// 4. Update : Make a bit '0' to '1' OR '1' to '0'

//! Count Index of Binary Numbers From Right.
/* 
        0 1 0 0     - Binary Number 
        ^ ^ ^ ^
        | | | |
        3 2 1 0     - Index
 */

/* 
?  1. Get Operation:
*  Q. Get the 3rd bit(Positon=2) of number n. (n=0101) 
*     Bit Mask: 1 << i
*     Operation: AND      
        Step 1: Create bit mask
                =  1 << 2
                =  0001 << 2
                =  0100
        Step 2: Perform AND Operation of (Final bitmask output AND n)
                = 0100 AND 0101
                =   0100
                AND 0101
                ---------
                    0100
        Step 3: Identify '0' '1'
                Non-Zero = 1
                Zero = 0
                so, Postion-2 is '1'.
 */

/* 
?  2. Set Operation:
*  Q. Set the 2nd bit(Positon=1) of number n. (n=0101) 
*     Bit Mask: 1 << i
*     Operation: OR
        Step 1: Create bit mask
                = 1 << 1
                = 0001 << 1
                = 0010
        Step 2: Perform OR Operation of (Final bitmask output OR n)
                = 0100 OR 0101
                =   0010
                OR  0101
                ---------
                    0111
        Now, You will notice that the position-1 is set to '1'.

*/

/* 
?  3. Clear Operation:
*  Q. Clear the 3rd bit(Positon=2) of number n. (n=0101) 
*     Bit Mask: 1 << i
*     Operation: AND with NOT
        Step 1: Create bit mask
                = 1 << 2
                = 0001 << 2
                = 0100
        Step 2: Perform AND with NOT Operation of (Final bitmask output with n)
                First, Perform NOT ~
                ~(0100) = 1011

                Then, Perform (Output of 'not' AND 'n')
                = 1011 AND 0101
                =   1011
                AND 0101
                ---------
                    0001
        Now, You will See that the position-2 will be clear, means '0'.
*/

/* 
?   4. Update Operation:
?   Q. Update the 2nd bit(Positon=1) of number to 1. (n=0101) 
*   For 0: (Means Clear Operation)
        Bit Mask: 1 << i
        Operation: AND with NOT 

*   For 1: (Means Set Operation)
        Bit Mask: 1 << i
        Operation: OR   

        Step 1: First Ask User For Input of what to Update (0 / 1)?
        Step 2: Perform Set-Operation if '1'
                Perform Clear-Operation if '0'

 */


// ------------- END OF JAVA BASICS --------------------------------