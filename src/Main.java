public class Main {

    public static void main(String[] args) {
        try {
            String painText = "4732562010002893";
            Encrypt encrypt = new Encrypt();
            System.out.println(encrypt.encryptRsa(painText));

            String text = "Mf6z4rBuP6ti/07LGUWGgItsFjnme8q/UYXc6rd/gJ6diDYPFM4JqCipsKihWk7A0YkiRT90j1WKr/cC0cdwDkBQNIlYzxT5PD608Xm9cT5xeriXZFXpRQa14ZHcOqwu0j4jdyZgxZ+LAtTndXv78hILQxhOFlot8U6UGzCxgeSz8tuW57Id+0fYBY93rTHo31Y2CuFYvXny6kivxcluIOE8UYj9UXfkoWRiFrg9j0vyAwtdoyWP2wsAILit8tvzBCbOu5QBKrBJP8BL71b3DJz9S5CHBn1Ab4eFChE1du7ZVqlawyWtKEbjbHwedX7+8nGFR4ZrWVZr9RJn3xsarQ==";
            Decrypt decrypt = new Decrypt();
            System.out.println(decrypt.getDecryptString(text));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
