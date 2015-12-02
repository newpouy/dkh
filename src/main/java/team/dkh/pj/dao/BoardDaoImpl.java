package team.dkh.pj.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import team.dkh.pj.controller.BoardContorller;
import team.dkh.pj.domain.BoardVo;

@Repository
public class BoardDaoImpl implements BoardDao {
	private Logger logger = LoggerFactory.getLogger(BoardContorller.class);
	private SqlSession sqlSession;
	
	public void seSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public  List<Map<String, Object>> selectBoardList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("team.dkh.pj.dao.BoardDao.selectBoardList");
	}
	
	@Override
	public BoardVo selectBoard(int boardId) {	
		// TODO Auto-generated method stub
		System.out.println("adafad");
		return sqlSession.selectOne("team.dkh.pj.dao.BoardDao.selectBoard", boardId);
	}

	@Override
	public BoardVo insertBoard(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVo updateBoard(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVo deleteBoard(int boardId) {
		// TODO Auto-generated method stub
		return null;
	}

}
