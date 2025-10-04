import java.util.Scanner; // For inputs

public class MyProgram
{
    public static void main(String[] args)
    {
        Questions multiChoiceQuestion = new Questions (
            "Who is british in the game \"Limbus Company\"?", // default question
            "Ishmael","Sinclair","Heathcliff","Gregor",
            "c");
        Scanner input = new Scanner(System.in);
        System.out.print(multiChoiceQuestion);
        
        System.out.println("Enter your response a/b/c/d");
        String Ans = input.nextLine().trim().toLowerCase(); // trim the first letter of the input received and then make it lowercase to ensure it isn't case sensitive
        QuestionChecker.checkAnswer(Ans, multiChoiceQuestion); // checks if it is correct
    }
}

/* https://static.wikia.nocookie.net/limbuscompany/images/4/4f/Heathcliff_Remember_StandingSprite.png/revision/latest?cb=20240503144415
^^^Here is an image of Heathcliff btw*/
