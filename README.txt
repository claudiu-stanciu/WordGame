World Game

Paul is obsessed with letters: He believes that the letter "A" and "B" are the most beautiful in the roman alphabet.
Inspired by those lovely shapes, Paul created a simple game:
You are given two input Strings: *initial* and *target* composed by only "A" and "B". The goal of the game is to try to transform the *initial* string into *target*.
To transform a string you can only do the following operations:
* Add the letter A to the end of the string.
* Add the letter B to the end of the string and then reverse the entire string. (Because the string will be reversed after adding the B, the newly added B will be at the beginning of the string after this operation).


Complete the function "validate" inside the "WordGame" class to return true if there is a sequence of valid moves that will change *initial* into *target*, false otherwise.


Examples:

Initial: "A"
Target "BABA"
Expected: True

Initial: "BAAAAABAA"
Target: "BAABAAAAAB"
Expected: True

Initial: "A"
Target: "ABBA"
Excepted: False

We have provided you a sample unit test class that contains sample tests.

### PLEASE NOTE: DUE TO ATTACHMENT RESTRICTIONS IN EMAILS THE FOLLOWING TWO LIBRARIES NEEDS TO BE INSTALLED MANUALLY IF YOU WANT TO RUN THE UNIT TEST PROVIDED ###
[Junit4] (http://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar)
[hamcrest] (http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar)

When you have returned your solution to us, we will execute a series of tests to verify if the solution is correct.
Feel free to use any IDE of your choice, we will only be evaluating the source code.