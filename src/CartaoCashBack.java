
public class CartaoCashBack extends CartaoPrePago{
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (valor > super.saldo) {
			return false;
		}
		else {
			super.saldo -= valor;
			switch(this.tipo) {
			case 1:
				super.saldo += valor*0.02;
				break;
			case 2:
				super.saldo += valor*0.05;
				break;
			case 3:
				super.saldo += valor*0.08;
				break;
			}			
			return true;
		}
	}

	@Override
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular
				+ ", saldo=" + saldo + "]";
	}
	
	

}
