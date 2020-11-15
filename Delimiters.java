package com.company;
import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

        public Delimiters(String open, String close) {
            openDel = open;
            closeDel = close;
        }

            public ArrayList<String> getDelimiter(String[] tokens) {

                ArrayList<String> delimiters = new ArrayList<String>();
                    for(String token : tokens) {
                        if(token.equals(openDel) || token.equals(closeDel)) {
                            delimiters.add(token);
                        }
                    }
                return delimiters;

            }

            public boolean isBalanced(ArrayList<String> delimiters) {

            int i = 0;
            int j = 0;
                for(String delimiter : delimiters) {
                    if(delimiter.equals(openDel)){
                        i++;
                    }
                    else {
                        j++;
                    }
                }
                if(i == j) {
                    return true;
                }
                else {
                    return false;
                }
            }

    public static void main(String[] args) {
        Delimiters brackets = new Delimiters("(", ")");
        String[] tokens = {"(", "@", "/@", ")", "+", "(", ")", "(", ")"};
        System.out.println(brackets.isBalanced(brackets.getDelimiter(tokens)));
    }
}
