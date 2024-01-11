import javax.swing.JOptionPane;

public class Bancomundi {
	private String nome;
	private int conta;
	private double saldo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setQuantidade(int conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Bancomundi() {
		this("", 0, 0);
	}
	public Bancomundi(String nome, int conta, double saldo) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void lerDados() {
		this.nome = JOptionPane.showMenssageDialog("Digite o nome:");
		this.conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\nPreço: " + this.getConta() + 
												"\nQuantidade: " + this.getSaldo());	
	}
	
	public void depositar() {
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser depositada:"));
		this.setQuantidade(this.getSaldo() + qtde);		
	}
	
	public void sacar() {
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que você deseja sacar:"));
		this.setQuantidade(this.getSaldo() - qtde);		
	}
	public void calcularJuros{
		double juros = Double.parseDouble(JOptionPane.showInputDialog("Digite o juros")
				this.setSaldo(this.getSaldo() + (this.getSaldo() * juro)/100))
}


}
