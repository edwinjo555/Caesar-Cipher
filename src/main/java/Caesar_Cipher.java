public class Caesar_Cipher {
    public static String Decrypt(String inpmessage,int key)
    {
        String decryptedMessage = "";

        char ch;



        for(int i = 0; i < inpmessage.length(); ++i){
            ch = inpmessage.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - key);

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }

                decryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - key);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }

                decryptedMessage += ch;
            }
            else {
                decryptedMessage += ch;
            }
        }

        return decryptedMessage;
    }}
