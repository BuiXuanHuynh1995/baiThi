import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanhBa {
    private String soDienThoai;
    private String nhomDanhBa;
    private String hoten;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    Pattern pattern;
    Matcher matcher;
    Scanner scanner;
    public DanhBa() {
    }

    public DanhBa(String soDienThoai, String nhomDanhBa, String hoten, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDienThoai = soDienThoai;
        this.nhomDanhBa = nhomDanhBa;
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
//        String regex ="^[\\w]{10,11}$";
//        pattern=Pattern.compile(regex);
//        matcher=pattern.matcher(soDienThoai);
//        while (!matcher.matches()) {
//            System.out.println("Nhap sai dinh dang!Moi nhap lai:");
//            this.setSoDienThoai(scanner.nextLine());
//        }
        this.soDienThoai = soDienThoai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DanhBa danhBa = (DanhBa) o;
        return soDienThoai.equals(danhBa.soDienThoai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soDienThoai);
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
//            String regex = "[a-zA-Z]+[\\s]*";
//            pattern = Pattern.compile(regex);
//            matcher = pattern.matcher(nhomDanhBa);
//            while (!matcher.matches()) {
//                System.out.println("Nhap sai dinh dang!Moi nhap lai:");
//                setNhomDanhBa(scanner.nextLine());
//            }
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoTen) {
//            String regex ="[a-zA-Z]+[\\s]*";
//            pattern=Pattern.compile(regex);
//            matcher=pattern.matcher(hoTen);
//            while (!matcher.matches()) {
//                System.out.println("Nhap sai dinh dang!Moi nhap lai:");
//                this.setHoten(scanner.nextLine());
//            }
        this.hoten = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
//        String regex ="[a-zA-Z]{2,10}";
//        pattern=Pattern.compile(regex);
//        matcher=pattern.matcher(gioiTinh);
//        while (!matcher.matches()) {
//            System.out.println("Nhap sai dinh dang!Moi nhap lai:");
//            setGioiTinh(scanner.nextLine());
//        }
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
//        String regex ="[0-9]{4}\\-[0-9]{2}\\-[0-9]{2}";
//        pattern=Pattern.compile(regex);
//        matcher=pattern.matcher(ngaySinh);
//        while (!matcher.matches()) {
//            System.out.println("Nhap sai dinh dang!Moi nhap lai:");
//            setNgaySinh(scanner.nextLine());
//        }
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
//        String regex ="[a-zA-Z]+[0-9]*@[a-zA-Z]+.[a-zA-Z]+";
//        pattern=Pattern.compile(regex);
//        matcher=pattern.matcher(email);
//        while (!matcher.matches()) {
//            System.out.println("Nhap sai dinh dang!Moi nhap lai:");
//            this.setEmail(scanner.nextLine());
//        }
        this.email = email;
    }

    public void hienThi(){
        System.out.printf("%-15s%-15s%-20s%-15s%-30s%-15s%-30s\n",soDienThoai,nhomDanhBa,hoten,gioiTinh,diaChi,ngaySinh,email);
    }
}