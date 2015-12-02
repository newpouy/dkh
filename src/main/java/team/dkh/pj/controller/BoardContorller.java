package team.dkh.pj.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import team.dkh.pj.domain.BoardVo;
import team.dkh.pj.service.BoardService;

@Controller
public class BoardContorller {
		
		private Logger logger = LoggerFactory.getLogger(BoardContorller.class);
		@Autowired
		BoardService boardService;
		
		@RequestMapping(value="/boardList", method=RequestMethod.GET)
		public String getBoardList(Model model) {
			 List<Map<String, Object>> boardList = boardService.getBoardList();
			System.out.println("sysout");
			logger.debug("boardList size: "+String.valueOf(boardList.size()));
			model.addAttribute("boardList", boardList);
			return "boardList";
		}
		
		@RequestMapping(value="/board/{boardId}", method=RequestMethod.GET)
		public String getBoard(Model model, @PathVariable int boardId) {
			System.out.println("dfafdsfa");
			BoardVo boardVo = boardService.getBoardOne(boardId);
			logger.debug(boardVo.toString());
			return "boardList";
		}
}
