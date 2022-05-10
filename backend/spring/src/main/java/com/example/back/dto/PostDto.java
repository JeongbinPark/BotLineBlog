package com.example.back.dto;

import com.example.back.model.post.PostInformation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class PostDto {


    @Getter
    @Setter
    @NoArgsConstructor
    public static class postInformationDto{

        String title;
        String contents;

        public postInformationDto(String contents, String title){
            this.contents = contents;
            this.title = title;
        }
    }


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    //@ApiModel
    public static class CreatePostDto{

        //@ApiModelProperty(value="포스트 제목")
        String title;

        //@ApiModelProperty(value="포스트 내용")
        String contents;

        //@ApiModelProperty(value="포스트 내용")
        String displayLevel;

        //@ApiModelProperty(value="포스트 가격")
        int price;

        //@ApiModelProperty(value="발행자 닉네임")
        String nickname;

        //@ApiModelProperty(value="현재 포스트를 생성하려는 유저의 고유 넘버")
        int userId;

        public PostInformation PostInfoToEntity(){
            return PostInformation.builder()
                                .title(this.title)
                                .contents(this.contents)
                                .displayLevel(this.displayLevel)
                                .userId(this.userId)
                                .price(this.price)
                                .build();
        
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    //@ApiModel
    public static class ReadPostDto{

        //@ApiModelProperty(value="현재 포스트를 읽으려는 유저의 고유 넘버")
        int userId;

        //@ApiModelProperty(value="현재 포스트의 고유 번호")
        int postId;
    }

    

    
}
