package Day5;

public class SinhVienKhoaNgoaiNgu extends SinhVien{
	public String course;
	
	@Override
	public void inThongTin() {
		// TODO Auto-generated method stub
		System.out.format("%10s %10s %10s %10s %10s\n", "ID", "Name", "DOB", "Gender", "Course");
		System.out.format("%10d %10s %10s %10s %10s\n", id, name, DOB, gender, course);
	}
}
