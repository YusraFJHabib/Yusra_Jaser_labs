public class Yusra_Jaser_ThreeLetterAcronym {

    public static void main(String[] args) {
        System.out.println("Enter three words:");

        String input = "";
        // Check if console is available
        if (System.console() != null) {
            input = System.console().readLine().toUpperCase();
        } else {
            System.err.println("Console is not available.");
            return;
        }

        // Extract the first letter of each word
        StringBuilder acronym = new StringBuilder();
        for (String word : input.split("\\s+")) {
            acronym.append(word.charAt(0));
        }

        // Display the acronym
        System.out.println("The acronym is: " + acronym);
    }
}
