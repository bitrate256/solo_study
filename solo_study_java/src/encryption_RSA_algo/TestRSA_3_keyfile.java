package encryption_RSA_algo;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Formatter;
public class TestRSA_3_keyfile {
       public static void main(String[] args) throws Exception {
              
              // 키쌍 생성  
              KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
              kpg.initialize(1024);
              KeyPair keyPair = kpg.genKeyPair();
              PublicKey pubKey = keyPair.getPublic();
              PrivateKey privKey = keyPair.getPrivate();             
              byte[] publicKeyBytes = pubKey.getEncoded();
              byte[] privateKeyBytes = privKey.getEncoded();
              System.out.println("공개키 : "+bytesToHex(publicKeyBytes));
              System.out.println("개인키 : "+bytesToHex(privateKeyBytes)); 
                           
              // 키쌍을 파일로 저장
              String pubKeyFile = "pub.key";
              String privKeyFile = "priv.key";         
              FileOutputStream publicFos = new FileOutputStream(pubKeyFile);
              publicFos.write(pubKey.getEncoded());
              publicFos.close();         
              FileOutputStream privateFos = new FileOutputStream(privKeyFile);
              privateFos.write(privKey.getEncoded());
              privateFos.close();
              
              // 파일에서 읽어오기         
              FileInputStream publicFis = new FileInputStream(pubKeyFile);
              ByteArrayOutputStream pubKeyBaos = new ByteArrayOutputStream();
              int curByte = 0;
              while((curByte = publicFis.read())!=-1){
                 pubKeyBaos.write(curByte);
              }
              X509EncodedKeySpec pubKeySpec
                 = new X509EncodedKeySpec(pubKeyBaos.toByteArray());
              pubKeyBaos.close();
              
              FileInputStream privateFis = new FileInputStream(privKeyFile);
              ByteArrayOutputStream privKeyBaos = new ByteArrayOutputStream();
              int curByte1 = 0;
              while((curByte1 = privateFis.read())!=-1){
                 privKeyBaos.write(curByte1);
              }
              PKCS8EncodedKeySpec privKeySpec
                 = new PKCS8EncodedKeySpec(privKeyBaos.toByteArray());
              privKeyBaos.close();
              
              // KeyFactory를 이용하여 KeySpec으로부터 키 생성하기
              KeyFactory fac = KeyFactory.getInstance("RSA"); 
              PublicKey publicKey = fac.generatePublic(pubKeySpec); 
              PrivateKey privateKey = fac.generatePrivate(privKeySpec);            
              byte[] publicKeyBytes1 = publicKey.getEncoded();
              byte[] privateKeyBytes1 = privateKey.getEncoded();
              System.out.println("공개키 : "+bytesToHex(publicKeyBytes1));
              System.out.println("개인키 : "+bytesToHex(privateKeyBytes1)); 
              
       }
       
       public static String bytesToHex(byte[] bytes) {
           StringBuilder sb = new StringBuilder(bytes.length * 2);
       
           @SuppressWarnings("resource")
              Formatter formatter = new Formatter(sb);
           for (byte b : bytes) {
               formatter.format("%02x", b);
           }
       
           return sb.toString();
       }
}