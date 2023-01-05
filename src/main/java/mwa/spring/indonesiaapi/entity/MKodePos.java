package mwa.spring.indonesiaapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "m_kode_pos")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MKodePos {
    @Id
    @Column(name = "id", length = 50)
    private String id;

    @Column(name = "kelurahan", length = 100)
    private String kelurahan;

    @Column(name = "kecamatan", length = 100)
    private String kecamatan;

    @Column(name = "kabupaten", length = 100)
    private String kabupaten;

    @Column(name = "provinsi", length = 100)
    private String provinsi;

    @Column(name = "kodepos", length = 100)
    private String kodepos;

    @Column(name = "created_dt")
    private Timestamp createdDt;

    @Column(name = "created_by", length = 50)
    private String createdBy;

    @Column(name = "changed_dt")
    private Timestamp changedDt;

    @Column(name = "changed_by", length = 50)
    private String changedBy;
}