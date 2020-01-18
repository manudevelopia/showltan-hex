-- create schema lep;
--
-- create table lep.notes
-- (
--     lep_id          serial primary key,
--     lep_name        varchar(50) not null,
--     lep_description varchar
-- );
--
-- create table lep.chemical_profile
-- (
--     lep_id     serial primary key,
--     lep_vla_ec numeric,
--     lep_vla_ed numeric
-- );
--
-- create table lep.composes
-- (
--     lep_id                  serial primary key,
--     lep_name                varchar(50) not null,
--     lep_description         varchar,
--     lep_ncas                varchar(25),
--     lep_nce                 varchar(25),
--     lep_chemical_profile_id int REFERENCES lep.chemical_profile (lep_id) on UPDATE cascade
-- );
--
-- create table lep.compose_note
-- (
--     lep_compose_id int references lep.composes (lep_id) on UPDATE cascade,
--     lep_note_id    int references lep.notes (lep_id) on update cascade,
--     constraint lep_compose_note_pkey primary key (lep_compose_id, lep_note_id)
-- );


create schema showltan;

create table showltan.movies
(
    id          serial primary key,
    title       varchar(50) not null,
    description varchar,
    imdb_id     varchar(10)
);

create unique index movies_imdb_id_uindex
    on showltan.movies (imdb_id );

-- create table showltan.chemical_profile
-- (
--     id     serial primary key,
--     vla_ec numeric,
--     vla_ed numeric
-- );
--
-- create table showltan.composes
-- (
--     id                  serial primary key,
--     name                varchar(50) not null,
--     description         varchar,
--     ncas                varchar(25),
--     nce                 varchar(25),
--     chemical_profile_id int REFERENCES showltan.chemical_profile (id) on UPDATE cascade
-- );
--
-- create table showltan.compose_note
-- (
--     compose_id int references showltan.composes (id) on UPDATE cascade,
--     note_id    int references showltan.notes (id) on update cascade,
--     constraint compose_note_pkey primary key (compose_id, note_id)
-- );

