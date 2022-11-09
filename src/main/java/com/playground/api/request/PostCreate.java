package com.playground.api.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PostCreate {

    @NotBlank(message = "제목은 필수 값입니다.")
    private String title;
    @NotBlank(message = "내용은 필수 값입니다.")
    private String content;
}
