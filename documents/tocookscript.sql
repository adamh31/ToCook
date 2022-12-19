CREATE TABLE Categorie_CSA(
   code_categorie INT AUTO_INCREMENT,
   libelle VARCHAR(50) ,
   PRIMARY KEY(code_categorie)
);

CREATE TABLE Genre(
   code_genre INT AUTO_INCREMENT,
   libelle VARCHAR(50) ,
   PRIMARY KEY(code_genre)
);

CREATE TABLE Origine(
   code_origine INT AUTO_INCREMENT,
   libelle VARCHAR(50) ,
   PRIMARY KEY(code_origine)
);

CREATE TABLE Emission(
   Id_Emission INT AUTO_INCREMENT,
   titre VARCHAR(150) ,
   titre_original VARCHAR(150) ,
   annee_production INT,
   num_saison INT,
   code_origine INT NOT NULL,
   code_genre INT NOT NULL,
   PRIMARY KEY(Id_Emission),
   FOREIGN KEY(code_origine) REFERENCES Origine(code_origine),
   FOREIGN KEY(code_genre) REFERENCES Genre(code_genre)
);

CREATE TABLE Programme(
   Id_Programme INT AUTO_INCREMENT,
   Id_Emission INT,
   titre VARCHAR(150) ,
   duree INT,
   code_categorie INT NOT NULL,
   PRIMARY KEY(Id_Programme, Id_Emission),
   FOREIGN KEY(Id_Emission) REFERENCES Emission(Id_Emission),
   FOREIGN KEY(code_categorie) REFERENCES Categorie_CSA(code_categorie)
);

CREATE TABLE Diffusion(
   Id_Diffusion INT AUTO_INCREMENT,
   jour DATE,
   horaire TIME,
   direct INT,
   Id_Emission INT NOT NULL,
   Id_Programme INT NOT NULL,
   PRIMARY KEY(Id_Diffusion),
   FOREIGN KEY(Id_Emission, Id_Programme) REFERENCES Programme(Id_Emission, Id_Programme)
);
