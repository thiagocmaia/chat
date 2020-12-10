package prova1b;

import java.util.Arrays;

public class Grupo {

	private String nome;
	private Mensagem[] mensagens;
	private Participante[] participantes;
	
	public Grupo(String n) {		
		this.nome = n;	
	}

	public void additionarParticipante(Participante p) {
		Participante[] ps = Arrays.copyOf(participantes, participantes.length + 1);
		ps[participantes.length] = p;
		this.participantes = ps;
	}
	
	public boolean removerParticipante(Participante p) {
		for (int i = 0; i < participantes.length; i++) {
			if(participantes[i].equals(p)) {
				Participante[] ps = new Participante[participantes.length -1];
				int remainingElements = participantes.length - (i + 1);
				System.arraycopy(participantes, 0, ps, 0, i);
				System.arraycopy(participantes, i+ 1, ps, i, remainingElements);
				
				this.participantes = ps;
				return true;
			}
		}
		return false;
	}
	
	public void enviarMensagem(Mensagem m) {
		Mensagem[] msg = Arrays.copyOf(mensagens, mensagens.length + 1);
		msg[mensagens.length] = m;
		this.mensagens = msg;
	}
	
	public Mensagem[] getMensagens() {
		return mensagens;
	}

	public String getNome() {
		return nome;
	}
	
	public Participante[] getParticipantes() {
		return participantes;
	}
	
}
