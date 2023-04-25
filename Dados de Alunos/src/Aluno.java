public class Aluno {

    public String name;
    public double primeiroTri;
    public double segundoTri;
    public double terceiroTri;

    public double notafinal(){
        return primeiroTri + segundoTri + terceiroTri;
    }

    public double Resultado (){
        if(notafinal() < 60 ){
            return 60.0 - notafinal();
        } else {
            return 0.0;
        }
    }

}
