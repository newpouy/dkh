package team.dkh.pj.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import team.dkh.pj.dao.BoardDao;
import team.dkh.pj.domain.BoardVo;

@Service
public interface BoardService {
	
	public List<Map<String, Object>> getBoardList();
	public BoardVo getBoardOne(int boardId);
}
