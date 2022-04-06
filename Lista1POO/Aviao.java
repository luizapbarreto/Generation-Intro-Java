package Lista1POO;
/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Aviao {
	
	private String modelo;
	private int tamanho;
	private String cor;
	
	public Aviao (String modelo,int tamanho,String cor)
	{
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimirAviao()
	{
		System.out.println("Modelo do avião: "+modelo+" Tamanho: "+tamanho+" cor: "+cor);
	}
	
	
}
