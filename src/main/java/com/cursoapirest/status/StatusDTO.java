package com.cursoapirest.status;

import java.io.Serializable;
import java.util.Date;

public class StatusDTO implements Serializable {

    private static final String MESSAGEM = "Servidor está Funcionando";
    private static final String VERSAO = "0.0.1";

    private String versao = VERSAO;
    private String mensagem = MESSAGEM;
    private Date data = new Date();

    public StatusDTO(){
    }

    public StatusDTO(String versao, String Mensagem, Date data) {
        this.versao = versao;
        this.mensagem = mensagem;
        this.data = data;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
