package com.example.arek.morse;

import java.util.HashMap;
import java.util.Map;


public class Dekoder {
    public final static Map<String, String> alfabet = new HashMap<String, String>();

    private String mText;

    static {
        alfabet.put("a", ".-");
        alfabet.put("b", "-...");
        alfabet.put("c", "-.-.");
        alfabet.put("d", "-..");
        alfabet.put("e", ".");
        alfabet.put("f", "..-.");
        alfabet.put("g", "--.");
        alfabet.put("h", "....");
        alfabet.put("i", "..");
        alfabet.put("j", ".---");
        alfabet.put("k", "-.-");
        alfabet.put("l", ".-..");
        alfabet.put("m", "--");
        alfabet.put("n", "-.");
        alfabet.put("o", "---");
        alfabet.put("p", ".--.");
        alfabet.put("q", "--.-");
        alfabet.put("r", ".-.");
        alfabet.put("s", "...");
        alfabet.put("t", "-");
        alfabet.put("u", "..-");
        alfabet.put("v", "...-");
        alfabet.put("w", ".--");
        alfabet.put("x", "-..-");
        alfabet.put("y", "-.--");
        alfabet.put("z", "--..");

    }

    public Dekoder(String text) {
        setText(text);
    }

    public void setText(String text) {
        if (text != null || text.length() != 0) {
            mText = text.toLowerCase();
        } else {
            mText = "";
        }
    }

    public String getText() {
        return mText;
    }

    public String getMorse() {
        char letters[] = mText.toCharArray();
        String result = "";

        for(char letter : letters) {
            if (alfabet.get(String.valueOf(letter)) != null) {
                result += alfabet.get(String.valueOf(letter));
            }
        }

        return result;
    }
}
