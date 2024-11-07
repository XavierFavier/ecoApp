package org.example.ecoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleController {

    @Autowired
    private AnnonceService annonceService;

    @GetMapping("/allAnnonces")
    public String allAnnonces() {
        return annonceService.getAllAnnonce();
    }

    @PostMapping("/annonce")
    public String annonce(@RequestBody AnnonceDTO annonce) {
        annonceService.createAnnonce(annonce);
        System.out.println(annonce);
        return annonce.toString();
    }
}