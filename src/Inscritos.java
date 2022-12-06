public class Inscritos extends Pessoa {
    private String login;
    private int totAssitindo;

    public Inscritos(String nome, int idade, String sexo, String login) {
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
        return "Inscrito [ "+ super.toString() + "  Login: " + login + ", Total Assitindo: " + totAssitindo + "]";
    }

   
    
}
