package com.example.cep.service;

import com.example.cep.controllers.response.CepInfoResponse;

public interface CepService {

  public CepInfoResponse consume(String cep);

}
