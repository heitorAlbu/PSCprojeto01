
package Interfaces;

import Modelos.Aluno;
import java.util.ArrayList;


public interface IAlunoRepositorio {
    
    public void Cadastrar(Aluno aluno);
    public ArrayList<Aluno> ListarTodos ();
    public Aluno BuscarPorId (int IdAluno);
    public void Deletar(Aluno aluno);
    
}
