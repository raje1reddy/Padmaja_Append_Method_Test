package com.padmaja.stringreverse;

public class stringUtil {
    public String reverse(String inputString) {
        StringBuilder sb = new StringBuilder();

        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            sb.append(inputString.charAt(i));
        }
        return sb.toString();
    }


}
