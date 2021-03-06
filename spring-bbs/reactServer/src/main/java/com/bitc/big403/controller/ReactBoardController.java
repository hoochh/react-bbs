package com.bitc.big403.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitc.big403.dto.BoardDto;
import com.bitc.big403.service.BoardService;

@RestController
public class ReactBoardController {

	@Autowired
	BoardService boardService;
	
	// 글 목록
	@RequestMapping(value="/ajax/boardList", method=RequestMethod.GET)
	public Object ajaxBoardList() throws Exception {
		
		List<BoardDto> dataList = boardService.selectBoardList();
		
		return dataList;
	}
	
	// 상세글 확인
		@RequestMapping(value="/ajax/boardDetail/{boardNo}", method=RequestMethod.GET)
		public Object ajaxBaordDetail(@PathVariable("boardNo") int boardNo) throws Exception {
			BoardDto data = boardService.selectBoardDetail(boardNo);
			//System.out.println(boardNo);
			return data;
		}

	// 글 쓰기
		@RequestMapping(value="ajax/boardWrite", method=RequestMethod.POST)
		public Object ajaxBoardWrite(BoardDto board) throws Exception {
			System.out.println(board);
			boardService.insertBoard(board);

			return "success";
		}
		
	// 글 수정
		@RequestMapping(value="/ajax/boardUpdate/{boardNo}", method=RequestMethod.PUT)
		public Object ahaxBoardUpdate(BoardDto board) throws Exception {
			boardService.updateBoard(board);

			return "success";
		}
		
	// 글 삭제
		@RequestMapping(value="/ajax/boardDelete/{boardNo}", method=RequestMethod.DELETE)
		public Object ajaxBoardDelete(@PathVariable("boardNo") int boardNo) throws Exception {

			boardService.deleteBoard(boardNo);
			
			return "success";
		}
}
