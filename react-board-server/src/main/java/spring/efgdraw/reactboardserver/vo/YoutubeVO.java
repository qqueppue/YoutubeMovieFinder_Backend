/***
 * 2020.11.16 유튜브 VO 추가
 * */
package spring.efgdraw.reactboardserver.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class YoutubeVO {
	Long id;
	String video_id_videoId;	//유튜브 플레이 아이디
	String video_snippet_title;
	String video_snippet_description;
	LocalDateTime save_date;
}
