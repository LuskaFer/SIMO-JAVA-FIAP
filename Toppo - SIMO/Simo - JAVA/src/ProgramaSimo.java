
public class ProgramaSimo {

	public static void main(String[] args) {
		
		Recrutamento vaga1 = new Recrutamento();
		vaga1.setNome("Ag�ncia de Empregos 'Agora vai!'");
		vaga1.setCargo("Auxiliar de Servi�os Gerais");
		vaga1.setHorario("Das 07:00 �s 16:00 hrs");
		vaga1.setSalario(1450.00);
		vaga1.setContratacao("CLT");
		vaga1.setBeneficios("VA + VR + VT + Conv�nio M�dico");
		vaga1.setTelefone("1245-7890");
		
		Recrutamento vaga2 = new Recrutamento();
		vaga2.setNome("Ag�ncia de Empregos 'Agora vai!'");
		vaga2.setCargo("Porteiro");
		vaga2.setHorario("Das 08:00 �s 18:00 hrs");
		vaga2.setSalario(1335.00);
		vaga2.setContratacao("CLT");
		vaga2.setBeneficios("VR + Cesta B�sica + VT + Conv�nio M�dico");
		vaga2.setTelefone("1245-7890");
		
		Recrutamento vaga3 = new Recrutamento();
		vaga3.setNome("Ag�ncia de Empregos 'Agora vai!'");
		vaga3.setCargo("Auxiliar Administrativo");
		vaga3.setHorario("Das 10:30 �s 18:30 hrs");
		vaga3.setSalario(1680.00);
		vaga3.setContratacao("CLT");
		vaga3.setBeneficios("VA + VR + VT + Conv�nio Odontol�gico + Conv�nio M�dico");
		vaga3.setTelefone("1245-7890");
		
		Usuario registro1 = new Usuario();
		registro1.setNome("Jos� Alves da Silva");
		registro1.setGenero ("Masculino");
		registro1.setTelefone("9898-3663");
		registro1.setDataDeNascimento("22/06/1980");
		registro1.setNacionalidade("Brasileiro");
		registro1.setEstadoCivil("Casado");
		registro1.setRg("44.799.635-9");
		registro1.setCpf("744.632.696-81");
		registro1.setHistoricoEscolar("Ensino M�dio Completo");
		registro1.setHistoricoProfissional("Possui Experi�ncia Anterior");
		registro1.setCargoDesejado("Auxiliar de Servi�os Gerais");
		
		HistoricoEscolar historico1 = new HistoricoEscolar();
		historico1.setEscolaridade("N�vel: Ensino M�dio Completo");
		historico1.setIntituicaoDeEnsino("Nome da Institui��o: E.E Presidente Deodoro da Fonseca");
		historico1.setAnoDeConclusao(1998);
		
		HistoricoProfissional profissional1 = new HistoricoProfissional();
		profissional1.setCargo("Cargo: Torneiro Mec�nico");
		profissional1.setEmpresa("Prada - Servi�os Metalurgicos");
		profissional1.setDataDeInicio("14/03/2001");
		profissional1.setDataDeSaida("22/09/2018");
		profissional1.setSalario(3850.00);
		
		CargoDesejado cargo1 = new CargoDesejado();
		cargo1.setCargoDesejado("Cargo: Auxiliar de Servi�os Gerais");
		cargo1.setFaixaSalarial(2000.00);
		cargo1.setCidade("S�o Paulo - SP");
		
		Usuario registro2 = new Usuario();
		registro2.setNome("Nome: Suzanna Teixeira dos Santos");
		registro2.setGenero("Sexo: Feminino");
		registro2.setTelefone("6338-0087");
		registro2.setDataDeNascimento("11/04/1984");
		registro2.setNacionalidade("Brasileiro");
		registro2.setEstadoCivil("Casada");
		registro2.setRg("14.102.643-1");
		registro2.setCpf("332.741.954.74");
		registro2.setHistoricoEscolar("Ensino Superior Completo");
		registro2.setHistoricoProfissional("Possui Experi�ncia Anterior");
		registro2.setCargoDesejado("Auxiliar Administrativo");
		
		HistoricoEscolar historico2 = new HistoricoEscolar();
		historico2.setEscolaridade("N�vel: Ensino Superior Completo");
		historico2.setIntituicaoDeEnsino("Uninove - Unidade Vergueiro");
		historico2.setCurso("Adminitra��o de Empresas");
		historico2.setAnoDeConclusao(2019);
		
		HistoricoProfissional profissional2 = new HistoricoProfissional();
		profissional2.setCargo("Cargo: Auxiliar Administrativo");
		profissional2.setEmpresa("Grupo BASF");
		profissional2.setDataDeInicio("15/09/2017");
		profissional2.setDataDeSaida("17/12/2019");
		profissional2.setSalario(1650.00);
		
		CargoDesejado cargo2 = new CargoDesejado();
		cargo2.setCargoDesejado("Auxiliar Administrativo");
		cargo2.setFaixaSalarial(2000.00);
		cargo2.setCidade("S�o Paulo - SP");
		
		Usuario registro3 = new Usuario();
		registro3.setNome("Nome: Fernando Carlos Silva");
		registro3.setGenero("Sexo: Masculino");
		registro3.setTelefone("7441-2525");
		registro3.setDataDeNascimento("07/02/1990");
		registro3.setNacionalidade("Brasileiro");
		registro3.setEstadoCivil("Solteiro");
		registro3.setRg("62.522.114-6");
		registro3.setCpf("411.258.941-35");
		registro3.setHistoricoEscolar("Ensino Superior Incompleto");
		registro3.setHistoricoProfissional("Possui Experi�ncia Anterior");
		registro3.setCargoDesejado("Porteiro");
		
		HistoricoEscolar historico3 = new HistoricoEscolar();
		historico3.setEscolaridade("N�vel: Ensino Superior Incompleto");
		historico3.setIntituicaoDeEnsino("Unip - Unidade Ch�cara Santo Antonio");
		historico3.setCurso("Engenharia de Produ��o");
		
		
		HistoricoProfissional profissional3 = new HistoricoProfissional();
		profissional3.setCargo("Cargo: Porteiro");
		profissional3.setEmpresa("GP Group");
		profissional3.setDataDeInicio("20/02/2016");
		profissional3.setDataDeSaida("11/10/2019");
		profissional3.setSalario(1450.00);
		
		CargoDesejado cargo3 = new CargoDesejado();
		cargo3.setCargoDesejado("Porteiro");
		cargo3.setFaixaSalarial(1500.00);
		cargo3.setCidade("S�o Paulo - SP");
		
		Usuario registro4 = new Usuario();
		registro4.setNome("Nome: Luiz Andr� Souza");
		registro4.setGenero("Sexo: Masculino");
		registro4.setTelefone("3388-4000");
		registro4.setDataDeNascimento("02/10/1974");
		registro4.setNacionalidade("Brasileiro");
		registro4.setEstadoCivil("Divorciado");
		registro4.setRg("64.552.141-2");
		registro4.setCpf("144.252.388-96");
		registro4.setHistoricoEscolar("Ensino M�dio Completo");
		registro4.setHistoricoProfissional("Possui Experi�ncia Anterior");
		registro4.setCargoDesejado("Auxiliar de Servi�os Gerais");
		
		HistoricoEscolar historico4 = new HistoricoEscolar();
		historico4.setEscolaridade("N�vel: Ensino M�dio Completo");
		historico4.setIntituicaoDeEnsino("E.E. Governador Franco Motoro");
		historico4.setAnoDeConclusao(1993);
		
		HistoricoProfissional profissional4 = new HistoricoProfissional();
		profissional4.setCargo("Cargo: Auxiliar de Servi�os Gerais");
		profissional4.setEmpresa("Empresa Elite Ltda");
		profissional4.setDataDeInicio("06/04/2009");
		profissional4.setDataDeSaida("17/07/2019");
		profissional4.setSalario(1380.00);
		
		CargoDesejado cargo4 = new CargoDesejado();
		cargo4.setCargoDesejado("Auxiliar de Servi�os Gerais");
		cargo4.setFaixaSalarial(1200.00);
		cargo4.setCidade("S�o Paulo - SP");
		
		
		System.out.println("SIMO - Painel de An�ncio de Vagas:");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Empresa Anunciante:" + vaga1.getNome());
		System.out.println("Vaga:" + vaga1.getCargo());
		System.out.println("Hor�rio:" + vaga1.getHorario());
		System.out.println("Sal�rio:" + vaga1.getSalario());
		System.out.println("Regime de Contrata��o:" + vaga1.getContratacao());
		System.out.println("Benef�cios:" + vaga1.getBeneficios());
		System.out.println("Telefone:" + vaga1.getTelefone());
		System.out.println(vaga1);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("Empresa Anunciante:" + vaga2.getNome());
		System.out.println("Vaga:" + vaga2.getCargo());
		System.out.println("Hor�rio:" + vaga2.getHorario());
		System.out.println("Sal�rio:" + vaga2.getSalario());
		System.out.println("Regime de Contrata��o:" + vaga2.getContratacao());
		System.out.println("Benef�cios:" + vaga2.getBeneficios());
		System.out.println("Telefone:" + vaga2.getTelefone());
		System.out.println(vaga2);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("Empresa Anunciante:" + vaga3.getNome());
		System.out.println("Vaga:" + vaga3.getCargo());
		System.out.println("Hor�rio:" + vaga3.getHorario());
		System.out.println("Sal�rio:" + vaga3.getSalario());
		System.out.println("Regime de Contrata��o:" + vaga3.getContratacao());
		System.out.println("Benef�cios:" + vaga3.getBeneficios());
		System.out.println("Telefone:" + vaga3.getTelefone());
		System.out.println(vaga3);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("Candidatos Cadastrados:");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Nome:" + registro1.getNome());
		System.out.println("G�nero:" + registro1.getGenero());
		System.out.println("Telefone:" + registro1.getTelefone());
		System.out.println("Data de Nascimento:" + registro1.getDataDeNascimento());
		System.out.println("Nacionalidade:" + registro1.getNacionalidade());
		System.out.println("Estado Civil:" + registro1.getEstadoCivil());
		System.out.println("RG:" + registro1.getRg());
		System.out.println("CPF:" + registro1.getCpf());
		System.out.println("Hist�rico Escolar:" + registro1.getHistoricoEscolar());
		System.out.println("Hist�rico Profissional:" + registro1.getHistoricoProfissional());
		System.out.println("Cargo Desejado:" + registro1.getCargoDesejado());
		System.out.println(registro1);
		System.out.println("");
		System.out.println("Hist�rico Escolar Completo:");
		System.out.println("Escolaridade:" + historico1.getEscolaridade());
		System.out.println("Institui��o de Ensino:" + historico1.getIntituicaoDeEnsino());
		System.out.println("Ano de Conclus�o:" + historico1.getAnoDeConclusao());
		System.out.println(historico1);
		System.out.println("");
		System.out.println("Hist�rico Profissional Completo:");
		System.out.println("Empresa:" + profissional1.getEmpresa());
		System.out.println("Cargo:" + profissional1.getCargo());
		System.out.println("Data Admiss�o:" + profissional1.getDataDeInicio());
		System.out.println("Data Demiss�o:" + profissional1.getDataDeSaida());
		System.out.println("Sal�rio:" + profissional1.getSalario());
		System.out.println(profissional1);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Nome:" + registro2.getNome());
		System.out.println("G�nero:" + registro2.getGenero());
		System.out.println("Telefone:" + registro2.getTelefone());
		System.out.println("Data de Nascimento:" + registro2.getDataDeNascimento());
		System.out.println("Nacionalidade:" + registro2.getNacionalidade());
		System.out.println("Estado Civil:" + registro2.getEstadoCivil());
		System.out.println("RG:" + registro2.getRg());
		System.out.println("CPF:" + registro2.getCpf());
		System.out.println("Hist�rico Escolar:" + registro2.getHistoricoEscolar());
		System.out.println("Hist�rico Profissional:" + registro2.getHistoricoProfissional());
		System.out.println("Cargo Desejado:" + registro2.getCargoDesejado());
		System.out.println(registro2);
		System.out.println("");
		System.out.println("Hist�rico Escolar Completo:");
		System.out.println("Escolaridade:" + historico2.getEscolaridade());
		System.out.println("Institui��o de Ensino:" + historico2.getIntituicaoDeEnsino());
		System.out.println("Ano de Conclus�o:" + historico2.getAnoDeConclusao());
		System.out.println(historico2);
		System.out.println("");
		System.out.println("Hist�rico Profissional Completo:");
		System.out.println("Empresa:" + profissional2.getEmpresa());
		System.out.println("Cargo:" + profissional2.getCargo());
		System.out.println("Data Admiss�o:" + profissional2.getDataDeInicio());
		System.out.println("Data Demiss�o:" + profissional2.getDataDeSaida());
		System.out.println("Sal�rio:" + profissional2.getSalario());
		System.out.println(profissional2);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Nome:" + registro3.getNome());
		System.out.println("G�nero:" + registro3.getGenero());
		System.out.println("Telefone:" + registro3.getTelefone());
		System.out.println("Data de Nascimento:" + registro3.getDataDeNascimento());
		System.out.println("Nacionalidade:" + registro3.getNacionalidade());
		System.out.println("Estado Civil:" + registro3.getEstadoCivil());
		System.out.println("RG:" + registro3.getRg());
		System.out.println("CPF:" + registro3.getCpf());
		System.out.println("Hist�rico Escolar:" + registro3.getHistoricoEscolar());
		System.out.println("Hist�rico Profissional:" + registro3.getHistoricoProfissional());
		System.out.println("Cargo Desejado:" + registro3.getCargoDesejado());
		System.out.println(registro3);
		System.out.println("");
		System.out.println("Hist�rico Escolar Completo:");
		System.out.println("Escolaridade:" + historico3.getEscolaridade());
		System.out.println("Institui��o de Ensino:" + historico3.getIntituicaoDeEnsino());
		System.out.println("Ano de Conclus�o:" + historico3.getAnoDeConclusao());
		System.out.println(historico3);
		System.out.println("");
		System.out.println("Hist�rico Profissional Completo:");
		System.out.println("Empresa:" + profissional3.getEmpresa());
		System.out.println("Cargo:" + profissional3.getCargo());
		System.out.println("Data Admiss�o:" + profissional3.getDataDeInicio());
		System.out.println("Data Demiss�o:" + profissional3.getDataDeSaida());
		System.out.println("Sal�rio:" + profissional3.getSalario());
		System.out.println(profissional3);
		System.out.println("");
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Nome:" + registro4.getNome());
		System.out.println("G�nero:" + registro4.getGenero());
		System.out.println("Telefone:" + registro4.getTelefone());
		System.out.println("Data de Nascimento:" + registro4.getDataDeNascimento());
		System.out.println("Nacionalidade:" + registro4.getNacionalidade());
		System.out.println("Estado Civil:" + registro4.getEstadoCivil());
		System.out.println("RG:" + registro4.getRg());
		System.out.println("CPF:" + registro4.getCpf());
		System.out.println("Hist�rico Escolar:" + registro4.getHistoricoEscolar());
		System.out.println("Hist�rico Profissional:" + registro4.getHistoricoProfissional());
		System.out.println("Cargo Desejado:" + registro4.getCargoDesejado());
		System.out.println(registro4);
		System.out.println("");
		System.out.println("Hist�rico Escolar Completo:");
		System.out.println("Escolaridade:" + historico4.getEscolaridade());
		System.out.println("Institui��o de Ensino:" + historico4.getIntituicaoDeEnsino());
		System.out.println("Ano de Conclus�o:" + historico4.getAnoDeConclusao());
		System.out.println(historico4);
		System.out.println("");
		System.out.println("Hist�rico Profissional Completo:");
		System.out.println("Empresa:" + profissional4.getEmpresa());
		System.out.println("Cargo:" + profissional4.getCargo());
		System.out.println("Data Admiss�o:" + profissional4.getDataDeInicio());
		System.out.println("Data Demiss�o:" + profissional4.getDataDeSaida());
		System.out.println("Sal�rio:" + profissional4.getSalario());
		System.out.println(profissional4);
		System.out.println("");
		
	}

}
