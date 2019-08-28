import java.util.ArrayList;

public class Vicky {
    /* Private Attributes */
    private ArrayList<String> arr = new ArrayList();

    /* Constructor */
    public Vicky(){ }

    /**
     * Method: learnWord
     * takes a string and checks to make sure it is only made of letters, then 
     * checks if the string is present in 'arr'. If it is not, this new string is
     * added to 'arr'
     */
    public Vicky learnWord(String str){
        /*
         * Splits 'str' if it contains any spaces, symbols, or numbers. If there
         * are, 'str' is invalid and it can be checked by checking the length of
         * 'parts'. If the length of 'parts' is anything other than 0, then 'str'
         * must be invalid.
         */
        String[] parts = str.split("\\s+|\\W|\\d+", -1);

        /*
         * If 'parts' has a length greater than 1, this would mean that split()
         * found a character that is not a letter and 'str' is rejected
         */
        if(parts.length > 1){
            System.out.println("I do not understand this word: \"" + str + "\".");
        } else {
            /* Runs toLowerCase() on 'str' and assigns the new value to 'word' */
            String word = str.toLowerCase();
            /*
             * 'word' is a valid string and it is checked against the contents
             * of the already collected strings in 'arr' if a match is found it will
             * be reported a duplicate and not be added to 'arr'
             */
            if(arr.contains(word)){
                System.out.println("I already know the word: \"" + word + "\".");
            } else {
                /*
                 * 'word' is both a valid string and was not found in 'arr' so
                 * it is added to 'arr' and reported to the user a accepted.
                 */
                arr.add(word);
                System.out.println("Thank you for teaching me: \"" + word + "\".");
            }
        }
        /* Returns this instance of 'Vicky' so that methods can be chained together */
        return this;
    }

    /**
     * Method: showVickyWords
     * prints for the user a list of all words contained in 'arr'
     */
    public Vicky showVickyWords(){
        System.out.println("\nVicky's Vocabulary: ");
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        /* Returns this instance of 'Vicky' so that methods can be chained together */
        return this;
    }
}
