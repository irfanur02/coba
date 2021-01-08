/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Entity.Irfan07156_JurusanEntity;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUIProfileMahasiswa {

    JFrame profileMhs = new JFrame();
    JTextArea areaDataMhs = new JTextArea();
    JButton btnBack;
    JLabel labelNamaMenu;
    int index_mhs;

    public Irfan07156_GUIProfileMahasiswa() {
        profileMhs.setSize(350, 455);
        profileMhs.setLayout(null);
        profileMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        profileMhs.setVisible(true);
        profileMhs.setLocationRelativeTo(null);

        labelNamaMenu = new JLabel("Profile Mahasiswa");
        labelNamaMenu.setBounds(65, 10, 600, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 25));
        profileMhs.add(labelNamaMenu);

        areaDataMhs.setBounds(30, 70, 273, 270);
        profileMhs.add(areaDataMhs);

        btnBack = new JButton("Kembali");
        btnBack.setBounds(210, 360, 95, 30);
        profileMhs.add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                profileMhs.dispose();
                Irfan07156_GUI menuUtama = new Irfan07156_GUI();
            }
        });
        
        areaDataMhs.setText(dataMhs());
    }

    String dataMhs() {
        String text = "Npm = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNpm() + "\n"
                + "Nama = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNama() + "\n"
                + "No Telp = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNo_telp() + "\n"
                + "Tanggal Lahir = " + new SimpleDateFormat("dd-MM yyyy").format(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getTglLahir()) + "\n"
                + "Password = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getPassword() + "\n"
                + "Jurusan = " + Irfan07156_JurusanEntity.jurusan[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()] + "\n";
        return text;
    }

    public void profileMhs(int index_mhs) {
        index_mhs = index_mhs;
    }
}
