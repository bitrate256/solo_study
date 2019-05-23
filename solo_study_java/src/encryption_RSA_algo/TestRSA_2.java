package encryption_RSA_algo;

import java.security.*;
import javax.crypto.*;
import java.util.*;

public class TestRSA_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        KeyPair keyPair = generator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();    
       
        System.out.println("\n=== RSA 키생성 ===");
        byte[] pubk = publicKey.getEncoded();
        byte[] prik = privateKey.getEncoded();
        System.out.print("\n Public Key : ");
        for(byte b: pubk) System.out.printf("%02X ", b);
        System.out.println("\n Public Key Length : "+pubk.length+ " byte" );      
        System.out.print("\n Private Key : ");
        for(byte b: prik) System.out.printf("%02X ", b);
        System.out.println("\n Private Key Length : "+prik.length+ " byte" );
      
        System.out.println("\n=== RSA 암호화 ===");
        Scanner s = new Scanner(System.in);
        System.out.print("암호화할 평문을 입력해주세요... = ");
        String text = s.next(); 
        byte[] t0 = text.getBytes();
        System.out.print("\n Plaintext : "+text+"\n");
        for(byte b: t0) System.out.printf("%02X ", b);
        System.out.println("\n Plaintext Length : "+t0.length+ " byte" );  
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] b0 = cipher.doFinal(t0);
        System.out.print("\n\n Ciphertext : ");
        for(byte b: b0) System.out.printf("%02X ", b);
        System.out.println("\n Ciphertext Length : "+b0.length+ " byte" ); 
        System.out.println("=== RSA 복호화 ===");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] b1 = cipher.doFinal(b0);
        System.out.print("\n Recovered Plaintext : "+ new String(b1) +"\n");
        for(byte b: b1) System.out.printf("%02X ", b);
        System.out.println("\n Recovered Plaintext Length : "+b1.length+ " byte" );     
       
    }
}