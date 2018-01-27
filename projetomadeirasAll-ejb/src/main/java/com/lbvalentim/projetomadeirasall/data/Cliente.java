package com.lbvalentim.projetomadeirasall.data;
/**
 *
 * @author LF
 */
public class Cliente {

    private Long id_cliente;
    private String nome;
    private String cpf_cnpj;
    private String rg_inscr_est;
    private String email;
    private String endereco;
    private String cidade;
    private String Telefone;

    public Cliente() {
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getRg_inscr_est() {
        return rg_inscr_est;
    }

    public void setRg_inscr_est(String rg_inscr_est) {
        this.rg_inscr_est = rg_inscr_est;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    
}
