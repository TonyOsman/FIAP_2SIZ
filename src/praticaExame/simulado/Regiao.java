package praticaExame.simulado;

public class Regiao implements Comparable<Regiao> {
    public String nome;
    public String sigla;
    public int numeroMunicipios;
    public double area;

    // Constructor
    public Regiao(String nome, String sigla, int numeroMunicipios, double area) {
        this.nome = nome;
        this.sigla = sigla;
        this.numeroMunicipios = numeroMunicipios;
        this.area = area;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getNumeroMunicipios() {
        return numeroMunicipios;
    }

    public double getArea() {
        return area;
    }

    // Implementing compareTo method from Comparable interface
    @Override
    public int compareTo(Regiao outraRegiao) {
        // Comparing based on nome (alphabetical order)
        return this.nome.compareTo(outraRegiao.nome);
    }

    // toString method for display
    @Override
    public String toString() {
        return "Regiao [nome=" + nome + ", sigla=" + sigla + 
               ", numeroMunicipios=" + numeroMunicipios + ", area=" + area + "]";
    }

    // equals method for object comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Regiao regiao = (Regiao) obj;
        return nome.equals(regiao.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNumeroMunicipios(int numeroMunicipios) {
        this.numeroMunicipios = numeroMunicipios;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // hashCode method to be consistent with equals
    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
