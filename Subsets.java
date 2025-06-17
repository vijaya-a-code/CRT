public class Subsets{
    static void generate(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        generate(input.substring(1), output);               // exclude
        generate(input.substring(1), output + input.charAt(0)); // include
    }

    public static void main(String[] args) {
        generate("abc", "");
    }
}
