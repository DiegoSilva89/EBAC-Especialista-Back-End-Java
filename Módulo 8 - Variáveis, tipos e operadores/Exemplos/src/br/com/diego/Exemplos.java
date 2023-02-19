package br.com.diego;

public class Exemplos {

    //tipos primitivos (atributos)
    private int codigo = 1;

    private long codigoMaior;

    private double valorDecimal1 = 10.1;

    private boolean status = true;

    private String texto = "Diego Silva";

    private float valorDecimal = 10.5f;

    private short shor;

    private byte bi;

    //contrutores devem ser publicos e se receberem parametros, os mesmos devem ser instanciados na classe main
    public Exemplos(int val) {
        this.codigo = val;
    }
    public Exemplos() {

    }


    //métodos
    public int retornaInteiro() {
        int val = 10; //variável de escopo de método, quem tem acesso a este valor é somente este método
        String texto = "Texto"; //O mesmo vale para esta variável
        this.texto = null; //esta variável texto é a variável inicializada como atributo da classe
        return val;
    }

    public long retornaLong() {
        return 10584461L;
    }

    public double retornaDouble() {
        return 10.68;
    }

    public boolean retornaBoolean() {
        return true;
    }

    public String retornaTexto() {
        this.codigo = 0;
        return "DSFkjsadfh";
    }

    public float retornaFloat() {
        return 10.8f;
    }












}
