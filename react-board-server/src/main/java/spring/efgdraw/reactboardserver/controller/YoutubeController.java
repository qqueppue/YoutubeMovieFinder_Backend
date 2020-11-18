package spring.efgdraw.reactboardserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.efgdraw.reactboardserver.mapper.YoutubeMapper;
import spring.efgdraw.reactboardserver.vo.YoutubeVO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/youtube")
public class YoutubeController {
	
	@Autowired
	YoutubeMapper mapper;
	
	@GetMapping
	public List<YoutubeVO> fetchMovies(){
		System.out.println(mapper.fetchMovies());
		return mapper.fetchMovies();
	}
	
	@PostMapping
	public void addMovie(@RequestBody YoutubeVO user) {
		mapper.addMovie(user);
		System.out.println("즐겨찾기 데이터 저장");
	}
	
	@DeleteMapping("/{id}")
	public void removeMovie(@PathVariable Long id) {
		System.out.println("삭제 즐겨찾기 아이디 => " + id);
		mapper.removeMovie(id);
		System.out.println("즐겨찾기 삭제!");
	}
	
}
