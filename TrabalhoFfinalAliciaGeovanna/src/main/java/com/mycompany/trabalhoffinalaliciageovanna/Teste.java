/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoffinalaliciageovanna;

/**
 *
 * @author geova
 */
public class Teste {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver MySQL carregado!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
