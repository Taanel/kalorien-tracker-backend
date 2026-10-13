package de.htwberlin.kalorientracker;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GerichtController {

    @GetMapping("/gerichte")
    public ResponseEntity<List<Gericht>> getGerichte() {
        List<Gericht> gerichte = List.of(
                new Gericht("Haferflocken mit Banane", 350),
                new Gericht("Hähnchen mit Reis", 620),
                new Gericht("Griechischer Salat", 280)
        );
        return ResponseEntity.ok(gerichte);
    }
}
