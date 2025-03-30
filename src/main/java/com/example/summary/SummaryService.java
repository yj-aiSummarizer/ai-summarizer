package com.example.summary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class SummaryService {

    private final WebClient webClient;

    public Mono<SummaryResponse> summarize(String filePath) {
        return webClient.post()
                .uri("/summarize")
                .bodyValue(Map.of("path", filePath))
                .retrieve()
                .bodyToMono(SummaryResponse.class);
    }
}
