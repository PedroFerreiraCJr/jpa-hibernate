CREATE TABLE books (
	id					bigint NOT NULL AUTO_INCREMENT,
	title				varchar(255),
	version				integer,
	publish				date,
	pages				integer,
	CONSTRAINT pk_book_id PRIMARY KEY (id)
);

CREATE TABLE blogposts (
	id					bigint NOT NULL AUTO_INCREMENT,
	title				varchar(255),
	version				integer,
	publish				date,
	url					varchar(255),
	CONSTRAINT pk_blogpost_id PRIMARY KEY (id)
);