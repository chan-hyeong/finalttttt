package kosta.finalproject.customer.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	/*
	 * 주석을 존나 달아야자ㅣ 버거킹가고싶다 빨리 새우버거
	 */

	/* 나도 수정함 되겠지 */

	/* 다시해보자 */

	/* 아 준혁이 */
	@Autowired
	private SqlSession sqlsessoin;

	@RequestMapping("/index.do")
	public String index() {
		System.out.println("이것은 lch 브랜치를 이용해서 수정한 파일입니다");
		System.out.println("뭐여 왜 안ㄴ와");

		int i = 100;
		System.out.println("이건 이찬형이 쓴 메시지이다");
		System.out.println("병수가 쓴건 과연 어디에?" + i);

		System.out.println("이건 수정한 내용이다");

		System.out.println("병수가 작업 한 내용 이다 26번줄 ");
		return "customer/index";
	}

	@RequestMapping("/loginform.do")
	public String loginform() {

		return "customer/loginform";
	}

	@RequestMapping("/joinform.do")
	public String joinform() {

		return "customer/joinform";
	}

	@RequestMapping("/main.do")
	public String main() {

		return "customer/main";
	}

	@RequestMapping("/menulist.do")
	public String menulist() {

		return "customer/menulist";
	}

	@RequestMapping("/favorite.do")
	public String favorite() {

		return "customer/favorite";
	}

	@RequestMapping("/history.do")
	public String history() {

		return "customer/history";
	}

	@RequestMapping("/cash.do")
	public String cash() {

		return "customer/cashform";
	}

	@RequestMapping("/orderdetail.do")
	public String orderdetail() {

		return "customer/orderdetail";
	}

	@RequestMapping("/shoppingbag.do")
	public String shoppingbag() {
		System.out.println("BS브랜치에 등록 합니다 마스터 합쳐줘");
		System.out.println("BS수정 2번째 ㅁㅁㅁㅁㅁㅁㅁ");
		String aa = "장준혁";
		
		
		System.out.println("난 로컬 ch에서 작업해서 origin/ch 에 올릴거임 ");
		System.out.println("병수도 bs에서 작ㅇ버해서 origin/bs 에 올릴거임 ");
		System.out.println("그럼 마스터는 둘중 하나를 고를 수 있어");
		System.out.println("어떻게 해야 합칠 수 있을까");

		return "customer/shoppingbag";
	}
}
