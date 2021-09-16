// João Victor C. Bartolot e Luana da Costa Bueno

public class Time {
    private String nome;
    private String escudo;
    
    public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }

    public String getEscudo() { return this.escudo; }
	public void setEscudo(String escudo) { this.escudo = escudo; }

    public Time(String nome, String escudo) {
        this.nome = nome;
        this.escudo = escudo;
    }
}