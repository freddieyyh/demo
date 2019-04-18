# Demo - webflux

## Test command
- `curl -X GET "localhost:8080/interface-a"`
```$xslt
< HTTP/1.1 200 OK
< transfer-encoding: chunked
< Content-Type: text/event-stream;charset=UTF-8
<
data:{"code":200}
```
- `curl -X GET -H "Accept: application/json"  "localhost:8080/class"`
```$xslt
< HTTP/1.1 200 OK
< Content-Type: application/json;charset=UTF-8
< Content-Length: 12
<
* Connection #0 to host localhost left intact
{"code":200}%
```
- `curl -X GET -H "Accept: application/json"  "localhost:8080/interface-a"`
```$xslt
< HTTP/1.1 406 Not Acceptable
< Content-Type: application/json;charset=UTF-8
< Content-Length: 157
```
- `curl -X GET -H "Accept: application/json"  "localhost:8080/interface-b"`
```$xslt
< HTTP/1.1 406 Not Acceptable
< Content-Type: application/json;charset=UTF-8
< Content-Length: 157
```
