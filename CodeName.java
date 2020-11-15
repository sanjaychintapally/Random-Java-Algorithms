package com.company;

public class CodeName {

    private int minLen;
    private int maxLen;
    private String isProhibited;

        public CodeName(int min, int max, String prohib) {
            minLen = min;
            maxLen = max;
            isProhibited = prohib;
        }

            public boolean isValid(String str) {
                if(str.length() <= minLen) {
                    return false;
                }
                else if(str.length() >= maxLen) {
                    return false;
                }
                else {
                    for(int i = 0; i <= str.length() - isProhibited.length(); i++) {
                        if(isProhibited.equals(str.substring(i, i + isProhibited.length()))) {
                            return false;
                        }
                    }
                return true;
                }
            }

        public static void main(String[] args) {
            CodeName code = new CodeName(6, 20, "pass");
            System.out.println(code.isValid("Milkpass"));
        }
}
