package si.fri.rso.samples.quickwheels.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewOrderFrame extends JFrame  implements ActionListener {
    private final ImageIcon logo = new ImageIcon(System.getProperty("user.dir") + "/images/logo.PNG");

    private JMenuBar menuBar;

    private JMenu deliveries, orders;

    private JMenuItem newDelivery, deliveryDetails, newOrder, orderDetails;

    private JComboBox productsList;

    NewOrderFrame() {
        this.setTitle("Quick Wheels - New Order");
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(logo.getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setupMenu();
        this.loadProducts();

        this.add(menuBar);
        this.setJMenuBar(menuBar);
        this.getContentPane().setBackground(new Color(0xfefeda));
        this.setVisible(true);
    }

    private void loadProducts() {

    }

    private void setupMenu() {
        menuBar = new JMenuBar();
        deliveries = new JMenu("Deliveries");
        orders = new JMenu("Orders");
        newDelivery = new JMenuItem("New Delivery");
        deliveryDetails = new JMenuItem("Delivery Details");
        newOrder = new JMenuItem("New Order");
        orderDetails = new JMenuItem("Order Details");

        newDelivery.addActionListener(this);
        deliveryDetails.addActionListener(this);
        newOrder.addActionListener(this);
        orderDetails.addActionListener(this);

        menuBar.add(deliveries);
        menuBar.add(orders);
        deliveries.add(newDelivery);
        deliveries.add(deliveryDetails);
        orders.add(newOrder);
        orders.add(orderDetails);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New Delivery")) {
            new NewDeliveryFrame();
            this.dispose();
        } else if (e.getActionCommand().equals("Delivery Details")) {
            new DeliveryDetailsFrame();
            this.dispose();
        } else if (e.getActionCommand().equals("New Order")) {
            new NewOrderFrame();
            this.dispose();
        } else if (e.getActionCommand().equals("Order Details")) {
            new OrderDetailsFrame();
            this.dispose();
        }
    }
}
