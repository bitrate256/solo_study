package encryption_RSA_algo;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class TestRSA_4_signature {

	public static void main(String[] args) {
		/* server code */
		/* Key 발급 */
		PublicKey publicKey = null; // 공개키
		PrivateKey privateKey = null; // 개인키

		SecureRandom secureRandom = new SecureRandom(); // random number generator(RNG)

		try {
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA"); // RSA(1024, 2048),
																						// DiffieHellman(1024)
			keyPairGenerator.initialize(1024, secureRandom);
			KeyPair keyPair = keyPairGenerator.generateKeyPair(); // generate key pair

			publicKey = keyPair.getPublic();
			privateKey = keyPair.getPrivate();

			System.out.println(publicKey.getAlgorithm());
			System.out.println("\n 공개키 표준 : " + publicKey.getFormat()); // 공개키 표준
			System.out.println("공개키 정보 : " + publicKey.toString());

			System.out.println();

			System.out.println(privateKey.getAlgorithm());
			System.out.println("\n 개인키 표준 : " + privateKey.getFormat()); // 개인키 표준
			System.out.println("공개키 정보 : " + privateKey.toString());

			String publicKeyStr = Base64.getEncoder().encodeToString(publicKey.getEncoded()); // Base64 인코딩
			String privateKeyStr = Base64.getEncoder().encodeToString(privateKey.getEncoded()); // Base64 인코딩
			System.out.println(privateKeyStr);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		/* 키발급 종료 */
		System.out.println("\n +++++ 키 발급 종료 +++++");

		/* client code */
		String plainText = "hello world!";
		String encryptedText = "";
		String decryptedText = "";

		try {
			Cipher cipher = Cipher.getInstance("RSA");

			// 개인키 이용 전자서명
			cipher.init(Cipher.ENCRYPT_MODE, privateKey);
			encryptedText = Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes()));
			System.out.println("**** 암호문 ****");
			System.out.println(encryptedText);
			System.out.println("**** 해독문 ****");
			cipher.init(Cipher.DECRYPT_MODE, publicKey);

			// 공개키 이용 복호화
			decryptedText = new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText.getBytes())));
			System.out.println(decryptedText);

		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
				| BadPaddingException e) {
			e.printStackTrace();
		}

	}
}