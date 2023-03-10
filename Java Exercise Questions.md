# Function Based Exercises
- Write a function in JAVA that accepts an integer array as an argument and returns the MEAN of values in an ARRAY.
- Write a java function that takes a string as input and returns the middle character.
- Write a java function that takes a string as input and returns the count of the number of each vowel in the string.
- Write a java function that takes an integer value as input and returns the sum of digits.
- write a java function that takes a string as input and checks if it is palindrome or not; if palindrome, return True else, False.
- write a java function that takes an integer as input and checks if it is palindrome or not; if palindrome, return True else, False.
- Write a function in JAVA that accepts an integer array as an argument and returns the MODE of values in an ARRAY.
- Write a function in JAVA that accepts an integer array as an argument and returns the MEDIAN of values in an ARRAY.

---

------

• What kind of code do we have to write? [USER DEFINED FUN.]
• What are the input(s)? [FUNCTION ARGUMENTS]
• What are the output(s)? [FUNCTION RETURN VALUES]
• What process converts the i/p to o/p? [LOGIC]
• How do we test it? --> What values do we have to give?
• How do we know that we got correct outputs?
• If we got correct outputs, how to beautify the outputs?

LOGIC to find the MEAN when a set of values are given:
Basically, compute the sum of the elements,
calculate the total number of elements,
the Average (or mean) will be the result of SUM/NO

Given this idea, how do we compute the Sum of the elements?
• Before we start the loop, let us have SUM = 0.
• A For Loop is required to iterate through the elements
• In each iteration, SUM = PREV_SUM + Element

At the end of the Loop, we will be having the SUM of values
Now, just divide the values as SUM/COUNT.

So, let us put our thought into a more formal manner -

function FindMeanOfElements(input ARRAY){
    SUM = 0;
    size = length(ARRAY);

    Let us start from 0, "count" to SIZE-1:
        Current_Element = Select the ARRAY[count]
        SUM = SUM + Current_Element
        repeat above steps until the we reach ARRAY[size]

    --> SUM --> Sum(all elements array)

    MEAN = SUM/SIZE;
    RETURN MEAN;
}

********
