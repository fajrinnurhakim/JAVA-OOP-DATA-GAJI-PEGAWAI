
package TUGAS;

public abstract class abstnama {
    public abstract void namapegawai ();
    public void namapegawaii (){
        System.out.print("Nama : ");
    }
}

class pegawai1 extends abstnama{
    @Override
    public void namapegawai(){
        System.out.println("Fajrin Nurhakim");
    }
}

class pegawai2 extends abstnama{
    @Override
    public void namapegawai(){
        System.out.println("Linda Ayu Kusumaningrum");
    }
}

class pegawai3 extends abstnama{
    @Override
    public void namapegawai(){
        System.out.println("Renita Fauziah");
    }
}

class pegawai4 extends abstnama{
    @Override
    public void namapegawai(){
        System.out.println("Jovita Vania");
    }
}

class pegawai5 extends abstnama{
    @Override
    public void namapegawai(){
        System.out.println("Asiah Jayanti");
    }
}