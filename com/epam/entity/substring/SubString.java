/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.entity.substring;


import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author Adilbek
 */
public class SubString {

   public static void main(String[] args) throws UnsupportedEncodingException {
   
        Scanner read = new Scanner(System.in);
        System.out.println("������� ��� �����:"); 
        String text = read.nextLine();
        System.out.print("������� ���� ���������: ");
        String sub = read.nextLine();
        System.out.print("������� ����� �������: ");
        int k = read.nextInt();
        System.out.printf("���������:", System.lineSeparator(),putStr(text, sub, k));
    }
 
    public static String putStr(String text, String str, int j) {
        StringBuilder sb = new StringBuilder();
        if (text != null && str != null && j > 0) {
            int count = 1;
            for (int i = 0; i < text.length(); i++) {
                sb.append(text.charAt(i));
                if (count == j) {
                    sb.append(str);
                }
                if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?'|| text.charAt(i)==',' ||text.charAt(i)=='-' ) {
                    
                    count = 0;
                }
                count++;
            }
        }
        return sb.toString();
    }
    }
