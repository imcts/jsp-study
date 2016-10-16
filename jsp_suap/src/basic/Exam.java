package basic;

public class Exam {
	String name; 
	int kor, eng, mat, sum, avg;
	
	public Exam() {
		
	}
	public Exam(String name, String kor, String eng, String mat) {
		this.name=name;
		this.kor=Integer.parseInt(kor);
		this.eng=Integer.parseInt(eng);
		this.mat=Integer.parseInt(mat);
		this.cal();
	}
	private void cal() {
		this.sum=kor+eng+mat;
		this.avg=sum/3;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
	
	
}
