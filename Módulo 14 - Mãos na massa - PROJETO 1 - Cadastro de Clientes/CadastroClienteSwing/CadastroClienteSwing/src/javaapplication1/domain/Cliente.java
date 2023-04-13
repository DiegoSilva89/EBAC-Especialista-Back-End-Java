/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.domain;

import java.util.Objects;

/**
 *
 * @author rodrigo.pires
 */
public class Cliente {
    
    private String nome;
    private Long cpf;
    private String nascimento;
    private Long telefone;
    private Integer cep;
    private String endereco;
    private Integer numero;
    private String estado;
    private String cidade;
    

    public Cliente(String nome, String cpf, String nascimento, String cep, String telefone, String endereco, String numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = Long.valueOf(cpf);
        this.nascimento = nascimento;
        this.telefone = Long.valueOf(telefone);
        this.cep = Integer.valueOf(cep);
        this.endereco = endereco;
        this.numero = Integer.valueOf(numero);
        this.cidade = cidade;
        this.estado = estado;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

//    @Override
//    public int compareTo(Cliente cliente) {
//        return Long.compare(this.cpf, cliente.getCpf());
//    }

    
}
