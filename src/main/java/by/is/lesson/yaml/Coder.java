package by.is.lesson.yaml;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;

public class Coder {

    private static final String KEY = "ITX02018VSER1986";
    private static final String AES = "AES";

    /**
     * Method encrypting input pass
     *
     * @param pass password
     * @return string with encrypted pass
     * @throws Exception when have trouble with encoding
     */
    public static String encrypto(String pass) throws Exception {
        Key aesKey = new SecretKeySpec(KEY.getBytes(), AES);
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);
        return Hex.encodeHexString(cipher.doFinal(pass.getBytes(StandardCharsets.UTF_8)));
    }

    /**
     * Method decrypting input string
     *
     * @param hex encoded string
     * @return string with pass
     */
    public static String decrypto(String hex) {
        try {
            Key aesKey = new SecretKeySpec(KEY.getBytes(), AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            return new String(cipher.doFinal(Hex.decodeHex(hex)), StandardCharsets.UTF_8);
        } catch (Exception e){
            throw new RuntimeException("Error of decrypto");
        }
    }

}
