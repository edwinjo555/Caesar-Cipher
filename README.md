# Caesar-Cipher

//Library for Caesae Cipher decryption

Prerequisites:
Add Dependencies to gradle

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

	dependencies {
	        implementation 'com.github.edwinjo555:Caesar-Cipher:-SNAPSHOT'
	}

Method Call

//Syntax: 

String Decryptedmessage = Caesar_Cipher.Decrypt(<input_message>,<key>);


//Example:

String Decryptedmessage = Caesar_Cipher.Decrypt("Jk ",2);
System.out.print(Decryptedmessage);

//Output:
Hi

Note: The key value 2 indicates that the message is decrypted by 2 letters.
