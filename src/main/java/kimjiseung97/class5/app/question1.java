package kimjiseung97.class5.app;


public class question1 {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (result.length() > 0 && result.charAt(result.length() - 1) == currentChar) {
                // Remove the last character if it's the same as the current character
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "browoanoommnaon";
        String result = removeDuplicates(input);
        System.out.println(result);  // Output: "brown"
    }
}
