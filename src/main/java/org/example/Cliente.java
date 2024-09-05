package org.example;
import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private int dni;
    @OneToOne(cascade = CascadeType.ALL)
    //la cascada que contiene la clave foranea de domicilio
    // Se crea FK en la tabla Cliente
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}