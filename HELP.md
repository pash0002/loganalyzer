
# Log Analyzer

* ### Import and Build Application
    1. Import the project in Intellij IDEA
    2. Run command `./gradlew clean build` to build the project. This will build and run all test cases.
  
* ### Code Debugging and Unit test
  1. I've added the unit test cases that will cover possible scenarios of the code.
  2. To see output on Web Browser or on REST API testing utilities you can hit the REST APIs.

* ### Accessing the REST APIS
  1. [Parsing REST API](http://localhost:8080/api/parse?path=<FILE.log>)
  
     Please provide the full file path after path=
  2. [getParsedLogsByLevel](http://localhost:8080/api/parse/level?l=error) & [getTailLogs](http://localhost:8080/api/parse/tail?t=100) REST APIs
  
     You can be able to execute above REST APIs if and only if you've executed first one.
  


