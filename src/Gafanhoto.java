public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssitindo;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login; 
        this.totAssitindo = 0;
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssitindo() {
        return totAssitindo;
    }
    public void setTotAssitindo(int totAssitindo) {
        this.totAssitindo = totAssitindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto [ "+ super.toString() + " + login=" + login + ", totAssitindo=" + totAssitindo + "]";
    }

   
    
}
