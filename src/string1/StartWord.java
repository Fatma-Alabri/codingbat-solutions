package string1;

public class StartWord {
    public String startWord(String str, String word) {
        int len = word.length();

        if (str.length() < len) {
            return "";
        }

        String strSub = str.substring(1, len);
        String wordSub = word.substring(1);

        if (strSub.equals(wordSub)) {
            return str.substring(0, len);
        }

        return "";
    }
}
