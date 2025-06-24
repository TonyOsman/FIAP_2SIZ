package praticaExame.simulado;

import java.util.Objects;

public class Regiao2 {
    private String nome;
    private int numMunicipios;
    private int area;
    private double porcentagem;

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Regiao2 regiao2 = (Regiao2) o;
        return nome == regiao2.nome && numMunicipios == regiao2.numMunicipios && area == regiao2.area && Double.compare(porcentagem, regiao2.porcentagem) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numMunicipios, area, porcentagem);
    }

    @Override
    public String toString() {
        return "Regiao2{" +
                "nome=" + nome +
                ", numMunicipios=" + numMunicipios +
                ", area=" + area +
                ", porcentagem=" + porcentagem +
                '}';
    }

    public Regiao2(String nome, int numMunicipios, int area, double porcentagem) {
        this.nome = nome;
        this.numMunicipios = numMunicipios;
        this.area = area;
        this.porcentagem = porcentagem;
    }

    public void setNome(String  nome) {
        this.nome = nome;
    }

    public int getNumMunicipios() {
        return numMunicipios;
    }

    public void setNumMunicipios(int numMunicipios) {
        this.numMunicipios = numMunicipios;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
