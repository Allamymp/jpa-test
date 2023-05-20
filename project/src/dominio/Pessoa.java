package dominio;

import java.io.Serial;
import java.io.Serializable;

public class Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String email;

}
