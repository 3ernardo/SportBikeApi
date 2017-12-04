package sportbike.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codVenda;
    private Long codMoto;
    private String nome;
    private String cpf;
    private String telefone;

    public Venda() {
    }

    public Venda(Long codMoto, String nome, String cpf, String telefone) {
        this.codMoto = codMoto;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Long getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Long codVenda) {
        this.codVenda = codVenda;
    }

    public Long getCodMoto() {
        return codMoto;
    }

    public void setCodMoto(Long codMoto) {
        this.codMoto = codMoto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
