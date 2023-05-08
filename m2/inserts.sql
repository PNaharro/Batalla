insert into players(nom,puntuacion) values('jose', '0');

insert into razas(nom_raza,fuerza,velocidad,agilidad,defensa,vida,puntos_que_da) values('elf', '4', '7', '7', '2', '40', '19');
insert into razas(nom_raza,fuerza,velocidad,agilidad,defensa,vida,puntos_que_da) values('nan', '5', '3', '5', '4', '60', '21');
insert into razas(nom_raza,fuerza,velocidad,agilidad,defensa,vida,puntos_que_da) values('huma','4', '5', '6', '3', '40', '20');

insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('daga.png', 'daga', '0', '3', '0', '0', '10');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('espasa.png', 'espasa', '1', '1', '0', '0', '10');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('destral.png', 'destral', '3', '0', '0', '0', '10');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('espases_dobles.png', 'espases_dobles', '2', '2', '0', '0', '14');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('simitarra.png', 'simitarra', '1', '2', '0', '0', '14');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('arc.png', 'arc', '1', '5', '0', '0', '15');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('katana.png', 'katana', '2', '3', '0', '0', '18');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('punyal.png', 'punyal', '0', '4', '0', '0', '12');
insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('destral_dues_mans.png', 'destral_dues_mans ', '5', '0', '0', '0', '20');

insert into weapons_available(id_raza,weapon_id) values('1', '1');
insert into weapons_available(id_raza,weapon_id) values('1', '2');
insert into weapons_available(id_raza,weapon_id) values('1', '3');
insert into weapons_available(id_raza,weapon_id) values('1', '4');
insert into weapons_available(id_raza,weapon_id) values('1', '5');
insert into weapons_available(id_raza,weapon_id) values('1', '8');
insert into weapons_available(id_raza,weapon_id) values('2', '2');
insert into weapons_available(id_raza,weapon_id) values('2', '3');
insert into weapons_available(id_raza,weapon_id) values('2', '8');
insert into weapons_available(id_raza,weapon_id) values('2', '9');
insert into weapons_available(id_raza,weapon_id) values('3', '1');
insert into weapons_available(id_raza,weapon_id) values('3', '2');
insert into weapons_available(id_raza,weapon_id) values('3', '3');
insert into weapons_available(id_raza,weapon_id) values('3', '4');
insert into weapons_available(id_raza,weapon_id) values('3', '5');
insert into weapons_available(id_raza,weapon_id) values('3', '7');
insert into weapons_available(id_raza,weapon_id) values('3', '8');

insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('tomas', 'tomas.png', '1', '2');
insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('marcos', 'marcos.png', '2', '2');
insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('maduro', 'maduro.png', '3', '2');

