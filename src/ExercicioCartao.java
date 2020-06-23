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
				
				System.out.println("Digite o valor do cr�dito a inserir no cart�o pr� pago:");
				cpp.adicionarCredito(Float.parseFloat(teclado.nextLine()));
				
				System.out.println("Digite o valor do cr�dito a inserir no cart�o cashback:");
				ccb.adicionarCredito(Float.parseFloat(teclado.nextLine()));
				
				System.out.println("Qual o valor da compra para cart�o pr� pago?");
				if(cpp.comprar(Float.parseFloat(teclado.nextLine()))) {
					System.out.println("Compra cart�o de "+cpp.getNomeTitular()+" efetuada com sucesso. Saldo R$ "+cpp.getSaldo());
				}
				else {
					System.out.println("Compra n�o autorizada cart�o "+cpp.getNumeroCartao()+". Saldo insuficiente. Saldo R$ "+cpp.getSaldo());
				}
				
				System.out.println("Qual o valor da compra para cart�o cashback?");
				if (ccb.comprar(Float.parseFloat(teclado.nextLine()))) {
					System.out.println("Compra cart�o de "+ccb.getNomeTitular()+" efetuada com sucesso. Saldo R$ "+ccb.getSaldo());
				}
				else {
					System.out.println("Compra n�o autorizada cart�o "+ccb.getNumeroCartao()+". Saldo insuficiente. Saldo R$ "+ccb.getSaldo());
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
