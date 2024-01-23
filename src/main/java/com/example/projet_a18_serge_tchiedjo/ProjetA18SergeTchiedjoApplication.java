package com.example.projet_a18_serge_tchiedjo;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetA18SergeTchiedjoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjetA18SergeTchiedjoApplication.class, args);
    }
    @PostConstruct
    public void init() {
        // Logique à exécuter au démarrage de l'application
        System.out.println("L'application a démarré avec succès !");
    }

}
