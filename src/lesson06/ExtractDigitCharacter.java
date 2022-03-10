package lesson06;

public class ExtractDigitCharacter {
    public static void main(String[] args) {
        String myString = "100 minutes 12";
        String myDigitCharacter = "";
        char[] myStringCharacter = myString.toCharArray();
        for (char character : myStringCharacter) {
            if (Character.isDigit(character)){
                myDigitCharacter = myDigitCharacter.concat(String.valueOf(character));
            }
        }

        System.out.println("My digit character is: " + myDigitCharacter);
    }
}
