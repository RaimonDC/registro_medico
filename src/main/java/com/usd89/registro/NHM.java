package com.usd89.registro;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

public class NHM {
    private JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public NHM() {
        frame = new JFrame("Expediente Médico");
        frame.setSize(1120, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setShape(new RoundRectangle2D.Double(0, 0, frame.getWidth(), frame.getHeight(), 30, 20));
        frame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        JPanel panel1 = createPanel1();
        JPanel panel2 = createPanel2();
        JPanel panel3 = createPanel3();

        mainPanel.add(panel1, "panel1");
        mainPanel.add(panel2, "panel2");
        mainPanel.add(panel3, "panel3");

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JPanel createPanel1() {
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(0, 0, 1120, 720);
        frame.add(Panel);

        // Cerrar ventana
        final JLabel Cerrar = Elementos.cerrar(1090, 10, 20, 20);
        Panel.add(Cerrar);
        Cerrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.dispose(); // Cierra la ventana
            }

            public void mouseEntered(MouseEvent e) {
                Cerrar.setForeground(Color.RED);
            }

            public void mouseExited(MouseEvent e) {
                Cerrar.setForeground(Color.WHITE);
            }
        });

        // Minimizar
        final JLabel Minimizar = Elementos.minimizar(1070, 10, 20, 20);
        Panel.add(Minimizar);
        Minimizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.setExtendedState(1);
            }

            public void mouseEntered(MouseEvent e) {
                Minimizar.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e) {
                Minimizar.setForeground(Color.white);
            }
        });

        // PRIMERA FILA
        int fila_x = 36;
        final JLabel label_apellido_familiar = Elementos.crearJLabel(fila_x, 65, 150, 20, "Apellido de tu familia:",
                false);
        fila_x += label_apellido_familiar.getWidth();
        Panel.add(label_apellido_familiar);

        final JTextField text_apellido_familiar = Elementos.crearJTextField(fila_x + 5, 65, 150, 20, "", true);
        fila_x += text_apellido_familiar.getWidth();
        Panel.add(text_apellido_familiar);

        final JLabel label_ci_jefe_familia = Elementos.crearJLabel(fila_x + 15, 65, 130, 20, "C.I Jefe de familia:",
                false);
        fila_x += label_ci_jefe_familia.getWidth();
        Panel.add(label_ci_jefe_familia);

        final JTextField text_ci_jefe_familia = Elementos.crearJTextField(fila_x + 15, 65, 150, 20, "", true);
        fila_x += text_ci_jefe_familia.getWidth();
        Panel.add(text_ci_jefe_familia);

        final JLabel Label_Numero_de_Historia = Elementos.crearJLabel(fila_x + 25, 65, 130, 20, "C.I Jefe de familia:",
                false);
        fila_x += Label_Numero_de_Historia.getWidth();
        Panel.add(Label_Numero_de_Historia);

        final JTextField text_Numero_de_Historia = Elementos.crearJTextField(fila_x + 25, 65, 150, 20, "", true);
        fila_x += text_Numero_de_Historia.getWidth();
        Panel.add(text_Numero_de_Historia);

        // Segunda linea
        final JLabel Label_ci = Elementos.crearJLabel(36, 95, 20, 20, "CI", false);
        Panel.add(Label_ci);
        final JComboBox<String> ci_ComboBox = new JComboBox<String>(new String[] { "V", "E" });
        ci_ComboBox.setBounds(61, 95, 40, 20);
        Panel.add(ci_ComboBox);

        final JTextField text_ci = Elementos.crearJTextField(105, 95, 150, 20, "", true);
        Panel.add(text_ci);

        final JLabel label_apellido = Elementos.crearJLabel(270, 95, 70, 20, "Apellido:", false);
        Panel.add(label_apellido);

        final JTextField text_apellido = Elementos.crearJTextField(335, 95, 150, 20, "", true);
        Panel.add(text_apellido);

        final JLabel label_nombre = Elementos.crearJLabel(500, 95, 65, 20, "Nombre:", false);
        Panel.add(label_nombre);

        final JTextField text_nombre = Elementos.crearJTextField(565, 95, 130, 20, "", true);
        Panel.add(text_nombre);

        final JLabel label_estadoCivil = Elementos.crearJLabel(700, 95, 90, 20, "Estado civil:", false);
        Panel.add(label_estadoCivil);

        final JComboBox<String> ComboBox_estadoCivil = new JComboBox<String>(new String[] { "S", "C", "V", "D", "O" });
        ComboBox_estadoCivil.setBounds(790, 95, 50, 20);
        Panel.add(ComboBox_estadoCivil);

        final JLabel label_Ocupacion = Elementos.crearJLabel(860, 95, 80, 20, "Ocupacion:", false);
        Panel.add(label_Ocupacion);

        final JTextField text_Ocupacion = Elementos.crearJTextField(943, 95, 100, 20, "", true);
        Panel.add(text_Ocupacion);

        // Tercera linea
        final JLabel label_Estudios = Elementos.crearJLabel(36, 125, 80, 20, "Estudios:", false);
        Panel.add(label_Estudios);

        final JComboBox<String> combo_estudio = new JComboBox<String>(new String[] { "P", "S", "U", "O" });
        combo_estudio.setBounds(110, 125, 50, 20);
        Panel.add(combo_estudio);

        final JLabel label_anosAprovados = Elementos.crearJLabel(170, 125, 120, 20, "Años aprovados:", false);
        Panel.add(label_anosAprovados);

        final JTextField text_anosAprovados = Elementos.crearJTextField(295, 125, 80, 20, "", true);
        Panel.add(text_anosAprovados);

        final JLabel label_Analfabeta = Elementos.crearJLabel(380, 125, 80, 20, "Analfabeta:", false);
        Panel.add(label_Analfabeta);

        final JComboBox<String> combo_Analfabeta = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Analfabeta.setBounds(465, 125, 50, 20);
        Panel.add(combo_Analfabeta);

        final JLabel label_Sexo = Elementos.crearJLabel(525, 125, 50, 20, "Sexo:", false);
        Panel.add(label_Sexo);

        final JComboBox<String> combo_sexo = new JComboBox<String>(new String[] { "F", "M" });
        combo_sexo.setBounds(575, 125, 50, 20);
        Panel.add(combo_sexo);

        // FECHA DE NACIMIENTO
        final JLabel label_fechaNacimiento = Elementos.crearJLabel(630, 125, 130, 20, "Fecha nacimiento:", false);
        Panel.add(label_fechaNacimiento);

        final JTextField text_NDia = Elementos.crearJTextField(765, 125, 50, 20, "DD", true);
        final JTextField text_NMes = Elementos.crearJTextField(815, 125, 50, 20, "MM", true);
        final JTextField text_NaAno = Elementos.crearJTextField(865, 125, 50, 20, "AA", true);
        Panel.add(text_NDia);
        Panel.add(text_NMes);
        Panel.add(text_NaAno);

        final JLabel label_LugarNacimento = Elementos.crearJLabel(36, 175, 150, 20, "Lugar de nacimiento:", false);
        Panel.add(label_LugarNacimento);

        final JTextField text_LugarNacimento = Elementos.crearJTextField(190, 175, 150, 20, "", true);
        Panel.add(text_LugarNacimento);

        final JLabel label_Estado = Elementos.crearJLabel(345, 175, 80, 20, "Estado:", false);
        Panel.add(label_Estado);

        final JTextField texto_Estado = Elementos.crearJTextField(400, 175, 100, 20, "", true);
        Panel.add(texto_Estado);

        final JLabel label_Pais = Elementos.crearJLabel(505, 175, 40, 20, "Pais:", false);
        Panel.add(label_Pais);

        final JTextField texto_Pais = Elementos.crearJTextField(545, 175, 100, 20, "", true);
        Panel.add(texto_Pais);

        final JLabel label_Dirrecion = Elementos.crearJLabel(650, 175, 80, 20, "Dirrecion:", false);
        Panel.add(label_Dirrecion);

        final JTextField texto_Dirrecion = Elementos.crearJTextField(725, 175, 325, 20, "", true);
        Panel.add(texto_Dirrecion);

        // Cuarta linea
        fila_x = 36;
        final JLabel label_Telefono = Elementos.crearJLabel(fila_x, 205, 70, 20, "Telefono:", false);
        fila_x += label_Telefono.getWidth();
        Panel.add(label_Telefono);

        final JTextField texto_Telefono = Elementos.crearJTextField(fila_x + 5, 205, 100, 20, "", true);
        fila_x += texto_Telefono.getWidth();
        Panel.add(texto_Telefono);

        final JLabel label_Religion = Elementos.crearJLabel(fila_x + 15, 205, 70, 20, "Religion:", false);
        fila_x += label_Religion.getWidth();
        Panel.add(label_Religion);

        final JTextField texto_Religion = Elementos.crearJTextField(fila_x + 15, 205, 100, 20, "", true);
        fila_x += texto_Religion.getWidth();
        Panel.add(texto_Religion);

        final JLabel label_Establecimiento = Elementos.crearJLabel(fila_x + 25, 205, 120, 20, "Establecimiento:",
                false);
        fila_x += label_Establecimiento.getWidth();
        Panel.add(label_Establecimiento);

        final JTextField texto_Establecimiento = Elementos.crearJTextField(fila_x + 25, 205, 110, 20, "", true);
        fila_x += texto_Establecimiento.getWidth();
        Panel.add(texto_Establecimiento);

        final JLabel label_Municipio = Elementos.crearJLabel(fila_x + 35, 205, 80, 20, "Municipio:", false);
        fila_x += label_Municipio.getWidth();
        Panel.add(label_Municipio);

        final JTextField texto_Municipio = Elementos.crearJTextField(fila_x + 35, 205, 120, 20, "", true);
        fila_x += texto_Municipio.getWidth();
        Panel.add(texto_Municipio);

        final JLabel label_Parroquia = Elementos.crearJLabel(fila_x + 45, 205, 80, 20, "Parroquia:", false);
        fila_x += label_Parroquia.getWidth();
        Panel.add(label_Parroquia);

        final JTextField texto_Parroquia = Elementos.crearJTextField(fila_x + 45, 205, 120, 20, "", true);
        fila_x += texto_Parroquia.getWidth();
        Panel.add(texto_Parroquia);

        // Quinta linea
        fila_x = 36;
        final JLabel label_Comunidad = Elementos.crearJLabel(fila_x, 235, 85, 20, "Comunidad:", false);
        fila_x += label_Comunidad.getWidth();
        Panel.add(label_Comunidad);

        final JTextField texto_Comunidad = Elementos.crearJTextField(fila_x + 5, 235, 120, 20, "", true);
        fila_x += texto_Comunidad.getWidth();
        Panel.add(texto_Comunidad);

        // Sextima linea
        fila_x = 36;
        final JLabel label_Madre_N_A = Elementos.crearJLabel(fila_x, 310, 220, 20, "Nombre y apellido de la madre:",
                false);
        fila_x += label_Madre_N_A.getWidth();
        Panel.add(label_Madre_N_A);

        final JTextField texto_Madre_N_A = Elementos.crearJTextField(fila_x + 5, 310, 200, 20, "", true);
        fila_x += texto_Madre_N_A.getWidth();
        Panel.add(texto_Madre_N_A);

        final JLabel label_Madre_Ocupacion = Elementos.crearJLabel(fila_x + 15, 310, 85, 20, "Ocupacion:", false);
        fila_x += label_Madre_Ocupacion.getWidth();
        Panel.add(label_Madre_Ocupacion);

        final JTextField texto_Madre_Ocupacion = Elementos.crearJTextField(fila_x + 15, 310, 100, 20, "", true);
        fila_x += texto_Madre_Ocupacion.getWidth();
        Panel.add(texto_Madre_Ocupacion);

        // Octaba linea
        fila_x = 36;
        final JLabel label_Padre_N_A = Elementos.crearJLabel(fila_x, 335, 220, 20, "Nombre y apellido de la padre:",
                false);
        fila_x += label_Padre_N_A.getWidth();
        Panel.add(label_Padre_N_A);

        final JTextField texto_Padre_N_A = Elementos.crearJTextField(fila_x + 5, 335, 200, 20, "", true);
        fila_x += texto_Padre_N_A.getWidth();
        Panel.add(texto_Padre_N_A);

        final JLabel label_Padre_Ocupacion = Elementos.crearJLabel(fila_x + 15, 335, 85, 20, "Ocupacion:", false);
        fila_x += label_Padre_Ocupacion.getWidth();
        Panel.add(label_Padre_Ocupacion);

        final JTextField texto_Padre_Ocupacion = Elementos.crearJTextField(fila_x + 15, 335, 100, 20, "", true);
        fila_x += texto_Padre_Ocupacion.getWidth();
        Panel.add(texto_Padre_Ocupacion);

        // Nobena linea
        fila_x = 36;
        final JLabel label_Representante = Elementos.crearJLabel(fila_x, 360, 110, 20, "Representante:", false);
        fila_x += label_Representante.getWidth();
        Panel.add(label_Representante);

        final JComboBox<String> combo_Representante = new JComboBox<String>(new String[] { "Padre", "Madre", "Otros" });
        combo_Representante.setBounds(fila_x + 5, 360, 80, 20);
        fila_x += combo_Representante.getWidth();
        Panel.add(combo_Representante);

        final JLabel label_Representante_N = Elementos.crearJLabel(fila_x + 15, 360, 70, 20, "Nombre:", false);
        fila_x += label_Representante_N.getWidth();
        Panel.add(label_Representante_N);

        final JTextField texto_Representante_N = Elementos.crearJTextField(fila_x + 10, 360, 100, 20, "", true);
        fila_x += texto_Representante_N.getWidth();
        Panel.add(texto_Representante_N);

        final JLabel label_Representante_ci = Elementos.crearJLabel(fila_x + 20, 360, 60, 20, "Cedula:", false);
        fila_x += label_Representante_ci.getWidth();
        Panel.add(label_Representante_ci);

        final JComboBox<String> combo__Representante_ci = new JComboBox<String>(new String[] { "V", "E" });
        combo__Representante_ci.setBounds(fila_x + 25, 360, 40, 20);
        fila_x += combo__Representante_ci.getWidth();
        Panel.add(combo__Representante_ci);

        final JTextField texto_Representante_ci = Elementos.crearJTextField(fila_x + 25, 360, 100, 20, "", true);
        fila_x += texto_Representante_ci.getWidth();
        Panel.add(texto_Representante_ci);

        final JLabel label_Representante_Telefono = Elementos.crearJLabel(fila_x + 35, 360, 70, 20, "Telefono:", false);
        fila_x += label_Representante_Telefono.getWidth();
        Panel.add(label_Representante_Telefono);

        final JTextField texto_Representante_Telefono = Elementos.crearJTextField(fila_x + 35, 360, 100, 20, "", true);
        fila_x += texto_Representante_Telefono.getWidth();
        Panel.add(texto_Representante_Telefono);

        // Antecedentes perinatales en menores de 12 años
        fila_x = 36;
        final JLabel label_CarnetPrenatal = Elementos.crearJLabel(fila_x, 470, 180, 20, "Carnet prenatal:", false);
        fila_x += label_CarnetPrenatal.getWidth();
        Panel.add(label_CarnetPrenatal);

        final JComboBox<String> combo_Carnet_prenatal = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Carnet_prenatal.setBounds(fila_x + 5, 470, 40, 20);
        fila_x += combo_Carnet_prenatal.getWidth();
        Panel.add(combo_Carnet_prenatal);

        fila_x = 36;
        final JLabel label_patologiaEmbarazo = Elementos.crearJLabel(fila_x, 500, 180, 20, "Patologia embarazo:",
                false);
        fila_x += label_patologiaEmbarazo.getWidth();
        Panel.add(label_patologiaEmbarazo);

        final JComboBox<String> combo_patologiaEmbarazo = new JComboBox<String>(new String[] { "Si", "No" });
        combo_patologiaEmbarazo.setBounds(fila_x + 5, 500, 40, 20);
        fila_x += combo_patologiaEmbarazo.getWidth();
        Panel.add(combo_patologiaEmbarazo);

        final JLabel label_Hrs_fuera_de_casa = Elementos.crearJLabel(fila_x + 30, 500, 160, 20, "Hrs fuera de casa:",
                false);
        fila_x += label_Hrs_fuera_de_casa.getWidth();
        Panel.add(label_Hrs_fuera_de_casa);

        final JTextField texto_Hrs_fuera_de_casa = Elementos.crearJTextField(fila_x + 5, 500, 50, 20, "", true);
        fila_x += texto_Hrs_fuera_de_casa.getWidth();
        Panel.add(texto_Hrs_fuera_de_casa);

        final JLabel label_MadreFamilia = Elementos.crearJLabel(fila_x + 40, 500, 80, 20, "Madre:", false);
        fila_x += label_MadreFamilia.getWidth();
        Panel.add(label_MadreFamilia);

        final JComboBox<String> combo_MadreFamilia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_MadreFamilia.setBounds(fila_x + 25, 500, 40, 20);
        fila_x += combo_MadreFamilia.getWidth();
        Panel.add(combo_MadreFamilia);

        fila_x = 36;
        final JLabel label_patologiaParto = Elementos.crearJLabel(fila_x, 530, 180, 20, "Patologia parto:", false);
        fila_x += label_patologiaParto.getWidth();
        Panel.add(label_patologiaParto);

        final JComboBox<String> combo_patologiaParto = new JComboBox<String>(new String[] { "Si", "No" });
        combo_patologiaParto.setBounds(fila_x + 5, 530, 40, 20);
        fila_x += combo_patologiaParto.getWidth();
        Panel.add(combo_patologiaParto);

        final JLabel label_PadreFamilia = Elementos.crearJLabel(fila_x + 250, 530, 80, 20, "Padre:", false);
        fila_x += label_PadreFamilia.getWidth();
        Panel.add(label_PadreFamilia);

        final JComboBox<String> combo_PadreFamilia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_PadreFamilia.setBounds(fila_x + 225, 530, 40, 20);
        fila_x += combo_PadreFamilia.getWidth();
        Panel.add(combo_PadreFamilia);

        fila_x = 36;
        final JLabel label_patologiaPuerperio = Elementos.crearJLabel(fila_x, 560, 180, 20, "Patologia puerperio:",
                false);
        fila_x += label_patologiaPuerperio.getWidth();
        Panel.add(label_patologiaPuerperio);

        final JComboBox<String> combo_patologiaPuerperio = new JComboBox<String>(new String[] { "Si", "No" });
        combo_patologiaPuerperio.setBounds(fila_x + 5, 560, 40, 20);
        fila_x += combo_patologiaPuerperio.getWidth();
        Panel.add(combo_patologiaPuerperio);

        final JLabel label_HermanoFamilia = Elementos.crearJLabel(fila_x + 250, 560, 80, 20, "Hermano:", false);
        fila_x += label_HermanoFamilia.getWidth();
        Panel.add(label_HermanoFamilia);

        final JComboBox<String> combo_HermanoFamilia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_HermanoFamilia.setBounds(fila_x + 245, 560, 40, 20);
        fila_x += combo_HermanoFamilia.getWidth();
        Panel.add(combo_HermanoFamilia);

        fila_x = 36;
        final JLabel texto_NConsultasPrenatales = Elementos.crearJLabel(fila_x, 590, 180, 20,
                "N~ Consultas prenatales:", false);
        fila_x += texto_NConsultasPrenatales.getWidth();
        Panel.add(texto_NConsultasPrenatales);

        final JComboBox<String> combo_NConsultasPrenatales = new JComboBox<String>(new String[] { "Si", "No" });
        combo_NConsultasPrenatales.setBounds(fila_x + 5, 590, 40, 20);
        fila_x += combo_NConsultasPrenatales.getWidth();
        Panel.add(combo_NConsultasPrenatales);

        final JLabel label_OtrosFamilia = Elementos.crearJLabel(fila_x + 250, 590, 80, 20, "Otros:", false);
        fila_x += label_OtrosFamilia.getWidth();
        Panel.add(label_OtrosFamilia);

        final JTextField text_OtrosFamilia = Elementos.crearJTextField(fila_x + 225, 590, 80, 20, "", true);
        fila_x += text_OtrosFamilia.getWidth();
        Panel.add(text_OtrosFamilia);

        // Boton Volver al menu
        final JLabel volverButton = new JLabel("VOLVER AL INICIO", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        volverButton.setBounds(20, 650, 308, 67);
        volverButton.setFont(new Font("Roboto Black", 1, 22));
        volverButton.setForeground(Elementos.colores(Inicio.Tema));
        volverButton.setVerticalTextPosition(SwingConstants.CENTER);
        volverButton.setHorizontalTextPosition(SwingConstants.CENTER);

        volverButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Menu Menu = new Menu();
                Menu.setVisible(true);
                frame.dispose();
            }

            public void mouseEntered(MouseEvent e) {
                volverButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                volverButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(volverButton);

        // Boton Limpiar datos
        final JLabel limpiarD_Button = new JLabel("LIMPIAR CAMPOS", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        limpiarD_Button.setBounds(400, 650, 308, 67);
        limpiarD_Button.setFont(new Font("Roboto Black", 1, 22));
        limpiarD_Button.setForeground(Elementos.colores(Inicio.Tema));
        limpiarD_Button.setVerticalTextPosition(SwingConstants.CENTER);
        limpiarD_Button.setHorizontalTextPosition(SwingConstants.CENTER);

        limpiarD_Button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JTextField[] textFieldNames = {
                        text_apellido_familiar,
                        text_ci_jefe_familia,
                        text_Numero_de_Historia,
                        text_ci,
                        text_apellido,
                        text_nombre,
                        text_Ocupacion,
                        text_anosAprovados,
                        text_LugarNacimento,
                        texto_Estado,
                        texto_Pais,
                        texto_Dirrecion,
                        texto_Telefono,
                        texto_Religion,
                        texto_Establecimiento,
                        texto_Municipio,
                        texto_Parroquia,
                        texto_Comunidad,
                        texto_Madre_N_A,
                        texto_Madre_Ocupacion,
                        texto_Padre_N_A,
                        texto_Padre_Ocupacion,
                        texto_Representante_N,
                        texto_Representante_ci,
                        texto_Representante_Telefono,
                        texto_Hrs_fuera_de_casa
                };
                for (final JTextField JTextField : textFieldNames) {
                    JTextField.setText("");
                    ;
                }
            }

            public void mouseEntered(MouseEvent e) {
                limpiarD_Button.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                limpiarD_Button.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(limpiarD_Button);

        // Boton Siguiente
        final JLabel seguienteButton = new JLabel("Siguiente", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        seguienteButton.setBounds(800, 650, 308, 67);
        seguienteButton.setFont(new Font("Roboto Black", 1, 22));
        seguienteButton.setForeground(Elementos.colores(Inicio.Tema));
        seguienteButton.setVerticalTextPosition(SwingConstants.CENTER);
        seguienteButton.setHorizontalTextPosition(SwingConstants.CENTER);

        seguienteButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JTextField[] textFieldNames = {
                        text_apellido_familiar,
                        text_ci_jefe_familia,
                        text_Numero_de_Historia,
                        text_ci,
                        text_apellido,
                        text_nombre,
                        text_Ocupacion,
                        text_anosAprovados,
                        text_LugarNacimento,
                        texto_Estado,
                        texto_Pais,
                        texto_Dirrecion,
                        texto_Telefono,
                        texto_Religion,
                        texto_Establecimiento,
                        texto_Municipio,
                        texto_Parroquia,
                        texto_Comunidad,
                };
                // int datosfantates = 0;
                for (final JTextField JTextField : textFieldNames) {
                    if (JTextField.getText().isEmpty()) {
                        JTextField.setBackground(Color.red);
                        // datosfantates++;
                    }
                    // if (datosfantates==0) {
                    cardLayout.show(mainPanel, "panel2");
                    // }
                }
            }

            public void mouseEntered(MouseEvent e) {
                seguienteButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                seguienteButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(seguienteButton);

        JTextField[] textFieldNames = {
                text_apellido_familiar,
                text_ci_jefe_familia,
                text_Numero_de_Historia,
                text_ci,
                text_apellido,
                text_nombre,
                text_Ocupacion,
                text_anosAprovados,
                text_LugarNacimento,
                texto_Estado,
                texto_Pais,
                texto_Dirrecion,
                texto_Telefono,
                texto_Religion,
                texto_Establecimiento,
                texto_Municipio,
                texto_Parroquia,
                texto_Comunidad,
                texto_Madre_N_A,
                texto_Madre_Ocupacion,
                texto_Padre_N_A,
                texto_Padre_Ocupacion,
                texto_Representante_N,
                texto_Representante_ci,
                texto_Representante_Telefono,
                texto_Hrs_fuera_de_casa
        };

        for (final JTextField textField : textFieldNames) {
            textField.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    textField.setBackground(Color.white);
                }
            });
        }

        // FONDO
        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon(getClass().getResource("/imagen/Fondos/Claro/NHM_part1-claro.png")));
        fondo.setBounds(0, 0, 1290, 720);
        Panel.add(fondo);
        return Panel;
    }

    private JPanel createPanel2() {
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(0, 0, 1120, 720);
        frame.add(Panel);
        // Cerrar ventana
        final JLabel Cerrar = Elementos.cerrar(1090, 10, 20, 20);
        Panel.add(Cerrar);
        Cerrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.dispose(); // Cierra la ventana
            }

            public void mouseEntered(MouseEvent e) {
                Cerrar.setForeground(Color.RED);
            }

            public void mouseExited(MouseEvent e) {
                Cerrar.setForeground(Color.WHITE);
            }
        });

        // Minimizar
        final JLabel Minimizar = Elementos.minimizar(1070, 10, 20, 20);
        Panel.add(Minimizar);
        Minimizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.setExtendedState(1);
            }

            public void mouseEntered(MouseEvent e) {
                Minimizar.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e) {
                Minimizar.setForeground(Color.white);
            }
        });

        // Edad_Gestacional *edad - Semanas

        int fila_x = 36;
        final JLabel label_Edad_Gestacional = Elementos.crearJLabel(fila_x, 65, 130, 20, "Edad Gestacional:", false);
        fila_x += label_Edad_Gestacional.getWidth();
        Panel.add(label_Edad_Gestacional);

        final JTextField text_Edad_Gestacional = Elementos.crearJTextField(fila_x + 5, 65, 50, 20, "", true);
        fila_x += text_Edad_Gestacional.getWidth();
        Panel.add(text_Edad_Gestacional);

        final JLabel label_sem = Elementos.crearJLabel(fila_x + 10, 65, 80, 20, "Semanas:", false);
        fila_x += label_sem.getWidth();
        Panel.add(label_sem);

        final JTextField text_sem = Elementos.crearJTextField(fila_x + 15, 65, 50, 20, "", true);
        fila_x += text_sem.getWidth();
        Panel.add(text_sem);

        fila_x = 36;
        final JLabel label_Forceps = Elementos.crearJLabel(fila_x, 95, 65, 20, "Forceps:", false);
        fila_x += label_Forceps.getWidth();
        Panel.add(label_Forceps);

        final JComboBox<String> combo_Forceps = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Forceps.setBounds(fila_x + 5, 95, 50, 20);
        fila_x += combo_Forceps.getWidth();
        Panel.add(combo_Forceps);

        final JLabel label_Cesarea = Elementos.crearJLabel(fila_x + 35, 95, 70, 20, "Cesarea:", false);
        fila_x += label_Cesarea.getWidth();
        Panel.add(label_Cesarea);

        final JComboBox<String> combo_Cesarea = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Cesarea.setBounds(fila_x + 35, 95, 50, 20);
        fila_x += combo_Cesarea.getWidth();
        Panel.add(combo_Cesarea);

        final JLabel label_Parto = Elementos.crearJLabel(fila_x + 65, 95, 50, 20, "Parto:", false);
        fila_x += label_Parto.getWidth();
        Panel.add(label_Parto);

        final JComboBox<String> combo_Parto = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Parto.setBounds(fila_x + 65, 95, 50, 20);
        fila_x += combo_Parto.getWidth();
        Panel.add(combo_Parto);

        final JLabel label_Peso_Al_Nacer = Elementos.crearJLabel(fila_x + 95, 95, 105, 20, "Peso al nacer:", false);
        fila_x += label_Peso_Al_Nacer.getWidth();
        Panel.add(label_Peso_Al_Nacer);

        final JTextField text_Peso_al_nacer = Elementos.crearJTextField(fila_x + 95, 95, 50, 20, "", true);
        fila_x += text_Peso_al_nacer.getWidth();
        Panel.add(text_Peso_al_nacer);

        final JLabel label_Peso_Al_Nacer_gr = Elementos.crearJLabel(fila_x + 100, 95, 20, 20, "gr", false);
        fila_x += label_Peso_Al_Nacer_gr.getWidth();
        Panel.add(label_Peso_Al_Nacer_gr);

        final JLabel label_Talla = Elementos.crearJLabel(fila_x + 120, 95, 40, 20, "Talla:", false);
        fila_x += label_Talla.getWidth();
        Panel.add(label_Talla);

        final JTextField text_Talla = Elementos.crearJTextField(fila_x + 120, 95, 50, 20, "", true);
        fila_x += text_Talla.getWidth();
        Panel.add(text_Talla);

        final JLabel label_Talla_cm = Elementos.crearJLabel(fila_x + 125, 95, 20, 20, "cm", false);
        fila_x += label_Talla_cm.getWidth();
        Panel.add(label_Talla_cm);

        final JLabel label_Circunferencia = Elementos.crearJLabel(fila_x + 150, 95, 170, 20, "Circunferencia cefalica:",
                false);
        fila_x += label_Circunferencia.getWidth();
        Panel.add(label_Circunferencia);

        final JTextField text_Circunferencia = Elementos.crearJTextField(fila_x + 150, 95, 50, 20, "", true);
        fila_x += text_Circunferencia.getWidth();
        Panel.add(text_Circunferencia);

        final JLabel label_Circunferencia_cm = Elementos.crearJLabel(fila_x + 155, 95, 20, 20, "cm", false);
        fila_x += label_Circunferencia_cm.getWidth();
        Panel.add(label_Circunferencia_cm);

        // segunda linea
        fila_x = 36;
        final JLabel label_ApgarMin = Elementos.crearJLabel(fila_x, 125, 80, 20,"Apgar min:", false);
        fila_x += label_ApgarMin.getWidth();
        Panel.add(label_ApgarMin);

        final JTextField text_ApgarMin = Elementos.crearJTextField(fila_x + 5, 125,80, 20, "", true);
        fila_x += text_ApgarMin.getWidth();
        Panel.add(text_ApgarMin);

        final JLabel label_Asfixia = Elementos.crearJLabel(fila_x + 35, 125, 60, 25, "Asfixia:",false);
        fila_x += label_Asfixia.getWidth();
        Panel.add(label_Asfixia);
        
        final JComboBox<String> combo_Asfixia = new JComboBox<String>(new String[] {"Si", "No" });
        combo_Asfixia.setBounds(fila_x + 35, 125, 50, 20);
        fila_x += combo_Asfixia.getWidth();
        Panel.add(combo_Asfixia);
        
        final JLabel label_Reanimacion = Elementos.crearJLabel(fila_x+65, 125, 100,20, "Reanimacion:", false);
        fila_x += label_Reanimacion.getWidth();
        Panel.add(label_Reanimacion);
        
        final JComboBox<String> combo_Reanimacion = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Reanimacion.setBounds(fila_x + 65, 125, 50, 20);
        fila_x += combo_Reanimacion.getWidth();
        Panel.add(combo_Reanimacion);

        final JLabel label_PatologiasRN = Elementos.crearJLabel(fila_x+95, 125, 110, 20, "Patologias RN:",false);
        fila_x += label_PatologiasRN.getWidth();
        Panel.add(label_PatologiasRN);
        
        final JComboBox<String> combo_PatologiasRN = new JComboBox<String>(new String[] { "Si", "No" });
        combo_PatologiasRN.setBounds(fila_x + 95, 125, 50, 20);
        fila_x += combo_PatologiasRN.getWidth();
        Panel.add(combo_PatologiasRN);
        
        final JLabel label_EngresoRN = Elementos.crearJLabel(fila_x+125, 125, 100, 20,"Engreso RN:", false);
        fila_x += label_EngresoRN.getWidth();
        Panel.add(label_EngresoRN);
        
        final JComboBox<String> combo_EngresoRN = new JComboBox<String>(new String[] { "Sanos", "Patologico" });
        combo_EngresoRN.setBounds(fila_x + 125,125, 95, 20);
        fila_x += combo_EngresoRN.getWidth();
        Panel.add(combo_EngresoRN);

        // tercera linea
        fila_x = 36;
        final JLabel label_lamtancia = Elementos.crearJLabel(fila_x, 160, 80, 20,"Lamtancia:", false);
        fila_x += label_lamtancia.getWidth();
        Panel.add(label_lamtancia);

        final JLabel label_Exclusiva = Elementos.crearJLabel(fila_x+30, 160, 80, 20,"Exclusiva:", false);
        fila_x += label_Exclusiva.getWidth();
        Panel.add(label_Exclusiva);

        final JTextField text_Exclusiva = Elementos.crearJTextField(fila_x + 30, 160,80, 20, "", true);
        fila_x += text_Exclusiva.getWidth();
        Panel.add(text_Exclusiva);

        final JLabel label_Exclusiva_m = Elementos.crearJLabel(fila_x+35, 160, 20, 20,"m", false);
        fila_x += label_Exclusiva_m.getWidth();
        Panel.add(label_Exclusiva_m);

        final JLabel label_Mixta = Elementos.crearJLabel(fila_x+60, 160, 50, 20,"Mixta:", false);
        fila_x += label_Mixta.getWidth();
        Panel.add(label_Mixta);

        final JTextField text_Mixta = Elementos.crearJTextField(fila_x + 60, 160,80, 20, "", true);
        fila_x += text_Mixta.getWidth();
        Panel.add(text_Mixta);

        final JLabel label_Mixta_m = Elementos.crearJLabel(fila_x+65, 160, 20, 20,"m", false);
        fila_x += label_Mixta_m.getWidth();
        Panel.add(label_Mixta_m);

        final JLabel label_Ablactacion = Elementos.crearJLabel(fila_x+90, 160, 90, 20,"Ablactacion:", false);
        fila_x += label_Ablactacion.getWidth();
        Panel.add(label_Ablactacion);

        final JTextField text_Ablactacion = Elementos.crearJTextField(fila_x + 90, 160,80, 20, "", true);
        fila_x += text_Ablactacion.getWidth();
        Panel.add(text_Ablactacion);

        final JLabel label_Ablactacion_m = Elementos.crearJLabel(fila_x+95, 160, 20, 20,"m", false);
        fila_x += label_Ablactacion_m.getWidth();
        Panel.add(label_Ablactacion_m);
        
        //Primera fila
        fila_x=36; int fila_y =250;

        final JLabel label_Alergia = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Alergia:", false);
        fila_x += label_Alergia.getWidth();
        Panel.add(label_Alergia);
        
        final JComboBox<String> combo_Alergia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Alergia.setBounds(fila_x,fila_y, 50, 20);
        fila_x += combo_Alergia.getWidth();
        Panel.add(combo_Alergia);

        fila_y=290; fila_x=36;
        final JLabel label_Asma = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Asma:", false);
        fila_x += label_Asma.getWidth();
        Panel.add(label_Asma);
        
        final JComboBox<String> combo_Asma = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Asma.setBounds(fila_x,fila_y, 50, 20);
        fila_x += combo_Asma.getWidth();
        Panel.add(combo_Asma);

        fila_y=330; fila_x=36;
        final JLabel label_TBC = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"T.B.C:", false);
        fila_x += label_TBC.getWidth();
        Panel.add(label_TBC);
        
        final JComboBox<String> combo_TBC = new JComboBox<String>(new String[] { "Si", "No" });
        combo_TBC.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_TBC.getWidth();
        Panel.add(combo_TBC);

        fila_y=370; fila_x=36;
        final JLabel label_Cardiopatia = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Cardiopatia:", false);
        fila_x += label_Cardiopatia.getWidth();
        Panel.add(label_Cardiopatia);
        
        final JComboBox<String> combo_Cardiopatia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Cardiopatia.setBounds(fila_x, fila_y, 50, 20);
        fila_x += combo_Cardiopatia.getWidth();
        Panel.add(combo_Cardiopatia);

        fila_y=410; fila_x=36;
        final JLabel label_Hipertension = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Hipertension:", false);
        fila_x += label_Hipertension.getWidth();
        Panel.add(label_Hipertension);
        
        final JComboBox<String> combo_Hipertension = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Hipertension.setBounds(fila_x, fila_y, 50, 20);
        fila_x += combo_Hipertension.getWidth();
        Panel.add(combo_Hipertension);

        fila_y=450; fila_x=36;
        final JLabel label_Varice = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Varice:", false);
        fila_x += label_Varice.getWidth();
        Panel.add(label_Varice);
        
        final JComboBox<String> combo_Varice = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Varice.setBounds(fila_x, fila_y, 50, 20);
        fila_x += combo_Varice.getWidth();
        Panel.add(combo_Varice);

        fila_y=490; fila_x=36; 
        final JLabel label_Desnutricion = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Desnutricion:", false);
        fila_x += label_Desnutricion.getWidth();
        Panel.add(label_Desnutricion);
        
        final JComboBox<String> combo_Desnutricion = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Desnutricion.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Desnutricion.getWidth();
        Panel.add(combo_Desnutricion);

        //Segunda fila
        fila_x=220; fila_y=250;
        final JLabel label_Diabetes = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Diabetes:", false);
        fila_x += label_Diabetes.getWidth();
        Panel.add(label_Diabetes);
        
        final JComboBox<String> combo_Diabetes = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Diabetes.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Diabetes.getWidth();
        Panel.add(combo_Diabetes);

        fila_x=220; fila_y=290;
        final JLabel label_Obesidad = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Obesidad:", false);
        fila_x += label_Obesidad.getWidth();
        Panel.add(label_Obesidad);
        
        final JComboBox<String> combo_Obesidad = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Obesidad.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Obesidad.getWidth();
        Panel.add(combo_Obesidad);

        fila_x=220; fila_y=330;
        final JLabel label_Gastropatia = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Gastropatia:", false);
        fila_x += label_Gastropatia.getWidth();
        Panel.add(label_Gastropatia);
        
        final JComboBox<String> combo_Gastropatia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Gastropatia.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Gastropatia.getWidth();
        Panel.add(combo_Gastropatia);

        fila_x=220; fila_y=370;
        final JLabel label_Neurologiaca = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Neurologiaca:", false);
        fila_x += label_Neurologiaca.getWidth();
        Panel.add(label_Neurologiaca);
        
        final JComboBox<String> combo_Neurologiaca = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Neurologiaca.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Neurologiaca.getWidth();
        Panel.add(combo_Neurologiaca);

        fila_x=220; fila_y=410;
        final JLabel label_Enf_Renal = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Enf.Renal:", false);
        fila_x += label_Enf_Renal.getWidth();
        Panel.add(label_Enf_Renal);
        
        final JComboBox<String> combo_Enf_Renal = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enf_Renal.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Enf_Renal.getWidth();
        Panel.add(combo_Enf_Renal);

        fila_x=220; fila_y=450;
        final JLabel label_Cancer = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Cancer:", false);
        fila_x += label_Cancer.getWidth();
        Panel.add(label_Cancer);
        
        final JComboBox<String> combo_Cancer = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Cancer.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Cancer.getWidth();
        Panel.add(combo_Cancer);

        fila_x=220; fila_y=490;
        final JLabel label_Alcohol = Elementos.crearJLabel(fila_x, fila_y, 100, 20,"Alcohol:", false);
        fila_x += label_Alcohol.getWidth();
        Panel.add(label_Alcohol);
        
        final JComboBox<String> combo_Alcohol = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Alcohol.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Alcohol.getWidth();
        Panel.add(combo_Alcohol);

        //Tercera fila
        fila_x=400; fila_y=250;
        final JLabel label_Drogas = Elementos.crearJLabel(fila_x, fila_y, 70, 20,"Drogas:", false);
        fila_x += label_Drogas.getWidth();
        Panel.add(label_Drogas);
        
        final JComboBox<String> combo_Drogas = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Drogas.setBounds(fila_x,fila_y, 50, 20);
        fila_x += combo_Drogas.getWidth();
        Panel.add(combo_Drogas);

        fila_x=400; fila_y=290;
        final JLabel label_Sifilis = Elementos.crearJLabel(fila_x, fila_y, 70, 20,"Sifilis:", false);
        fila_x += label_Sifilis.getWidth();
        Panel.add(label_Sifilis);
        
        final JComboBox<String> combo_Sifilis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Sifilis.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Sifilis.getWidth();
        Panel.add(combo_Sifilis);

        fila_x=400; fila_y=330;
        final JLabel label_SIDA = Elementos.crearJLabel(fila_x, fila_y, 70, 20,"SIDA:", false);
        fila_x += label_SIDA.getWidth();
        Panel.add(label_SIDA);
        
        final JComboBox<String> combo_SIDA = new JComboBox<String>(new String[] { "Si", "No" });
        combo_SIDA.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_SIDA.getWidth();
        Panel.add(combo_SIDA);

        fila_x=400; fila_y=370;
        final JLabel label_Artritis = Elementos.crearJLabel(fila_x, fila_y, 70, 20,"Artritis:", false);
        fila_x += label_Artritis.getWidth();
        Panel.add(label_Artritis);
        
        final JComboBox<String> combo_Artritis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Artritis.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Artritis.getWidth();
        Panel.add(combo_Artritis);

        fila_x=400; fila_y=410;
        final JLabel label_otros = Elementos.crearJLabel(fila_x, fila_y, 70, 20,"Otros:", false);
        fila_x += label_otros.getWidth();
        Panel.add(label_otros);
        
        final JComboBox<String> combo_otros = new JComboBox<String>(new String[] { "Si", "No" });
        combo_otros.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_otros.getWidth();
        Panel.add(combo_otros);

        //Cuarta fila 
        fila_x=600; fila_y=250;
        final JLabel label_Padre = Elementos.crearJLabel(fila_x, fila_y, 50, 20,"Padre:", false);
        fila_x += label_Padre.getWidth();
        Panel.add(label_Padre);
        
        final JComboBox<String> combo_Padre = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Padre.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Padre.getWidth();
        Panel.add(combo_Padre);

        fila_x=600; fila_y=290;
        final JLabel label_Madre = Elementos.crearJLabel(fila_x, fila_y, 50, 20,"Madre:", false);
        fila_x += label_Madre.getWidth();
        Panel.add(label_Madre);
        
        final JComboBox<String> combo_Madre = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Madre.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Madre.getWidth();
        Panel.add(combo_Madre);

        fila_x=600; fila_y=330;
        final JLabel label_Hermanos = Elementos.crearJLabel(fila_x, fila_y, 110, 20,"Hermanos(as):", false);
        fila_x += label_Hermanos.getWidth();
        Panel.add(label_Hermanos);
        
        final JComboBox<String> combo_Hermanos = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Hermanos.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Hermanos.getWidth();
        Panel.add(combo_Hermanos);

        fila_x=600; fila_y=370;
        final JLabel label_Otros = Elementos.crearJLabel(fila_x, fila_y, 50, 20,"Otros:", false);
        fila_x += label_Otros.getWidth();
        Panel.add(label_Otros);
        
        final JComboBox<String> combo_Otros = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Otros.setBounds(fila_x ,fila_y, 50, 20);
        fila_x += combo_Otros.getWidth();
        Panel.add(combo_Otros);

        

        // Boton Volver
        final JLabel volverButton = new JLabel("VOLVER AL INICIO", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        volverButton.setBounds(20, 650, 308, 67);
        volverButton.setFont(new Font("Roboto Black", 1, 22));
        volverButton.setForeground(Elementos.colores(Inicio.Tema));
        volverButton.setVerticalTextPosition(SwingConstants.CENTER);
        volverButton.setHorizontalTextPosition(SwingConstants.CENTER);
        volverButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(mainPanel, "panel1");
            }

            public void mouseEntered(MouseEvent e) {
                volverButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                volverButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(volverButton);


        // Boton Siguiente
        final JLabel seguienteButton = new JLabel("Siguiente", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        seguienteButton.setBounds(800, 650, 308, 67);
        seguienteButton.setFont(new Font("Roboto Black", 1, 22));
        seguienteButton.setForeground(Elementos.colores(Inicio.Tema));
        seguienteButton.setVerticalTextPosition(SwingConstants.CENTER);
        seguienteButton.setHorizontalTextPosition(SwingConstants.CENTER);

        seguienteButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int datosfantates = 0;
               // if (datosfantates == 0) {
                    cardLayout.show(mainPanel, "panel3");
            //  }
            }

            public void mouseEntered(MouseEvent e) {
                seguienteButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                seguienteButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(seguienteButton);

        // FONDO
        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon(getClass().getResource("/imagen/Fondos/Claro/NHM_part2-claro.png")));
        fondo.setBounds(0, 0, 1290, 720);
        Panel.add(fondo);
        return Panel;
    }

    private JPanel createPanel3() {
        JPanel Panel = new JPanel();
        Panel.setLayout(null);
        Panel.setBounds(0, 0, 1120, 720);
        frame.add(Panel);
        // Cerrar ventana
        final JLabel Cerrar = Elementos.cerrar(1090, 10, 20, 20);
        Panel.add(Cerrar);
        Cerrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.dispose(); // Cierra la ventana
            }

            public void mouseEntered(MouseEvent e) {
                Cerrar.setForeground(Color.RED);
            }

            public void mouseExited(MouseEvent e) {
                Cerrar.setForeground(Color.WHITE);
            }
        });

        // Minimizar
        final JLabel Minimizar = Elementos.minimizar(1070, 10, 20, 20);
        Panel.add(Minimizar);
        Minimizar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                frame.setExtendedState(1);
            }

            public void mouseEntered(MouseEvent e) {
                Minimizar.setForeground(Color.red);
            }

            public void mouseExited(MouseEvent e) {
                Minimizar.setForeground(Color.white);
            }
        });

        //Primera fila - Arriba
        int fila_x = 36;  int fila_y = 50; 
        final JLabel label_Menarquia = Elementos.crearJLabel(fila_x, fila_y, 90, 20, "Menarquia:", false);
        fila_x += label_Menarquia.getWidth();
        Panel.add(label_Menarquia);

        final JTextField texto_Menarquia = Elementos.crearJTextField(fila_x, fila_y, 80, 20, "", true);
        fila_x += texto_Menarquia.getWidth();
        Panel.add(texto_Menarquia);

        fila_x = 36; fila_y = 80; 
        final JLabel label_Cliclo_menstrual = Elementos.crearJLabel(fila_x , fila_y, 120, 20, "Cliclo menstrual:", false);
        fila_x += label_Cliclo_menstrual.getWidth();
        Panel.add(label_Cliclo_menstrual);

        final JTextField texto_Cliclo_menstrual = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_Cliclo_menstrual.getWidth();
        Panel.add(texto_Cliclo_menstrual);

        fila_x = 36; fila_y = 110; 
        final JLabel label_PRSexual = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "P.R. Sexual:", false);
        fila_x += label_PRSexual.getWidth();
        Panel.add(label_PRSexual);

        final JTextField texto_PRSexual = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_PRSexual.getWidth();
        Panel.add(texto_PRSexual);

        fila_x = 36; fila_y = 140; 
        final JLabel label_FrecuenciaRSexual = Elementos.crearJLabel(fila_x, fila_y,160, 20, "Frecuencia R. Sexual:", false);
        fila_x += label_FrecuenciaRSexual.getWidth();
        Panel.add(label_FrecuenciaRSexual);

        final JTextField texto_FrecuenciaRSexual = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_FrecuenciaRSexual.getWidth();
        Panel.add(texto_FrecuenciaRSexual);

        fila_x = 36; fila_y = 170; 
        final JLabel label_N_Parejas = Elementos.crearJLabel(fila_x, fila_y,90, 20, "N~ Parejas:", false);
        fila_x += label_N_Parejas.getWidth();
        Panel.add(label_N_Parejas);

        final JTextField texto_N_Parejas = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_N_Parejas.getWidth();
        Panel.add(texto_N_Parejas);

        fila_x = 36; fila_y = 200; 
        final JLabel label_Dispareunia = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Dispareunia:", false);
        fila_x += label_Dispareunia.getWidth();
        Panel.add(label_Dispareunia);

        final JComboBox<String> combo_Dispareunia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Dispareunia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Dispareunia.getWidth();
        Panel.add(combo_Dispareunia);

        //Segunda fila - Arriba
        fila_x = 280;  fila_y = 50; 
        final JLabel label_Anticoncepcion = Elementos.crearJLabel(fila_x, fila_y, 120, 20, "Anticoncepcion:", false);
        fila_x += label_Anticoncepcion.getWidth();
        Panel.add(label_Anticoncepcion);

        final JComboBox<String> combo_Anticoncepcion = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Anticoncepcion.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Anticoncepcion.getWidth();
        Panel.add(combo_Anticoncepcion);

        fila_x = 280; fila_y = 80; 
        final JComboBox<String> combo_AC_DIU = new JComboBox<String>(new String[] {"ACO","DIU","Otros"});
        combo_AC_DIU.setBounds(fila_x , fila_y, 80, 20);
        fila_x += combo_AC_DIU.getWidth();
        Panel.add(combo_AC_DIU);

        fila_x = 280; fila_y = 110; 
        final JLabel label_Menospausia = Elementos.crearJLabel(fila_x, fila_y, 120, 20, "Menospausia:", false);
        fila_x += label_Menospausia.getWidth();
        Panel.add(label_Menospausia);

        final JComboBox<String> combo_Menospausia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Menospausia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Menospausia.getWidth();
        Panel.add(combo_Menospausia);

        fila_x = 280; fila_y = 140; 
        final JLabel label_Gesta = Elementos.crearJLabel(fila_x, fila_y,120, 20, "Gesta", false);
        fila_x += label_Gesta.getWidth();
        Panel.add(label_Gesta);

        final JComboBox<String> combo_Gesta = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Gesta.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Gesta.getWidth();
        Panel.add(combo_Gesta);

        fila_x = 280; fila_y = 170; 
        final JLabel label_Partos = Elementos.crearJLabel(fila_x, fila_y,120, 20, "Partos:", false);
        fila_x += label_Partos.getWidth();
        Panel.add(label_Partos);

        final JComboBox<String> combo_Partos = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Partos.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Partos.getWidth();
        Panel.add(combo_Partos);

        fila_x = 280; fila_y = 200; 
        final JLabel label_Cesarea = Elementos.crearJLabel(fila_x, fila_y,120, 20, "Cesarea:", false);
        fila_x += label_Cesarea.getWidth();
        Panel.add(label_Cesarea);

        final JComboBox<String> combo_Cesarea = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Cesarea.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Cesarea.getWidth();
        Panel.add(combo_Cesarea);

        // tercera fila - Arriba
        fila_x = 500;  fila_y = 50; 
        final JLabel label_Aborto = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Aborto:", false);
        fila_x += label_Aborto.getWidth();
        Panel.add(label_Aborto);

        final JComboBox<String> combo_Aborto = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Aborto.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Aborto.getWidth();
        Panel.add(combo_Aborto);

        fila_x = 500; fila_y = 80; 
        final JLabel label_E1erparto = Elementos.crearJLabel(fila_x , fila_y, 100, 20, "E 1er parto:", false);
        fila_x += label_E1erparto.getWidth();
        Panel.add(label_E1erparto);

        final JTextField texto_E1erparto = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_E1erparto.getWidth();
        Panel.add(texto_E1erparto);

        fila_x = 500; fila_y = 110; 
        final JLabel label_F_Uparto = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "F.U parto:", false);
        fila_x += label_F_Uparto.getWidth();
        Panel.add(label_F_Uparto);

        final JTextField texto_F_Uparto = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_F_Uparto.getWidth();
        Panel.add(texto_F_Uparto);

        fila_x = 500; fila_y = 140; 
        final JLabel label_F_UAborto = Elementos.crearJLabel(fila_x, fila_y,100, 20, "F.U Aborto:", false);
        fila_x += label_F_UAborto.getWidth();
        Panel.add(label_F_UAborto);

        final JTextField texto_F_UAborto = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_F_UAborto.getWidth();
        Panel.add(texto_F_UAborto);

        //Cuarta fila - Arriba
        fila_x = 700;  fila_y = 50; 
        final JLabel label_Curetaje = Elementos.crearJLabel(fila_x, fila_y, 80, 20, "Curetaje:", false);
        fila_x += label_Curetaje.getWidth();
        Panel.add(label_Curetaje);

        final JTextField combo_Curetaje = Elementos.crearJTextField(fila_x, fila_y, 80, 20, "", true);
        fila_x += combo_Curetaje.getWidth();
        Panel.add(combo_Curetaje);

        fila_x = 700; fila_y = 80; 
        final JLabel label_N_de_Hijos = Elementos.crearJLabel(fila_x , fila_y, 100, 20, "N~ de Hijos:", false);
        fila_x += label_N_de_Hijos.getWidth();
        Panel.add(label_N_de_Hijos);

        final JTextField texto_N_de_Hijos = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_N_de_Hijos.getWidth();
        Panel.add(texto_N_de_Hijos);

        fila_x = 700; fila_y = 110; 
        final JLabel label_Vivos = Elementos.crearJLabel(fila_x, fila_y, 80, 20, "Vivos:", false);
        fila_x += label_Vivos.getWidth();
        Panel.add(label_Vivos);

        final JTextField texto_Vivos = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_Vivos.getWidth();
        Panel.add(texto_Vivos);

        fila_x = 700; fila_y = 140; 
        final JLabel label_Muertos = Elementos.crearJLabel(fila_x, fila_y,80, 20, "Muertos:", false);
        fila_x += label_Muertos.getWidth();
        Panel.add(label_Muertos);

        final JTextField texto_Muertos = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += texto_Muertos.getWidth();
        Panel.add(texto_Muertos);

        fila_x = 700; fila_y = 170; 
        final JLabel label_RN_mayor_peso = Elementos.crearJLabel(fila_x, fila_y,150, 20, "RN de mayor peso:", false);
        fila_x += label_RN_mayor_peso.getWidth();
        Panel.add(label_RN_mayor_peso);

        final JTextField combo_RN_de_mayor_peso = Elementos.crearJTextField(fila_x , fila_y, 50, 20, "", true);
        fila_x += combo_RN_de_mayor_peso.getWidth();
        Panel.add(combo_RN_de_mayor_peso);

        final JLabel combo_RN_de_mayor_peso_gr = Elementos.crearJLabel(fila_x+10, fila_y,20, 20, "gr:", false);
        fila_x += combo_RN_de_mayor_peso_gr.getWidth();
        Panel.add(combo_RN_de_mayor_peso_gr);

        //Primera fila - abajo
        fila_x = 36;  fila_y = 270; 
        final JLabel label_Alergia = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Alergia:", false);
        fila_x += label_Alergia.getWidth();
        Panel.add(label_Alergia);

        final JComboBox<String> combo_Alergia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Alergia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Alergia.getWidth();
        Panel.add(combo_Alergia);

        fila_x = 36; fila_y = 300; 
        final JLabel label_Asma = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Asma:", false);
        fila_x += label_Asma.getWidth();
        Panel.add(label_Asma);

        final JComboBox<String> combo_Asma = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Asma.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Asma.getWidth();
        Panel.add(combo_Asma);

        fila_x = 36; fila_y = 330; 
        final JLabel label_Neumonia = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Neumonia", false);
        fila_x += label_Neumonia.getWidth();
        Panel.add(label_Neumonia);

        final JComboBox<String> combo_Neumonia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Neumonia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Neumonia.getWidth();
        Panel.add(combo_Neumonia);

        fila_x = 36; fila_y = 360; 
        final JLabel label_TBC = Elementos.crearJLabel(fila_x, fila_y,100, 20, "T.B.C:", false);
        fila_x += label_TBC.getWidth();
        Panel.add(label_TBC);

        final JComboBox<String> combo_TBC = new JComboBox<String>(new String[] { "Si", "No" });
        combo_TBC.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_TBC.getWidth();
        Panel.add(combo_TBC);

        fila_x = 36; fila_y = 390; 
        final JLabel label_Cardiopatia = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Cardiopatia:", false);
        fila_x += label_Cardiopatia.getWidth();
        Panel.add(label_Cardiopatia);

        final JComboBox<String> combo_Cardiopatia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Cardiopatia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Cardiopatia.getWidth();
        Panel.add(combo_Cardiopatia);

        fila_x = 36; fila_y = 420; 
        final JLabel label_Hipertension = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Hipertension:", false);
        fila_x += label_Hipertension.getWidth();
        Panel.add(label_Hipertension);

        final JComboBox<String> combo_Hipertension = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Hipertension.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Hipertension.getWidth();
        Panel.add(combo_Hipertension);

        fila_x = 36; fila_y = 450; 
        final JLabel label_Hiperlipidemias = Elementos.crearJLabel(fila_x, fila_y,120, 20, "Hiperlipidemias:", false);
        fila_x += label_Hiperlipidemias.getWidth();
        Panel.add(label_Hiperlipidemias);

        final JComboBox<String> combo_Hiperlipidemias = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Hiperlipidemias.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Hiperlipidemias.getWidth();
        Panel.add(combo_Hiperlipidemias);

        fila_x = 36; fila_y = 480; 
        final JLabel label_Varices = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Varices:", false);
        fila_x += label_Varices.getWidth();
        Panel.add(label_Varices);

        final JComboBox<String> combo_Varices = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Varices.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Varices.getWidth();
        Panel.add(combo_Varices);

        //Segunda fila - abajo
        fila_x = 280;  fila_y = 270; 
        final JLabel label_Hepatopatia = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Hepatopatia:", false);
        fila_x += label_Hepatopatia.getWidth();
        Panel.add(label_Hepatopatia);

        final JComboBox<String> combo_Hepatopatia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Hepatopatia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Hepatopatia.getWidth();
        Panel.add(combo_Hepatopatia);

        fila_x = 280; fila_y = 300; 
        final JLabel label_Desnutricion = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Desnutricion:", false);
        fila_x += label_Desnutricion.getWidth();
        Panel.add(label_Desnutricion);

        final JComboBox<String> combo_Desnutricion = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Desnutricion.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Desnutricion.getWidth();
        Panel.add(combo_Desnutricion);

        fila_x = 280; fila_y = 330; 
        final JLabel label_Diabetes = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Diabetes", false);
        fila_x += label_Diabetes.getWidth();
        Panel.add(label_Diabetes);

        final JComboBox<String> combo_Diabetes = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Diabetes.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Diabetes.getWidth();
        Panel.add(combo_Diabetes);

        fila_x = 280; fila_y = 360; 
        final JLabel label_Obesidad = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Obesidad:", false);
        fila_x += label_Obesidad.getWidth();
        Panel.add(label_Obesidad);

        final JComboBox<String> combo_Obesidad = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Obesidad.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Obesidad.getWidth();
        Panel.add(combo_Obesidad);

        fila_x = 280; fila_y = 390; 
        final JLabel label_Gastroenteritis = Elementos.crearJLabel(fila_x, fila_y,120, 20, "Gastroenteritis:", false);
        fila_x += label_Gastroenteritis.getWidth();
        Panel.add(label_Gastroenteritis);

        final JComboBox<String> combo_Gastroenteritis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Gastroenteritis.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Gastroenteritis.getWidth();
        Panel.add(combo_Gastroenteritis);

        fila_x = 280; fila_y = 420; 
        final JLabel label_Encoprexis = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Encoprexis:", false);
        fila_x += label_Encoprexis.getWidth();
        Panel.add(label_Encoprexis);

        final JComboBox<String> combo_Encoprexis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Encoprexis.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Encoprexis.getWidth();
        Panel.add(combo_Encoprexis);

        fila_x = 280; fila_y = 450; 
        final JLabel label_Enf_Renal = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Enf. Renal:", false);
        fila_x += label_Enf_Renal.getWidth();
        Panel.add(label_Enf_Renal);

        final JComboBox<String> combo_Enf_Renal = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enf_Renal.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Enf_Renal.getWidth();
        Panel.add(combo_Enf_Renal);

        fila_x = 280; fila_y = 480; 
        final JLabel label_Enuresis = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Enuresis:", false);
        fila_x += label_Enuresis.getWidth();
        Panel.add(label_Enuresis);

        final JComboBox<String> combo_Enuresis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enuresis.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Enuresis.getWidth();
        Panel.add(combo_Enuresis);

        //Tercera fila - abajo
        fila_x = 500;  fila_y = 270; 
        final JLabel label_Cancer = Elementos.crearJLabel(fila_x, fila_y, 130, 20, "Cancer:", false);
        fila_x += label_Cancer.getWidth();
        Panel.add(label_Cancer);

        final JComboBox<String> combo_Cancer = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Cancer.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Cancer.getWidth();
        Panel.add(combo_Cancer);

        fila_x = 500; fila_y = 300; 
        final JLabel label_Tromboembolica = Elementos.crearJLabel(fila_x, fila_y, 130, 20, "Tromboembolica:", false);
        fila_x += label_Tromboembolica.getWidth();
        Panel.add(label_Tromboembolica);

        final JComboBox<String> combo_Tromboembolica = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Tromboembolica.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Tromboembolica.getWidth();
        Panel.add(combo_Tromboembolica);

        fila_x = 500; fila_y = 320; 
        final JLabel label_Tumor_Mamario = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Tumor Mamario:", false);
        fila_x += label_Tumor_Mamario.getWidth();
        Panel.add(label_Tumor_Mamario);

        final JComboBox<String> combo_Tumor_Mamario = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Tumor_Mamario.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Tumor_Mamario.getWidth();
        Panel.add(combo_Tumor_Mamario);

        fila_x = 500; fila_y = 360; 
        final JLabel label_Meningitis = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Meningitis:", false);
        fila_x += label_Meningitis.getWidth();
        Panel.add(label_Meningitis);

        final JComboBox<String> combo_Meningitis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Meningitis.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Meningitis.getWidth();
        Panel.add(combo_Meningitis);

        fila_x = 500; fila_y = 390; 
        final JLabel label_TCraneoencefal = Elementos.crearJLabel(fila_x, fila_y,130, 20, "T Craneoencefal:", false);
        fila_x += label_TCraneoencefal.getWidth();
        Panel.add(label_TCraneoencefal);

        final JComboBox<String> combo_TCraneoencefal = new JComboBox<String>(new String[] { "Si", "No" });
        combo_TCraneoencefal.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_TCraneoencefal.getWidth();
        Panel.add(combo_TCraneoencefal);

        fila_x = 500; fila_y = 420; 
        final JLabel label_Enf_Eruptivas = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Enf.Eruptivas:", false);
        fila_x += label_Enf_Eruptivas.getWidth();
        Panel.add(label_Enf_Eruptivas);

        final JComboBox<String> combo_Enf_Eruptivas = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enf_Eruptivas.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Enf_Eruptivas.getWidth();
        Panel.add(combo_Enf_Eruptivas);

        fila_x = 500; fila_y = 450; 
        final JLabel label_Dengue = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Dengue:", false);
        fila_x += label_Dengue.getWidth();
        Panel.add(label_Dengue);

        final JComboBox<String> combo_Dengue = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Dengue.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Dengue.getWidth();
        Panel.add(combo_Dengue);

        fila_x = 500; fila_y = 480; 
        final JLabel label_Hospitalizacion = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Hospitalizacion:", false);
        fila_x += label_Hospitalizacion.getWidth();
        Panel.add(label_Hospitalizacion);

        final JComboBox<String> combo_Hospitalizacion = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Hospitalizacion.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Hospitalizacion.getWidth();
        Panel.add(combo_Hospitalizacion);

        //Cuarta fila - abajo
        fila_x = 750;  fila_y = 270; 
        final JLabel label_Interv_Quirugica = Elementos.crearJLabel(fila_x, fila_y, 130, 20, "Interv. Quirugica:", false);
        fila_x += label_Interv_Quirugica.getWidth();
        Panel.add(label_Interv_Quirugica);

        final JComboBox<String> combo_Interv_Quirugica = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Interv_Quirugica.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Interv_Quirugica.getWidth();
        Panel.add(combo_Interv_Quirugica);

        fila_x = 750; fila_y = 300; 
        final JLabel label_Accidentes = Elementos.crearJLabel(fila_x, fila_y, 130, 20, "Accidentes:", false);
        fila_x += label_Accidentes.getWidth();
        Panel.add(label_Accidentes);

        final JComboBox<String> combo_Accidentes = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Accidentes.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Accidentes.getWidth();
        Panel.add(combo_Accidentes);

        fila_x = 750; fila_y = 330; 
        final JLabel label_Artritis = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Artritis:", false);
        fila_x += label_Artritis.getWidth();
        Panel.add(label_Artritis);

        final JComboBox<String> combo_Artritis = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Artritis.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Artritis.getWidth();
        Panel.add(combo_Artritis);

        fila_x =750; fila_y = 360; 
        final JLabel label_Enf_TS = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Enf. T.S:", false);
        fila_x += label_Enf_TS.getWidth();
        Panel.add(label_Enf_TS);

        final JComboBox<String> combo_Enf_TS = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enf_TS.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Enf_TS.getWidth();
        Panel.add(combo_Enf_TS);

        fila_x = 750; fila_y = 390; 
        final JLabel label_Enf_Infec_Tran = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Enf. Infec y Tran:", false);
        fila_x += label_Enf_Infec_Tran.getWidth();
        Panel.add(label_Enf_Infec_Tran);

        final JComboBox<String> combo_Enf_Infec_Tran = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enf_Infec_Tran.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Enf_Infec_Tran.getWidth();
        Panel.add(combo_Enf_Infec_Tran);

        fila_x = 750; fila_y = 420; 
        final JLabel label_Enf_Laboral = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Enf. Laboral:", false);
        fila_x += label_Enf_Laboral.getWidth();
        Panel.add(label_Enf_Laboral);

        final JComboBox<String> combo_Enf_Laboral = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Enf_Laboral.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Enf_Laboral.getWidth();
        Panel.add(combo_Enf_Laboral);

        fila_x = 750; fila_y = 450; 
        final JLabel label_Otros = Elementos.crearJLabel(fila_x, fila_y,130, 20, "Otros:", false);
        fila_x += label_Otros.getWidth();
        Panel.add(label_Otros);

        final JTextField text_Otros = Elementos.crearJTextField(fila_x , fila_y, 100, 20, "", true);
        fila_x += text_Otros.getWidth();
        Panel.add(text_Otros);

        //Primera fila - Factores de riesgo
        fila_x = 36;  fila_y = 540; 
        final JLabel label_Alcohol = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Alcohol:", false);
        fila_x += label_Alcohol.getWidth();
        Panel.add(label_Alcohol);

        final JComboBox<String> combo_Alcohol = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Alcohol.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Alcohol.getWidth();
        Panel.add(combo_Alcohol);

        fila_x = 36; fila_y = 570; 
        final JLabel label_Drogas = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Drogas:", false);
        fila_x += label_Drogas.getWidth();
        Panel.add(label_Drogas);

        final JComboBox<String> combo_Drogas = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Drogas.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Drogas.getWidth();
        Panel.add(combo_Drogas);

        fila_x = 36; fila_y = 600; 
        final JLabel label_Insecticidas = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Insecticidas:", false);
        fila_x += label_Insecticidas.getWidth();
        Panel.add(label_Insecticidas);

        final JComboBox<String> combo_Insecticidas = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Insecticidas.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Insecticidas.getWidth();
        Panel.add(combo_Insecticidas);

        fila_x = 36; fila_y = 630; 
        final JLabel label_Deoirtes = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Deoirtes:", false);
        fila_x += label_Deoirtes.getWidth();
        Panel.add(label_Deoirtes);

        final JComboBox<String> combo_Deoirtes = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Deoirtes.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Deoirtes.getWidth();
        Panel.add(combo_Deoirtes);

        //segunda fila - Factores de riesgo
        fila_x = 280;  fila_y = 540; 
        final JLabel label_Sedentarismo = Elementos.crearJLabel(fila_x, fila_y, 120, 20, "Sedentarismo:", false);
        fila_x += label_Sedentarismo.getWidth();
        Panel.add(label_Sedentarismo);

        final JComboBox<String> combo_Sedentarismo = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Sedentarismo.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Sedentarismo.getWidth();
        Panel.add(combo_Sedentarismo);

        fila_x = 280; fila_y = 570; 
        final JLabel label_Sueno = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Sueño:", false);
        fila_x += label_Sueno.getWidth();
        Panel.add(label_Sueno);

        final JComboBox<String> combo_Sueno = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Sueno.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Sueno.getWidth();
        Panel.add(combo_Sueno);

        fila_x = 280; fila_y = 600; 
        final JLabel label_ChuparDedo = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Chupar Dedo:", false);
        fila_x += label_ChuparDedo.getWidth();
        Panel.add(label_ChuparDedo);

        final JComboBox<String> combo_ChuparDedo = new JComboBox<String>(new String[] { "Si", "No" });
        combo_ChuparDedo.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_ChuparDedo.getWidth();
        Panel.add(combo_ChuparDedo);

        fila_x = 280; fila_y = 630; 
        final JLabel label_Onicofagia = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Onicofagia:", false);
        fila_x += label_Onicofagia.getWidth();
        Panel.add(label_Onicofagia);

        final JComboBox<String> combo_Onicofagia = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Onicofagia.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Onicofagia.getWidth();
        Panel.add(combo_Onicofagia);

        //Tercera fila - Factores de riesgo
        fila_x = 500;  fila_y = 540; 
        final JLabel label_Micciones = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Micciones:", false);
        fila_x += label_Micciones.getWidth();
        Panel.add(label_Micciones);

        final JComboBox<String> combo_Micciones = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Micciones.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Micciones.getWidth();
        Panel.add(combo_Micciones);

        fila_x = 500; fila_y = 570; 
        final JLabel label_Evacuaciones = Elementos.crearJLabel(fila_x, fila_y, 120, 20, "Evacuaciones:", false);
        fila_x += label_Evacuaciones.getWidth();
        Panel.add(label_Evacuaciones);

        final JComboBox<String> combo_Evacuaciones = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Evacuaciones.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Evacuaciones.getWidth();
        Panel.add(combo_Evacuaciones);

        fila_x = 500; fila_y = 600; 
        final JLabel label_Stres = Elementos.crearJLabel(fila_x, fila_y,100, 20, "Stres:", false);
        fila_x += label_Stres.getWidth();
        Panel.add(label_Stres);

        final JComboBox<String> combo_Stres = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Stres.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Stres.getWidth();
        Panel.add(combo_Stres);

        fila_x = 500; fila_y = 630; 
        final JLabel label_Metales_Pensados = Elementos.crearJLabel(fila_x, fila_y,140, 20, "Metales Pensados:", false);
        fila_x += label_Metales_Pensados.getWidth();
        Panel.add(label_Metales_Pensados);

        final JComboBox<String> combo_Metales_Pensados = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Metales_Pensados.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Metales_Pensados.getWidth();
        Panel.add(combo_Metales_Pensados);

        //cuarta fila - Factores de riesgo
        fila_x = 750;  fila_y = 540; 
        final JLabel label_Alimentacion = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Alimentacion:", false);
        fila_x += label_Alimentacion.getWidth();
        Panel.add(label_Alimentacion);

        final JComboBox<String> combo_Alimentacion = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Alimentacion.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Alimentacion.getWidth();
        Panel.add(combo_Alimentacion);

        fila_x = 750; fila_y = 570; 
        final JLabel label_Fuma = Elementos.crearJLabel(fila_x, fila_y, 100, 20, "Fuma:", false);
        fila_x += label_Fuma.getWidth();
        Panel.add(label_Fuma);

        final JComboBox<String> combo_Fuma = new JComboBox<String>(new String[] { "Si", "No" });
        combo_Fuma.setBounds(fila_x , fila_y, 50, 20);
        fila_x += combo_Fuma.getWidth();
        Panel.add(combo_Fuma);

        fila_x = 750; fila_y = 600; 
        final JLabel label_NCigarrillos_diarios = Elementos.crearJLabel(fila_x, fila_y,160, 20, "N~ Cigarrillos diarios:", false);
        fila_x += label_NCigarrillos_diarios.getWidth();
        Panel.add(label_NCigarrillos_diarios);

        final JTextField texto_NCigarrillos_diarios = Elementos.crearJTextField(fila_x , fila_y, 100, 20, "", true);
        fila_x += texto_NCigarrillos_diarios.getWidth();
        Panel.add(texto_NCigarrillos_diarios);


        
        
        
        // Boton Volver 
        final JLabel volverButton = new JLabel("VOLVER AL INICIO", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        volverButton.setBounds(20, 650, 308, 67);
        volverButton.setFont(new Font("Roboto Black", 1, 22));
        volverButton.setForeground(Elementos.colores(Inicio.Tema));
        volverButton.setVerticalTextPosition(SwingConstants.CENTER);
        volverButton.setHorizontalTextPosition(SwingConstants.CENTER);
        volverButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cardLayout.show(mainPanel, "panel2");
            }

            public void mouseEntered(MouseEvent e) {
                volverButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                volverButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(volverButton);

        

        // Boton Siguiente
        final JLabel seguienteButton = new JLabel("Siguiente", Elementos.botonImagen(Inicio.Tema, "pequeno.0"),
                SwingConstants.CENTER);
        seguienteButton.setBounds(800, 650, 308, 67);
        seguienteButton.setFont(new Font("Roboto Black", 1, 22));
        seguienteButton.setForeground(Elementos.colores(Inicio.Tema));
        seguienteButton.setVerticalTextPosition(SwingConstants.CENTER);
        seguienteButton.setHorizontalTextPosition(SwingConstants.CENTER);

        seguienteButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int datosfantates = 0;
                if (datosfantates == 0) {
                }
            }

            public void mouseEntered(MouseEvent e) {
                seguienteButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.1"));
            }

            public void mouseExited(MouseEvent e) {
                seguienteButton.setIcon(Elementos.botonImagen(Inicio.Tema, "pequeno.0"));
            }
        });
        Panel.add(seguienteButton);

        // FONDO
        JLabel fondo = new JLabel();
        fondo.setIcon(new ImageIcon(getClass().getResource("/imagen/Fondos/Claro/NHM_part3-claro.png")));
        fondo.setBounds(0, 0, 1290, 720);
        Panel.add(fondo);
        return Panel;
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación en el subproceso de la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NHM(); // Crear una instancia de la aplicación
            }
        });
    }
}
