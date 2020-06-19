package by.is.lesson.yaml;

import org.apache.commons.codec.binary.Base64;

import java.util.Arrays;

/**
 * Utils for generating token by name and pass.
 */
public class TokenUtils {

    private static final String COLON = ":";
    private static final String BASIC = "Basic ";

    /**
     * Build token by name and pass.
     * Use a {@link Base64} library.
     *
     * @param name as String
     * @param pass as String
     * @return token in format "name:pass" as String
     */
    public static String get(String name, String pass) {
        String credentials = name + COLON + pass;
        return BASIC + Base64.encodeBase64String(credentials.getBytes());
    }

    public static String encoding(String token) {
//        Base64.getDecoder().decode(encodedString);
        return Arrays.toString(Base64.decodeBase64(token));
//        String credentials = name + COLON + pass;
//        return BASIC + Base64.encodeBase64String(credentials.getBytes());
    }
}
