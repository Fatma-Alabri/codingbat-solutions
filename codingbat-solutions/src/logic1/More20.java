package logic1;

public class More20 {
    public boolean more20(int n) {
        int remainder = n % 20;
        return (remainder == 1) || (remainder == 2);
    }
}
