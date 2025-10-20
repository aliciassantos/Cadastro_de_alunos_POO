/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoffinalaliciageovanna;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Date;
/**
 *
 * @author DTIC
 */

public class Aluno {
     //Declaração das variáveis dos alunos
    private String matricula;
    private String nome;
    private String CPF;
    private String telefone;
    private Date dataNasc; 
    private int idade;

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public static void main(String[]arg){
        //Cria uma lista para os alunos
        List<Aluno> listaAlunos;
        listaAlunos = new ArrayList<Aluno>();
        
         
    }
}
