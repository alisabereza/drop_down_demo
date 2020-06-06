CREATE TABLE "country" (
                        id SERIAL,
                        name  VARCHAR NOT NULL,
                        PRIMARY KEY (id));

CREATE TABLE "state" (
                       id SERIAL,
                       name VARCHAR NOT NULL,
                       countryId INT NOT NULL REFERENCES country(id),
                       PRIMARY KEY (id)
);

CREATE TABLE "city" (
                        id SERIAL,
                        name VARCHAR NOT NULL,
                        stateId INT NOT NULL REFERENCES state(id),
                        PRIMARY KEY (id)
);


INSERT INTO country (id, name) VALUES
(1, 'Country 1'),
(2, 'Country 2'),
(3, 'Country 3'),
(4, 'Country 4');

INSERT INTO state (id, name, countryId) VALUES
(1, 'State 1', 1),
(2, 'State 2', 1),
(3, 'State 3', 1),
(4, 'State 5', 2),
(5, 'State 6', 2),
(6, 'State 7', 3),
(7, 'State 8', 3);

INSERT INTO city (id, name, stateId) VALUES
(1, 'City 1', 1),
(2, 'City 2', 1),
(3, 'City 3', 2),
(4, 'City 4', 2),
(5, 'City 5', 2),
(6, 'City 6', 3),
(7, 'City 7', 3);