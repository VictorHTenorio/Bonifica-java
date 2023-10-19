package br.gov.cesarschool.poo.bonusvendas.tela;

import org.eclipse.swt.widgets.*;

import br.gov.cesarschool.poo.bonusvendas.negocio.VendedorMediator;

import org.eclipse.swt.*;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TelaManutencaoVendedor {

	protected Shell shell;
	private Text txtCPF;
	private Text txtNomeCompleto;
	private Button radSexoM;
	private Button radSexoF;
	private Text txtDataNascimento;
	private Text txtRenda;
	private Text txtNumero;
	private Text txtComplemento;
	private Text txtCEP;
	private Text txtCidade;
	private Combo cmbEstado;
	private VendedorMediator mediator = VendedorMediator.getInstancia();
	private Text txtLogradouro;
	


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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
	    shell = new Shell();
	    shell.setSize(483, 382); // Ajustando o tamanho da janela para acomodar todos os campos
	    shell.setText("Manutenção de Vendedor");

	    // CPF
	    Label lblCPF = new Label(shell, SWT.NONE);
	    lblCPF.setText("CPF:");
	    lblCPF.setBounds(10, 39, 29, 20);
	    txtCPF = new Text(shell, SWT.BORDER);
	    txtCPF.setBounds(45, 39, 150, 20);

	    // Nome Completo
	    Label lblNomeCompleto = new Label(shell, SWT.NONE);
	    lblNomeCompleto.setText("Nome Completo:");
	    lblNomeCompleto.setBounds(10, 13, 114, 20);
	    txtNomeCompleto = new Text(shell, SWT.BORDER);
	    txtNomeCompleto.setBounds(130, 13, 300, 20);

	    // Sexo
	    Label lblSexo = new Label(shell, SWT.NONE);
	    lblSexo.setText("Sexo:");
	    lblSexo.setBounds(10, 70, 39, 20);
	    radSexoM = new Button(shell, SWT.RADIO);
	    radSexoM.addSelectionListener(new SelectionAdapter() {
	    	@Override
	    	public void widgetSelected(SelectionEvent e) {
	    	}
	    });
	    radSexoM.setText("Masculino");
	    radSexoM.setBounds(55, 70, 83, 20);
	    radSexoF = new Button(shell, SWT.RADIO);
	    radSexoF.setText("Feminino");
	    radSexoF.setBounds(161, 70, 100, 20);

	    // Data de Nascimento
	    Label lblDataNascimento = new Label(shell, SWT.NONE);
	    lblDataNascimento.setText("Data de Nascimento:");
	    lblDataNascimento.setBounds(10, 100, 150, 20);
	    txtDataNascimento = new Text(shell, SWT.BORDER);
	    txtDataNascimento.setBounds(161, 100, 109, 20);

	    // Renda
	    Label lblRenda = new Label(shell, SWT.NONE);
	    lblRenda.setText("Renda:");
	    lblRenda.setBounds(10, 202, 39, 20);
	    txtRenda = new Text(shell, SWT.BORDER);
	    txtRenda.setBounds(65, 202, 150, 20);

	    // ... (adicionar os campos restantes de forma similar)

	    // CEP
	    Label lblCEP = new Label(shell, SWT.NONE);
	    lblCEP.setText("CEP:");
	    lblCEP.setBounds(10, 228, 29, 20);
	    txtCEP = new Text(shell, SWT.BORDER);
	    txtCEP.setBounds(45, 228, 150, 20);

	    // Cidade
	    Label lblCidade = new Label(shell, SWT.NONE);
	    lblCidade.setText("Cidade:");
	    lblCidade.setBounds(10, 260, 45, 20);
	    txtCidade = new Text(shell, SWT.BORDER);
	    txtCidade.setBounds(55, 257, 200, 20);

	    // Estado
	    Label lblEstado = new Label(shell, SWT.NONE);
	    lblEstado.setText("Estado:");
	    lblEstado.setBounds(10, 286, 45, 20);
	    cmbEstado = new Combo(shell, SWT.NONE);
	    cmbEstado.setBounds(55, 283, 150, 20);
	    String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
	    cmbEstado.setItems(estados);

	    Button btnEnviar = new Button(shell, SWT.PUSH);
	    btnEnviar.setText("Enviar");
	    btnEnviar.setBounds(357, 303, 100, 30);
	    
	    Label lblLogradouro = new Label(shell, SWT.NONE);
	    lblLogradouro.setBounds(10, 126, 74, 15);
	    lblLogradouro.setText("Logradouro:");
	    
	    txtLogradouro = new Text(shell, SWT.BORDER);
	    txtLogradouro.setBounds(104, 120, 76, 21);
	    
	    Label lblNumero = new Label(shell, SWT.NONE);
	    lblNumero.setBounds(10, 148, 55, 15);
	    lblNumero.setText("Numero:");
	    
	    txtNumero = new Text(shell, SWT.BORDER);
	    txtNumero.setBounds(82, 145, 76, 21);
	    
	    Label lblComplemento = new Label(shell, SWT.NONE);
	    lblComplemento.setBounds(10, 172, 88, 15);
	    lblComplemento.setText("Complemento:");
	    
	    txtComplemento = new Text(shell, SWT.BORDER);
	    txtComplemento.setBounds(104, 172, 76, 21);
	    
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
		String dataNascimento = txtDataNascimento.getText();
		String renda = txtRenda.getText();
		String numero = txtNumero.getText();
		String Complemento = txtComplemento.getText();
		String Logradouro = txtLogradouro.getText();
		String CEP = txtCEP.getText();
		String cidade = txtCidade.getText();
		
		String cep = txtCEP.getText();
		// ... e assim por diante para os outros campos
		 if (cpf.length() != 11) {
	           mostrarMensagemErro("Formato do campo CPF inválido!");
	           return;
	       }
	// Validando Data de Nascimento
		 if (dataNascimento.matches("\\d{8}")) {
			    dataNascimento = dataNascimento.substring(0, 2) + "/" + 
			                     dataNascimento.substring(2, 4) + "/" + 
			                     dataNascimento.substring(4);
			}
		 if (!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
			    mostrarMensagemErro("Formato do campo Data de Nascimento inválido!");
			    return;
			}
	    
	    // Validando Número
	    if (!numero.matches("\\d{1,7}")) {
	        mostrarMensagemErro("Formato do campo Número inválido!");
	        return;
	    }

	    // Validando Renda
	    if (!renda.matches("\\d+\\.\\d+")) {
	        mostrarMensagemErro("Formato do campo Renda inválido!");
	        return;
	    }

	   

	    // Validando CEP
	    if (!cep.matches("\\d{8}")) {
	        mostrarMensagemErro("Formato do campo CEP inválido!");
	        return;
	    }
		// Realize as operações necessárias com os dados coletados

		// Se tudo estiver correto, você pode mostrar uma mensagem de sucesso:
		MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION | SWT.OK);
		messageBox.setMessage("Dados enviados com sucesso!");
		messageBox.open();
	}
	
	private void mostrarMensagemErro(String mensagem) {
	    MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
	    messageBox.setMessage(mensagem);
	    messageBox.open();
	}
}

