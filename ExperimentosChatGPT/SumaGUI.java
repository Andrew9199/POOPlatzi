/*Aqui nos dara error por el hecho de que no contamos con las librerias necesarias
podemos hacerla funcionar utilizando IntelliJIDEA el cual si cuenta con las librerias necesarias*/
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class SumaGUI implements ActionListener {
//     private JTextField num1Field, num2Field, resultadoField;
    
//     public SumaGUI() {
//         // Crear la ventana principal
//         JFrame ventana = new JFrame("Suma de dos números");
//         ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         ventana.setSize(300, 150);
        
//         // Crear el panel para los cuadros de texto y el botón
//         JPanel panel = new JPanel();
//         panel.setLayout(new GridLayout(3, 2));
//         JLabel num1Label = new JLabel("Número 1:");
//         num1Field = new JTextField(10);
//         JLabel num2Label = new JLabel("Número 2:");
//         num2Field = new JTextField(10);
//         JButton sumarButton = new JButton("Sumar");
//         sumarButton.addActionListener(this);
//         JLabel resultadoLabel = new JLabel("Resultado:");
//         resultadoField = new JTextField(10);
//         resultadoField.setEditable(false);
//         panel.add(num1Label);
//         panel.add(num1Field);
//         panel.add(num2Label);
//         panel.add(num2Field);
//         panel.add(sumarButton);
//         panel.add(resultadoLabel);
//         panel.add(resultadoField);
        
//         // Agregar el panel a la ventana y hacerla visible
//         ventana.add(panel);
//         ventana.setVisible(true);
//     }
    
//     public void actionPerformed(ActionEvent e) {
//         // Obtener los valores de los cuadros de texto
//         double num1 = Double.parseDouble(num1Field.getText());
//         double num2 = Double.parseDouble(num2Field.getText());
//         // Sumar los dos números
//         double resultado = num1 + num2;
//         // Mostrar el resultado en el cuadro de texto correspondiente
//         resultadoField.setText(Double.toString(resultado));
//     }
    
//     public static void main(String[] args) {
//         // Crear la GUI
//         new SumaGUI();
//     }
// }
