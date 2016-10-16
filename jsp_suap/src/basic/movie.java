package basic;

import java.util.HashMap;

public class movie {

   
   String movie,msg;
   int cnt;
   
   double [] rate = {1,1.1,2};
   
   String [] arr= {"아 이언 맨이에요9개월 이죠",
         "공병도 받나요?",
         "1+1 행사 중입니다."};
   
   HashMap<String,Integer> map = new HashMap();
   
   public movie(String movie, String cntStr) {
      super();
      
      map.put("iron",0);
      map.put("super",1);
      map.put("mart",2);
      this.movie = movie;
      this.cnt = Integer.parseInt(cntStr);
      
      msg= arr[map.get(movie)];
      cnt = (int)(cnt*rate[map.get(movie)]);
   }
   
   
   public String getMsg() {
      return msg;
   }


   public void setMsg(String msg) {
      this.msg = msg;
   }


   public String getMovie() {
      return movie;
   }
   public void setMovie(String movie) {
      this.movie = movie;
   }
   public int getCnt() {
      return cnt;
   }
   public void setCnt(int cnt) {
      this.cnt = cnt;
   }
   
   
   
   
}