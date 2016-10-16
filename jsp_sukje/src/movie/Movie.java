package movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Movie {
	HashMap map,mainmap,membermap;
	HttpServletRequest request;
	HttpServletResponse response;
	String menuKey="",mainKey="",mainurl="",choicemovie="",id="",pw="";
	Cookie loginCoo;
	

	int adult=0,student=0,kids=0,loginchk=0;
	
	
	


	public Movie(HttpServletRequest request, HttpServletResponse response) {
		this.map = new HashMap<>();
		this.mainmap = new HashMap<>();
		this.membermap = new HashMap<>();
		this.request=request;
		this.response=response;
		
		
		
		this.input();
		this.seting();

		
	}


	
	private void delete() {
		Iterator it = membermap.keySet().iterator();
		
		while(it.hasNext()){
			Cookie cookie = new Cookie((String)it.next(), "");
			cookie.setPath("/");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		
		
		
		
	}


	private void loginchk() {
		
		this.id="";
		if(request.getParameter("id")!=null){
			this.id=request.getParameter("id");
		}
		this.pw="";
		if(request.getParameter("password")!=null){
			this.pw=request.getParameter("password");
		}
		
		
		Iterator it = this.membermap.keySet().iterator();
		
		while(it.hasNext()){
			String id=((String)it.next());
			if(id.equals(this.id)){  
				for(int i=0; i<membermap.size(); i++){
					if(membermap.get(id).equals(this.pw)){ //로그인에 성공하였다면. 메뉴값도 바꿔줘야징 ~ 
						this.loginCoo=new Cookie(this.id,"login");
						this.loginCoo.setPath("/");
						this.response.addCookie(this.loginCoo);
						
					}
				}
			}
		}
		
	Iterator i1 = membermap.keySet().iterator(); 
	
	if(request.getCookies()!=null){
	 br: while(i1.hasNext()){
			Cookie cookie[] = request.getCookies();
			String id = (String)i1.next();
			for(int i=0; i<cookie.length; i++){
				if((cookie[i].getName()).equals(id)){ //쿠키의 네임이 있다면? 그건 로그인 상태인게지.
					this.loginchk=1;
					break br;
				}
			}
		}
	}
		
		if(this.loginchk==1){
			((List)map.get("top")).clear();
			((List)map.get("top")).add(new Menu("movieinfo","영화소개"));
			((List)map.get("top")).add(new Menu("booking","영화예매"));
			((List)map.get("top")).add(new Menu("logout","로그아웃"));
		}else{
			((List)map.get("top")).clear();
			((List)map.get("top")).add(new Menu("movieinfo","영화소개"));
			((List)map.get("top")).add(new Menu("booking","영화예매"));
			((List)map.get("top")).add(new Menu("login","로그인"));
		}
		
	}



	private void seting() {
		
		this.mainurl="inc/main.jsp";
		this.mainKey="romance";
		this.menuKey="movieinfo";
		
		if(request.getParameter("mainkey")!=null){
			this.mainKey=request.getParameter("mainkey");
		}
		
		
		
		if(request.getParameter("menukey")!=null){
			this.menuKey=request.getParameter("menukey");
			if(request.getParameter("menukey").equals("booking")){ //들어온 값이 부킹이었
				this.loginchk();
				if(this.loginchk==0){ //로긴 실패면, 로그인폼으로.넘기고. 
					this.menuKey="login";
					this.mainurl="inc/loginform.jsp";
					this.mainKey=request.getParameter("menukey");
					System.out.println("여기 오냐?");
				}else if(this.loginchk==1){ //로그인에 성공 했다면.
					this.mainurl="inc/booking.jsp";
					this.mainKey=request.getParameter("menukey");
				}
			}
			if(request.getParameter("menukey").equals("login")){
				this.mainurl="inc/loginform.jsp";
				this.mainKey=request.getParameter("menukey");
			}else if(request.getParameter("menukey").equals("logout")){
				this.delete();
				this.mainurl="inc/main.jsp";
				this.mainKey="romance";
				this.menuKey="movieinfo";
			}
		}
		
		this.adult=0;
		if(request.getParameter("adult")!=null){
			this.adult=Integer.parseInt(request.getParameter("adult"));
			this.mainurl="inc/result.jsp";
		}
		
		this.student=0;
		if(request.getParameter("student")!=null){
			this.student=Integer.parseInt(request.getParameter("student"));
			this.mainurl="inc/result.jsp";
		}
		
		this.kids=0;
		if(request.getParameter("kids")!=null){
			this.kids=Integer.parseInt(request.getParameter("kids"));
			this.mainurl="inc/result.jsp";
		}
		
		this.choicemovie="";
		if(request.getParameter("choice")!=null){
			this.choicemovie=request.getParameter("choice");
		}

		if(request.getParameter("student")!=null ||
				request.getParameter("kids")!=null ||
				request.getParameter("choice")!=null){
		
		if(request.getParameter("adult").equals("0") 
				&& request.getParameter("student").equals("0") 
				&& request.getParameter("kids").equals("0")){
			this.mainurl="inc/booking.jsp";
			this.mainKey=request.getParameter("menukey");
		}
		}
		
		this.loginchk();
		
	}

	private void input() {
		
		this.membermap.put("aaa", "111");
		this.membermap.put("bbb", "222");
		this.membermap.put("ccc", "333");
		this.membermap.put("ddd", "444");
		this.membermap.put("eee", "555");
		
		///////////////////////////////////////////////////////////
		
		this.map.put("top", new ArrayList<>());
		((List)map.get("top")).add(new Menu("movieinfo","영화소개"));
		((List)map.get("top")).add(new Menu("booking","영화예매"));
		((List)map.get("top")).add(new Menu("login","로그인"));
	
		
		this.map.put("movieinfo", new ArrayList<>());
		((List)map.get("movieinfo")).add(new Menu("romance","로맨스"));
		((List)map.get("movieinfo")).add(new Menu("action","액션"));
	
		
		this.map.put("booking", new ArrayList());
		((List)map.get("booking")).add(new Menu("booking","예매 하기"));
		
		
		this.map.put("login", new ArrayList());
		((List)map.get("login")).add(new Menu("login","로그인"));
		
		
		
		/////////////////////////////////////////////////////////////////
		
	
		
		
		this.mainmap.put("romance", new ArrayList<>());
		
		((List)mainmap.get("romance")).add(new Menu("kiss50","첫키스만 50번째"));
		((List)mainmap.get("romance")).add(new Menu("girlman","그여자 작사 그남자 작곡"));
		((List)mainmap.get("romance")).add(new Menu("laboom","라붐"));
		
		
		this.mainmap.put("kiss50", new ArrayList<>());
		((List)mainmap.get("kiss50")).add(new Menu("romance","<img src='../image/kiss50.jpg'  width='100%' height='20%'><br>"
				+ "<줄거리><br>그녀에겐 첫 키스, 나는 벌써 50번째! 제발 진도 좀 나갑시다~! 낮엔 수족관의 동물을, 밤엔 하와이를 찾은 여자관광객을 돌보는(?) 매력적인 수의사 헨리(아담 샌들러). "
				+ "진실한 사랑은 자신의 인생에 방해만 된다고 굳게 믿고 있던 그에게 일생일대의 사건이 발생했다. 바로 우연히 만난 루시(드류 배리모어)와 한눈에 사랑에 빠진 것! "
				+ "헨리는 노련한 작업 솜씨를 발휘, 그녀와의 첫 데이트 약속을 받아내는데 성공한다. 하지만 데이트 첫날, 그녀를 만나 반갑게 인사를 건넨 헨리는 오히려 파렴치한으로 몰리고, "
				+ "가만히 보니 그녀는 어제 일은 커녕 그를 기억조차 못하는 눈치! 세상에나... 알고 보니 루시는 1년전 교통사고 이후 사고 당일로 기억이 멈춰버린 단기 기억상실증 환자."
				+ "  둘의 사랑은 매일 매일 반복되지만, 다음날이면 그가 누구인지조차 기억하지 못하는 루시의 사랑 유통기한은 딱! 하루 뿐이다. "
				+ "이제 하루 하루 뿐일지라도 그녀의 완벽한 연인이 되기로 결심한 헨리는 매번 새로운 그녀와의 첫데이트를 위해 갖가지 기상천외한(?) 작업을 시도하는데..."));
		
		this.mainmap.put("girlman", new ArrayList<>());
		((List)mainmap.get("girlman")).add(new Menu("romance","<img src='../image/girlman.jpg'  width='100%' height='20%'><br>"
				+ "<줄거리><br>80년대 최고 인기를 누리던 왕년의 팝스타 알렉스(휴 그랜트). 이제는 퇴물 취급을 받는 그에게 어느 날 재기의 기회가 찾아온다. 브리트니보다 인기 많은 최고의 스타 가수 코라 콜만으로부터 듀엣 제안을 받은 것! 단 조건이 있으니 둘이 함께 부를 노래를 알렉스가 만들어야 한다는 것이다. "
				+ "하지만 작곡에서 손 뗀지 이미 오래인데다 작사라곤 해본 적도 없는 알렉스는 굴러들어온 기회를 놓칠 지경이다.  그런데 마침 알렉스 앞에 자신의 집 화초를 가꿔주는 수다쟁이 아가씨 소피(드류 베리모어)가 구세주처럼 등장한다. 전에는 시끄럽기만 하던 말소리가 하나 같이 주옥 같은 노랫말! "
				+ "알렉스는 작사에 남다른 재능을 가진 소피에게 동업을 제안하고. 왠지 인생 최고의 히트송을 만들 수 있을 것 같은데…"));
		
		this.mainmap.put("laboom", new ArrayList<>());
		((List)mainmap.get("laboom")).add(new Menu("romance","<img src='../image/laboom.jpg'  width='100%' height='20%'><br>"
				+ "<줄거리><br>13살 소녀, 낭만의 도시 파리에 오다!  파리로 전학 온 첫 날, 13살 소녀 빅(소피 마르소 분)은 새로운 친구들을 사귀며 즐거운 학교생활을 시작한다. "
				+ "이제 막 이성에 눈을 뜨기 시작한 소녀들. 잘생긴 학교 선생님부터 학교 인기짱 남학생까지 그들의 이야기만으로도 시간가는 줄을 모른다. 13살 소녀, 첫사랑을 만나다!"
				+ " 어느 날 친구들의 초대로 가게 된 파티에서 잘생긴 친구 마티유(알렉산드르 스텔링 분)를 만나게 된다. 첫눈에 반한 그녀. 마티유는 디스코에 빠져있는 친구들 틈에서 빅에게 헤드폰을 씌워주며 둘만의 로맨틱한 시간을 만든다."
				+ "  13살 그녀, 사랑이 어렵다! 사랑이 어려운 13살 소녀 빅, 그녀는 고민 끝에 친구처럼 지내는 할머니 푸펫트(故 데니즈 그레이 분)에게 사실을 고백하고 연애코치를 받는다. "
				+ "첫사랑 그와의 짜릿한 밤을 위해 할머니와 작전을 짜고 드디어 감행하기에 이르는 데… "
				+ " 빛나고 아름다웠던 시절, 모든 것이 서툴지만 행복했던 이들의 사랑 이야기가 지금 시작된다."));

		
		///////////////////////////////////////////////////////////////////////////////
		
		this.mainmap.put("action", new ArrayList<>());
		((List)mainmap.get("action")).add(new Menu("diehard","다이하드"));
		((List)mainmap.get("action")).add(new Menu("myungryang","명량"));
		((List)mainmap.get("action")).add(new Menu("gundo","군도"));
		
		this.mainmap.put("gundo", new ArrayList<>());
		((List)mainmap.get("gundo")).add(new Menu("action","<img src='../image/gundo.jpg'  width='100%' height='20%'><br><줄거리><br>"
				+ "군도, 백성을 구하라! 양반과 탐관오리들의 착취가 극에 달했던 조선 철종 13년. 힘 없는 백성의 편이 되어 세상을 바로잡고자 하는 의적떼인 군도(群盜), 지리산 추설이 있었다."
				+ "쌍칼 도치 vs 백성의 적 조윤 잦은 자연재해, 기근과 관의 횡포까지 겹쳐 백성들의 삶이 날로 피폐해 져 가는 사이,  나주 대부호의 서자로 조선 최고의 무관 출신인 조윤은 극악한 수법으로 양민들을 수탈,"
				+ " 삼남지방 최고의 대부호로 성장한다. 한편 소, 돼지를 잡아 근근이 살아가던 천한 백정 돌무치는 죽어도 잊지 못할 끔찍한 일을 당한 뒤 군도에 합류. 지리산 추설의 신 거성(新 巨星) 도치로 거듭난다. "
				+ " 뭉치면 백성, 흩어지면 도적!  망할 세상을 뒤집기 위해, 백성이 주인인 새 세상을 향해 도치를 필두로 한 군도는 백성의 적,  조윤과 한 판 승부를 시작하는데..."));
		
		this.mainmap.put("diehard", new ArrayList<>());
		((List)mainmap.get("diehard")).add(new Menu("action","<img src='../image/dyehard.jpg'  width='100%' height='20%'><br><줄거리><br>"
				+ "뉴욕만으로는 너무 좁지! 맥클레인X맥클레인의 국제 테러 진압이 시작됐다! 미국 전체를 누비며 우연찮게 테러를 진압해온 뉴욕 경찰 존 맥클레인. "
				+ "하나뿐인 아들 잭이 러시아에서 사건에 휘말렸다는 소식을 듣고 난생 처음 해외로 날아간다.  하지만 잭을 만나러 가던 중, 눈 앞에서 대형 폭탄 테러가 발생하고, 전쟁터를 방불케 하는 극한 상황 속에 재회한 맥클레인 부자."
				+ " 게다가 아들 잭은 모스크바에서 작전을 수행 중인 CIA 요원임을 알게 된다.  놀라움도 잠시, 도심 곳곳에서는 다시금 무장 테러단의 공격이 이어지고, 고집스럽고 물불 안 가리는 아들로 인해 이번에도 엄청난 사건에 휘말리게"
				+ " 된 존 맥클레인은 마침내 잭과 힘을 합쳐 역대 최악의 테러리스트에 맞서게 되는데…"));
		
		this.mainmap.put("myungryang", new ArrayList<>());
		((List)mainmap.get("myungryang")).add(new Menu("action","<img src='../image/myungryang.jpg'  width='100%' height='20%'><br><줄거리><br>"
				+ "1597년 임진왜란 6년,  오랜 전쟁으로 인해 혼란이 극에 달한 조선.  무서운 속도로 한양으로 북상하는 왜군에 의해 국가존망의 위기에 처하자 누명을 쓰고 파면 당했던 이순신 장군(최민식)이 삼도수군통제사로 재임명된다. "
				+ " 하지만 그에게 남은 건 전의를 상실한 병사와 두려움에 가득 찬 백성, 그리고 12척의 배 뿐.  마지막 희망이었던 거북선마저 불타고 잔혹한 성격과 뛰어난 지략을 지닌 용병 구루지마(류승룡)가 왜군 수장으로 나서자 조선은 더욱 술렁인다. "
				+ " 330척에 달하는 왜군의 배가 속속 집결하고 압도적인 수의 열세에 모두가 패배를 직감하는 순간, 이순신 장군은 단 12척의 배를 이끌고 명량 바다를 향해 나서는데…! 12척의 조선 vs 330척의 왜군 역사를 바꾼 위대한 전쟁이 시작된다!"));
		
		
	}
	
	

	public HashMap getMainmap() {
		return mainmap;
	}


	public String getMenuKey() {
		return menuKey;
	}


	public HashMap getMap() {
		return map;
	}

	public String getMainurl() {
		return mainurl;
	}



	public String getMainKey() {
		return mainKey;
	}



	public String getChoicemovie() {
		return choicemovie;
	}



	public int getAdult() {
		return adult;
	}



	public int getStudent() {
		return student;
	}



	public int getKids() {
		return kids;
	}

	
	public String getId() {
		return id;
	}



}
