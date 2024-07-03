public class Dispositivo implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();


        dispositivo.tocar();
        dispositivo.pausar();
        dispositivo.selecionarMusica("Minha Música Favorita");


        dispositivo.ligar("123456789");
        dispositivo.atender();
        dispositivo.iniciarCorreioVoz();


        dispositivo.exibirPagina("https://www.exemplo.com");
        dispositivo.adicionarNovaAba();
        dispositivo.atualizarPagina();
    }

}
