package br.com.zup.orangetalents.rest.api.controller.DTO;

import br.com.zup.orangetalents.rest.api.model.Comic;
import br.com.zup.orangetalents.rest.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/comics")
public class ClientController {

        @Autowired
        private ClientService service;

        @GetMapping
        public ResponseEntity comic (Comic comic) {
            ArrayList<Comic> results  = new ArrayList();
             results.add(service.chamarApiExterna(results));
            return ResponseEntity.ok(results);

        }
}
