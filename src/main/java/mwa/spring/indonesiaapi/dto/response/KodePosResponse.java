package mwa.spring.indonesiaapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KodePosResponse {
    private String id;
    private String provinsi;
    private String kabupaten;
    private String kecamatan;
    private String kelurahan;

    @JsonProperty("kode_pos")
    private String kodePos;
}
