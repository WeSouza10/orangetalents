package br.com.zup.orangetalents.rest.api.service;

import br.com.zup.orangetalents.rest.api.model.Comic;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class ClientService {


        private static final String URI = "http://gateway.marvel.com/v1/public/comics?ts=1625429721&apikey=57a77d18566fd8dd115ff792630ab92f&hash=82a4a55ba36c5cb44dd4c3f9fe5fb294";

        public Comic chamarApiExterna(ArrayList<Comic> comic) {
            RestTemplate rest = new RestTemplate();

            Comic retorno = rest.getForObject(URI, Comic.class);

            return retorno;
        }
    }


