package br.fatecrl.mvcdemo.models;

public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private float preco;
    private int ano;
    private float km;

    public Carro(String marca, String modelo, String cor, float preco, int ano, float km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.ano = ano;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
}