package com.example.summary;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SummaryController {

    private final SummaryService summaryService;

    @GetMapping("/api/summary")
    public Mono<SummaryResponse> summarize(@RequestParam("filePath") String filePath) {
        log.info("Summarizing file: {}", filePath);
        return summaryService.summarize(filePath);
    }
}
