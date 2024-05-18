import greenfoot.*;  
import java.util.Random;

public class BinaryConversionQuiz extends Actor
{
    private Random rn = new Random();
    private int score = 0;
    private int questionCount = 0;
    private String lastBinary;

    public BinaryConversionQuiz()
    {
        displayQuestion();
    }
    
    private void displayQuestion()
    {
        if (questionCount >= 10) {
            getWorld().showText("Quiz completed! Score: " + score + "/10", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
            return;
        }
        
        lastBinary = randomBinaryNumber();
        int decimal = binaryToDecimal(lastBinary);
        
        getWorld().showText("Convert binary: " + lastBinary + " to decimal.", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
    }
    
    private String randomBinaryNumber() {
        String binaryNumber = "";

        for (int i = 0; i < 8; i++) {
            if (rn.nextBoolean()) {
                binaryNumber = binaryNumber.concat("1");
            } else {
                binaryNumber = binaryNumber.concat("0");
            }
        }

        return binaryNumber;
    }

    private int binaryToDecimal(String binary) {
        int decimal = 0;
        int digitValue = 128;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += digitValue;
            }
            digitValue /= 2;
        }

        return decimal;
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            String answer = Greenfoot.ask("Enter your answer:");
            if (answer != null && !answer.isEmpty()) {
                int userAnswer = Integer.parseInt(answer);
                if (userAnswer == binaryToDecimal(lastBinary)) {
                    score++;
                }
                questionCount++;
                displayQuestion();
            }
        }
    }
}
