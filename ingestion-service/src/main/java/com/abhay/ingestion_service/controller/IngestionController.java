package com.abhay.ingestion_service.controller;

import com.abhay.ingestion_service.IngestionServiceApplication;
import com.abhay.ingestion_service.dto.EnergyUsageDto;
import com.abhay.ingestion_service.service.IngestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ingestion")
public class IngestionController {
    @Autowired
    private final IngestionService ingestionService;

    public IngestionController(IngestionService ingestionService) {
        this.ingestionService = ingestionService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void ingestData (@RequestBody EnergyUsageDto usageDto) {
        ingestionService.ingestEnergyUsage(usageDto);
    }
}
