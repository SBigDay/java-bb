package com.program.shop.DES;


import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class DES {
    public static final String PASSWORD_CRYPT_KEY = "CSHAPPJM";
    private static byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };


    public static String encryptDES(String encryptString, String encryptKey)
            throws Exception {
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
        byte[] encryptedData = cipher.doFinal(encryptString.getBytes());
        return Base64.encode(encryptedData);
    }
    /**
     * des加密
     */
    public static String encrypt(String encryptString) {
        String s = "";
        try {
            s = encryptDES(encryptString, PASSWORD_CRYPT_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    /**
     * des加密
     */
    public static String encrypt(String encryptString, String encryptKey) {
        String s = "";
        try {
            s = encryptDES(encryptString, encryptKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    /**
     * des解密
     */
    public static String decrypt(String decryptString) {
        String s = "";
        try {
            s = decryptDES(decryptString, PASSWORD_CRYPT_KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String decryptDES(String decryptString, String decryptKey)
            throws Exception {
        byte[] byteMi = Base64.decode(decryptString);
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
        byte decryptedData[] = cipher.doFinal(byteMi);
        return new String(decryptedData);
    }
    public static String urlEncrypt (String encryptStr){
        String result = "";
        try {
            result = URLEncoder.encode(encryptStr,"UTF-8");
            result = DES.encrypt(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isBlank(result) ? encryptStr : result;
    }

    public static String urlDecrypt (String decryptStr){
        String result = "";
        try {
            result = DES.decrypt(decryptStr);
            result = URLDecoder.decode(result,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isBlank(result) ? decryptStr : result;
    }
    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isBlank(String str) {
        return (str == null || str.trim().length() == 0 || str.trim()
                .equals(""));
    }

    public static String decryptDESFormat(String decryptString, String decryptKey)
            throws Exception {
        byte[] byteMi = Base64.decode(decryptString);
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
        byte decryptedData[] = cipher.doFinal(byteMi);
        return new String(decryptedData,"UTF-8");
    }

    public static void main(String[]args) throws Exception{
        System.out.println("解密后：" + DES.decryptDES("59GfmazEYIV2Fa7HwImrLg==", DES.PASSWORD_CRYPT_KEY));
    }
}
