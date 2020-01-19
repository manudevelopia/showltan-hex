
create schema showltan;

create table showltan.movies
(
    id          serial primary key,
    title       varchar(50) not null,
    description varchar,
    imdb_id     varchar(10) unique
);

create unique index movies_imdb_id_uindex
    on showltan.movies (imdb_id );

create user showltan_user with password 'sh0wlt4nP4ssw0rd';
grant all privileges on schema showltan to showltan_user;
grant all privileges on table showltan.movies to showltan_user;
