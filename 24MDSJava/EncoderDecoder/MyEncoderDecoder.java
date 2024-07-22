// Write a JAVA Program for encoding & decoding
// a filename that has been passed as command line argument.
// : javac MyEncoderDecoder.java
// : java MyEncoderDecoder filename.txt encode
// : java MyEncoderDecoder filename.txt decode

class EncoderDecorder {
    private String msg;
    private String en_chars = "abcdefghijklmnopqrstuvwxyz";
    private String de_chars = "zyxwvutsrqponmlkjihgfedcba";

    EncoderDecorder() {}

    EncoderDecorder(String msg) {}

    EncoderDecorder(String msg, String encode_decode) {
        this.msg = msg;
        if (encode_decode.equals("encode")) {
            this.msg = encode();
        } else {
            this.msg = decode();
        }
    }

    private String encode() {
        String temp = "";
        for (int i = 0; i < this.msg.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < this.en_chars.length(); j++) {
                if (this.msg.charAt(i) == this.en_chars.charAt(j)) {
                    temp += this.de_chars.charAt(j);
                    flag = true;
                }
            }
            if (flag == false) {
                temp += this.msg.charAt(i);
            }
        }
        return temp;
    }

    private String decode() {
        String temp = "";
        for (int i = 0; i < this.msg.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < this.de_chars.length(); j++) {
                if (this.msg.charAt(i) == this.de_chars.charAt(j)) {
                    temp += this.en_chars.charAt(j);
                    flag = true;
                }
            }
            if (flag == false) {
                temp += this.msg.charAt(i);
            }
        }
        return temp;
    }

    public String getMsg() {
        return this.msg;
    }
}

class MyEncoderDecoder {
    public static void main(String[] args) {
        String msg = "This is Java";
        EncoderDecorder enc = new EncoderDecorder(msg, "encode");
        System.out.println(msg);
        System.out.println(enc.getMsg());
        enc = new EncoderDecorder(enc.getMsg(), "decode");
        System.out.println(enc.getMsg());
    }
}