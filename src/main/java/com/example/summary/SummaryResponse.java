package com.example.summary;

import lombok.Data;

import java.util.List;

@Data
public class SummaryResponse {
    private String title;
    private String summary;
    private List<String> bullets;
}
