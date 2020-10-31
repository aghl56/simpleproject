DROP TABLE IF EXISTS Films CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE Films(
    id  INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name    VARCHAR     NOT NULL,
    year    VARCHAR     NOT NULL,
    genre    VARCHAR     NOT NULL
);