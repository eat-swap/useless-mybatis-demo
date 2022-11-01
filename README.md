# useless-mybatis-demo

Demo.

## Create database

```sql
CREATE DATABASE mybatis;

USE mybatis;

CREATE TABLE authors (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE,
                         name TEXT NOT NULL UNIQUE
);

CREATE TABLE tags (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE,
                      tag TEXT NOT NULL UNIQUE
);

CREATE TABLE blogs (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE,
                       author_id BIGINT NOT NULL,
                       status TINYINT(2) NOT NULL,
                       FOREIGN KEY (author_id) REFERENCES authors(id)
);

CREATE TABLE posts (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE,
                       title TEXT NOT NULL,
                       content TEXT NOT NULL,
                       blog_id BIGINT NOT NULL,
                       is_published BOOLEAN NOT NULL,
                       FOREIGN KEY (blog_id) REFERENCES blogs(id)
);

CREATE TABLE comments (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY UNIQUE,
                          content TEXT NOT NULL,
                          name TEXT NOT NULL,
                          post_id BIGINT NOT NULL,
                          FOREIGN KEY (post_id) REFERENCES posts(id)
);

CREATE TABLE post_tags (
                           post_id BIGINT NOT NULL,
                           tag_id BIGINT NOT NULL,
                           FOREIGN KEY (post_id) REFERENCES posts(id),
                           FOREIGN KEY (tag_id) REFERENCES tags(id)
);
```