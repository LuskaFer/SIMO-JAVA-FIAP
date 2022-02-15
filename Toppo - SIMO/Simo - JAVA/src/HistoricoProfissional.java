
public class HistoricoProfissional extends Usuario {

	private String cargo;
	private String empresa;
	private String dataDeInicio;
	private String dataDeSaida;
	private double salario;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public String getDataDeSaida() {
		return dataDeSaida;
	}

	public void setDataDeSaida(String dataDeSaida) {
		this.dataDeSaida = dataDeSaida;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
