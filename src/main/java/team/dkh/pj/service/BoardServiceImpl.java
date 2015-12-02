package team.dkh.pj.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.dkh.pj.dao.BoardDao;
import team.dkh.pj.domain.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	public BoardDao boardDao;
	@Override
	public  List<Map<String, Object>> getBoardList() {
		// TODO Auto-generated method stub
		
		return boardDao.selectBoardList();
	}
	@Override
	public BoardVo getBoardOne(int boardId) {
		// TODO Auto-generated method stub
		return boardDao.selectBoard(boardId);
	}

}
