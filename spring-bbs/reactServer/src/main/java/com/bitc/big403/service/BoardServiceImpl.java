package com.bitc.big403.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.big403.dto.BoardDto;
import com.bitc.big403.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception {
		
		return boardMapper.selectBoardList();
	}

	@Override
	public BoardDto selectBoardDetail(int boardNo) throws Exception {
		// hitCnt 변경
		boardMapper.updateHitCount(boardNo);
		// mapper를 통해서 db에서 가져옴
		return boardMapper.selectBoardDetail(boardNo);
	}

	@Override
	public void insertBoard(BoardDto board) throws Exception {
		
		boardMapper.insertBoard(board);
	}

	@Override
	public void updateBoard(BoardDto board) throws Exception {
		
		boardMapper.updateBoard(board);
		
	}

	@Override
	public void deleteBoard(int boardNo) throws Exception {
		
		boardMapper.deleteBoard(boardNo);
	}


}
