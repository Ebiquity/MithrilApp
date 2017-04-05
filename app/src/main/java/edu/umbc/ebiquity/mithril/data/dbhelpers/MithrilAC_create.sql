-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-04-05 22:04:34.378

-- tables
-- Table: actionlog
CREATE TABLE actionlog (
    id int NOT NULL AUTO_INCREMENT,
    resources_id int NOT NULL,
    requesters_id int NOT NULL,
    time timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    action int NOT NULL,
    CONSTRAINT actionlog_pk PRIMARY KEY (id)
) COMMENT 'Table showing actions taken for each context, resource, requester tuple';

-- Table: appperm
CREATE TABLE appperm (
    id int NOT NULL AUTO_INCREMENT,
    apps_id int NOT NULL,
    permissions_id int NOT NULL,
    CONSTRAINT appperm_pk PRIMARY KEY (id,apps_id,permissions_id)
) COMMENT 'Table showing apps and permissions';

-- Table: apps
CREATE TABLE apps (
    id int NOT NULL AUTO_INCREMENT,
    uid int NOT NULL,
    description text NULL,
    assocprocname text NULL,
    targetsdkver int NOT NULL,
    icon blob NOT NULL,
    label text NOT NULL,
    name text NOT NULL,
    verinfo text NOT NULL,
    installed bool NOT NULL DEFAULT true,
    type int NOT NULL,
    installdate timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    requesters_id int NOT NULL,
    UNIQUE INDEX apps_unique_key (name),
    CONSTRAINT apps_pk PRIMARY KEY (id)
) COMMENT 'Table showing metadata for apps';

-- Table: context
CREATE TABLE context (
    id int NOT NULL AUTO_INCREMENT,
    location text NULL,
    activity text NULL,
    temporal text NULL,
    presence_info text NULL DEFAULT user,
    CONSTRAINT context_pk PRIMARY KEY (id)
) COMMENT 'Table showing context instances';

-- Table: contextlog
CREATE TABLE contextlog (
    id int NOT NULL AUTO_INCREMENT,
    instance_id int NOT NULL,
    identity text NOT NULL DEFAULT user,
    location text NULL,
    activity text NULL,
    temporal text NULL,
    time timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT contextlog_pk PRIMARY KEY (id)
) COMMENT 'Table showing log of current user context';

-- Table: permissions
CREATE TABLE permissions (
    id int NOT NULL AUTO_INCREMENT,
    name text NOT NULL,
    label text NOT NULL,
    protectionlvl text NOT NULL,
    permgrp text NULL,
    flag text NULL,
    description text NULL,
    icon blob NOT NULL,
    resources_id int NOT NULL,
    UNIQUE INDEX permissions_unique_name (name),
    CONSTRAINT permissions_pk PRIMARY KEY (id)
) COMMENT 'Table showing metadata for permissions';

-- Table: policyrules
CREATE TABLE policyrules (
    id int NOT NULL AUTO_INCREMENT,
    name text NOT NULL,
    action int NOT NULL,
    requesters_id int NOT NULL,
    resources_id int NOT NULL,
    context_id int NOT NULL,
    CONSTRAINT policyrules_pk PRIMARY KEY (id)
) COMMENT 'Table showing policy rules defined for apps and requested resources in given context';

-- Table: requesters
CREATE TABLE requesters (
    id int NOT NULL AUTO_INCREMENT,
    name text NOT NULL DEFAULT *,
    CONSTRAINT requester_id PRIMARY KEY (id)
) COMMENT 'Table showing metadata for requesters of user data';

-- Table: resources
CREATE TABLE resources (
    id int NOT NULL AUTO_INCREMENT,
    name text NOT NULL,
    CONSTRAINT resource_id PRIMARY KEY (id)
) COMMENT 'Table showing metadata for resource being requested';

-- Table: violationlog
CREATE TABLE violationlog (
    id int NOT NULL AUTO_INCREMENT,
    resources_id int NOT NULL,
    requesters_id int NOT NULL,
    description text NOT NULL,
    marker bool NULL,
    time timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    CONSTRAINT violationlog_pk PRIMARY KEY (id)
) COMMENT 'Table showing violations recorded by MithrilAC and subsequent user feedback';

-- views
-- View: apppermview
CREATE VIEW `mithril.db`.apppermview AS
SELECT
a.name as apppkgname,
p.name as permname,
p.protectionlvl as protectionlevel,
p.label as permlabel,
p.permgrp as permgroup
FROM
apps a, 
permissions p, 
appperm ap
WHERE
ap.apps_id = a.id
AND
ap.permissions_id = p.id;

-- foreign keys
-- Reference: actions_requesters (table: actionlog)
ALTER TABLE actionlog ADD CONSTRAINT actions_requesters FOREIGN KEY actions_requesters (requesters_id)
    REFERENCES requesters (id);

-- Reference: actions_resources (table: actionlog)
ALTER TABLE actionlog ADD CONSTRAINT actions_resources FOREIGN KEY actions_resources (resources_id)
    REFERENCES resources (id);

-- Reference: appperm_apps (table: appperm)
ALTER TABLE appperm ADD CONSTRAINT appperm_apps FOREIGN KEY appperm_apps (apps_id)
    REFERENCES apps (id)
    ON DELETE CASCADE;

-- Reference: appperm_permissions (table: appperm)
ALTER TABLE appperm ADD CONSTRAINT appperm_permissions FOREIGN KEY appperm_permissions (permissions_id)
    REFERENCES permissions (id);

-- Reference: apps_requesters (table: apps)
ALTER TABLE apps ADD CONSTRAINT apps_requesters FOREIGN KEY apps_requesters (requesters_id)
    REFERENCES requesters (id);

-- Reference: contextlog_context (table: contextlog)
ALTER TABLE contextlog ADD CONSTRAINT contextlog_context FOREIGN KEY contextlog_context (instance_id)
    REFERENCES context (id);

-- Reference: permissions_resources (table: permissions)
ALTER TABLE permissions ADD CONSTRAINT permissions_resources FOREIGN KEY permissions_resources (resources_id)
    REFERENCES resources (id);

-- Reference: policyrules_context (table: policyrules)
ALTER TABLE policyrules ADD CONSTRAINT policyrules_context FOREIGN KEY policyrules_context (context_id)
    REFERENCES context (id);

-- Reference: policyrules_requesters (table: policyrules)
ALTER TABLE policyrules ADD CONSTRAINT policyrules_requesters FOREIGN KEY policyrules_requesters (requesters_id)
    REFERENCES requesters (id);

-- Reference: policyrules_resources (table: policyrules)
ALTER TABLE policyrules ADD CONSTRAINT policyrules_resources FOREIGN KEY policyrules_resources (resources_id)
    REFERENCES resources (id);

-- Reference: violations_requesters (table: violationlog)
ALTER TABLE violationlog ADD CONSTRAINT violations_requesters FOREIGN KEY violations_requesters (requesters_id)
    REFERENCES requesters (id);

-- Reference: violations_resources (table: violationlog)
ALTER TABLE violationlog ADD CONSTRAINT violations_resources FOREIGN KEY violations_resources (resources_id)
    REFERENCES resources (id);

-- End of file.

