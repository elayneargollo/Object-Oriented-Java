/* Iº Avaliação Individual – 2018*/

/* PARTE I - 1 */
public class Coluna {
    private String nome;
    private TipoColuna tipo;
    private boolean nulo;
    private boolean chavePrimaria;


/* PARTE I - 2 */
    public Coluna (String nome, TipoColuna tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.nulo = true;
        this.chavePrimaria = false;
    }

/* PARTE I - 3 */
    public Coluna (String nome, TipoColuna tipo, boolean nulo, boolean chavePrimaria){
        this.nome = nome;
        this.tipo = tipo;
        this.nulo = nulo;
        this.chavePrimaria = chavePrimaria;
    }

/* PARTE I - 4 */
    public String getNome(){
        return this.nome;
    }

/* PARTE I - 4 */
    public TipoColuna getTipo (){
        return this.tipo;
    }


/* PARTE I - 5 */
    public boolean equals (Coluna coluna){
        return this.getNome().equals(coluna.getNome()) && this.getTipo().equals(coluna.getTipo());    
    }

/* PARTE I - 6 */
    public boolean equals (Coluna coluna){
        return this.getNome().equals(coluna.getNome()) && this.getTipo().equals(coluna.getTipo());    
    }
    public String ToString (){
        return this.getNome();
             + this.getTipo();
             +(this.isNotNull()? "not null : null");            
    }

/* IMPORTANTE PARA MODULAÇÃO */
    public boolean getChavePrimaria(){
        return this.chavePrimaria;
    }

    public boolean isNotNull(){
        return !this.nulo;
    }   

    public boolean isChavePrimaria(){
        return this.chavePrimaria;
    }   

}
