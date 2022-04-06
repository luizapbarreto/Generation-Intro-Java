package Lista1POO;
/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto produto eletr�nico, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */
public class ProdutoEletronico {
	
	private String tipoProduto;
	private double valor;
	private String modelo;
	
	public ProdutoEletronico (String produto, double valor, String modelo)
	{
		this.tipoProduto = produto;
		this.valor = valor;
		this.modelo = modelo;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor*valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
