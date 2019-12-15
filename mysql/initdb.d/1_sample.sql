CREATE TABLE artist (
  id int not null auto_increment comment 'id',
  name varchar(45) not null comment '名前',
  primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ア ーティスト';

CREATE TABLE music (
  id int not null auto_increment comment 'id',
  artist_id int not null comment 'アーティスト ID',
  title varchar(45) not null comment 'title', 
  primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ミ ュージック';

insert into artist (id, name) value (1, 'スティーブ・アオキ'); 
insert into artist (id, name) value (2, 'Skrillex');
insert into artist (id, name) value (3, 'Avicii');
insert into music (artist_id, title) values (1, 'Cake Face');
insert into music (artist_id, title) values (1, 'Azukita');
insert into music (artist_id, title) values (2, 'Face My Fears');
insert into music (artist_id, title) values (2, 'Recess');
insert into music (artist_id, title) values (3, 'Wake Me Up');
insert into music (artist_id, title) values (3, 'The Nights');


