package spring.efgdraw.reactboardserver.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import spring.efgdraw.reactboardserver.vo.YoutubeVO;

@Mapper
public interface YoutubeMapper {
	List<YoutubeVO> fetchMovies();
	YoutubeVO fetchMovieByID(Long id);
	void addMovie(YoutubeVO user);
	void removeMovie(Long id);
}
