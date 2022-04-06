package Lista1POO;
/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Cliente {
	
	private String nomeCliente;
	private String cpfCliente;
	private String endereço;
	
	public Cliente (String nome, String cpf, String endereço)
	{
		this.nomeCliente = nome;
		this.cpfCliente = cpf;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public void infoCliente()
	{
		System.out.println("Nome do cliente: "+nomeCliente+" cpf: "+cpfCliente+" endereço: "+endereço);
	}

}
