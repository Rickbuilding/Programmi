import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Geometria extends JFrame implements ActionListener {
   private JTextField baseField, altezzaField;
   private JLabel areaTriangoloLabel, perimetroRettangoloLabel, areaRettangoloLabel;

   public Geometria() {
      setTitle("Calcolatore di Geometria");
      setSize(400, 200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      // Creiamo i componenti della GUI
      JLabel baseLabel = new JLabel("Base: ");
      JLabel altezzaLabel = new JLabel("Altezza: ");
      baseField = new JTextField(10);
      altezzaField = new JTextField(10);
      JButton calculateButton = new JButton("Calcola");
      calculateButton.addActionListener(this);

      areaTriangoloLabel = new JLabel("Area del triangolo: ");
      perimetroRettangoloLabel = new JLabel("Perimetro del rettangolo: ");
      areaRettangoloLabel = new JLabel("Area del rettangolo: ");

      // Creiamo un pannello per organizzare i componenti
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 2));
      panel.add(baseLabel);
      panel.add(baseField);
      panel.add(altezzaLabel);
      panel.add(altezzaField);
      panel.add(calculateButton);

      // Aggiungiamo i componenti alla finestra principale
      Container contentPane = getContentPane();
      contentPane.add(panel, BorderLayout.CENTER);
      contentPane.add(areaTriangoloLabel, BorderLayout.NORTH);
      contentPane.add(perimetroRettangoloLabel, BorderLayout.WEST);
      contentPane.add(areaRettangoloLabel, BorderLayout.EAST);
   }

   public void actionPerformed(ActionEvent e) {
      // Leggiamo i valori di base e altezza
      double base = Double.parseDouble(baseField.getText());
      double altezza = Double.parseDouble(altezzaField.getText());

      // Calcoliamo l'area del triangolo
      double areaTriangolo = 0.5 * base * altezza;
      areaTriangoloLabel.setText("Area del triangolo: " + areaTriangolo);

      // Calcoliamo il perimetro del rettangolo
      double perimetroRettangolo = 2 * (base + altezza);
      perimetroRettangoloLabel.setText("Perimetro del rettangolo: " + perimetroRettangolo);

      // Calcoliamo l'area del rettangolo
      double areaRettangolo = base * altezza;
      areaRettangoloLabel.setText("Area del rettangolo: " + areaRettangolo);

   }

  
}
