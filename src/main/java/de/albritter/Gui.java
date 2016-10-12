package de.albritter; /**
 * Created by henrik on 08.10.16.
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Gui extends JFrame {
    private JTextField ip;
    private JTextField brodcast;
    private JTextField netaddr;
    private JTextField netmask;
    private JTextField binip;
    private JTextField binnetmask;
    private JTextField binbrodcast;
    private JTextField binnetaddr;


    public Gui() {
        setSize(new Dimension(320, 210));
        setMinimumSize(new Dimension(300, 200));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{1, 1, 2,1};
        gridBagLayout.rowHeights = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0};
        setLayout(gridBagLayout);

        int posy = 0;
        GridBagConstraints gbcip = new GridBagConstraints();
        gbcip.anchor = GridBagConstraints.WEST;
        gbcip.gridx = 0;
        gbcip.gridy = posy++;
        gbcip.insets = new Insets(0, 0, 5, 5);
        ip = new JTextField("192.168.0.20");
        ip.setColumns(18);
        this.add(ip, gbcip);

        GridBagConstraints gbcnetmask = new GridBagConstraints();
        gbcnetmask.anchor = GridBagConstraints.WEST;
        gbcnetmask.gridx = 0;
        gbcnetmask.gridy = posy++;
        gbcnetmask.insets = new Insets(0, 0, 5, 5);
        netmask = new JTextField("255.255.255.255");
        netmask.setColumns(18);
        this.add(netmask, gbcnetmask);

        GridBagConstraints gbcbrodcast = new GridBagConstraints();
        gbcbrodcast.anchor = GridBagConstraints.WEST;
        gbcbrodcast.gridx = 0;
        gbcbrodcast.gridy = posy++;
        gbcbrodcast.insets = new Insets(0, 0, 5, 5);
        brodcast = new JTextField("192.168.0.255");
        brodcast.setColumns(18);
        this.add(brodcast, gbcbrodcast);

        GridBagConstraints gbcnetaddr = new GridBagConstraints();
        gbcnetaddr.anchor = GridBagConstraints.WEST;
        gbcnetaddr.gridx = 0;
        gbcnetaddr.gridy = posy++;
        gbcnetaddr.insets = new Insets(0, 0, 5, 5);
        netaddr = new JTextField("192.168.0.0");
        netaddr.setColumns(18);
        this.add(netaddr, gbcnetaddr);
//Output section
        GridBagConstraints gbclbloutput = new GridBagConstraints();
        gbclbloutput.anchor = GridBagConstraints.CENTER;
        gbclbloutput.gridx = 0;
        gbclbloutput.gridy = posy++;
        gbclbloutput.gridwidth = 3;
        gbclbloutput.insets = new Insets(10, 10, 10, 10);
        this.add(new JLabel("Ausgabe"), gbclbloutput);

        GridBagConstraints gbcbinip = new GridBagConstraints();
        gbcbinip.anchor = GridBagConstraints.WEST;
        gbcbinip.gridx = 0;
        gbcbinip.gridy = posy++;
        gbcbinip.insets = new Insets(0, 0, 5, 5);
        gbcbinip.gridwidth = 3;
        binip = new JTextField("00000000.00000000.00000000.00000000");
        binip.setEditable(false);
        this.add(binip, gbcbinip);

        GridBagConstraints gbcbinnetmask = new GridBagConstraints();
        gbcbinnetmask.anchor = GridBagConstraints.WEST;
        gbcbinnetmask.gridx = 0;
        gbcbinnetmask.gridy = posy++;
        gbcbinnetmask.insets = new Insets(0, 0, 5, 5);
        gbcbinnetmask.gridwidth = 3;
        binnetmask = new JTextField("00000000.00000000.00000000.00000000");
        binnetmask.setEditable(false);
        System.out.println(binnetmask.getColumns());
        this.add(binnetmask, gbcbinnetmask);

        GridBagConstraints gbcbinbrodcast = new GridBagConstraints();
        gbcbinbrodcast.anchor = GridBagConstraints.WEST;
        gbcbinbrodcast.gridx = 0;
        gbcbinbrodcast.gridy = posy++;
        gbcbinbrodcast.insets = new Insets(0, 0, 5, 5);
        gbcbinbrodcast.gridwidth = 3;
        binbrodcast = new JTextField("00000000.00000000.00000000.00000000");
        binbrodcast.setEditable(false);
        this.add(binbrodcast, gbcbinbrodcast);

        GridBagConstraints gbcbinnetaddr = new GridBagConstraints();
        gbcbinnetaddr.anchor = GridBagConstraints.WEST;
        gbcbinnetaddr.gridx = 0;
        gbcbinnetaddr.gridy = posy++;
        gbcbinnetaddr.insets = new Insets(0, 0, 5, 5);
        gbcbinnetaddr.gridwidth = 3;
        binnetaddr = new JTextField("00000000.00000000.00000000.00000000");
        binnetaddr.setEditable(false);
        this.add(binnetaddr, gbcbinnetaddr);
//Lables
        posy = 0;
        JLabel lblip = new JLabel("Host Adresse");
        GridBagConstraints gbclblip = new GridBagConstraints();
        gbclblip.anchor = GridBagConstraints.WEST;
        gbclblip.gridx = 1;
        gbclblip.gridy = posy++;
        gbclblip.insets = new Insets(0, 0, 5, 5);
        add(lblip, gbclblip);
    }

    public static void main(String[] argv) {
        Gui g = new Gui();
        g.setVisible(true);

    }

}
