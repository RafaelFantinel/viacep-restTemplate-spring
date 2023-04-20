package com.example.cep.controllers.request;

import lombok.Data;

@Data
public class CepInfo {
  private String cep;
  private String logradouro;
  private String complemento;
  private String bairro;
  private String localidade;
  private String uf;
  private String ibge;
  private String gia;
  private String ddd;
  private String siaf;

}
