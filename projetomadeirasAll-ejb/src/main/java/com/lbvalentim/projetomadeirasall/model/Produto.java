package com.lbvalentim.projetomadeirasall.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto implements Serializable, Entidade {
    @Id
    @Column(name = "id_produto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "descricao", length = 60)
    private String descProduto;
    @Column(name = "especie", length = 30)
    private String especieProduto;
    @Column(name= "unidade_medida", length = 10)
    private String unidadeMedida;
    @Column(name= "tipo_madeira", length = 25)
    private String tipoMadeira;
    @Column(name= "tratamento", length = 30)
    private String tratamento;
    @Column(name= "qtd_estoque", length = 10)
    private BigDecimal qtdEstoque;
    @Column(name= "preco", length = 12)
    private BigDecimal preco;
    @Column(name= "tabela_tipi", length = 15)
    private String tabelaTipi;
    
    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public String getEspecieProduto() {
        return especieProduto;
    }

    public void setEspecieProduto(String especieProduto) {
        this.especieProduto = especieProduto;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public BigDecimal getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(BigDecimal qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getTabelaTipi() {
        return tabelaTipi;
    }

    public void setTabelaTipi(String tabelaTipi) {
        this.tabelaTipi = tabelaTipi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.descProduto);
        hash = 67 * hash + Objects.hashCode(this.especieProduto);
        hash = 67 * hash + Objects.hashCode(this.unidadeMedida);
        hash = 67 * hash + Objects.hashCode(this.tipoMadeira);
        hash = 67 * hash + Objects.hashCode(this.tratamento);
        hash = 67 * hash + Objects.hashCode(this.qtdEstoque);
        hash = 67 * hash + Objects.hashCode(this.preco);
        hash = 67 * hash + Objects.hashCode(this.tabelaTipi);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.descProduto, other.descProduto)) {
            return false;
        }
        if (!Objects.equals(this.especieProduto, other.especieProduto)) {
            return false;
        }
        if (!Objects.equals(this.unidadeMedida, other.unidadeMedida)) {
            return false;
        }
        if (!Objects.equals(this.tipoMadeira, other.tipoMadeira)) {
            return false;
        }
        if (!Objects.equals(this.tratamento, other.tratamento)) {
            return false;
        }
        if (!Objects.equals(this.tabelaTipi, other.tabelaTipi)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.qtdEstoque, other.qtdEstoque)) {
            return false;
        }
        if (!Objects.equals(this.preco, other.preco)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
