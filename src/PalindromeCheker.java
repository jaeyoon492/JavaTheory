public class PalindromeCheker {
    boolean checkPalindrome(String inputString) {
        int result = 0;
        boolean torf = false;
        for (int i = 0, j = inputString.length() - 1; i < inputString.length() / 2; i++, j--) {
            if (inputString.charAt(i) == inputString.charAt(j)) {
                result++;
            }
        }
        if (result == inputString.length() / 2) {
            torf = true;
        }
        return torf;
    }

    public static void main(String[] args) {
        PalindromeCheker palindromeCheker = new PalindromeCheker();
        boolean result = palindromeCheker.checkPalindrome("aaaanabaa");
        System.out.println(result);
    }
}
