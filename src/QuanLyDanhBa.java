import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDanhBa {
    ArrayList<DanhBa> danhBas = new ArrayList<>();
    DanhBa danhBa=new DanhBa();
    Scanner scanner;

    public void docFile(){
        final String tenFile="E:\\codeGym\\baiThi\\src\\contacts.csv";
        BufferedReader bufferedReader=null;
        String line ="";
        String splitBy = ",";
        String[] thongTin;
        try {
            bufferedReader= new BufferedReader(new FileReader(tenFile));
            while ((line=bufferedReader.readLine())!=null){
                thongTin=line.split(splitBy);
                danhBa = new DanhBa(thongTin[0],thongTin[1],thongTin[2],thongTin[3],thongTin[4],thongTin[5],thongTin[6]);
                danhBas.add(danhBa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Doc thanh cong!");
    }

    public void ghiFile(){
        final String tenFile="E:\\codeGym\\baiThi\\src\\newcontacts.csv";
//        System.out.printf("%-15s%-15s%-20s%-15s%-30s%-15s%-30s\n","SDT","TenNhom","HoTen","GioiTinh","DiaChi","NgaySinh","Email");
        try {
            FileWriter fileWriter = new FileWriter(tenFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (DanhBa danhBa : danhBas){
                line = danhBa.getSoDienThoai()+ "," + danhBa.getNhomDanhBa()+","+danhBa.getHoten() + "," + danhBa.getGioiTinh() + "," + danhBa.getDiaChi()+
                        danhBa.getDiaChi()+","+danhBa.getEmail()+ "\n";
                bufferedWriter.write(line);
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ghi thanh cong");
    }

    public void hienThi() {
        if (danhBas.size() == 0) {
            System.out.println("Khong co gi de hien thi");
        } else {
            for (DanhBa danhBa : danhBas) {
                danhBa.hienThi();
            }
        }
    }


    public void themDanhBa() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Moi nhap so dien thoai: ");
        String soDienThoai=scanner.nextLine();

        System.out.println("Moi nhap ten nhom ");
        String tenNhom =scanner.nextLine();

        System.out.println("Moi nhap ho ten: ");
        String hoTen =scanner.nextLine();

        System.out.println("Moi nhap gioi tinh: ");
        String gioiTinh =scanner.nextLine();

        System.out.println("Moi nhap so dia chi: ");
        String diaChi =scanner.nextLine();

        System.out.println("Moi nhap ngay sinh: ");
        String ngaySinh =scanner.nextLine();

        System.out.println("Moi nhap email: ");
        String email =scanner.nextLine();
        danhBa= new DanhBa(soDienThoai,tenNhom,hoTen,gioiTinh,diaChi,ngaySinh,email);
        danhBas.add(danhBa);
        hienThi();
    }


    public void suaDanhBa(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Moi nhap so dien thoai: ");
        String soDienThoai=scanner.nextLine();
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getSoDienThoai().equals(soDienThoai)) {
                System.out.println("Moi nhap so dien thoai: ");
                String soDt = scanner.nextLine();
                danhBas.get(i).setSoDienThoai(soDt);

                System.out.println("Moi nhap ten nhom ");
                String tenNhom = scanner.nextLine();
                danhBas.get(i).setNhomDanhBa(tenNhom);

                System.out.println("Moi nhap ho ten: ");
                String hoTen = scanner.nextLine();
                danhBas.get(i).setHoten(hoTen);

                System.out.println("Moi nhap gioi tinh: ");
                String gioiTinh = scanner.nextLine();
                danhBas.get(i).setGioiTinh(gioiTinh);

                System.out.println("Moi nhap so dia chi: ");
                String diaChi = scanner.nextLine();
                danhBas.get(i).setDiaChi(diaChi);

                System.out.println("Moi nhap ngay sinh: ");
                String ngaySinh = scanner.nextLine();
                danhBas.get(i).setNgaySinh(ngaySinh);

                System.out.println("Moi nhap email: ");
                String email = scanner.nextLine();
                danhBas.get(i).setEmail(email);
                hienThi();
            }
        }
    }

    public void xoaDanhBa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so dien thoai: ");
        String soDienThoai = scanner.nextLine();
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getSoDienThoai().equals(soDienThoai)) {
                danhBas.remove(i);
                hienThi();
            }else{
                System.out.println("Khong tim thay");
            }
        }
    }

    public void timDanhBa() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DanhBa> danhBaCanTim = new ArrayList<>();
        System.out.println("Moi nhap so dien thoai: ");
        String soDienThoai = scanner.nextLine();
        for (int i = 0; i < danhBas.size(); i++) {
            if (danhBas.get(i).getSoDienThoai().equals(soDienThoai)) {
                danhBaCanTim.add(danhBas.get(i));
            }
        }
        if (danhBaCanTim.size()==0){
            System.out.println("Khong tim thay");
        }else {
            for (DanhBa danhBa:danhBaCanTim) {
                danhBa.hienThi();
            }
        }
    }
}