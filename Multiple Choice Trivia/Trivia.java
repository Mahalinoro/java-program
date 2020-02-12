// Author: Mahalinoro Razafimanjato

// Importing Scanner for user input
import java.util.Scanner;

// Main class

class Main{
    public static void main(String[] args){

        // Creating scanner object in order to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = scanner.next(); // Get user input

        // Welcome Menu
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                 Welcome to Multiple Choice Trivia, "+ name + "!                ");
        System.out.println("                      You will have to answer 10 questions.                     ");
        System.out.println("If you get the correct answer in less than 2 seconds, you will get EXTRA 5 POINTS");
        System.out.println("                           Good Luck, " + name + "!                              ");
        System.out.println("-------------------------------------------------------------------------------- ");
      
        // Calling triviaQuestions method
        triviaQuestions();
        // Closing scanner object to avoid resource leak
        scanner.close();
    }

    // triviaQuestions that contains the 10 questions and the scoring system
    public static void triviaQuestions(){
        Scanner scanner = new Scanner(System.in); // scanner object for input

        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------");

        int score = 0; // initializing score variable to store the score during each round
        // Question 1
        System.out.println("First Question: ");
        System.out.println("What year was the very first model of the iPhone released?");
        System.out.println("a. 2007              b. 2009");
        System.out.println("Your answer [a or b]: ");
        long start = System.currentTimeMillis(); // Start timer in millisecond
        String answerFirst = scanner.nextLine();
        long end = System.currentTimeMillis(); // End timer in millisecond
        float sec = (end - start) / 1000F; // Calculate the timelapse between start and end time, then convert it seconds
        if (answerFirst.equals("a")) {
            System.out.println("Are you a genius? Correct!");
            score += 5; // correct anser +5 point added to score
            if (sec < 3.0){
                score += 5; // answer in less than 3 added bonus point
            }
        }
        else{
            System.out.println("You can do better on the next question!");
        }
        
        // Same principle for each question: time, extra points
        // Question 2
        System.out.println("");
        System.out.println("Second Question: ");
        System.out.println("What’s the shortcut for the “copy” function on most computers?");
        System.out.println("a. ctrl c              b. ctrl x");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerSecond = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerSecond.equals("a")) {
            System.out.println("Correct! You get it right. Keep it up!");
            score += 10;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("Don't give up, you still have 8 questions left!");
        }

        // Question 3
        System.out.println("");
        System.out.println("Third Question: ");
        System.out.println("What does “HTTP” stand for?");
        System.out.println("a. HyperText Transfer Protocol   b. Hello To The Planet");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerThird = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerThird.equals("a")) {
            System.out.println("You are right! Keep Going!");
            score += 15;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("Wrong answer, you can do better!");
        }

        // Question 4
        System.out.println("");
        System.out.println("Fourth Question: ");
        System.out.println("What is the name of the man who launched eBay back in 1995?");
        System.out.println("a. Pierre Omidyar               b. Alexander Jones");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerFourth = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerFourth.equals("a")) {
            System.out.println("Yayyy! Correct!");
            score += 20;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("Sorry, it's wrong!");
        }

        // Question 5
        System.out.println("");
        System.out.println("Filth Question: ");
        System.out.println("What is often seen as the smallest unit of memory?");
        System.out.println("a. gigabyte                     b. kilobyte");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerFilth = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerFilth.equals("b")) {
            System.out.println("Hurray! Keep it up!");
            score += 25;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("Wrong guess, continue your efforts!");
        }
    
        // Question 6
        System.out.println("");
        System.out.println("Sixth Question: ");
        System.out.println("Which email service is owned by Microsoft?");
        System.out.println("a. Yahoo                   b. Hotmail");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerSixth = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerSixth.equals("b")) {
            System.out.println("Correct!");
            score += 30;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("You can do better on the next question!");
        }

        // Question 7
        System.out.println("");
        System.out.println("Seventh Question: ");
        System.out.println("Google Chrome, Safari, Firefox and Explorer are different types of what?");
        System.out.println("a. Web browser                     b. Search Engine");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerSeventh = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerSeventh.equals("a")) {
            System.out.println("Right answer! Good!");
            score += 35;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("Sorry, wrong answer");
        }

        // Question 8
        System.out.println("");
        System.out.println("Eighth Question: ");
        System.out.println("Is Java a type of OS?");
        System.out.println("a. yes          b. no");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerEighth = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerEighth.equals("b")) {
            System.out.println("Cool, you are right!");
            score += 40;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("Wrong answer!");
        }

        // Question 9
        System.out.println("");
        System.out.println("Nineth Question: ");
        System.out.println("Who is often called the father of the computer?");
        System.out.println("a. Charles Babage   b. Linus Torvald");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerNineth = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerNineth.equals("a")) {
            System.out.println("Trivia King or Queen? Keep it up!");
            score += 45;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("You can do better on the next question!");
        }

        // Question 10
        System.out.println("");
        System.out.println("Tenth Question: ");
        System.out.println("What was Twitter’s original name?");
        System.out.println("a. tinker   b. twttr");
        System.out.println("Your answer [a or b]: ");
        start = System.currentTimeMillis();
        String answerTenth = scanner.nextLine();
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
        if (answerTenth.equals("b")) {
            System.out.println("Nice! Correct answer!");
            score += 50;
            if (sec < 3.0){
                score += 5;
            }
        }
        else{
            System.out.println("You can guess better next time");
        }

        // End of the Trivia
        // Displaying the result 
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("Your final score: " + score);
        if (score < 137){
            System.out.println("You still have to improve!"); // if it is less than 137 which is the half of the total score
        }
        else{
            System.out.println("Good Job!");
        }
        System.out.println("--------------------------");

        tryAgain();      // Calling the method tryAgain
        scanner.close();          
    }

    // tryAgain method asking users if they want to play again or not
    // If they want to play, the trivia will start again
    // If not, the game will end
    public static void tryAgain(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to play again?");
        System.out.println("Type yes or no: ");
        String choice = scanner.nextLine();
        if (choice.equals("yes")) {
            triviaQuestions();
        }else{
            System.out.println("Thanks for playing! Enjoy your day");
        }
        scanner.close();
    }
    
}


