# Consumer-reports : User API
This API to create and retrieve Users.

## API resources (Content-Type:application/json)
POST : http://localhost:8080/register
Request body:
{
  "fName": "Maulik",
  "lName": "Megha",
  "email": "Maulik.developer@gmail.com"
}

GET : http://localhost:8080/users

## How to run locally
- With IntelliJ: run ```UserApiApp.java```
- With maven: ```mvn spring-boot:run```

## DB : apache.derby
