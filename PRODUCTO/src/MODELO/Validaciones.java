package MODELO;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author User
 */
public class Validaciones extends DocumentFilter {
    private WindowFocusListener oyenteventana;
    public static final String MATCH_LETRAS = "^[a-zA-Z\\s]*$";//permite espacios
    public static final String MATCH_PASSWORD = "^[\\u2022]*$|^[a-zA-Z0-9 -p]*$";
    public static final String MATCH_NUMEROS = "^[0-9]*$";
    public static final String MATCH_NUMEROS_DOUBLES = "[0-9]+['.']?[0-9]*";
//    public static final String MATCH_NUMEROS_DOUBLES = "[0-9]*['.']?[0-9]*";
    public static final String MATCH_EMAILS = "^[a-zA-Z0-9@_.-]+$";
    public static final String MATCH_PLACAS = "^[a-zA-Z]{0,4}([0-9]){0,4}";
    public static final String DIALOG_ERROR = "icons8_error_70px";
    public static final String DIALOG_INFO = "icons8_info_70px";
    public static final String DIALOG_WARNING = "icons8_warning_shield_70px";
    public static final String DIALOG_IMPORTANT = "icons8_box_important_70px";
    public static final String DIALOG_SUCCES = "icons8_ok_70px";
    //PARA VALIDACIONES AL GUARDAR
//        ^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$
//        ^[A-Z]{3}([-]){0,1}([0-9]){4}
//"^[a-zA-Z0-9 -p]*$";
//^[a-zA-Z]{0,3}([-]){0,1}([0-9]){0,4}
//    protected Styles styles = new Styles();

    public DocumentFilter createFilteredField(JTextField field, int maxChar, String match) {

        DocumentFilter df;
        ((AbstractDocument) field.getDocument()).setDocumentFilter(df = new DocumentFilter() {

            @Override
            public void replace(DocumentFilter.FilterBypass fb, int offs, int length, String str, AttributeSet a) throws BadLocationException {
                String text = fb.getDocument().getText(0, fb.getDocument().getLength());
                text += str;
                if ((fb.getDocument().getLength() + str.length() - length) <= maxChar && text.matches(match)) {
                    if (match.equals(MATCH_EMAILS) || match.equals(MATCH_PASSWORD)) {
                        fb.replace(offs, length, str, a);
                    } else {
                        fb.replace(offs, length, str.toUpperCase(), a);
                    }
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            @Override
            public void insertString(DocumentFilter.FilterBypass fb, int offs, String str, AttributeSet a) throws BadLocationException {
                String text = fb.getDocument().getText(0, fb.getDocument().getLength());
                text += str;
                if ((fb.getDocument().getLength() + str.length()) <= maxChar && text.matches(match)) {
                    if (match.equals(MATCH_EMAILS) || match.equals(MATCH_PASSWORD)) {
                        fb.insertString(offs, str, a);
                    } else {
                        fb.insertString(offs, str.toUpperCase(), a);
                    }
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        return df;
    }
     
    public void validarJDialog(JDialog jdexample){
        oyenteventana =new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent we) {
            }

            @Override
            public void windowLostFocus(WindowEvent we) {
                int confirm=1;
                if(jdexample.isShowing()){
                confirm = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere salir? Los datos no guardados, se perderan",null,JOptionPane.YES_NO_OPTION);
                jdexample.show(true);
                }
                if (confirm==0) {
                jdexample.dispose();
                }            
            }
        };
        jdexample.addWindowFocusListener(oyenteventana);
    }
    
    public void QuitarJDialog(JDialog jdexample){
        jdexample.removeWindowFocusListener(oyenteventana);
    }
    
}
