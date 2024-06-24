//! Operators & Binary Number System in Java:
//? Operators are used to perform operations on Operands. 

//? 1. Arithmetic Operators.
/* 
Binary...
    + : Plus     - Addition
    - : Minus    - Subtraction
    * : Multiply - Multiplication
    / : Divison  - Find The Quotent      (10/5) = 2
    % : Modulo   - Find The Remainder.   (10/5) = 0
Unary...
    ++ : Increment  - Increase Value by 1,      a=a+1 / a++
    -- : Decrement  - Decrease Value by 1,      b=b-1 / b--
*/

public class A14_Operators{
    public static void main(String[] args) {

        // 1.Post-Increment 1)use value 2)change value
        int a = 10;
        int b = 0;
        b = a++;
        System.out.println(a);
        System.out.println(b);

        // Pre-Increment... 1)change value 2)use value
        int x = 10;
        int y = 0;
        y = ++x;
        System.out.println(x);
        System.out.println(y);

        // Pre-decrement
        int i = 10;
        int j = 0;
        j = --i;
        System.out.println(i);
        System.out.println(j);

        // post-decrement
        int k = 10;
        int l = 0;
        l = k--;
        System.out.println(k);
        System.out.println(l);
    }
}

//? 2. Relational Operators
/* 
    == : Equal to 
    != : Not equal to
    <  : Less than
    <= : Less than or equal to 
    >  : Greater than 
    >= : Greater than or equal to
 */

// ? 3. Logical Operators.
/* 
    && : Logical AND - True if Both conditons are True,          (5>1 && 3<5)   - True
    || : Logical OR  - True if any one condition is True         (5>2 || 1>2)   - True
    !  : Logical NOT - True if the conditon is False.            !(10 > 5)      - false
 */


//? 4. Bitwise Operators: ... in notebook
/* 
    &  - Binary AND 
    |  - Binary OR  
    ^  - Binary XOR 
    ~  - Binary One's Complement
    << - Binary Left Shift  
    >> - Binary Right Shift 
 */

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


//? 5. Assignment Operators:
/* 
    *  Right side value is assigned to the left side.
    *  a = value assigned to 'a'

    * Assume A=5, B=2 in all.
    =   : A = 5
    +=  : A += 2  or A = A+2 , = 7
    -=  : A -= 2  or A = A-2 , = 3
    *=  : A *= 2  or A = A*2 , = 10
    /=  : A /= 2  or A = A/2 , = 2

 */

 //! Binary Number System: in notebook...
// Binary, Decimal, Octal, Hexadecimal & Their Conversions.