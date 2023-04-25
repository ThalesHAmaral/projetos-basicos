public class Produto
{
    public double largura;
    public  double altura;

    public double Area(){
        return largura * altura;
    }

    public double Perimetro(){
        return largura + largura + altura + altura;
    }

    public double Diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }

}
