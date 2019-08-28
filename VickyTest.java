/*
 * Make a program that creates an object: 'Vicky' which conatins and accepts strings
 * and stores them in an ArrayList. Also checks to make sure the input string
 * has not be previously been entered and that it does not contain non-letters. 
 *
 * @author Stewart
 * @version JAVA 8, 7/22/2019
 */

public class VickyTest {
    public static void main(String[] args){
        Vicky vic = new Vicky();
        vic.learnWord("Horse").learnWord("table").learnWord("fork").learnWord("horse");
        vic.learnWord("sun").learnWord("123").learnWord("Hi!").showVickyWords();
    }
}
