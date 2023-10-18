package com.example.supercoding.Subject_week5Day2;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptionExample {
    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "src/main/java/com/example/supercoding/Subject_week5Day2/decrypted_abc.txt";
        String decryptedOutputFilePath = "src/main/java/com/example/supercoding/Subject_week5Day2/encrypted_abc.txt";

        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";

        // TODO: 위 정보를 이용해서 "encryptedOutputFilePath" 파일을 읽고 복호화 하영합니다.

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(PW);
        encryptor.setAlgorithm(ALGORITHM);
        encryptor.setSaltGenerator(new StringFixedSaltGenerator(SALT_GENERATOR));
        String txt = encryptor.decrypt(readTextFile(encryptedOutputFilePath));
        System.out.println("Decryption completed successfully." + txt);
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
