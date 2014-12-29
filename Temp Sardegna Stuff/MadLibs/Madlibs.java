import javax.swing.JOptionPane;
/**
 * Write a description of class MadLibs here.
 * 
 * Chris Sardegna
 * 10/16/13
 */
public class Madlibs {
    public void storyChanger() {
     String verb1, adj1, color1, pastverb1, noun1, noun2, noun3, noun4, pastverb2, noun5, pastverb3, bodypart1, pastverb4, adjective2, char2;
     int int1;
     char char1;
     double double1;
     
     verb1 = JOptionPane.showInputDialog("Enter a verb :: ");
     char1 = (JOptionPane.showInputDialog("Enter a vowel :: ")).charAt(0);
     adj1 = JOptionPane.showInputDialog("Enter an adjective :: ");
     double1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a double :: "));
     int1 = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer :: "));
     color1 = JOptionPane.showInputDialog("Enter a color :: ");
     pastverb1 = JOptionPane.showInputDialog("Enter a past tense verb :: ");
     noun1 = JOptionPane.showInputDialog("Enter a noun :: ");
     noun2 = JOptionPane.showInputDialog("Enter a noun :: ");
     noun3 = JOptionPane.showInputDialog("Enter a noun :: ");
     noun4 = JOptionPane.showInputDialog("Enter a noun :: ");
     pastverb2 = JOptionPane.showInputDialog("Enter a past verb :: ");
     noun5 = JOptionPane.showInputDialog("Enter a noun :: ");
     pastverb3 = JOptionPane.showInputDialog("Enter a past verb :: ");
     bodypart1 = JOptionPane.showInputDialog("Enter a body part :: ");
     pastverb4 = JOptionPane.showInputDialog("Enter a past verb :: ");
      adjective2 = JOptionPane.showInputDialog("Enter an adjective :: ");
        
     System.out.println("Once upon " + char1 + " time there were a rooster and a hen who wanted to take a " + verb1 + " together. So the rooster built a " + adj1 + " carriage with " + double1 + color1 + " wheels, \n and hitched " + int1 +" mice to it. The hen climbed aboard with the rooster, and they " + pastverb1 + " away together. \n Not long afterward they met a cat, who said, Where are you going? \n The rooster answered, We're on our way to Herr Korbes's house. Take me with you, said the cat.  \n The rooster answered, 'Gladly. Climb on behind, so you won't fall off the front. Be careful not to get my " + color1 + " wheels dirty. Roll, wheels. Whistle, mice. \n We're on our way to Herr Korbes's house. \n Then a millstone came along, then an " +  noun1 + ", then a " +  noun2 + ", then a " +  noun3 + ", and finally a " +  noun4 + ". They all " + pastverb2 + " aboard the carriage and rode with them. \n  But when they arrived at Herr Korbes's house, he was not there. The mice pulled the carriage into the barn. The hen and the rooster flew onto a pole. \n The cat sat down in the fireplace and the duck in the water bucket. The egg rolled itself up in a towel. The pin stuck itself into a chair \n cushion. The " + noun5 + " " + pastverb3 + " onto the bed in the middle of the pillow. The millstone lay down above the door. \n Then Herr Korbes came home. He went to the fireplace, wanting to make a fire, and the cat threw ashes into his  " + bodypart1 + ". He ran quickly into the kitchen to wash \n himself, and the duck splashed water into his face. He wanted to dry himself off with the towel, but the egg rolled against him, broke, and glued his eyes shut. \n Wanting to rest, he sat down in the chair, and the pin pricked \n him. He fell into a rage and " + pastverb4 + " himself onto his bed, but when he laid his head on the pillow, the needle pricked him, causing him to scream and run \n out of the house. As he ran through the front door the millstone jumped down and struck him dead. \n Herr Korbes must have been a very " + adjective2 + " man.");     
    }
}