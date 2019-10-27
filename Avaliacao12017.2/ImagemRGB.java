public ImagemRGB{
    private CorRGB[][] pixels;

    public ImagemRGB (int altura, int largura){
        this.pixels = new CorRGB[altura][largura];
        for (int i=0; i<pixels.length; i++)
            for (int j=0; j<pixels[i]; j++)
                this.setPixel(i, j, new CorRGB(255,0,0))
    }

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

    public CorRGB NewImagem(){
        Imagem newImagem = new CorRGB(this.getAltura(), this.getLargura());

        for (int i=0; i<pixels.length; i++)
            for (int j=0; j<pixels[i]; j++)
                int luminosidade = this.getPixel(i,j).getLuminosidade();
                newImagem.setPixel(i,j, new CorRGB(luminosidade, luminosidade, luminosidade));

        return newImagem;
    }
}