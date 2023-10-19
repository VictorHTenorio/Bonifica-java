package br.gov.cesarschool.poo.bonusvendas.tela;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import br.gov.cesarschool.poo.bonusvendas.negocio.AcumuloResgateMediator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;

public class TelaAcumuloResgate {

	protected Shell shell;
	private Text textNumeroCaixaDeBonus;
	private Text textSaldoAtual;
	private Text textValor;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaAcumuloResgate window = new TelaAcumuloResgate();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private AcumuloResgateMediator mediator = AcumuloResgateMediator.getInstancia();

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
		shell.setSize(337, 355);
		shell.setText("SWT Application");
		
		textNumeroCaixaDeBonus = new Text(shell, SWT.BORDER);
		textNumeroCaixaDeBonus.setBounds(10, 32, 153, 21);
		
		Label lblNmeroDaCaixa = new Label(shell, SWT.NONE);
		lblNmeroDaCaixa.setBounds(10, 11, 153, 15);
		lblNmeroDaCaixa.setText("Número da caixa de bônus:");
		
		Button btnBuscar = new Button(shell, SWT.NONE);
		btnBuscar.setBounds(236, 30, 75, 25);
		btnBuscar.setText("Buscar");
		
		textSaldoAtual = new Text(shell, SWT.BORDER);
		textSaldoAtual.setBounds(10, 138, 153, 21);
		
		Label lblSaldoAtual = new Label(shell, SWT.NONE);
		lblSaldoAtual.setBounds(10, 117, 153, 15);
		lblSaldoAtual.setText("Saldo Atual:");
		
		Label lblOperao = new Label(shell, SWT.NONE);
		lblOperao.setBounds(10, 59, 55, 15);
		lblOperao.setText("Operação:");
		
		Button btnAcumulo = new Button(shell, SWT.RADIO);
		btnAcumulo.setBounds(10, 81, 75, 16);
		btnAcumulo.setText("Acumulo");
		
		Button btnResgate = new Button(shell, SWT.RADIO);
		btnResgate.setBounds(91, 81, 90, 16);
		btnResgate.setText("Resgate");
		
		Label lblTipoDeResgate = new Label(shell, SWT.NONE);
		lblTipoDeResgate.setBounds(10, 165, 153, 15);
		lblTipoDeResgate.setText("Tipo de Resgate:");
		
		textValor = new Text(shell, SWT.BORDER);
		textValor.setBounds(10, 236, 154, 21);
		
		Label lblValor = new Label(shell, SWT.NONE);
		lblValor.setBounds(11, 215, 55, 15);
		lblValor.setText("Valor:");
		
		Button btnVoltar = new Button(shell, SWT.NONE);
		btnVoltar.setBounds(10, 281, 75, 25);
		btnVoltar.setText("Voltar");
		
		Button btnAcumularresgatar = new Button(shell, SWT.NONE);
		btnAcumularresgatar.setBounds(179, 281, 132, 25);
		btnAcumularresgatar.setText("Acumular/Resgatar");
		
		Combo comboTipoResgate = new Combo(shell, SWT.NONE);
		comboTipoResgate.setItems(new String[] {"Produto", "Serviço", "Cash"});
		comboTipoResgate.setBounds(10, 186, 91, 23);

	}
}
