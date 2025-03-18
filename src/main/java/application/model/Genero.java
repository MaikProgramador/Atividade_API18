package application.model;

import application.record.GeneroDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "generos")
@Getter
@Setter
@NoArgsConstructor
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;

    public Genero(GeneroDTO record) {
        this.id = record.id();
        this.descricao = record.descricao();
    }
}
