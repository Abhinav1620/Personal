package Actions;

import java.util.Base64;

public class EncodingDecoding {

    public static String decoding(String text1){
        byte[] actualByte = Base64.getDecoder()
                .decode(text1);
        String actualString = new String(actualByte);

        return actualString;
    }
}
