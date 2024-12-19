import java.util.StringTokenizer;

class Main {
    public static void splitIPAddress(String IP)
    {
       StringTokenizer tokenizer = new StringTokenizer(IP, ".");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
    public static void main(String[] args) {
        String IP = "192.0.2.1";
        splitIPAddress(IP);
 

    }
}
