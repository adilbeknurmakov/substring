/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.entity.substring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Adilbek
 */
public class Zipper {
     public static void main(String args[]) {
        System.out.println(zip("tooopak, yahoo, gooooooooogle"));
    }
 
    private static String zip(String input) {
        String temp = "";
 
        Pattern pattern = Pattern.compile("(.)\\1{0,}");
 
        Matcher matcher = pattern.matcher(input);
 
        while (matcher.find()) {
            temp += matcher.group(1);
            int length = matcher.group().length();
            if (length > 1)
                temp += length;
        }
        return temp;
    }
 }

