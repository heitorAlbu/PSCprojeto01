
package Controllers;

import Interfaces.IAlunoRepositorio;
import Modelos.Aluno;

public class AlunoController {
    
   private IAlunoRepositorio IAluno;
    
   
   public AlunoController(IAlunoRepositorio IAluno){
       this.IAluno = IAluno;
   }
   
   public void cadastrarNovoAluno(Aluno aluno){
       Aluno novoAluno = IAluno.BuscarPorId(aluno.getId());
       try { 
       if (novoAluno == null) {
           
           IAluno.Cadastrar(aluno);
       }
       }catch(Exception e){
           e.getMessage();
       }  
   }
   
   public void DeletarAluno(Aluno aluno){
              IAluno.Deletar(aluno);
   }
   
   public String VerificarStatus(Aluno aluno){
        Aluno retorno = IAluno.BuscarPorId(aluno.getId());
       
       return  retorno.getStatus();
      
   }
   
   
   
}
