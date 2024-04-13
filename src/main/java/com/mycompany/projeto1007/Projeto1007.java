/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1007;

import java.util.Scanner;

public class Projeto1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
