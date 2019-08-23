
package Modelos;

public class Aluno extends Pessoa {
    
    private boolean Financiado;
    private double credito;
    private String Status;
    private int NotaPortugues;
    private int NotaMatematica;
    private int NotaHistoria;
    
      
    
    public Aluno(){
        super(); 
    }

    public boolean isFinanciado() {
        return Financiado;
    }

    public void setFinanciado(boolean Financiado) {
        this.Financiado = Financiado;
    }

    public int getNotaPortugues() {
        return NotaPortugues;
    }

    public void setNotaPortugues(int NotaPortugues) {
        this.NotaPortugues = NotaPortugues;
    }

    public int getNotaMatematica() {
        return NotaMatematica;
    }

    public void setNotaMatematica(int NotaMatematica) {
        this.NotaMatematica = NotaMatematica;
    }

    public int getNotaHistoria() {
        return NotaHistoria;
    }

    public void setNotaHistoria(int NotaHistoria) {
        this.NotaHistoria = NotaHistoria;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

  
    
    
    
}
