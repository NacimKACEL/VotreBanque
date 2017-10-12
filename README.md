### Votre Banque

#How to use the application :

**Step 1 : Create schema votrebanque within data base system manager like MySQLWorkbench

**Step 2 : change spring.jpa.hibernate.ddl-auto=update to spring.jpa.hibernate.ddl-auto=create application.properties

**Step 2 : Open the terminal and follow the commands below :

*$ git clone https://github.com/nkacel/VotreBanque.git
*$ cd VotreBanque
*$ mvn package
*$ java -jar target/VotreBanque-0.0.1-SNAPSHOT.jar

**Step 4 : go to http://loclahost:8080

**Step 5 : username=admin, password=1234 for ADMIN ROLE
  *username=user, password=1234 for USER ROLE
  
**Step 6 : Enjoy your bank application
