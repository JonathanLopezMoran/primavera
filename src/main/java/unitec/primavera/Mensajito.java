
package unitec.primavera;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

public class Mensajito {
    
    @Id
    private String id;
    private String titulo;
    private String cuerpo;
    private LocalDate fecha;

    public Mensajito() {
    }

    public Mensajito(String titulo, String cuerpo, LocalDate fecha) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
