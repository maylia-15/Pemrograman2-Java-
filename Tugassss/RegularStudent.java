package Tugassss;

public class RegularStudent extends Student implements Payment {
    private int totalSKS;
    private double totalUKT;

    public RegularStudent(String name, int id, int totalSKS) {
        super(name, id);
        this.totalSKS = totalSKS;
        this.totalUKT = pay(totalSKS); // ✅ hitung langsung di sini
    }

    @Override
    public double pay(int totalSKS) {
        return totalSKS * 250000; // 250 ribu per SKS
    }

    @Override
    public void showInfo() {
        System.out.println("Nama: " + getName());
        System.out.println("NIM: " + getId());
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Total UKT: Rp" + totalUKT);
    }
}
