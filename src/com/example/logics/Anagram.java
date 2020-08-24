package com.example.logics;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("dictionary.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String word;
            List<String> list = new ArrayList<>();

            while ((word = br.readLine()) != null) {

                list.add(word);

            }
            System.out.println(list);

            List<String> anagramPair = new ArrayList<>();

            String[] arr = list.toArray(new String[0]);
            int n = arr.length;


            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    char[] str1 = arr[i].toCharArray();
                    char[] str2 = arr[j].toCharArray();

                    Arrays.sort(str1);
                    Arrays.sort(str2);

                    if (checkAnagram(str1, str2)) {

                        anagramPair.add(arr[i] + "-" + arr[j]);

                    }
                }
            }

            System.out.println(anagramPair);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static boolean checkAnagram(char[] str1, char[] str2) {
        for (int k = 0; k < str1.length; k++)
            if (str1[k] != str2[k])
                return false;
        return true;
    }
}
