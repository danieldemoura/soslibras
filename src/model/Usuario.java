/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DANIEL_VE160
 */
public class Usuario {
    private int codUsuario;
    private String nome; 
    private int senha; 
    private int confiSenha; 

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getConfiSenha() {
        return confiSenha;
    }

    public void setConfiSenha(int confiSenha) {
        this.confiSenha = confiSenha;
    }
    
    
}
