package br.com.robson.adapter.controller;

import br.com.robson.dominio.Imposto;
import br.com.robson.adapter.impl.Icms;
import br.com.robson.request.ImpostoRequest;
import br.com.robson.response.ImpostoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculoImpostoController {

    @GetMapping("/calcula-imposto")
    public ResponseEntity<?> get() {
        return new ResponseEntity<>("imposto", HttpStatus.ACCEPTED);

    }

    @PostMapping("/calcula-imposto")
    public ResponseEntity<?> calcula(@RequestBody ImpostoRequest impostoRequest){
        Imposto imposto = new Icms();
        imposto.calcula(impostoRequest.getValor());
        imposto.ehRoubo();
        return new ResponseEntity<>(new ImpostoResponse(imposto), HttpStatus.ACCEPTED);
    }
}
