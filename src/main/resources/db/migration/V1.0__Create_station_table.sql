CREATE TABLE STATION
(
  station_id varchar(255),
  name       VARCHAR(255),
  hd_enabled boolean,
  call_sign  VARCHAR(255),
  PRIMARY KEY (station_id)
);
CREATE INDEX NAMEINDEX
  on STATION (name);
CREATE INDEX HDENABLEDINDEX
  on STATION (hd_enabled);