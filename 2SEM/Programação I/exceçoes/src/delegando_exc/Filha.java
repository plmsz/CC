package delegando_exc;

public class Filha {
	
	Neta classeNeta;

	public void executar() throws Exception{
		classeNeta = new Neta();
		classeNeta.executar();
	}

}
