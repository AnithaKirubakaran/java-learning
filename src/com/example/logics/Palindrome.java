package com.example.logics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("dictionary.txt");
        String rev = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String word;
            List<String> list = new ArrayList<>();

            while ((word = br.readLine()) != null) {

                list.add(word);

            }
            System.out.println(list);

            List<String> palindrome = new ArrayList<>();

            String[] arr = list.toArray(new String[0]);
            int n = arr.length;


            for (String line : list) {
                int length = line.length();

                for (int i = length - 1; i >= 0; i--)
                    rev = rev + line.charAt(i);

                if (line.equals(rev)) {
                    palindrome.add(rev);
                }
            }
            System.out.println(palindrome);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
