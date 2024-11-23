package bai5sgk;

public class Test {
    public static void main(String[] args) {
        try
        {
        	SinhVien sv=new SinhVien("",7,'6');
            System.out.println(sv.toString());
        }
        catch(Exception e)
        {
        	System.out.println("loi !");
        }
    }
}