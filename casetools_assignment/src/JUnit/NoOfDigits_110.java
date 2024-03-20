package JUnit;

public class NoOfDigits_110 {
	public static int countDigits(int number) {
        if (number == 0) {
            return 1; // 0 has one digit
        }
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    } 

}
