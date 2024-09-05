package org.example;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Builder

@Entity
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCalle;
    private int numero;

    @OneToOne(mappedBy = "domicilio") //Sirve para indicar quien es el dueño de la relación

    private Cliente cliente;
}
