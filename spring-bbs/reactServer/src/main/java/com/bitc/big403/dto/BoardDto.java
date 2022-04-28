package com.bitc.big403.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo;
	private String title;
	private String contents;
	private String createId;
	private String createDate;
	private String updateId;
	private String updateDate;
	private int hitCnt;
}
