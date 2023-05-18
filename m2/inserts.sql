insert into players(nom,puntuacion) values('jose', '0');
insert into players(nom,puntuacion) values('marcos', '0');
insert into players(nom,puntuacion) values('paco', '0');



insert into razas(nom_raza,fuerza,velocidad,agilidad,defensa,vida,puntos_que_da) values('elf', '4', '7', '7', '2', '40', '19');
insert into razas(nom_raza,fuerza,velocidad,agilidad,defensa,vida,puntos_que_da) values('nan', '5', '3', '5', '4', '60', '21');
insert into razas(nom_raza,fuerza,velocidad,agilidad,defensa,vida,puntos_que_da) values('huma','4', '5', '6', '3', '50', '20');

/*1*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/daga.png', 'daga', '0', '3', '0', '0', '10');
/*2*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/espasa.png', 'espasa', '1', '1', '0', '0', '10');
/*3*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/destral.png', 'destral', '3', '0', '0', '0', '10');
/*4*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/espases_dobles.png', 'espases_dobles', '2', '2', '0', '0', '14');
/*5*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/simitarra.png', 'simitarra', '1', '2', '0', '0', '14');
/*6*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/arc.png', 'arc', '1', '5', '0', '0', '15');
/*7*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/katana.png', 'katana', '2', '3', '0', '0', '18');
/*8*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/punyal.png', 'punyal', '0', '4', '0', '0', '12');
/*9*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/destral_dues_mans.png', 'destral_dues_mans ', '5', '0', '0', '0', '20');
/*10*/insert into weapons(imgWeapon,weapon_name,fuerza,velocidad,agilidad,defensa,puntos_que_da) values('armas/punos.png', 'punos ', '0', '0', '0', '0', '0');


insert into weapons_available(id_raza,weapon_id) values('1', '1');
insert into weapons_available(id_raza,weapon_id) values('1', '2');
insert into weapons_available(id_raza,weapon_id) values('1', '3');
insert into weapons_available(id_raza,weapon_id) values('1', '4');
insert into weapons_available(id_raza,weapon_id) values('1', '5');
insert into weapons_available(id_raza,weapon_id) values('1', '8');
insert into weapons_available(id_raza,weapon_id) values('1', '10');
insert into weapons_available(id_raza,weapon_id) values('2', '2');
insert into weapons_available(id_raza,weapon_id) values('2', '3');
insert into weapons_available(id_raza,weapon_id) values('2', '8');
insert into weapons_available(id_raza,weapon_id) values('2', '9');
insert into weapons_available(id_raza,weapon_id) values('2', '10');
insert into weapons_available(id_raza,weapon_id) values('3', '1');
insert into weapons_available(id_raza,weapon_id) values('3', '2');
insert into weapons_available(id_raza,weapon_id) values('3', '3');
insert into weapons_available(id_raza,weapon_id) values('3', '4');
insert into weapons_available(id_raza,weapon_id) values('3', '5');
insert into weapons_available(id_raza,weapon_id) values('3', '7');
insert into weapons_available(id_raza,weapon_id) values('3', '8');
insert into weapons_available(id_raza,weapon_id) values('3', '10');

/*1*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('tomas', 'imagenes/tomas.png', '1', '10');
/*3*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('legolas', 'imagenes/legolas.png', '1', '10');
/*8*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('meliso', 'imagenes/meliso.png', '1', '10');
/*4*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('marcos', 'imagenes/marcos.png', '2', '10');
/*5*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('ang', 'imagenes/ang.png', '2', '10');
/*6*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('jwan', 'imagenes/jwan.png', '2', '10');
/*2*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('gerardo', 'imagenes/gerardo.png', '3', '10');
/*7*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('maduro', 'imagenes/maduro.png', '3', '10');
/*9*/insert into warriors(nomWarrior,imgWarrior,raza,armaPersonatge) values('rigoberto', 'imagenes/rigoberto.png', '3', '10');

insert into batalla(id_player,warrior_id,warrior_weapon_id,oponent_id,oponent_weapon_id,damage_caused,damage_recived,battle_points) 
values(1, 1, 2, 4, 8, 30, 60,23);
insert into batalla(id_player,warrior_id,warrior_weapon_id,oponent_id,oponent_weapon_id,damage_caused,damage_recived,battle_points) 
values(1, 1, 1, 3, 8, 35, 40,21);
insert into batalla(id_player,warrior_id,warrior_weapon_id,oponent_id,oponent_weapon_id,damage_caused,damage_recived,battle_points) 
values(2, 1, 2, 4, 8, 30, 60,25);
insert into batalla(id_player,warrior_id,warrior_weapon_id,oponent_id,oponent_weapon_id,damage_caused,damage_recived,battle_points) 
values(3, 1, 2, 4, 8, 40, 20,0);
insert into batalla(id_player,warrior_id,warrior_weapon_id,oponent_id,oponent_weapon_id,damage_caused,damage_recived,battle_points) 
values(2, 1, 2, 4, 8, 40, 20,0);
insert into batalla(id_player,warrior_id,warrior_weapon_id,oponent_id,oponent_weapon_id,damage_caused,damage_recived,battle_points) 
values(1, 1, 2, 4, 8, 40, 20,0);

