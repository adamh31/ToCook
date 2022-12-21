CREATE TABLE Categorie_CSA(
   code VARCHAR(2) ,
   libelle VARCHAR(50) ,
   PRIMARY KEY(code)
);

CREATE TABLE Genre(
   code VARCHAR(3) ,
   libelle VARCHAR(50) ,
   PRIMARY KEY(code)
);

CREATE TABLE Origine(
   code VARCHAR(3) ,
   libelle VARCHAR(50) ,
   PRIMARY KEY(code)
);

CREATE TABLE Emission(
   Id_Emission INT AUTO_INCREMENT,
   titre VARCHAR(150) ,
   titre_original VARCHAR(150) ,
   annee_production INT,
   num_saison INT,
   code VARCHAR(3)  NOT NULL,
   code_1 VARCHAR(3)  NOT NULL,
   PRIMARY KEY(Id_Emission),
   FOREIGN KEY(code) REFERENCES Origine(code),
   FOREIGN KEY(code_1) REFERENCES Genre(code)
);

CREATE TABLE Programme(
   Id_Programme INT AUTO_INCREMENT,
   Id_Emission INT,
   titre VARCHAR(150) ,
   duree INT,
   code VARCHAR(2)  NOT NULL,
   PRIMARY KEY(Id_Programme, Id_Emission),
   FOREIGN KEY(Id_Emission) REFERENCES Emission(Id_Emission),
   FOREIGN KEY(code) REFERENCES Categorie_CSA(code)
);

CREATE TABLE Diffusion(
   Id_Diffusion INT AUTO_INCREMENT,
   jour DATE,
   horaire TIME,
   direct TINYINT,
   Id_Emission INT NOT NULL,
   Id_Programme INT NOT NULL,
   PRIMARY KEY(Id_Diffusion),
   FOREIGN KEY(Id_Programme, Id_Emission) REFERENCES Programme(Id_Programme, Id_Emission)
);
