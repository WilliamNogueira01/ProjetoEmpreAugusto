package augusto;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.*;

public class Connector{
    
    private String url="jdbc:mysql://localhost:3306/augusto";
    private String query="";
    private ResultSet rs;
    private Connection con;
    private Statement stmt;
   
    private void abrirConexao()throws Exception{
        con = DriverManager.getConnection(url,"root","");
        stmt = con.createStatement();
    }
        
    private void fecharConexao() throws Exception{
        con.close();
        stmt.close();
    }
    
    public void cadastroPF(Fisico F) throws Exception{
        abrirConexao();
        try{
            query="insert into pessoafisica(Tipo,Nome,CPF,RG,Sexo,endereço,numero,bairro,CEP,Cidade,Complemento,UF,DataNasc,Telefone,Celular1,Celular2,Email)"
                + "values ('"+F.getTipo()+"','"+F.getNome()+"','"+F.getCpf()+"','"+F.getRg()+"','"+F.getSexo()+"','"+F.getLogradouro()+"','"+F.getNumero()+"','"+F.getBairro()+"','"+F.getCep()+"','"+F.getCidade()+"','"+F.getComplemento()+"','"+F.getUf()+"',"
                + "'"+F.getDataDeNascimento()+"','"+F.getTelefone()+"','"+F.getCelular1()+"','"+F.getCelular2()+"','"+F.getEmail()+"')";
        }catch(Exception e){ System.out.println(e);}
        stmt.execute(query);
        fecharConexao();
    }
    
    public void cadastroPJ(Juridico J) throws Exception{
        abrirConexao();
        try{
            query = "insert into pessoajuridica(CNPJ, RazaoSocial, Endereco,Numero,Bairro,CEP,Cidade,Complemento,UF,Telefone,Celular1,Celular2,Email)"
                + "values ('"+J.getCnpj()+"','"+J.getRazaoSocial()+"','"+J.getLogradouro()+"','"+J.getNumero()+"','"+J.getBairro()+"','"+J.getCep()+"','"+J.getCidade()+"','"+J.getComplemento()+"','"+J.getUf()+"','"+J.getTelefone()+"','"+J.getCelular1()+"','"+J.getCelular2()+"','"+J.getEmail()+"')";
        }catch(Exception e){ System.out.println(e);}
        stmt.execute(query);
        fecharConexao();
    }
    
}
