public class BinaryStringsNoConsecutive1 {
    public static void generate(String str, int n) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        generate(str + "0", n - 1);

        if (str.isEmpty() || str.charAt(str.length() - 1) != '1') {
            generate(str + "1", n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generate("", n);
    }
}
