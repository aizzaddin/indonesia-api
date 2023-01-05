package mwa.spring.indonesiaapi.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> customResponse(String message, HttpStatus httpStatus, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("status", httpStatus.value());
        map.put("data", data);

        return new ResponseEntity<>(map, httpStatus);
    }

    public static ResponseEntity<Object> successWithoutDataResponse() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Success");
        map.put("status", "200");
        map.put("data", null);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    public static ResponseEntity<Object> successWithDataResponse(Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Success");
        map.put("status", "200");
        map.put("data", data);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    public static ResponseEntity<Object> failedResponse() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "System unavailable");
        map.put("status", "500");
        map.put("data", null);

        return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
