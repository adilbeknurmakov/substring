/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.entity.substring;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Adilbek
 */
public class Spliter {

    public static void main(String[] args) {
       // Scanner read = new Scanner(System.in);
        //System.out.println("������� �����:");
        //String text = read.nextLine();
        //System.out.print("������� ������: ");
       // int k = read.nextInt();

        String text =  " What a ffff is going on?  ������! ������  8 ����." ;
        String words[] = text.split("[^a-zA-Z]");
        Pattern pattern = Pattern.compile("([A-Z�-�][^.!?]*)\\?");
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }

        int i, size = words.length, length = 5; // count = 0;
        for (i = 0; i < size; ++i) {
            if (words[i].length() == length) {
                  //++count;

                System.out.println("����� �������� �����  " + words[i]);
            }

        }

    }
}
