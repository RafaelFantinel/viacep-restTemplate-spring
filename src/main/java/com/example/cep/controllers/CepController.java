package com.example.cep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cep.controllers.response.CepInfoResponse;
import com.example.cep.service.CepService;

@RestController
@RequestMapping("/rest-api")
public class CepController {
  @Autowired
  private CepService cepService;

  @GetMapping("/busca/{cepEscolhido}")
  public ResponseEntity<CepInfoResponse> getByCep(@PathVariable("cepEscolhido") String cep) {
    return ResponseEntity.status(HttpStatus.OK).body(cepService.consume(cep));
  }
}
