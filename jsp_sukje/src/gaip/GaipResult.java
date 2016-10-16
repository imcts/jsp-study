package gaip;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import com.oreilly.servlet.*;
import com.oreilly.servlet.multipart.*;


public class GaipResult {
	HttpServletRequest request;
	ArrayList photo,iryuk;
	int fileChk=1,phoChk=1,iryukChk=1;
	String photoOri="", photoSys="", iryukOri="", iryukSys="";
	String name="", id="", tel="", mail1="", mail2="", job="",pw="",hobbyList="";
	String [] hobby;
	
	public GaipResult(HttpServletRequest request) throws Exception {
		this.request=request;
		this.photo=new ArrayList<>();
		this.iryuk=new ArrayList<>();
		this.input();
		
		this.FileUproad();
		
		
	}

	public void FileUproad() throws Exception{
		String path="C:\\Users\\TaeSan\\Documents\\JspSave\\jsp_sukje\\WebContent\\uproad\\image";
		MultipartRequest mr = new MultipartRequest(
				request,
				path,
				1024 * 1024 * 10, "utf-8", new DefaultFileRenamePolicy());
	//이름, 아이디 비번 텔 잡 이메일 1,2, 
		this.name=mr.getParameter("name");
		this.id=mr.getParameter("id");
		this.pw=mr.getParameter("pw");
		this.tel=mr.getParameter("tel");
		this.mail1=mr.getParameter("mail1");
		this.mail2=mr.getParameter("mail2");
		this.job=mr.getParameter("job");
		if(mr.getParameterValues("hobby")!=null){
			this.hobby=mr.getParameterValues("hobby");
			
			for(int i=0; i<hobby.length; i++){
				if(i!=hobby.length-1){
					this.hobbyList+=hobby[i]+",";
				}else{
					this.hobbyList+=hobby[i];
				}
			}
		}else{
			this.hobbyList="취미없음";
		}

		
		
		if(mr.getOriginalFileName("photo")!=null){//포토의 주소값이 널이 아니라면 실행. 
			this.photoOri=mr.getOriginalFileName("photo");
			this.photoSys=mr.getFilesystemName("photo");
			
			if(!this.photo.contains(photoSys.substring(photoSys.trim().lastIndexOf(".")+1))){
				File photo = new File(path+"\\"+photoSys);
				photo.delete();
				this.phoChk=0;
				this.fileChk=0;
			}
			
		}
		
		if(mr.getOriginalFileName("iryuk")!=null){
			this.iryukOri=mr.getOriginalFileName("iryuk");
			this.iryukSys=mr.getFilesystemName("iryuk");
			
			if(!this.iryuk.contains(iryukSys.substring(iryukSys.trim().lastIndexOf(".")+1)) ){//이력서가 문제면,
				File iryuk = new File(path+"\\"+iryukSys);
				iryuk.delete();
				this.iryukChk=0;
				this.fileChk=0;
			}
		}
		
	}
	


	

	private void input() {
		this.photo.add("jpg");
		this.photo.add("png");
		this.photo.add("gif");
		this.photo.add("bmp");
		
		
		this.iryuk.add("txt");
		this.iryuk.add("hwp");
		this.iryuk.add("exl");
	}

	
	public String getHobbyList() {
		return hobbyList;
	}
	
	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

	public String getMail1() {
		return mail1;
	}

	public String getMail2() {
		return mail2;
	}

	public String getJob() {
		return job;
	}

	public String[] getHobby() {
		return hobby;
	}

	
	public int getFileChk() {
		return fileChk;
	}
	
	public String getPhotoOri() {
		return photoOri;
	}

	public String getPhotoSys() {
		return photoSys;
	}

	public String getIryukOri() {
		return iryukOri;
	}

	public String getIryukSys() {
		return iryukSys;
	}

	
	
}
