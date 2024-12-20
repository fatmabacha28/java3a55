# Prosit java

Bienvenue dans le projet **Prosits java**. Ce dépôt contient plusieurs branches, chacune dédiée à une fonctionnalité ou une tâche spécifique.

## Branches disponibles

### 1. Branche principale : `main`
- **Description** :
- - Implémente la classe principale `ZooManagement`.
- Déclare les variables `nbrCages` (20) et `zooName` ("my zoo").
- Affiche : _"my zoo comporte 20 cages"_.
- Permet à l'utilisateur d'entrer le nombre de cages et le nom du zoo via le clavier avec validation des données.
- **Lien** : [Accéder à la branche `main`](https://github.com/fatmabacha28/java3a55/tree/main)

---

### 2. Branche : `Prosit 2`
- **Description** :
- Création des classes `Zoo` (name, city, nbrCages, animals[]) et `Animal` (family, name, age, isMammal).
- Ajout de constructeurs paramétrés pour simplifier l'initialisation.
- Méthode `displayZoo()` pour afficher les informations d'un zoo.
- Ajustement des affichages directs des objets `Zoo` et `Animal`.
- **Lien** : [Accéder à la branche `Prosit 2`](https://github.com/fatmabacha28/java3a55/tree/prosit2)

---

### 3. Branche : `Prosit 3`
- **Description** :
- Ajout des fonctionnalités suivantes dans la classe `Zoo` :
    - **`addAnimal(Animal animal)`** : Ajoute un animal au zoo si possible (unique et sans dépasser la capacité).
    - **`displayAnimals()`** : Affiche tous les animaux du zoo.
    - **`searchAnimal(Animal animal)`** : Recherche un animal par son nom et retourne son index ou `-1` si introuvable.
    - **`removeAnimal(Animal animal)`** : Supprime un animal du zoo.
    - **`isZooFull()`** : Vérifie si le zoo est plein.
    - **`comparerZoo(Zoo z1, Zoo z2)`** : Compare deux zoos et retourne celui ayant le plus d'animaux.
    - `nbrCages` devient une constante pour limiter le zoo à 25 animaux maximum.
- **Lien** : [Accéder à la branche `Prosit 3`](https://github.com/fatmabacha28/java3a55/tree/prosit3)

---

### 4. Branche : `Prosit 4`
- **Description** :
- **Modification de `addAnimal`** : Intègre la méthode `isZooFull()` pour empêcher l'ajout d'animaux si le zoo est plein.
- **Renforcement des validations** :
    - L'âge d'un animal ne peut pas être négatif.
    - Le nom d'un zoo ne peut pas être vide.
- **Réorganisation du code** :
    - Les classes sont réparties dans des packages :
        - `tn.esprit.gestionzoo.main` : contient la classe principale.
        - `tn.esprit.gestionzoo.entities` : contient les classes `Zoo` et `Animal`.
- **Lien** : [Accéder à la branche `Prosit 4`](https://github.com/fatmabacha28/java3a55/tree/prosit4)

---

### 5. Branche : `Prosit 5`
- **Description** :
- - **Création des sous-classes d'animaux** :
- **Aquatic** : Attribut `habitat` (String).
- **Terrestrial** : Attribut `nbrLegs` (int).
- **Dolphin** : Attribut `swimmingSpeed` (float).
- **Penguin** : Attribut `swimmingDepth` (float).
- **Création d'instances d'animaux** dans la méthode `main` via des constructeurs par défaut.
- **Ajout de constructeurs paramétrés** et protection des attributs.
- **Redéfinition de `toString()`** dans les sous-classes pour inclure les attributs spécifiques.
- **Méthode `swim()`** : Implémentée dans `Aquatic`, `Dolphin`, et `Penguin`. Affiche des messages spécifiques pour chaque type d'animal.
- **Lien** : [Accéder à la branche `Prosit 5`](https://github.com/fatmabacha28/java3a55/tree/prosit5)

---
### 6. Branche : `Prosit 6`
- **Description** :
- **Ajout d'un tableau `aquaticAnimals`** dans la classe `Zoo` pour contenir jusqu'à 10 animaux aquatiques.
- **Méthode `addAquaticAnimal(Aquatic aquatic)`** pour ajouter un animal aquatique au tableau.
- Ajout d'animaux aquatiques dans la méthode `main` et affichage de la méthode `swim()` pour chaque animal.
- **Redéfinition de la méthode `swim()`** dans la classe `Aquatic` pour la rendre abstraite, obligeant sa redéfinition dans toutes les classes filles.
- **Méthode `maxPenguinSwimmingDepth()`** dans `Zoo` pour retourner la profondeur maximale de nage des pingouins.
- **Méthode `displayNumberOfAquaticsByType()`** pour afficher le nombre de dauphins et de pingouins dans un zoo.
- **Redéfinition de la méthode `equals()`** dans la classe `Aquatic` pour comparer les animaux aquatiques selon leur nom, âge et habitat.
- **Lien** : [Accéder à la branche `Prosit 6`](https://github.com/fatmabacha28/java3a55/tree/prosit6)

---
### 7. Branche : `Prosit 7`
- **Description** :
- **Modification de la méthode `addAnimal()`** : Le type de retour est changé de `boolean` à `void`, et les tests de zoo plein sont supprimés.
- **Création d'exception personnalisée `ZooFullException`** : Levée dans `addAnimal` lorsque le zoo est plein. La méthode `main` est modifiée pour gérer cette exception et afficher le nombre d'animaux après chaque ajout.
- Réduction du nombre de cages à 3 pour tester le comportement de l'exception.
- **Création de l'exception `InvalidAgeException`** : Levée si un animal a un âge négatif. La méthode `main` est modifiée pour gérer cette exception.
- **Lien** : [Accéder à la branche `Prosit 7`](https://github.com/fatmabacha28/java3a55/tree/prosit7)

---
### 8. Branche : `Prosit 8`
- **Description** :
- **Création des interfaces** :
    - `Carnivore<T>` : Méthode `void eatMeat(T meat)`.
    - `Herbivore<T>` : Méthode `void eatPlant(T plant)`.
    - `Omnivore<T>` : Hérite de `Carnivore` et `Herbivore`, avec la méthode `void eatPlantAndMeat(T food)`.

- **Création de l'énumération `Food`** : Définit trois valeurs (`MEAT`, `PLANT`, `BOTH`).

- **Implémentation des interfaces** :
    - `Carnivore` pour la classe `Aquatic`, utilisant l'énumération `Food` comme paramètre.
    - `Omnivore` pour la classe `Terrestrial`, avec redéfinition des méthodes appropriées.

- **Tests dans la méthode `main`** :
    - Création d'objets `Aquatic`, `Penguin`, et `Terrestrial`, et test des méthodes implémentées.
- **Lien** : [Accéder à la branche `Prosit 8`](https://github.com/fatmabacha28/java3a55/tree/prosit8)

---
### 9. Branche : `Prosit 9`
- **Description** :
- **Création de la classe `Employe`** :
- Attributs : `id` (int), `nom` (String), `prenom` (String), `nomDepartement` (String), `grade` (int).
- Constructeurs : Un constructeur sans paramètre et un constructeur paramétré.
- Méthodes : Getters et Setters.
- Redéfinition des méthodes `equals` (comparaison par `id` et `nom`) et `toString`.

- **Création de l'interface `IGestion`** :
    - Méthodes : `ajouterEmploye(T t)`, `rechercherEmploye(String nom)`, `rechercherEmploye(T t)`, `supprimerEmploye(T t)`, `displayEmploye()`, `trierEmployeParId()`, `trierEmployeParNomDepartementEtGrade()`.

- **Implémentation de l'interface `IGestion` dans la classe `SocieteArrayList`** :
    - Utilisation d'un `ArrayList` pour la gestion de la liste des employés.
    - Implémentation des méthodes de l'interface pour gérer les employés.
- **Lien** : [Accéder à la branche `Prosit 9`](https://github.com/fatmabacha28/java3a55/tree/prosit9)

---
### 10. Branche : `Prosit 10`
- **Description** :
- **Création de la classe `Departement`** :
- Attributs : `id` (int), `nomDepartement` (String), `nbEmployes` (int).
- Constructeurs : Un constructeur sans paramètre et un constructeur paramétré.
- Méthodes : Getters et Setters.
- Redéfinition des méthodes `equals` (comparaison par `id` et `nomDepartement`) et `toString`.

- **Création de l'interface `IDepartement`** :
    - Méthodes : `ajouterDepartement(T t)`, `rechercherDepartement(String nom)`, `rechercherDepartement(T t)`, `supprimerDepartement(T t)`, `displayDepartement()`, `trierDepartementById()`.

- **Implémentation de l'interface `IDepartement` dans la classe `DepartementHashSet`** :
    - Utilisation d'un `HashSet` pour la gestion de la liste des départements.
    - Implémentation des méthodes de l'interface pour gérer les départements.
- **Lien** : [Accéder à la branche `Prosit 10`](https://github.com/fatmabacha28/java3a55/tree/prosit10)

---
### 11. Branche : `Prosit 11`
- **Description** :
- **Création de la classe `AffectationHashMap`** :
    - Utilisation d'une collection dynamique composée de paires clé-valeur (employé-départment), où un employé peut être affecté à un seul département.
    - Les éléments insérés ne sont pas triés.

- **Méthodes à développer** :
    - `ajouterEmployeDepartement(Employe e, Departement d)` : Affecte un employé à un département.
    - `afficherEmployesEtDepartements()` : Affiche l'ensemble des employés et leurs départements.
    - `supprimerEmploye(Employe e)` : Supprime un employé de la collection.
    - `supprimerEmployeEtDepartement(Employe e, Departement d)` : Supprime un employé d'un département spécifique.
    - `afficherEmployes()` : Affiche la liste des employés.
    - `afficherDepartements()` : Affiche la liste des départements.
    - `rechercherEmploye(Employe e)` : Vérifie si un employé existe dans la collection.
    - `rechercherDepartement(Departement d)` : Vérifie si un département existe dans la collection.
    - `trierMap()` : Retourne un `TreeMap` pour trier les employés selon leur identifiant.
- **Lien** : [Accéder à la branche `Prosit 11`](https://github.com/fatmabacha28/java3a55/tree/prosit11)

---
### 12. Branche : `Prosit 12`
- **Description** :
- **Création de la classe `Etudiant`** :
    - Attributs : `id` (int), `nom` (String), `age` (int).
    - 2 constructeurs, dont un sans paramètre.
    - Méthodes Getters & Setters.
    - Redéfinition de la méthode `toString`.

- **Création de l'interface `Management`** :
    - Méthodes :
        - `displayStudents(List<Student> students, Consumer<Student> con)` : Affiche la liste des étudiants avec un consommateur.
        - `displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con)` : Affiche les étudiants filtrés par un prédicat.
        - `returnStudentsNames(List<Student> students, Function<Student, String> fun)` : Retourne les noms des étudiants via une fonction.
        - `createStudent(Supplier<Student> sup)` : Crée un étudiant via un fournisseur.
        - `sortStudentsById(List<Student> students, Comparator<Student> com)` : Trie les étudiants par identifiant.
        - `convertToStream(List<Student> students)` : Convertit la liste d'étudiants en Stream.

- **Création de la classe `StudentManagement`** :
    - Implémentation de l'interface `Management` avec les méthodes spécifiées pour gérer la liste des étudiants.
- **Lien** : [Accéder à la branche `Prosit 12`](https://github.com/fatmabacha28/java3a55/tree/prosit12)

---
### 13. Branche : `Prosit 13`
- **Description** :
- **Lien** : [Accéder à la branche `Prosit 13`](https://github.com/fatmabacha28/java3a55/tree/prosit13)

---
