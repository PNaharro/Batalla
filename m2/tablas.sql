drop database BR;
Create database if not exists BR; 
use BR;

create table razas(
id_raza INTEGER PRIMARY KEY auto_increment,
nom_raza varchar(20),
fuerza int,
velocidad int,
agilidad int,
defensa int,
vida int,
puntos_que_da int
);
create table weapons(
weapon_id INTEGER PRIMARY KEY auto_increment,
imgWeapon varchar(50), 
weapon_name varchar(20),
fuerza int,
velocidad int,
agilidad int,
defensa int,
puntos_que_da int
);
create table warriors(
id_warriors INTEGER PRIMARY KEY auto_increment, 
nomWarrior VARCHAR(20),
imgWarrior varchar(50), 
raza int,
armaPersonatge int,
INDEX razas (raza),
    FOREIGN KEY (raza)
        REFERENCES razas(id_raza),
INDEX arma (armaPersonatge),
    FOREIGN KEY (armaPersonatge)
        REFERENCES weapons(weapon_id)
);
create table weapons_available(
id_available INTEGER PRIMARY KEY auto_increment,
id_raza int,
weapon_id int,
INDEX razas_wa (id_raza),
    FOREIGN KEY (id_raza)
        REFERENCES razas(id_raza),
INDEX arma_wa (weapon_id),
    FOREIGN KEY (weapon_id)
        REFERENCES weapons(weapon_id)
);



create table players(
id_player int primary key auto_increment,
nom VARCHAR(20),
puntuacion int
);

CREATE TABLE batalla (
  id_batalla int PRIMARY KEY AUTO_INCREMENT,
  id_player int ,
  warrior_id int ,
  warrior_weapon_id int ,
  oponent_id int ,
  oponent_weapon_id int ,
  damage_caused int ,
  damage_recived int ,
  battle_points int ,
  INDEX battala_wa_p (warrior_weapon_id),
	FOREIGN KEY (warrior_weapon_id)
		REFERENCES weapons (weapon_id),
  INDEX battala_wa_a (oponent_weapon_id),
	FOREIGN KEY (oponent_weapon_id) 
		REFERENCES weapons (weapon_id),
  INDEX batalla_w_p (warrior_id),
	FOREIGN KEY (warrior_id) 
		REFERENCES warriors (id_warriors),
  INDEX batalla_w_a (oponent_id),
	FOREIGN KEY (oponent_id) 
		REFERENCES warriors (id_warriors)
);