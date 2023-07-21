package com.copyslack.copyslack.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Chat {
    private Long id;
    private String name;
    private Long masterId;
    private String photoUrl;
    private String description;
}
