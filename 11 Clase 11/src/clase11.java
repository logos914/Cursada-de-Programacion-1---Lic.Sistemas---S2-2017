
public class clase11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha hoyEs = new Fecha(2082518725);
		hoyEs.imprimir();
		
		System.out.print("\n");
		
		int cantDias = Fecha.diasDelMes(5,1992);
		
		System.out.print(cantDias);
		
		
		Fecha fecha1 = new Fecha(28,2,1992);
		Fecha fecha2 = new Fecha(19,3,1992);
		
		cantDias = fecha1.diasDeDiferenciaCon(fecha2);
		System.out.print("\n");
		System.out.print(cantDias);
}
}
