import java.util.*; //isn't really needed but put here anyway
public class Questions 
{
    //private instance variables
    private String TheQuestion;
    private String Choice1;
    private String Choice2;
    private String Choice3;
    private String Choice4;
    private String CorrectAnswer;
    
    //constructor, defines the variables when you put arguments in the parameters in another file
    public Questions(String prompt, String first, String second, String third, String fourth, String answer)
    {
        TheQuestion = prompt;
        Choice1 = first;
        Choice2 = second;
        Choice3 = third;
        Choice4 = fourth;
        CorrectAnswer = answer;
    }
    
    public String toString()
    {
        return TheQuestion + 
        "\na. " + Choice1 + 
        "\nb. "+ Choice2 + 
        "\nc. " + Choice3 + 
        "\nd. " + Choice4 + "\n";
    }
    /* Getters which are public methods that will return the private variables.
    declaring the variables as public breaks the idea of encapsulation and hiding data so... yeah*/
    public String getQuestion() {return TheQuestion;}
    public String getChoice1() {return Choice1;}
    public String getChoice2() {return Choice2;}
    public String getChoice3() {return Choice3;}
    public String getChoice4() {return Choice4;}
    public String getCorrectAnswer() {return CorrectAnswer;}
    
}
