
package Repositorios;

import Interfaces.IAlunoRepositorio;
import Modelos.Aluno;
import java.util.ArrayList;
import java.util.Collection;



public class AlunoRepositorio implements IAlunoRepositorio {
    
    private static AlunoRepositorio AlunoRepoInstancia;
    public ArrayList<Aluno> ListaAlunos;
    
    
    public AlunoRepositorio(){
        ListaAlunos = new ArrayList<Aluno>();
    
    }
    
  
    
    public void Cadastrar(Aluno aluno){
        
        ListaAlunos.add(aluno);
        
    }
    
    public ArrayList<Aluno> ListarTodos (){
        
        return ListaAlunos;
    }
    
    public Aluno BuscarPorId (int IdAluno){
        Aluno busca = new Aluno();
         for (Aluno aluno : ListaAlunos){
             if (IdAluno == aluno.getId()) {
                busca = aluno;
                 
                 return busca;   
             }else
                 busca = null;
         }
        return busca;
    }
     
    public void Deletar(Aluno aluno){
         try {
           for(Aluno registro : ListaAlunos){
                    if (registro.getId() ==  aluno.getId()) {
                        ListaAlunos.remove(aluno);
               }
           }    
        } 
         catch(Exception e){
          e.getMessage();
        }
     }
    
    
    
    public static AlunoRepositorio getInstancia(){
        if (AlunoRepoInstancia == null) {
            AlunoRepoInstancia = new AlunoRepositorio();
        }
        return AlunoRepoInstancia;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return ListaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> ListaAlunos) {
        this.ListaAlunos = ListaAlunos;
    }
    
    
}
