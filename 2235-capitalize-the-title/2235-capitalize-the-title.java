class Solution {
    public String capitalizeTitle(String title) {
        // Convert the entire title to lowercase
        title = title.toLowerCase();
        
        // Split the title into words
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            // Capitalize the first letter if the word length is greater than 2
            if (word.length() > 2) {
                sb.append(Character.toUpperCase(word.charAt(0))); // Capitalize first letter
                sb.append(word.substring(1)); // Append the rest of the word
            } else {
                sb.append(word); // Keep the word in lowercase
            }
            sb.append(" "); // Add a space after each word
        }
        
        // Remove the trailing space and return
        return sb.toString().trim();
    }
}