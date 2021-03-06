package com.bitc.big403.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bitc.big403.dto.BoardDto;
import com.bitc.big403.service.BoardService;


//@CrossOrigin(origins="http://localhost:3000")
@Controller
public class TestController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/")
	public String index() throws Exception {
		return "index";
	}
	
	// CORS 오류 처리 방법
	// 1. 리액트 package.json 파일에 "proxy" : "서버주소"를 추가하는 방법
	// (위 방식은 가끔 yarn이 시작되지 않는 오류 발생)
	
	// 2. 스프링 서버에서 처리하는 방법
	// 2-1. @CrossOrigin 어노테이션 사용 방식 (컨트롤러 파일에 설정)
	//		- @CrossOrigin(origins="서버주소")
	//		- controller 클래스 어노테이션을 입력하는 방식과 메서드에 어노테이션을 입력하는 방식 두 가지가 있음
	
	// 2-2. WebMvcConfigurer 에서 설정 (파일을 새로 생성 후 추가)
	//		- Spring Framework의 WebMvcConfigurer 인터페이스를 상속받아 addCorsMappings (CorsRegistry registry) 메서드를 오버라이딩하여 사용하는 방식
	//		- WebMvcConfigurer를 상속받는 클래스에 @Configuration 어노테이션 사용
	//		- addMapping("적용할 주소") : 매개변수로 현재 스프링 서버에서 적용될 주소를 입력, 컨트롤러에서 사용자 입력을 받기 위한 주소
	//		- allowedOrigins("접속하는 외부서버주소") : 현재 스프링 서버로 접속할 외부 서버의 주소를 입력
	
	//@CrossOrigin(origins="http://localhost:3000")
	@ResponseBody
	@RequestMapping(value="/ajax/test", method=RequestMethod.GET)
	public Object ajaxTest(@RequestParam("data") String data) {
		System.out.println("서버로 전송된 데이터 : " + data);
		return data;
	}
	
//	@ResponseBody
//	@RequestMapping(value="/ajax/boardList", method=RequestMethod.GET)
//	public Object ajaxBoardList() throws Exception {
//		
//		List<BoardDto> dataList = boardService.selectBoardList();
//		
//		return dataList;
//	}


// 문제 1) BoardService, BoardServiceImpl, BoardMapper, sql-board.xml에 글읽기, 글쓰기, 글수정, 글삭제 기능을 구현하세요

// 필요한 기능
// 전체글 리스트 출력
	
//// 상세글 확인
//	@ResponseBody
//	@RequestMapping(value="/ajax/boardDetail/{boardNo}", method=RequestMethod.GET)
//	public Object ajaxBaordDetail(@PathVariable("boardNo") int boardNo) throws Exception {
//		BoardDto data = boardService.selectBoardDetail(boardNo);
//		
//		return data;
//	}
//
//// 글 쓰기
//	@ResponseBody
//	@RequestMapping(value="ajax/boardWrite", method=RequestMethod.POST)
//	public Object ajaxBoardWrite(BoardDto board) throws Exception {
//		boardService.insertBoard(board);
//		System.out.println(board);
//		return "success";
//	}
//	
// 글 수정
//	@ResponseBody
//	@RequestMapping(value="/ajax/boardUpdate/{boardNo}", method=RequestMethod.PUT)
//	public Object ahaxBoardUpdate(BoardDto board) throws Exception {
//		boardService.updateBoard(board);
//		//System.out.println(board);
//		return "success";
//	}
//	
//// 글 삭제
//	@ResponseBody
//	@RequestMapping(value="/ajax/boardDelete/{boardNo}", method=RequestMethod.DELETE)
//	public Object ajaxBoardDelete(@PathVariable("boardNo") int boardNo) throws Exception {
//		//System.out.println(boardNo);
//		
//		boardService.deleteBoard(boardNo);
//		
//		return "success";
//	}
	
}