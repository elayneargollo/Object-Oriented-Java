/*PARTE II - 7*/
public class ImagemRGB{
    private CorRGB[][] pixels;

    /*PARTE II - 8*/
    public ImagemRGB (int altura, int largura){
        this.pixels = new CorRGB[altura][largura];
        for (int i=0; i<pixels.length; i++)
            for (int j=0; j<pixels[i]; j++)
                this.setPixel(i, j, new CorRGB(255,0,0))
    }

    /* METODOS DE ACESSO - LEITURA/ESCRITA*/
    public int getAltura(){
        return this.altura;
    }

    public int getLargura(){
        return this.largura;
    }

    public CorRGB getPixels(int i, int j){
        return this.pixels[i][j];
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }
  
    public void setPixel(int i, int j, CorRGB pixels){
        this.pixels[i][j]=pixels;
    }

    /*PARTE II - 9*/
    public CorRGB NewImagem(){
        Imagem newImagem = new CorRGB(this.getAltura(), this.getLargura());

        for (int i=0; i<pixels.length; i++)
            for (int j=0; j<pixels[i]; j++)
                int luminosidade = this.getPixel(i,j).getLuminosidade();
                newImagem.setPixel(i,j, new CorRGB(luminosidade, luminosidade, luminosidade));

        return newImagem;
    }
}
