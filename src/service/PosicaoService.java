package service;

import model.Campeonato;
import repository.PosicaoRepository;

public class PosicaoService {
	public Posicao GetPosicao(int indice) {
		PosicaoRepository repository = new PosicaoRepository();
		// Posicao result = repository.GetPosicao(indice); 
		// return result;
	}

	public void SetPosicao(Posicao posicao) {
		PosicaoRepository repository = new PosicaoRepository();

		// repository.SetPosicao(posicao);
	}
}
