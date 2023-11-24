package org.elmaghrani;

import org.elmaghrani.composant.Composant;
import org.elmaghrani.composant.ConcreteComposant;
import org.elmaghrani.decorateur.ConcreteDecorateur;
import org.elmaghrani.decorateur.Decorateur;

public class Main {
    public static void main(String[] args) {
        // Création d'un composant concret
        Composant composant = new ConcreteComposant();

        // Création d'un décorateur et utilisation de la composition pour ajouter des fonctionnalités supplémentaires
        Decorateur decorateur = new ConcreteDecorateur(composant);

        // Appel à la fonctionnalité de l'ensemble (incluant les fonctionnalités supplémentaires)
        decorateur.operation();
    }
}