package encryption;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Scanner;

import javax.crypto.Cipher;
public class TestRSA {
    public static void main(String[] args) {
        try {
            //공개키 및 개인키 생성
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            //keyPairGenerator.initialize(2048);
            keyPairGenerator.initialize(4096);
            
            KeyPair keyPair = keyPairGenerator.genKeyPair();
            Key publicKey = keyPair.getPublic(); // 공개키
            Key privateKey = keyPair.getPrivate(); // 개인키
            
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            RSAPublicKeySpec publicKeySpec = keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
            RSAPrivateKeySpec privateKeySpec = keyFactory.getKeySpec(privateKey, RSAPrivateKeySpec.class);
            System.out.print(" +++++ 키 생성 +++++");
            System.out.println("\n public key modulus(공개키)(" + publicKeySpec.getModulus() + ") exponent(" + publicKeySpec.getPublicExponent() + ")");
            System.out.println("\n private key modulus(개인키)(" + privateKeySpec.getModulus() + ") exponent(" + privateKeySpec.getPrivateExponent() + ")");
            
            // 암호화(Encryption) 예제
            Scanner s = new Scanner(System.in);
            System.out.print("\n 암호화할 평문을 입력해주세요 : ");
            String text = s.nextLine();
            s.close();
            System.out.print("\n 입력된 평문 : "+text+"\n");
            String inputStr = text; // "평문"을 암호화한다!
            
            /*String inputStr = "Thunderbolts and lightning very very frightening me! Galileo, Galileo, Galileo, Galileo, Galileo, Figaro~";
            System.out.print("\n 입력된 평문 : "+inputStr);*/
            
            System.out.print("\n +++++ 암호화 +++++");
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] arrCipherData = cipher.doFinal(inputStr.getBytes()); // 암호화된 데이터(byte 배열)
            String strCipher = new String(arrCipherData);
            
            System.out.print("\n 공개키를 통해 평문을 암호화 합니다. 이로써 서비스 제공자는 동일한 키로 개인에게 암호화를 제공합니다.");
            System.out.println("\n\n 평문을 암호화 한 결과 : "+strCipher); // 암호화 결과물 출력(눈으로 보이기에는 깨질 수 있음)
            
            // 복호화(Decryption) 예제
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] arrData = cipher.doFinal(arrCipherData);
            String strResult = new String(arrData);
            System.out.print("\n 개인키를 통해 평문을 복보화 합니다. 이로써 해당되는 개인만 본인의 평문을 확인할 수 있습니다.");
            System.out.println("\n\n 다시 평문으로 복보화한 결과 : "+strResult); // 복호화 결과물 출력(다시 "평문"이 출력됨)
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}