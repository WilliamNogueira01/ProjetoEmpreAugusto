
package augusto;


public class Fisico extends Pessoa {

    String nome="", cpf="", rg="", sexo="", dataDeNascimento="", tipo="";

    public Fisico(String nome, String cpf, String rg, String sexo, String dataDeNascimento, String tipo, String telefone, String celular1, String celular2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, String uf, String numero) {
        super(telefone, celular1, celular2, email, cep, logradouro, bairro, cidade, complemento, uf, numero);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.tipo = tipo;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    
    
}
