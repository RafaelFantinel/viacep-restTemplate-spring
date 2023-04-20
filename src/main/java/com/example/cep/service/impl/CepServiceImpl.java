package com.example.cep.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.cep.controllers.request.CepInfo;
import com.example.cep.controllers.response.CepInfoResponse;
import com.example.cep.service.CepService;

@Service
public class CepServiceImpl implements CepService {

  @Value("${url.viacep}")
  private String url;

  public CepInfoResponse consume(String cep) {
    final var fullUrl = url + cep + "/json";
    RestTemplate restTemplate = new RestTemplate();
    CepInfo cepInfo = restTemplate.getForObject(fullUrl, CepInfo.class);

    CepInfoResponse response = new CepInfoResponse();
    BeanUtils.copyProperties(cepInfo, response);
    return response;

  }

}
