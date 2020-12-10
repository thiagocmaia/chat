package prova1b;

public class Moderador extends Participante implements SuperParticipante{

	private Grupo grupo;

	public Moderador(String n) {
		super.nome = n;		
	}
	
	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.additionarParticipante(this);
		this.grupo = g;
		return g;
	}

	@Override
	public void addicionarParticipante(Participante p) {
		this.grupo.additionarParticipante(p);
		
	}

	@Override
	public boolean removerParticipante(Participante p) {
		this.grupo.removerParticipante(p);
		return true;
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
	
	public Grupo getGrupo() {
		return grupo;
	}
}
