package testesDeClasses;

import classes.Pessoa;
public class testePessoas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("murilo",
                                    23,
                                    'M',
                                    "Desenvolvedor de extensões I");
        
        System.out.println(pessoa.getNome()+ " | " + pessoa.getIdade()+ " | " + pessoa.getProfissao()+ " | " + pessoa.getSexo());
    }

}
