package com.example.oraclemavenjpa.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="TBL_ESTUDIANTES")
public class Estudiante {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEstudiantes")
    @SequenceGenerator(name = "seqEstudiantes", allocationSize = 1, sequenceName = "SEQ_ESTUDIANTES")
    @Builder.Default
    Long id=0L;
    @NotNull
    @NotBlank
    String nombres;
    @NotNull @NotBlank
    String apellidos;
    Integer edad;
    @NotBlank(message = "Direccion es requerida")
    @Size(min = 5, max = 50)
    String direccion;
    String ciudad;
    String pais;
}

