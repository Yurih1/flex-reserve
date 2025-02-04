/**
 * @author Yuri Santos
 * @since 04-02-2025
 * @version 1.0
 * Helper class to handle encrypted data.
 */
package br.com.flexreserve.flex_reserve.utils;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class encryptionUtil {


    private static SecretKey generatorKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        return keyGenerator.generateKey();
    }

    /**
     * Method to encrypt information
     */
    public static String encrypt(String data, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] dataEncrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(dataEncrypted); // Encodes to Base64
    }

    /**
     * Reverse engineering the encrypt method
     */
    public static String decrypt(String dataEncrypted, String key) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] dataDecoded = Base64.getDecoder().decode(dataEncrypted);
        byte[] dataDecrypted = cipher.doFinal(dataDecoded);
        return new String(dataDecrypted);
    }
}
