package mwa.spring.indonesiaapi.service;

import mwa.spring.indonesiaapi.dto.response.KodePosResponse;
import mwa.spring.indonesiaapi.entity.MKodePos;
import mwa.spring.indonesiaapi.entity.repository.MKodePosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KodePosService {

    private final MKodePosRepository kodePosRepository;

    public KodePosService(MKodePosRepository kodePosRepository) {
        this.kodePosRepository = kodePosRepository;
    }

    public List<KodePosResponse> getKodePosDetail(String kodePos) {
        List<MKodePos> listKodePos = kodePosRepository.findByKodepos(kodePos);
        return listKodePos.stream().map(data -> KodePosResponse
                .builder()
                        .id(data.getId())
                        .provinsi(data.getProvinsi())
                        .kabupaten(data.getKabupaten())
                        .kecamatan(data.getKecamatan())
                        .kelurahan(data.getKelurahan())
                        .kodePos(data.getKodepos())
                .build())
                .collect(Collectors.toList());
    }
}
