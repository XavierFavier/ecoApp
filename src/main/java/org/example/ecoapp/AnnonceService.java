package org.example.ecoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {
    @Autowired
    private AnnonceRepository annonceRepository;


    public String getAllAnnonce() {
        List<Annonce> annonces = (List<Annonce>) annonceRepository.findAll();

        String returnStr = "";
        for (Annonce annonce : annonces) {
            returnStr += "<div class=\"compost-card\">\n" +
                    "            <h3>" + annonce.getName() + "</h3>\n" +
                    "            <p>" + annonce.getDescription() + "</p>\n" +
                    "            <p>Ville : <span class=\"user-info\">" + annonce.getCity() + "</span></p>\n" +
                    "            <p>Tel: <span class=\"user-info\">" + annonce.getPhone() + "/span></p>\n" +
                    "        </div>";
        }

        return returnStr;
    }

    public void createAnnonce(AnnonceDTO annonce) {
        Annonce newAnnonce = new Annonce(annonce);
        annonceRepository.save(newAnnonce);
    }
}
