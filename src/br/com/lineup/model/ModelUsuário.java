package br.com.lineup.model;
/**
*
* @author Siqueira
*/
public class ModelUsuário {

    private int iduser;
    private String nomeuser;
    private String foneuser;
    private String login;
    private String senha;
    private String perfil;

    /**
    * Construtor
    */
    public ModelUsuário(){}

    /**
    * seta o valor de iduser
    * @param pIduser
    */
    public void setIduser(int pIduser){
        this.iduser = pIduser;
    }
    /**
    * return iduser
    */
    public int getIduser(){
        return this.iduser;
    }

    /**
    * seta o valor de nomeuser
    * @param pNomeuser
    */
    public void setNomeuser(String pNomeuser){
        this.nomeuser = pNomeuser;
    }
    /**
    * return nomeuser
    */
    public String getNomeuser(){
        return this.nomeuser;
    }

    /**
    * seta o valor de foneuser
    * @param pFoneuser
    */
    public void setFoneuser(String pFoneuser){
        this.foneuser = pFoneuser;
    }
    /**
    * return foneuser
    */
    public String getFoneuser(){
        return this.foneuser;
    }

    /**
    * seta o valor de login
    * @param pLogin
    */
    public void setLogin(String pLogin){
        this.login = pLogin;
    }
    /**
    * return login
    */
    public String getLogin(){
        return this.login;
    }

    /**
    * seta o valor de senha
    * @param pSenha
    */
    public void setSenha(String pSenha){
        this.senha = pSenha;
    }
    /**
    * return senha
    */
    public String getSenha(){
        return this.senha;
    }

    /**
    * seta o valor de perfil
    * @param pPerfil
    */
    public void setPerfil(String pPerfil){
        this.perfil = pPerfil;
    }
    /**
    * return perfil
    */
    public String getPerfil(){
        return this.perfil;
    }

    @Override
    public String toString(){
        return "ModelUsuário {" + "::iduser = " + this.iduser + "::nomeuser = " + this.nomeuser + "::foneuser = " + this.foneuser + "::login = " + this.login + "::senha = " + this.senha + "::perfil = " + this.perfil +  "}";
    }
}