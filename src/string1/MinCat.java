package string1;

public class MinCat {
    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int minLen = Math.min(lenA, lenB);

        String newA = a.substring(lenA - minLen);
        String newB = b.substring(lenB - minLen);

        return newA + newB;
    }
}
