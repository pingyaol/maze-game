import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random; // this is used to generate a random number

public class wrong extends Actor
{
    String binary;
    int decimal;
    boolean isTouched = false;
    
    public wrong()
    {
        // generating the random binary + wrong decimal number
        binary = randomBinaryNumber();
        decimal = binaryToDecimal(binary);
    }
    
    // returns a randomly generated 8-bit binary number (as a string)
  private String randomBinaryNumber() {
      Random rn = new Random();
      String binaryNumber = "";

      // picks either 1 or 0 to add to the binary number (repeats 8 times)
      for (int i = 0; i < 8; i++) {
        if (rn.nextBoolean()) {
          binaryNumber = binaryNumber.concat("1");
        } else {
          binaryNumber = binaryNumber.concat("0");
        }
      }

      return binaryNumber;
  }

  // converts a binary number (in string form) to a decimal number (in integer form)
  private int binaryToDecimal(String binary) {
    int decimal = 0;
    int digitValue = 128; // could be modified to be 2 ^ binary.length() - 1 if the binary numbers are decided to have random lengths

    // adds the appropriate value for each '1' in the binary digit to the decimal number
    for (int i = 0; i < binary.length(); i++) {
      if (binary.charAt(i) == '1') {
        decimal += digitValue + 1;
      }
      digitValue /= 2;
    }

    return decimal;
  }
  
  public void act() 
  { 
    // this throws an error if put in public badGuy(), so it has to be put here
    if (!isTouched) {
        getWorld().showText(binary + " = " + decimal, this.getX(), this.getY());
    }
  }   
  
  public void touchedHero()
    {
        isTouched = true;
        getWorld().showText("", this.getX(), this.getY());
    }
}

