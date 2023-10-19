package br.gov.cesarschool.poo.bonusvendas.tela;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;

public class TelaManutencaoVendedor {

	protected Shell shell;
	private Text txtCPF;
	private Text txtNomeCompleto;
	private Button radSexoM;
	private Button radSexoF;
	private Text txtDataNascimento;
	private Text txtRenda;
	private Text txtLogradouro;
	private Text txtNumero;
	private Text txtComplemento;
	private Text txtCEP;
	private Text txtCidade;
	private Combo cmbEstado;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaManutencaoVendedor window = new TelaManutencaoVendedor();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
	    shell = new Shell();
	    shell.setSize(600, 500); // Ajustando o tamanho da janela para acomodar todos os campos
	    shell.setText("Manutenção de Vendedor");

	    // CPF
	    Label lblCPF = new Label(shell, SWT.NONE);
	    lblCPF.setText("CPF:");
	    lblCPF.setBounds(10, 10, 100, 20);
	    txtCPF = new Text(shell, SWT.BORDER);
	    txtCPF.setBounds(120, 10, 150, 20);

	    // Nome Completo
	    Label lblNomeCompleto = new Label(shell, SWT.NONE);
	    lblNomeCompleto.setText("Nome Completo:");
	    lblNomeCompleto.setBounds(10, 40, 100, 20);
	    txtNomeCompleto = new Text(shell, SWT.BORDER);
	    txtNomeCompleto.setBounds(120, 40, 300, 20);

	    // Sexo
	    Label lblSexo = new Label(shell, SWT.NONE);
	    lblSexo.setText("Sexo:");
	    lblSexo.setBounds(10, 70, 100, 20);
	    radSexoM = new Button(shell, SWT.RADIO);
	    radSexoM.setText("Masculino");
	    radSexoM.setBounds(120, 70, 100, 20);
	    radSexoF = new Button(shell, SWT.RADIO);
	    radSexoF.setText("Feminino");
	    radSexoF.setBounds(230, 70, 100, 20);

	    // Data de Nascimento
	    Label lblDataNascimento = new Label(shell, SWT.NONE);
	    lblDataNascimento.setText("Data de Nascimento:");
	    lblDataNascimento.setBounds(10, 100, 150, 20);
	    txtDataNascimento = new Text(shell, SWT.BORDER);
	    txtDataNascimento.setBounds(170, 100, 100, 20);

	    // Renda
	    Label lblRenda = new Label(shell, SWT.NONE);
	    lblRenda.setText("Renda:");
	    lblRenda.setBounds(10, 130, 100, 20);
	    txtRenda = new Text(shell, SWT.BORDER);
	    txtRenda.setBounds(120, 130, 150, 20);

	    // ... (adicionar os campos restantes de forma similar)

	    // CEP
	    Label lblCEP = new Label(shell, SWT.NONE);
	    lblCEP.setText("CEP:");
	    lblCEP.setBounds(10, 250, 100, 20);
	    txtCEP = new Text(shell, SWT.BORDER);
	    txtCEP.setBounds(120, 250, 150, 20);

	    // Cidade
	    Label lblCidade = new Label(shell, SWT.NONE);
	    lblCidade.setText("Cidade:");
	    lblCidade.setBounds(10, 280, 100, 20);
	    txtCidade = new Text(shell, SWT.BORDER);
	    txtCidade.setBounds(120, 280, 200, 20);

	    // Estado
	    Label lblEstado = new Label(shell, SWT.NONE);
	    lblEstado.setText("Estado:");
	    lblEstado.setBounds(10, 310, 100, 20);
	    cmbEstado = new Combo(shell, SWT.NONE);
	    cmbEstado.setBounds(120, 310, 150, 20);
	    String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
	    cmbEstado.setItems(estados);

	    Button btnEnviar = new Button(shell, SWT.PUSH);
	    btnEnviar.setText("Enviar");
	    btnEnviar.setBounds(250, 430, 100, 30); // Posicionando o botão na parte inferior da tela

	    btnEnviar.addListener(SWT.Selection, new Listener() {
	        public void handleEvent(Event e) {
	            switch (e.type) {
	                case SWT.Selection:
	                    enviarDados();
	                    break;
	            }
	        }
	    });
	}
	private void enviarDados() {
		// Aqui você pode coletar os dados dos campos e realizar as operações necessárias.
		// Por exemplo, salvar os dados em um banco de dados ou atualizar um registro existente.

		String cpf = txtCPF.getText();
		String nomeCompleto = txtNomeCompleto.getText();
		// ... e assim por diante para os outros campos

		// Realize as operações necessárias com os dados coletados

		// Se tudo estiver correto, você pode mostrar uma mensagem de sucesso:
		MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION | SWT.OK);
		messageBox.setMessage("Dados enviados com sucesso!");
		messageBox.open();
	}
}
