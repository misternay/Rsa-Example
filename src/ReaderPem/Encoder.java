package ReaderPem;

import java.io.IOException;
import java.io.OutputStream;

public interface Encoder {
    int decode(String var1, OutputStream var2) throws IOException;
}