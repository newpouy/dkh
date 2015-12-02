package team.dkh.pj.dao;

import java.util.List;
import java.util.Map;

import team.dkh.pj.domain.BoardVo;

public interface BoardDao {
	
	public  List<Map<String, Object>> selectBoardList();
	public BoardVo selectBoard(int boardId);
	public BoardVo insertBoard(BoardVo boardVo);
	public BoardVo updateBoard(BoardVo boardVo);
	public BoardVo deleteBoard(int boardId);
	
}
