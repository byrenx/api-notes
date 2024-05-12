# How to Run the API Locally

### Prerequisites 

* Java JDK 21
* Gradle 8.7 

### Run Local Server
* Run `gradle build`
* Run `gradle bootRun`

### API's
* Create Note: POST `/notes`
* Get Note: GET `/notes/{id}`
* Update Note: PUT `/notes/{id}`
* Get All Notes: GET `/notes`
* Delete Note: DELETE `/notes/{id}`

### Test the API using postman or curl

Exacmple curl API call:

```
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"title":"xyz","body":"xyz"}' \
  http://localhost:8080/notes
```
