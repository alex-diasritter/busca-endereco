package com.alex.buscacep.infra.client;

import com.alex.buscacep.domain.dtos.request.EnderecoRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws/")
public interface ViaCepClient {

    @GetMapping("{cep}/json/")
    EnderecoRequestDTO buscarEnderecoPorCep(@PathVariable("cep") String cep);

}
