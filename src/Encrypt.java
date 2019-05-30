import ReaderPem.PemObject;
import ReaderPem.PemReader;

import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class Encrypt {

    public String encryptRsa(String painText) throws Exception{
        PublicKey publicKey = getPublicKey();

        Cipher cipher = Cipher.getInstance("RSA");

        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] cipherData = cipher.doFinal(painText.getBytes());

        return Base64.getEncoder().encodeToString(cipherData);
    }

    private static BufferedReader getPublicKeyFromPEMfile() throws IOException {
        return new BufferedReader(new FileReader("resources/publicKey.pem"));
    }

    private static PublicKey generatePublickeyFromPem(BufferedReader publicKeyPEM) throws IOException, GeneralSecurityException {
        PemReader pp = new PemReader(publicKeyPEM);
        PemObject pem = pp.readPemObject();
        byte[] content = pem.getContent();
        pp.close();

        X509EncodedKeySpec spec = new X509EncodedKeySpec(content);

        KeyFactory kf = KeyFactory.getInstance("RSA");

        return kf.generatePublic(spec);
    }

    private static PublicKey getPublicKey() throws IOException, GeneralSecurityException {
        BufferedReader publicKeyPEM = getPublicKeyFromPEMfile();
        return generatePublickeyFromPem(publicKeyPEM);
    }
}
