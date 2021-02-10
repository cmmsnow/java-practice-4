package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    /**
     * created method to add additional element to end of array
     */
    public static String[] addElement(String[] array, String string){
        String[] newArray = new String[array.length + 1];
        for (int i=0; i<array.length; i++){ //for loop adding each element of array to newArray
            newArray[i] = array[i];
        }
        newArray[array.length] = string; //add string to end of array
        return newArray;
    }

    /**
     * created method to find if element already exists in array
     */
    public static Boolean elementExists(String[] array, String string){
        for (int i=0; i< array.length; i++){
            if (array[i].equals(string)){ return true; }
        }
        return false;
    }

    public static String[] getAllSubstrings(String string) {
        String[] answer = new String[0];
        for (int i=0; i<string.length(); i++){
            String sub = "";
            for (int j=i; j<string.length(); j++){
                sub = sub + String.valueOf(string.charAt(j));
                if (!elementExists(answer, sub)){ answer = addElement(answer, sub); }
            }
        }
        return answer;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] subs1 = getAllSubstrings(string1);
        String[] subs2 = getAllSubstrings(string2);
        String[] answer = new String[0];
        for (int i=0; i<subs1.length; i++){
            for (int j=0; j< subs2.length; j++){
                if (subs1[i].equals(subs2[j]) && (!elementExists(answer, subs1[i]))){
                    answer = addElement(answer, subs1[i]);
                }
            }
        }
        return answer;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
