/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoffinalaliciageovanna;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
/**
 *
 * @author DTIC
 */
// mostrar que Aluno é uma entidade
@Entity 
// Nomeia tabela
@Table(name = "aluno")
public class Aluno implements Serializable {
     //Declaração das variáveis dos alunos
    // Definir a chave primária 
    @Id
    @Column(name = "matricula", unique = true, nullable = false)
    private String matricula;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "cpf",unique = true, nullable = false)
    private String cpf;
    @Column(name = "telefone")
    private String telefone;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nasc", nullable = false)
    private Date dataNasc; 
    @Column(name="idade", nullable = false)
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
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
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
   
    public Aluno (String matricula, String nome, int idade, Date dataNasc, String telefone, String cpf){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    
     public Aluno(){
     }
}
