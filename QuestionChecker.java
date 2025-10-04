/*Checks whether the inputted answer from a user is valid. This could have been done on the main 
file but for my own learning purposes and readability I decided to learn how to use multiple classes and files*/

import java.util.*; // is not neccesary but is here anyway in case I ended up needing it
public class QuestionChecker {

    public static void checkAnswer (String userAns, Questions q) // 'q' is just the argument (the object created in MyProgram is in this case what would be 'q'
    {
        if (userAns.equals(q.getCorrectAnswer())) {
            System.out.println("You got the answer right!");
        } else {
            System.out.println(
                "Wrong! The answer was: " + q.getCorrectAnswer()
                );
        }
    }
}
