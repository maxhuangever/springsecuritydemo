# Getting Started
Spring security sample project, user data stored in mysql.


### Prerequisite
You need to install mysql.

### How to run it
 * Set database configuration (databaseName / user / password) in `application.properties`
 * Run: `mvn spring-boot:run`
 * Test with [dashboard](http://localhost:9090/dashboard)

### About user and password
The password stored in database is encrypted with `PasswordEncoder`. You need to run PasswordEncoderTest to get the encrypted password.

Below encrypted password is : `password123`
```
insert into testDB.user(password, username)
values('$2a$10$ggfyPR2/jofBSur7LHrZW.6aEmJRUJ/1ZsAsqZaMNQ7W0JX3dR9pO', 'admin');
insert into testDB.authorities(authority, user_id)
values('ROLE_USER', 1);
insert into testDB.authorities(authority, user_id)
values('ROLE_ADMIN', 1);
insert into testDB.authorities(authority, user_id)
values('ROLE_SUPERUSER', 1);
```
