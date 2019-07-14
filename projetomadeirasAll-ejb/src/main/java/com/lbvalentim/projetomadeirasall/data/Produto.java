package com.lbvalentim.projetomadeirasall.data;

import java.math.BigDecimal;

/**
 *
 * @author LF
 */
public class Produto {
    private Long id_produto;
    private String descProduto;
    private String especie;
    private String unidade_medida;
    private String tipo_madeira;
    private String tratamento;
    private BigDecimal qtd_estoque;
    private BigDecimal preco;
    private String tabela_tipi;

    public Produto() {
    }

    public Long getId_produto() {
        return id_produto;
    }

    public void setId_produto(Long id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public String getTipo_madeira() {
        return tipo_madeira;
    }

    public void setTipo_madeira(String tipo_madeira) {
        this.tipo_madeira = tipo_madeira;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public BigDecimal getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(BigDecimal qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getTabela_tipi() {
        return tabela_tipi;
    }

    public void setTabela_tipi(String tabela_tipi) {
        this.tabela_tipi = tabela_tipi;
    }
    
    
    
}
