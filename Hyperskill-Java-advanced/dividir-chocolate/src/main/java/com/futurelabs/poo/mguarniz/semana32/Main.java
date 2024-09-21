package com.futurelabs.poo.mguarniz.semana32;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JTextField txtCustomerName = new JTextField(10);
        JTextField txtCustomerLastname = new JTextField(10);
        JTextField txtAge = new JTextField(5);

        JTextField txtDescription = new JTextField(10);
        JTextField txtPrice = new JTextField(5);

        JPanel panelProduct = buildProductPanel(txtDescription, txtPrice);

        JPanel panelClient = buildClientPanel(txtCustomerName, txtCustomerLastname, txtAge);

        int result = JOptionPane.showConfirmDialog(null, panelProduct,
                "Producto:", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            Product product = new Product(txtDescription.getText(), Double.parseDouble(txtPrice.getText()));

            int resultClient = JOptionPane.showConfirmDialog(null, panelClient,
                    "Cliente:", JOptionPane.OK_CANCEL_OPTION);

            Client client = new Client(txtCustomerName.getText(), txtCustomerLastname.getText(), Integer.parseInt(txtAge.getText()));
            if (resultClient == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, product.showInformation()
                        + "\n\n" + client.showInformation());
            }
        }
        System.exit(0);
    }

    private static JPanel buildProductPanel(JTextField txtDescription, JTextField txtPrice) {
        JPanel panelProduct = new JPanel();
        panelProduct.add(Box.createHorizontalStrut(15));
        panelProduct.add(new JLabel("Descripción:"));
        panelProduct.add(txtDescription);
        panelProduct.add(new JLabel("Precio:"));
        panelProduct.add(txtPrice);
        return panelProduct;
    }

    private static JPanel buildClientPanel(JTextField txtCustomerName, JTextField txtCustomerLastname, JTextField txtAge) {
        JPanel panelClient = new JPanel();
        panelClient.add(new JLabel("Nombre:"));
        panelClient.add(txtCustomerName);
        panelClient.add(Box.createHorizontalStrut(15));
        panelClient.add(new JLabel("Apellido:"));
        panelClient.add(txtCustomerLastname);
        panelClient.add(new JLabel("Edad:"));
        panelClient.add(txtAge);
        return panelClient;
    }
}
