 class ReverseString {
    public static void main(String[] args) {
        String input = "seaside the to sent be to ne2ds army ten of team a goodbye";
        String modified = modifyString(input, "goodbye", "good2ye");
        String reversed = reverseString(modified);
        System.out.println(reversed);
    }

    public static String modifyString(String str, String target, String replacement) {
        return str.replaceAll(target, replacement);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sb.append(word.reverse()).append(" ");
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }

        sb.append(word.reverse());

        return sb.toString();
    }
}
