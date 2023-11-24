package org.elmaghrani.decorateur;

import org.elmaghrani.composant.Composant;

public class ConcreteDecorateur implements Decorateur {
    private Composant composant;

    public ConcreteDecorateur(Composant composant) {
        this.composant = composant;
    }

    @Override
    public void operation() {
        // Fonctionnalité supplémentaire avant l'appel à la fonctionnalité de base
        System.out.println("Fonctionnalité supplémentaire.");

        // Appel à la fonctionnalité de base du composant
        composant.operation();

        // Fonctionnalité supplémentaire après l'appel à la fonctionnalité de base
        System.out.println("Autre fonctionnalité supplémentaire.");
    }
}
