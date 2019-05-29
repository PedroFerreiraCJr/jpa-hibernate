CREATE TABLE books (
	id					bigint NOT NULL AUTO_INCREMENT,
	pages				integer,
	CONSTRAINT pk_book_id PRIMARY KEY (id)
);

CREATE TABLE blogposts (
	id					bigint NOT NULL AUTO_INCREMENT,
	url					varchar(255),
	CONSTRAINT pk_blogpost_id PRIMARY KEY (id)
);

CREATE TABLE authors (
	id					bigint NOT NULL AUTO_INCREMENT,
	name				varchar(255),
	CONSTRAINT pk_blogpost_id PRIMARY KEY (id)
);

CREATE TABLE publications (
	id					bigint NOT NULL AUTO_INCREMENT,
	title				varchar(255),
	version				integer,
	publish				date,
	CONSTRAINT pk_blogpost_id PRIMARY KEY (id)
);

CREATE TABLE author_publication (
	id					bigint NOT NULL AUTO_INCREMENT,
	author_id			bigint NOT NULL,
	publication_id		bigint NOT NULL,
	CONSTRAINT pk_author_publication_id PRIMARY KEY (id),
	CONSTRAINT fk_author_publication_author_id FOREIGN KEY (author_id) REFERENCES authors (id),
	CONSTRAINT fk_author_publication_publication_id FOREIGN KEY (author_id) REFERENCES publications (id)
);
