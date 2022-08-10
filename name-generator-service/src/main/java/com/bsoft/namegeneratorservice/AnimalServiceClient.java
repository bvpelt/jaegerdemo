package com.bsoft.namegeneratorservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "animal-service-client", url = "${animal.service.prefix.url}")
interface AnimalServiceClient {

    @GetMapping("/api/v1/animals/random")
    String randomAnimalName();

}