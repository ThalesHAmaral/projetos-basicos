public class Backdoproduto {
    public String name;
    public double price;
    public int quantidade;

    public double totalnoEstoque(){
        return price * quantidade;
    }
    public void addProdutos(int quantidade){
        this.quantidade +=quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -=quantidade;
    }


   public String toString(){
        return name + ", $"
        + String.format("%.2f" , price)  + ", "
        + quantidade + " unidades, Total: $"
        + String.format("%.2f" , totalnoEstoque());
    }



}
