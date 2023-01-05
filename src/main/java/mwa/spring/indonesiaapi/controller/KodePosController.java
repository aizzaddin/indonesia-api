package mwa.spring.indonesiaapi.controller;

import mwa.spring.indonesiaapi.configuration.ResponseHandler;
import mwa.spring.indonesiaapi.dto.response.KodePosResponse;
import mwa.spring.indonesiaapi.service.KodePosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/kodepos")
public class KodePosController {

    private final KodePosService kodePosService;

    public KodePosController(KodePosService kodePosService) {
        this.kodePosService = kodePosService;
    }

    @GetMapping("/{kodePos}")
    public ResponseEntity<Object> getKodePosDetail(@PathVariable String kodePos) {
        List<KodePosResponse> response;
        try {
            response = kodePosService.getKodePosDetail(kodePos);
        } catch (Exception e) {
            return ResponseHandler.failedResponse();
        }
        return ResponseHandler.successWithDataResponse(response);
    }
}
