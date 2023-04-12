public class Main {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        string.append("a");
        string.append(", ");
        string.append("b");
        string.append(", ");
        string.setLength(string.length() - 2);
//        String newString = string.substring(0, string.length() - 2);
        System.out.println(string);
    }
}
