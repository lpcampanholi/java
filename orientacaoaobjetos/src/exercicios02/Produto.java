package exercicios02;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(int desconto) {
        if (desconto < 0 || desconto > 100) {
            System.out.println("Forneça um valor de desconto entre 0 e 100.");
        } else {
            this.preco = this.preco - (this.preco * desconto/100);
            System.out.println("Desconto aplicado!");
            System.out.println("Preço: " + this.preco);
        }
    }
}
