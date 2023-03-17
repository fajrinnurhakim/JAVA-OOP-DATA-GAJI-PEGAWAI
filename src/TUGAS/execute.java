package TUGAS;

public class execute {

    public static void main(String[] args) {
        encgaji encgajinya = new encgaji();
        encgajinya.setGajinya("Gajinya fajrin adalah : ");
        abstnama abstractnama1 =new pegawai1();
        abstnama abstractnama2 =new pegawai2();
        abstnama abstractnama3 =new pegawai3();
        abstnama abstractnama4 =new pegawai4();
        abstnama abstractnama5 =new pegawai5();
        System.out.println("----------------------------------------");
        System.out.println("--------- DATA GAJI PEGAWAI ------------");
        System.out.println("----------------------------------------");
        ingolA golonganA = new ingolA();
        abstractnama1.namapegawaii(); abstractnama1.namapegawai();
        golonganA.golonganjenis();
        System.out.println(golonganA.jenis + golonganA.golongan);
        System.out.print(encgajinya.getGajinya());
        System.out.println(ovrlgaji.gajibersih1(12000000, 20));
        System.out.println("");
        ingolB golonganB = new ingolB();
        encgajinya.setGajinya("Gajinya linda adalah : ");
        abstractnama2.namapegawaii(); abstractnama2.namapegawai();
        golonganB.golonganjenis();
        System.out.println(golonganB.jenis + golonganB.golongan);
        System.out.print(encgajinya.getGajinya());
        System.out.println(ovrlgaji.gajibersih2(10000000, 15));
        System.out.println("");
        ingolC golonganC = new ingolC();
        abstractnama3.namapegawaii(); abstractnama3.namapegawai();
        golonganC.golonganjenis();
        encgajinya.setGajinya("Gajinya Renita adalah : ");
        System.out.println(golonganC.jenis + golonganC.golongan);
        System.out.print(encgajinya.getGajinya());
        System.out.println(ovrlgaji.gajibersih3(7000000, 12));
        System.out.println("");
        ingolD golonganD = new ingolD();
        abstractnama4.namapegawaii(); abstractnama4.namapegawai();
        encgajinya.setGajinya("Gajinya Jovita adalah : ");
        golonganD.golonganjenis();
        System.out.println(golonganD.jenis + golonganD.golongan);
        System.out.print(encgajinya.getGajinya());
        System.out.println(ovrlgaji.gajibersih4(4000000, 10));
        System.out.println("");
        ingolE golonganE = new ingolE();
        abstractnama5.namapegawaii(); abstractnama5.namapegawai();
        golonganE.golonganjenis();
        encgajinya.setGajinya("Gajinya Asiah adalah : ");
        System.out.println(golonganE.jenis + golonganE.golongan);
        System.out.print(encgajinya.getGajinya());
        System.out.println(ovrlgaji.gajibersih5(2000000, 8));
    }
}
