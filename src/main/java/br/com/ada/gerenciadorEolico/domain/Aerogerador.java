package br.com.ada.gerenciadorEolico.domain;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Aerogerador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String modelo;

    @Column(unique = true)
    private String numeroSerie;

    @Enumerated(EnumType.STRING)
    private AerogeradorStatus status;
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    private ParqueEolico parqueEolico;
}
