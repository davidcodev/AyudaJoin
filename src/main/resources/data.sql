INSERT INTO dicdat (planta, grupo, descripcion_grupo, fuente, descripcion_tag)
VALUES ('NATURAL', 'NATURAL', 'CALDERA', 'FUENTE 1', 'DESCRIPCIONTAG 1');
INSERT INTO dicdat (planta, grupo, descripcion_grupo, fuente, descripcion_tag)
VALUES ('PLANTA 2', 'ARTIFICIAL', 'CALDERA', 'FUENTE 2', 'DESCRIPCIONTAG 2');

INSERT INTO mqttlogs (terminal_date, grupo, source, value, server_timestamp)
VALUES ('2024-01-01', 'GRUPO 1', 'SOURCE 1', 'VALUE 1', '2024-01-01');
INSERT INTO mqttlogs (terminal_date, grupo, source, value, server_timestamp)
VALUES ('2024-01-01', 'NATURAL', 'FUENTE 1', 'VALUE 2', '2024-01-01');