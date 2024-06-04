package com.summer.app.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {

	private Long board_num;
	private Long member_id;
	private String board_writer;
	private String board_head;
	private String board_contents;
	private String board_date;
}
