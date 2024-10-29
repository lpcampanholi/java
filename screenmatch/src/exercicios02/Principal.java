package exercicios02;

public class Principal {
    public static void main(String[] args) {

        // Conta Bancaria
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(3022);
        conta.setSaldo(1000.80);
        conta.titular = "João da Silva";

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(2000.50);
        System.out.println("Novo saldo: " + conta.getSaldo());

        // Idade Pessoa
        System.out.println("----------------");

        IdadePessoa novaPessoa = new IdadePessoa();
        novaPessoa.setNome("José Figueiredo");
        novaPessoa.setIdade(53);

        System.out.println("Nome: " + novaPessoa.getNome());
        System.out.println("Idade: " + novaPessoa.getIdade());

        // Produto
        System.out.println("----------------");
        Produto meuProduto = new Produto();
        meuProduto.setNome("Desodorante");
        meuProduto.setPreco(12.80);

        System.out.println("Produto: " + meuProduto.getNome());
        System.out.println("Preço: " + meuProduto.getPreco());

        meuProduto.aplicarDesconto(10);

    }
}
