
package Modelos;


public abstract class Pessoa {
    static  int Id;
    private String Nome;
    private int Matricula;
    
    public Pessoa(){
        Id ++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }
    
    
    
}
