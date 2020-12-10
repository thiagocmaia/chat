package prova1b;

public class Usuario extends Participante {

	public Usuario (String nome) {
	this.nome = nome;
}
	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem m = new Mensagem(texto);
		g.enviarMensagem(m);		
	}
	@Override
	public String getNome() {
		return nome;
	}
	

}
