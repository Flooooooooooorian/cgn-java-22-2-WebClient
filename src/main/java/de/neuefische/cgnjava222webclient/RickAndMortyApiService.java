package de.neuefische.cgnjava222.ordersystem.shop;

import org.springframework.web.reactive.function.client.WebClient;

public class RickAndMortyApiService {

    private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

    public void getAllCharacters() {
        RickAndMortyCharacterListResponse response = webClient.get()
                .uri("/character")
                .retrieve()
                .toEntity(RickAndMortyCharacterListResponse.class)
                .block()
                .getBody();

        System.out.println(response);
    }
}
