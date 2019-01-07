package com.alexandru.lungu.kubernetes.annotations.example.kubernetesjavaannotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {
    @GetMapping("/")
    public String getRoot() {
       
        String DEFAULT_MSG = "The microservice 1 is up and running";
        return DEFAULT_MSG;
    }

}
