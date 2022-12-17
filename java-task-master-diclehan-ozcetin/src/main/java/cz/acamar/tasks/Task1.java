package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        str=str.trim();
        String result=str;
        // Because of no explanation about the case below: I assume that if there is no whitespace input
        // itself is the first word is also the last word itself. So if there is no whitespace,
        // last word become the str itself.
        int requestedIndex=str.lastIndexOf(' ');
        if(requestedIndex >= 0){
            result=str.substring(requestedIndex+1);
        }
        return result.length();
    }
}
