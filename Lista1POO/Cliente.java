package Lista1POO;
/*Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
 *  em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */
public class Cliente {
	
	private String nomeCliente;
	private String cpfCliente;
	private String endere�o;
	
	public Cliente (String nome, String cpf, String endere�o)
	{
		this.nomeCliente = nome;
		this.cpfCliente = cpf;
		this.endere�o = endere�o;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	public void infoCliente()
	{
		System.out.println("Nome do cliente: "+nomeCliente+" cpf: "+cpfCliente+" endere�o: "+endere�o);
	}

}
