
package augusto;

public class Juridico extends Pessoa {
    
    String cnpj="", razaoSocial="";
    public Juridico(String cnpj, String razaoSocial, String telefone, String celular1, String celular2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, String uf, String numero) {
        super(telefone, celular1, celular2, email, cep, logradouro, bairro, cidade, complemento, uf, numero);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    
}
