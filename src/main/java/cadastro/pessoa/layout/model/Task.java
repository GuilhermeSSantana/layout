package cadastro.pessoa.layout.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity //indica que a classe é uma entidade
public class Task {

    // public Task(Long id, String name, String email, String contato, String curso) {
    //     this.id = id;
    //     this.name = name;
    //     this.email = email;
    //     this.contato = contato;
    //     this.curso = curso;
    // }


    @Id //identifica a Entidade
	@GeneratedValue(strategy=GenerationType.IDENTITY) //estratégia - fica por conta do DB
    private Long id;
    private String name;
    private String email;
    private String contato;
    private String curso;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getContato() {
        return contato;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }


    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
