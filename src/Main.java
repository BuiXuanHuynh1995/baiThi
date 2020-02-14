import java.util.Scanner;

public class Main {
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Đọc file.");
        System.out.println("2. Ghi file");
        System.out.println("3. Thêm danh ba");
        System.out.println("4. Hiên thị danh bạ");
        System.out.println("5. Sửa danh bạ");
        System.out.println("6. Xóa danh bạ");
        System.out.println("7. Tìm Danh bạ");
        System.out.println("8. Ấn 8 để thoát");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
        while (true) {
            showMenu();
            System.out.println("Moi nhap lua chon: ");
            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    quanLyDanhBa.docFile();
                    break;
                case 2:
                    quanLyDanhBa.ghiFile();
                    break;
                case 3:
                    quanLyDanhBa.themDanhBa();
                    break;
                case 4:
                    quanLyDanhBa.hienThi();
                    break;
                case 5:
                    quanLyDanhBa.suaDanhBa();
                    break;
                case 6:
                    quanLyDanhBa.xoaDanhBa();
                    break;
                case 7:
                    quanLyDanhBa.timDanhBa();
                    break;
                case 8:
                    System.exit(8);
            }
        }
    }
}
