//Reprise

//This class is responsible for the word-bag logic. It will set up a random word for the user to guess based
//on the difficulty they chose in the begining before pressing "start Game" button. each bag has 25 words.

package guessTheWord;
import java.util.Random;


public class DifferentWords {
    //GLOBALS
    String guessMe;
    int count = 0;

    //This is the "EASY" difficulty, random word generator
    public String wussLevel(){
        guessMe = "";
        int randomNumber;
        Random randomGenerator = new Random();

        String[] wussWord= new String[] {"whale","joy", "spirit","court","trees","dream","dozen","mouse","cinema","book",
                                         "pond","moon","stars","elbow","nurse","belief","peace","farmer","garden","love",
                                         "ocean","watch","school","beach","money","gravy","burst","cuddle","bug"};

        randomNumber = randomGenerator.nextInt(wussWord.length); // all 25 entries. 
        guessMe = wussWord[randomNumber];
        System.out.println("Number: " + randomNumber);

        return guessMe;
    }
    //This is the "MEDIUM" difficulty, random word generator
    public String aightLevel(){
        guessMe = "";
        int randomNumber;
        Random randomGenerator = new Random();

        String[] aightWord= new String[] {"centipede","continent","chocolate","rectangle","population","sandwich","exciting","philosopher","dishonest","equipment",
                                         "generous","confusion","friendship","airplane","strawberry","information","confused","landscape","staircase","zipper",
                                         "automobile","technician","arpeggio","acceleration","mountain", "accessories"};

        randomNumber = randomGenerator.nextInt(aightWord.length);
        guessMe = aightWord[randomNumber];
        System.out.println("Number: " + randomNumber);

        return guessMe;
    }
    //This is the "HARD" difficulty, random word generator
    public String veteranLevel(){
        guessMe = "";
        int randomNumber;
        Random randomGenerator = new Random();

        String[] veteranWord= new String[] {"vociferous","extrapolate","tertiary","vicarious","ferrous","animosity","elucidate","phenomenon","bellicose","indictment",
                                         "sphynx","idiosyncrasy","aphorism","hermeneutic","pernicious","epistemology","dietetic","deprecate","sojourn","assent",
                                         "verdict","congenial","inculcate","zephyr","uxorious","trapezoid","encyclopedia"};

        randomNumber = randomGenerator.nextInt(veteranWord.length);
        guessMe = veteranWord[randomNumber];
        System.out.println("Number: " + randomNumber);

        return guessMe;
    }
    //is the letter there?
    public boolean isRightLetter(char letter){
        boolean isCorrectLetter;
        String sLetter = String.valueOf(letter); //converted char to string.

        isCorrectLetter = guessMe.contains(sLetter);

        //Send to console to see the result, the user will see it on their screen another way.
        System.out.print("Entered Letter: " + letter + " - ");
        if (isCorrectLetter){
            System.out.print("EXISTS\n");
        }
        else
            System.out.println("ABSENT");

        return isCorrectLetter;
    }
}
