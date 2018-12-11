
	private static final long serialVersionUID = -6378541616489228055L;
	
	private List<Entrada> listaEntrada;
	private List<Servico> listaServico;
	
	public Entrada getEntity() {
		if (entity == null)
			entity = new Entrada();
		return entity;
	}
	
	public void limpar() {
		setEntity(null);
		listaEntrada = null;		
	}
	
	public TipoVeiculo[] getVetorTipoVeiculo() {
		return TipoVeiculo.values();
	}
	
	public void gerarCodigo() {
		Random random = new Random();
		Calendar cal = Calendar.getInstance();
		int sec = cal.get(Calendar.SECOND);
		int min = cal.get(Calendar.MINUTE);;
		int ano = cal.get(Calendar.YEAR);
		String rand = "" + ano + min + sec + random.nextInt(9)*2; //criar em forma de string para concatenar
		int cod = Integer.parseInt(rand); //converte o valor gerado que antes era String para INT
		entity.setCodigo(cod);
	}
	
	public List<Servico> getListaServico(){
		ServicoRepository repository = new ServicoRepository(getEntityManager());
		if(listaServico == null)
			listaServico = repository.getServico();
		return listaServico;
	}
	
	
	public List<Entrada> getListaEntrada() {
		EntradaRepository repository = new EntradaRepository(getEntityManager());
		if (listaEntrada == null)
			listaEntrada = repository.getEntrada();
		return listaEntrada;
	}
	

