package encryption_RSA_algo;

import java.security.*;

public class TestRSA_5_signature {
	public static void main(String[] args) throws Exception {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		SecureRandom random = new SecureRandom();
		kpg.initialize(1024, random);
		KeyPair keyPair = kpg.genKeyPair();
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();
		byte[] pubk = publicKey.getEncoded();
		byte[] prik = privateKey.getEncoded();

		System.out.println("\n\nRSA key generation ");
		System.out.print("\nPublic Key : ");
		for (byte b : pubk)
			System.out.printf("%02X ", b);
		System.out.println("\nPublic Key Length : " + pubk.length + " byte");
		System.out.print("\nPrivate Key : ");
		for (byte b : prik)
			System.out.printf("%02X ", b);
		System.out.println("\nPrivate Key Length : " + prik.length + " byte");

		String sigData = "전자서명 테스트";
		byte[] data = sigData.getBytes("UTF8");
		System.out.print("\nPlaintext : " + sigData + "\n");

		// -----------------------------------------
		System.out.println("\n\nMD5WithRSA");
		Signature sig = Signature.getInstance("MD5WithRSA");
		sig.initSign(keyPair.getPrivate());
		sig.update(data);
		byte[] signatureBytes = sig.sign();
		System.out.print("\nSingature: ");
		for (byte b : signatureBytes)
			System.out.printf("%02X ", b);
		System.out.print("\nSingature length: " + signatureBytes.length * 8 + " bits");

		sig.initVerify(keyPair.getPublic());
		sig.update(data);
		System.out.print("\nVerification: ");
		System.out.print(sig.verify(signatureBytes));

		// -----------------------------------------
		System.out.println("\n\nSHA1WithRSA");
		Signature sig1 = Signature.getInstance("SHA1WithRSA");
		sig1.initSign(keyPair.getPrivate());
		sig1.update(data);
		byte[] signatureBytes1 = sig1.sign();
		System.out.print("\nSingature: ");
		for (byte b : signatureBytes1)
			System.out.printf("%02X ", b);
		System.out.print("\nSingature length: " + signatureBytes1.length * 8 + " bits");

		sig1.initVerify(keyPair.getPublic());
		sig1.update(data);
		System.out.print("\nVerification: ");
		System.out.print(sig1.verify(signatureBytes1));

		// -----------------------------------------
		System.out.println("\n\nSHA512WithRSA");
		Signature sig2 = Signature.getInstance("SHA512WithRSA");
		sig2.initSign(keyPair.getPrivate());
		sig2.update(data);
		byte[] signatureBytes2 = sig2.sign();
		System.out.print("\nSingature: ");
		for (byte b : signatureBytes2)
			System.out.printf("%02X ", b);
		System.out.print("\nSingature length: " + signatureBytes2.length * 8 + " bits");

		sig2.initVerify(keyPair.getPublic());
		sig2.update(data);
		System.out.print("\nVerification: ");
		System.out.print(sig2.verify(signatureBytes2));

		// -----------------------------------------
		KeyPairGenerator kpg1 = KeyPairGenerator.getInstance("EC");
		kpg1.initialize(160, random);
		KeyPair keyPair1 = kpg1.genKeyPair();
		PublicKey publicKey1 = keyPair1.getPublic();
		PrivateKey privateKey1 = keyPair1.getPrivate();
		byte[] pubk1 = publicKey1.getEncoded();
		byte[] prik1 = privateKey1.getEncoded();

		System.out.println("\n\nEC key generation ");
		System.out.print("\nPublic Key : ");
		for (byte b : pubk1)
			System.out.printf("%02X ", b);
		System.out.println("\nPublic Key Length : " + pubk1.length + " byte");
		System.out.print("\nPrivate Key : ");
		for (byte b : prik1)
			System.out.printf("%02X ", b);
		System.out.println("\nPrivate Key Length : " + prik1.length + " byte");

		System.out.println("\n\nSHA1withECDSA");
		Signature sig3 = Signature.getInstance("SHA1withECDSA");
		sig3.initSign(keyPair1.getPrivate());
		sig3.update(data);
		byte[] signatureBytes3 = sig3.sign();
		System.out.print("\nSingature: ");
		for (byte b : signatureBytes3)
			System.out.printf("%02X ", b);
		System.out.print("\nSingature length: " + signatureBytes3.length * 8 + " bits");

		sig3.initVerify(keyPair1.getPublic());
		sig3.update(data);
		System.out.print("\nVerification: ");
		System.out.print(sig3.verify(signatureBytes3));

	}
}