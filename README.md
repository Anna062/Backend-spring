# Backend-spring
# Backend de Blog avec Spring

Ce projet contient le backend de mon futur blog, développé en utilisant le framework Spring.

## Fonctionnalités

- Gestion des articles : Ajouter, mettre à jour et récupérer des articles.
- Gestion des commentaires : Ajouter et récupérer des commentaires pour les articles.(pas encore implémentée )

## Prérequis

- Java 11 ou version ultérieure
- Maven

## Installation

1. Clonez ce dépôt : `git clone https://github.com/Anna062/Backend-spring.git`
2. Accédez au répertoire du projet : `cd Backend-spring/backend`

## Configuration

1. Configurez les propriétés d'application dans `src/main/resources/application.properties` ou utilisez des variables d'environnement.
2. Assurez-vous que votre base de données MySql est configurée correctement.

## Exécution

1. Compilez et exécutez l'application : `mvn spring-boot:run`
2. Le serveur démarrera sur le port par défaut 8080. Vous pouvez le changer dans le fichier de configuration.

## Points d'API

- `GET /articles` : Récupérer la liste des articles.
- `POST /articles` : Ajouter un nouvel article.
- `GET /articles/{id}` : Récupérer un article par ID.
- `DELETE /articles/{id}`: Supprimer un article de la liste
- `UPDATE /articles`: Mettre à jour un article

Veuillez consulter la documentation du code pour obtenir une liste complète des points d'API et des exemples d'utilisation.

## Contribuer

Toute contribution est la bienvenue ! Si vous souhaitez contribuer, suivez ces étapes :

1. Créez une branche pour votre fonctionnalité : `git checkout -b nouvelle-fonctionnalite`
2. Effectuez vos modifications et testez-les.
3. Soumettez une demande de tirage (Pull Request) avec une description détaillée.

## Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus d'informations.

---
