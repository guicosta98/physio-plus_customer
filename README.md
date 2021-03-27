# physio-plus_customer
Customer's microservice for a Physiotherapy center management system.

Postgres DB:

CREATE TABLE customers (
    id serial, 
    name text not null,
    email text,
    address_id integer,
    birthdate date not null,
    phone text not null,
    cpf text not null    
    );
    
CREATE TABLE adresses (
    id serial, 
    street text not null,
    num text not null,
    zip_code text not null,
    district text,
    city text not null,
    complement text
    );
    
