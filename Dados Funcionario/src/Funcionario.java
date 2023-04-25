public class Funcionario {
    public String name;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public String toString(){
        return name + ", $" + String.format("%.2f" , salarioLiquido());
    }

    public void aumentarSalario(double porcentagem){
       salarioBruto += salarioBruto * porcentagem / 100.0;
    }


}
