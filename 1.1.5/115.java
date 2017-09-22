
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you provide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this method (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();
        // generate a sciFi name
        firstName = firstName.substring(0,3);
        lastName = lastName.substring(0,2);
        String scifiFirstName = firstName + lastName;
        
        city = city.substring(0,2);
        school = school.substring(0,3);
        String scifiLastName = city + school;
        
        int lengthR1 = relativeName1.length() -1;
        int randomR1 = (int)(Math.random() * lengthR1) + 1;
        
        int lengthR2 = relativeName2.length() -1;
        int randomR2 = (int)(Math.random() * lengthR2) + 1;
        
        relativeName1 = relativeName1.substring(randomR1);
        relativeName2 = relativeName2.substring(randomR2);
        
        String scifiPlaceOfOrigin = relativeName1 + relativeName2;
        
        scifiFirstName = scifiFirstName.toLowerCase();
        scifiLastName = scifiLastName.toLowerCase();
        scifiPlaceOfOrigin = scifiPlaceOfOrigin.toLowerCase();
        
        String firstLetter = scifiFirstName.substring(0,1);
        scifiFirstName = firstLetter.toUpperCase() + scifiFirstName.substring(1);
        firstLetter = scifiLastName.substring(0,1);
        scifiLastName = firstLetter.toUpperCase() + scifiLastName.substring(1);
        firstLetter = scifiPlaceOfOrigin.substring(0,1);
        scifiPlaceOfOrigin = firstLetter.toUpperCase() + scifiPlaceOfOrigin.substring(1);
        
        System.out.println("Greetings " + scifiFirstName + " " + scifiLastName + " from planet " + scifiPlaceOfOrigin + " this way to our leader.");
        
        
        
    }
}
