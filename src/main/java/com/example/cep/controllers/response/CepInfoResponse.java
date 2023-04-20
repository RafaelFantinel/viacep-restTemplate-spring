package com.example.cep.controllers.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CepInfoResponse {

  @JsonProperty("status")
  private String status;

  @JsonProperty("cep")
  private String cep;

  @JsonProperty("endereco")
  private String logradouro;

  @JsonProperty("bairro")
  private String bairro;

  @JsonProperty("cidade")
  private String localidade;

  @JsonProperty("estado")
  private String uf;

}
