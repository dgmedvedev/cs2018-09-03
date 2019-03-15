package lesson14.task14_2_copy;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
// https://j4web.ru/java-io/generatsiya-kontrolnoj-summy-v-java.html

public abstract class CheckSum {

    private static final String ALGORITHM = "SHA-1";

    public static String setCheckSum(String directory) {

        StringBuilder sb = new StringBuilder();

        try {
            // Получаем контрольную сумму для файла в виде массива байт
            final MessageDigest md = MessageDigest.getInstance(ALGORITHM);
            final FileInputStream fis = new FileInputStream(directory);
            byte[] dataBytes = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(dataBytes)) > 0) {
                md.update(dataBytes, 0, bytesRead);
            }
            byte[] mdBytes = md.digest();

            // Переводим контрольную сумму в виде массива байт в
            // шестнадцатеричное представление

            for (byte mdByte : mdBytes) {
                sb.append(Integer.toString((mdByte & 0xff) + 0x100, 16)
                        .substring(1));
            }

        } catch (NoSuchAlgorithmException | IOException ex) {
            Logger.getLogger(CheckSum.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }
}