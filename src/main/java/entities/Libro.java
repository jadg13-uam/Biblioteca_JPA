package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter
@Setter
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo", length = 150, nullable = false)
    private String titulo;

    private int añoPub;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autor_id")
    private Autor autor;
}
