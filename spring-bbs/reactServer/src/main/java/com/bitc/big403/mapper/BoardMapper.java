package com.bitc.big403.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bitc.big403.dto.BoardDto;

@Mapper
public interface BoardMapper {

	List<BoardDto> selectBoardList() throws Exception;

	BoardDto selectBoardDetail(@Param("boardNo") int boardNo);

	void insertBoard(BoardDto board) throws Exception;

	void updateBoard(BoardDto board) throws Exception;

	void deleteBoard(@Param("boardNo") int boardNo) throws Exception;

	void updateHitCount(@Param("boardNo") int boardNo) throws Exception;

}
