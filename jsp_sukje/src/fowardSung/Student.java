package fowardSung;

public class Student {
	private String name,gen,grade;
	private int kor,eng,mat,sum,avg,ban,rank=1,haknyun;
	private  String gra[]={"가","양","미","우","수","수"};  
	
	
	public Student(String name, int ban, String gen, int kor, int eng, int mat,int haknyun) {
		this.name=name;
		this.ban=ban;
		this.gen=gen;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.haknyun=haknyun;
		this.cal();
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNum() {
		return haknyun;
	}

	public void setNum(int num) {
		this.haknyun = num;
	}

	public String[] getGra() {
		return gra;
	}

	public void setGra(String[] gra) {
		this.gra = gra;
	}

	private void cal(){
		this.sum=this.kor+eng+mat;
		this.avg=this.sum/3;
		this.grade = gra[avg/10-5 < 0 ? 0 : avg/10-5];
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	

}
