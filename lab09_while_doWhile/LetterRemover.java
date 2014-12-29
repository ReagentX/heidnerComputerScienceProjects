//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
    private String sentence;
    private String lookFor;
    

    public LetterRemover()
    {
        sentence="";//call set
    }

    //add in second constructor
    public LetterRemover(String s, String rem)
    {
        sentence = s;
        lookFor = rem;
    }

    public void setRemover(String s, String rem)
    {
        sentence = s;
        lookFor = rem;
    }

    public String removeLetters()
    {
        String cleaned=sentence;
        cleaned = sentence.replace(lookFor, "");
        System.out.println(sentence + " - letter to remove: " + lookFor + " = " + cleaned);
        return cleaned;
    }

    public String toString()
    {
        return sentence + " - letter to remove " + lookFor;
    }
}