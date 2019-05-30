package ReaderPem;

public class PemObject {
    private byte[] content;

    public PemObject(byte[] var3) {
        this.content = var3;
    }
    public byte[] getContent() {
        return this.content;
    }
}