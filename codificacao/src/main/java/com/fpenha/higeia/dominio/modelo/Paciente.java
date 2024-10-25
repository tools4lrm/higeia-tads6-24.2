package com.fpenha.higeia.dominio.modelo;

/**
 * Classe que representa o individuo que chega na instituição procurando um atendimento
 * médico oferecido pelo hospital.
 * 
 * 
 */
public class Paciente {

    private String nome;
    private String CPF;

    /**
     * Nesta instituição, um Paciente só é instanciado com nome e CPF. Dessa forma, uma vez
     * instanciado, esses campos não podem ser alterados.
     * 
     * @param nome atributo textual que representa o nome encontrado em algum documento.
     * @param CPF atributo textual que identifica o individuo como único.
     */
    public Paciente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    /**
     * Método para acessar o valor registrado para o nome.
     * 
     * @return um nome do individuo da forma que foi registrado.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para acessar o valor registrado para o CPF.
     * 
     * @return um número de CPF do individuo da forma que foi registrado.
     */
    public String getCPF() {
        return CPF;
    }
    
    
}
