/* Iº Avaliação Individual – 2018*/

/* PARTE II - 7 */
public class Tabela {
    private String nome;
    private Coluna[] colunas;

    public Tabela (String nome, Coluna[] colunas){
        this.nome = nome;
        this.colunas = new Coluna[0];
    }

    public String getNome(){
        return this.nome;
    }

/* PARTE II - 8 */
    public Coluna[] getChavePrimaria(){
        Coluna[] chavesPrimarias = new Coluna[0];

        for (int i=0; i <colunas.length; i++){
            if (coluna.isChavePrimaria()){
                chavesPrimarias = this.addColuna (chavesPrimarias, coluna);
            }
        }

        return chavesPrimarias;
    }

/* MODULARIZAÇÃO - PARTE II - 8 / Para retornar colunas, preciso instânciar o array de coluna / */
    public void adcionarColunas (Coluna coluna){
        this.colunas = this.addColuna(this.colunas, coluna); 
    }

/* PARTE II - 8 / Para retornar colunas, preciso instânciar o array de coluna / */
    public Coluna[] addColuna (Coluna[] colunas, Coluna coluna){
        Coluna[] novo = new coluna[colunas.length + 1];

        for (int i=0; i <colunas.length; i++){
            novo[i] = colunas[i];
        }

        novo[i-1] = coluna;
        return novo;        
    }

/* PARTE II - 9 */
    public Tabela merge(String nome, Tabela tabela){
        Tabela merge = new Tabela(nome);

        for (Coluna atual : this.colunas){
            if (!tabela.pertence(atual))
                merge.adcionarColunas(new Coluna(atual));
            else 
                Coluna coluna = tabela.getColuna(atual.getNome(), atual.getTipo());
                merge.adcionarColunas(new Coluna(atual.getNome(), 
                                    atual.getTipo(),
                                    !coluna.isChavePrimaria() && atual.isChavePrimaria(), 
                                    !coluna.isNotNull() || atual.isNotNull()));
        }
    }

/* MODULARIZAÇÃO - PARTE II - 9 */
    public boolean pertence(Coluna coluna){
        for (int i=0; i<colunas.length; i++){
            if (colunas[i].getNome.equals(coluna.getNome())){
                return true;
            }else return false;
        }
    }

/* MODULARIZAÇÃO - PARTE II - 9 */
    public Coluna getColuna (String nome, TipoColuna tipo){
        for(Coluna atual : this.colunas)
          if(atual.getNome().equals(nome) && atual.getTipo() == tipo)
            return atual;
        return null;  
    }
}
