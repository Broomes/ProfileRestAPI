# Profile Rest API

Rest micro service that can be used to CURD user profiles to / from a MySQL database.

### Prerequisites

Java JDK 8 or higher
Tomcat 9 or higher
Access to a MySql server (local or remote)

### Setup

In order to use this project, you will need to create the nessecary database and table first.
1. Setup local MySql server either on your local machine or remotely.
2. Run the following sql script to get your database and table created:
```
CREATE DATABASE  IF NOT EXISTS `profile_table`;
USE `profile_table`;

DROP TABLE IF EXISTS `profile`;

CREATE TABLE `profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;


INSERT INTO `profile` VALUES 
	(1,'Granville','Broomes','broomesgl@gmail.com','Full Stack Developer','Creating rests with the rest of them ;)');
```

3. Make the nessecary changes to the mysql-connection.properties file.
>Note: replace **__localhost__** with your remote MySQL server's IP address if you are using a remote database server.
```
- jdbc.url=jdbc:mysql://localhost:3306/profile_table?useSSL=false&serverTimezone=UTC
- jdbc.user=
- jdbc.password=
```
> jdbc.user and jdbc password should be the MySQL username and password you setup in step 1.

## Deployment

1. Complete setup instruction above.
2. Generate .war file
3. Deploy to tomcat server.
4. Check that you can access the data by navigating to ../api/profile in your web browser.

## Built With

* [Spring](https://spring.io/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Hibernate](http://hibernate.org/orm/documentation/5.3/) - ORM used 

## Authors

* **Granville Broomes** - *Creator* - [Broomes](https://github.com/Broomes)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details