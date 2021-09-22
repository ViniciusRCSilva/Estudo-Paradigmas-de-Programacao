public class Candidato {
    int voto;
    String nome;

    public Candidato(int cod, String nom) {
        voto = cod;
        nome = nom;
    }

    public int getCodigo() { return voto; }
    public void setCodigo(int codigo) { this.voto = codigo;}
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome;}
}
