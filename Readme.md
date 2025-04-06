Steps to run the microservices:
1. Clone the Repository
2. Open the project in an IDE such as IntelliJ IDEA.
3. Load Maven dependencies, Allow the IDE to automatically import and resolve all Maven dependencies for each module.
4. Build each Maven project individually to ensure all modules are compiled successfully.
5. Start the microservices, It's important to start the services in the following sequence:
  i) Config Server
  ii) Eureka Server
  iii) Cards
  iv) Loans
  v) Accounts
  vi) Gateway Server
6. Open Postman.
7. Import the provided API collection if you haven’t already.
8. Hit the desired APIs via the Gateway Server.

Thanks for checking out the project! Feel free to raise issues or contribute.
