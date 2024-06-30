
<h3> 개요 </h3>
1. Spring Boot @ControllerAdvice, @ExceptionHandler를 사용하는 방법을 보여줍니다. <br/>
이를 통해 전역적으로 예외를 처리하고, 사용자에게 일관된 에러 응답을 제공할 수 있습니다. <br/>
필요한 경우, 추가적인 커스텀 예외 처리기를 정의하여 더 세부적인 에러 처리가 가능합니다. <br/>
<br/>
2. log4j2의 사용법과 Sync, Async File의 성능 비교 예제 코드가 수록되어 있습니다.

<h3> 실행 결과 </h3>

- 유효한 요청: /resource/1
```
{
"timestamp": "2024-06-29T12:34:56.789+00:00",
"status": 200,
"message": "Resource 1"
}
```

- 존재하지 않는 리소스 요청: /resource/notfound

```
{
"timestamp": "2024-06-29T12:34:56.789+00:00",
"status": 404,
"message": "Resource not found with id notfound",
"details": "uri=/resource/notfound"
}
```

- 기타 예외 발생 시

```
{
"timestamp": "2024-06-29T12:34:56.789+00:00",
"status": 500,
"message": "Internal Server Error",
"details": "uri=/somepath"
}
```
