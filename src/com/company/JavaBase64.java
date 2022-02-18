package com.company;

import java.util.Base64;
import java.util.Scanner;

public class JavaBase64 {
    public void encoder() {
        var scanner = new Scanner(System.in);
        var encoder = Base64.getEncoder();
        System.out.print("Enter the Message to be Encrypted: ");
        String originalString = scanner.nextLine();
        String encodedString = encoder.encodeToString(originalString.getBytes());
        System.out.println("Your Encoded String is " + encodedString);

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedString = decoder.decode(encodedString);
        String finalDecodedString = new String(decodedString);
        System.out.println("Your Decoded string is " + finalDecodedString);
    }
}
