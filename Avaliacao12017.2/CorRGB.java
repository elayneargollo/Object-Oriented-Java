/* PARTE I - 1*/
public class CorRGB{
    private int red;
    private int green;
    private int blue;

    /*PARTE I - 3*/
    public CorRGB(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /*MÉTODOS DE ACESSO - LEITURA/ESCRITA*/
    public int getRed(){
        return this.red;
    }

    public int getGreen(){
        return this.green;
    }

    public int getBlue(){
        return this.blue;
    }

    public void setRed(int red){
        if (red>=0 && red<=255){
            this.red = red;
        }
    }

    public void setGreen(int green){
        if(green>=o && green<=255){
            this.green = green;
        }
    }

     public void setBlue(int blue){
        if(blue>=o && blue<=255){
            this.blue = blue;
        }
    }

    /*PARTE I - 4*/
    public int getLuminosidade(){
        return ((int)(this.getRed*0.3) + (this.getGreen()*0.59) + (this.getBlue()*0.11));
    }

    /*PARTE I - 5*/
    public boolean equals (CorRGB corRGB){
        return  this.getRed().equals(corRGB.getRed) &&
                this.getBlue().equals(corRGB.getBlue()) &&
                this.getGreen().equals(corRGB.getGreen());
    }  

    /*PARTE I - 6*/
    public String ToString(){
        return "#" + RedparaString(red) 
                + GreenparaString(green) 
                + BlueparaString(blue);
    }
    
   /* TRANSFORMAÇÕES INT para HEXA */
    private char toHex(int valor){
        if (Valor < 10){
            return (char)(valor + '0');
        } else
            return (char)((valor - 10) + 'A');
    }

    public String RedparaString (int red){
        this.toHex((this.getRed()/16) + this.toHex((this.getRed()%16));
    }

    public String GreenparaString (int green){
        this.toHex((this.getGreen()/16) + this.toHex((this.getGreen()%16));
    }

    public String BlueparaString (int blue){
        this.toHex((this.getBlue()/16) + this.toHex((this.getBlue()%16));
    }
}
