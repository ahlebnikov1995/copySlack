package com.copyslack.copyslack.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Message {
    private UUID uid;
    private Long chatId;
    private Long authorId;
    private String text;
    private Date createTime;

}
