# User REST API

To check what is inside H2DB use    http://localhost:8080/h2-console/ 


1. Create User (POST http://localhost:8080/users )
Request example              
             
              {
                "name": "Vitalii",
	              "age": 27
              }
              
Response example 

              {
                "id": 1,
                "name": "Vitalii",
                "age": 27
              }

2. Get User (GET http://localhost:8080/users/1 )
Response example  

              {
                "id": 1,
                "name": "Vitalii",
                "age": 27
              }
