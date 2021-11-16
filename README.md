# Prerequist to run the API tests in your local machine:
##Install the below softwares:
1) Java SDK must be installed
2) Maven must be installed (any build automation tool like Gradle, etc should be fine)
3) Any IDE must be installed like Eclipse, Intellij, etc

##To Run the Test:
1) Import the cloned Repo as maven project.
2) Run the below command in the terminal to test that your setup is correct.
     ```
         mvn test
     ```     
   If the set is proper "Hello World!!!" will be printed on the terminal.


## APIs to Automate:
1) API to get List Of User:
    1) HTTP Method: GET
    2) Request URI: https://reqres.in/api/users

2) API to get Single User:
    1) HTTP Method: GET
    2) Request URI: https://reqres.in/api/users/2

3) APIs to create a User:
    1) HTTP Method: POST
    2) Request URI: https://reqres.in/api/users
    3) Request Body: {
       "name": "test_api",
       "job": "test"
       }       
