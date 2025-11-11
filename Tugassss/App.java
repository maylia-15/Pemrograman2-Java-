package Tugassss;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Scanner input;
    private ArrayList<Student> students;

    public App() {
        students = new ArrayList<>();
        input = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = input.nextInt();
            input.nextLine();
            handleChoice(choice);
        }
    }

    private void showMenu() {
        System.out.println("=== Perhitungan UKT ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan UKT");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Masukan Nama Mahasiswa: ");
                String name = input.nextLine();

                System.out.print("Masukan NIM Mahasiswa: ");
                int id = input.nextInt();

                System.out.print("Masukan Jumlah SKS: ");
                int totalSKS = input.nextInt();

                Student student = new RegularStudent(name, id, totalSKS);
                students.add(student);
                System.out.println("Data berhasil ditambahkan!\n");
                break;

            case 2:
                if (students.isEmpty()) {
                    System.out.println("Belum ada data mahasiswa\n");
                } else {
                    System.out.println("---- Daftar Mahasiswa ----");
                    for (Student s : students) {
                        s.showInfo();
                        System.out.println("--------------------------");
                    }
                }
                break;

            case 0:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;

            default:
                System.out.println("Pilihan Tidak Valid");
        }
    }
}
