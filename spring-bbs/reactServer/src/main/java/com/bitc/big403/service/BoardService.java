package com.bitc.big403.service;

import java.util.List;

import com.bitc.big403.dto.BoardDto;

public interface BoardService {
	
	// 전체글 목록 확인
	List<BoardDto> selectBoardList() throws Exception;
	// 상세글 확인
	BoardDto selectBoardDetail(int boardNo) throws Exception;
	// 글쓰기
	void insertBoard(BoardDto board) throws Exception;
	// 글 수정
	void updateBoard(BoardDto board) throws Exception;
	// 글 삭제
	void deleteBoard(int boardNo) throws Exception;
}
