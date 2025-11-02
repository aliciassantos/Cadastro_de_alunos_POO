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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author DTIC
 */
// mostrar que Aluno é uma entidade
@Entity 
// Nomeia tabela
@Table(name = "Aluno")
public class Aluno implements Serializable {
     //Declaração das variáveis dos alunos
    // Definir a chave primária 
    @Id
    @Column(name = "matricula", unique = true, nullable = false)
    private String matricula;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "cpf",unique = true, nullable = false)
    private String CPF;
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
   
}
