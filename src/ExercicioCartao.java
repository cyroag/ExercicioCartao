
public class ExercicioCartao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CartaoPrePago cpp = new CartaoPrePago("1111 2222 3333 4444","Cyro de A Gianelli",2025,05,2000);
		CartaoCashBack ccb = new CartaoCashBack("9999 8888 7777 6666","Isidro",2028,01,1500,3);
		
		cpp.adicionarCredito(500);
		ccb.adicionarCredito(100);
		
		if(cpp.comprar(2000)) {
			System.out.println("Compra cartão de "+cpp.getNomeTitular()+" efetuada com sucesso. Saldo R$ "+cpp.getSaldo());
		}
		else {
			System.out.println("Compra não autorizada cartão "+cpp.getNumeroCartao()+". Saldo insuficiente. Saldo R$ "+cpp.getSaldo());
		}
		
		if (ccb.comprar(2000)) {
			System.out.println("Compra cartão de "+ccb.getNomeTitular()+" efetuada com sucesso. Saldo R$ "+ccb.getSaldo());
		}
		else {
			System.out.println("Compra não autorizada cartão "+ccb.getNumeroCartao()+". Saldo insuficiente. Saldo R$ "+ccb.getSaldo());
		}
	}
}
