//© A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Sardegna
//Date - 3/27/2014
//Class - Period 5
//Lab  -

import static java.lang.System.*;

public class Lab09j
{
    public static void main( String args[] )
    {
        LetterRemover ava = new LetterRemover("I am Sam I am","a");
        ava.removeLetters();
        LetterRemover as = new LetterRemover("ssssssssxssssesssssesss","s");
        as.removeLetters();
        LetterRemover sd = new LetterRemover("qwertyqwertyqwerty","a");
        sd.removeLetters();
        LetterRemover df = new LetterRemover("abababababa","b");
        df.removeLetters();
        LetterRemover fg = new LetterRemover("abaababababa","x");
        fg.removeLetters();
	}
}