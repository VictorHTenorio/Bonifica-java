package br.gov.cesarschool.poo.bonusvendas.tela;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;

import br.gov.cesarschool.poo.bonusvendas.entidade.Vendedor;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Endereco;
import br.gov.cesarschool.poo.bonusvendas.entidade.geral.Sexo;
import br.gov.cesarschool.poo.bonusvendas.negocio.ResultadoInclusaoVendedor;
import br.gov.cesarschool.poo.bonusvendas.negocio.VendedorMediator;

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

    public static void main(String[] args) {
        try {
            TelaManutencaoVendedor window = new TelaManutencaoVendedor();
            window.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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

    protected void createContents() {
        shell = new Shell();
        shell.setSize(600, 500);
        shell.setText("Manutenção de Vendedor");

        // ... (campos da tela)

        Button btnEnviar = new Button(shell, SWT.PUSH);
        btnEnviar.setText("Enviar");
        btnEnviar.setBounds(250, 430, 100, 30);

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
        Vendedor vendedor = new Vendedor();
        
        // Coletando os dados dos campos e preenchendo a instância de Vendedor
        vendedor.setCpf(txtCPF.getText());
        vendedor.setNomeCompleto(txtNomeCompleto.getText());
        // ... (colete e defina os outros campos)

        VendedorMediator mediator = VendedorMediator.getInstancia();
        ResultadoInclusaoVendedor resultado = mediator.validarVendedor(vendedor);

        if (resultado.getMensagemErroValidacao() != null) {
            MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
            messageBox.setMessage(resultado.getMensagemErroValidacao());
            messageBox.open();
            return;
        }

        resultado = mediator.incluir(vendedor);
        if (resultado.getMensagemErroValidacao() != null) {
            MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
            messageBox.setMessage(resultado.getMensagemErroValidacao());
            messageBox.open();
            return;
        }

        MessageBox messageBox = new MessageBox(shell, SWT.ICON_INFORMATION | SWT.OK);
        messageBox.setMessage("Dados enviados com sucesso!");
        messageBox.open();
    }
}
