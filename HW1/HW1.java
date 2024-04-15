public class HW1 {
    String name;
    String masv;
    String classs;
    String github;
    public HW1(String name, String masv, String classs, String github){
        this.name = name;
        this.masv = masv;
        this.classs = classs;
        this.github = github;
    }
    public void hienthithongtin(){
        System.out.println(name + "\t" + masv + "\t" + classs + "\t" + github);
    }
}
