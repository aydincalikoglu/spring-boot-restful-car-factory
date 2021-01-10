# Car Factory API with factory pattern

This is a example of a Car Factory providing a REST
API to factory pattern model.

# REST API

The REST API to the example app is described below.
https://documenter.getpostman.com/view/4908629/TVzREcU3

## Create a typed car

### Request

`POST /v1/cars`

    curl --header "Content-Type: application/json"  --request POST --data '{"type":"cabrio"}' http://localhost:8080/v1/cars

### Response

    HTTP/1.1 201 Created
    Date: Thu, 10 Jan 2021 19:36:31 GMT
    Status: 201 Created
    Connection: close
    Content-Type: text/plain;charset=ISO-8859-1
    Location: /thing/2
    Content-Length: 23

    Sedan Car has produced.
