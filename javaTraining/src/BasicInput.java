import java.io.IOException;

public class BasicInput {
    // didnt handle exceptions yet

    public static String readString() throws IOException {
        byte b[] = new byte[255];
        int length = System.in.read(b);
        byte bt[] = new byte[length - 1];
        System.arraycopy(b, 0, bt, 0, length - 1);

        String s = new String(bt);
        return s;
    }

    public static int readInteger() throws IOException {
        String s = readString();

        int i = Integer.parseInt(s);
        return i;
    }

    public static Float readFloat() throws IOException {
        String s = readString();
        Float f = Float.parseFloat(s);
        return f;
    }

}
