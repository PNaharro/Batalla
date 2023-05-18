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
vida int
);
create table weapons(
weapon_id INTEGER PRIMARY KEY auto_increment,
imgWeapon varchar(50), 
weapon_name varchar(20),
fuerza int,
velocidad int,
agilidad int,
defensa int
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
nomPersonatgeJugador VARCHAR(20),
puntuacion int
);
