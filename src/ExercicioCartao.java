import java.util.Scanner;

public class ExercicioCartao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		boolean deuCerto = false;
		
		do {
			try {
				
				CartaoPrePago cpp = new CartaoPrePago("1111 2222 3333 4444","Cyro de A Gianelli",2025,05,2000);
				CartaoCashBack ccb = new CartaoCashBack("9999 8888 7777 6666","Isidro",2028,01,1500,3);
				
				System.out.println("Digite o valor do crédito a inserir no cartão pré pago:");
				cpp.adicionarCredito(Float.parseFloat(teclado.nextLine()));
				
				System.out.println("Digite o valor do crédito a inserir no cartão cashback:");
				ccb.adicionarCredito(Float.parseFloat(teclado.nextLine()));
				
				System.out.println("Qual o valor da compra para cartão pré pago?");
				if(cpp.comprar(Float.parseFloat(teclado.nextLine()))) {
					System.out.println("Compra cartão de "+cpp.getNomeTitular()+" efetuada com sucesso. Saldo R$ "+cpp.getSaldo());
				}
				else {
					System.out.println("Compra não autorizada cartão "+cpp.getNumeroCartao()+". Saldo insuficiente. Saldo R$ "+cpp.getSaldo());
				}
				
				System.out.println("Qual o valor da compra para cartão cashback?");
				if (ccb.comprar(Float.parseFloat(teclado.nextLine()))) {
					System.out.println("Compra cartão de "+ccb.getNomeTitular()+" efetuada com sucesso. Saldo R$ "+ccb.getSaldo());
				}
				else {
					System.out.println("Compra não autorizada cartão "+ccb.getNumeroCartao()+". Saldo insuficiente. Saldo R$ "+ccb.getSaldo());
				}
				deuCerto = true;
				
			}
			catch (CardException e) {
				System.out.println("CardError - Erro de valor. Motivo: "+e.getMessage());
			}
			catch(Exception ex) {
				System.out.println("Erro desconhecido");
			}
		}while (!deuCerto);
		teclado.close();
	}
}
