package com.copyslack.copyslack.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
@Table(name = "messages")
@Entity
public class Message {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID uid;

  @ManyToOne(targetEntity = Chat.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
      fetch = FetchType.EAGER)
  @JoinColumn(name = "chat_id")
  private Chat chat;

  @ManyToOne(targetEntity = User.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
      fetch = FetchType.EAGER)
  @JoinColumn(name = "author_id")
  private User author;

  @Column(nullable = false)
  private String text;

  @Column(nullable = false)
  private Date createTime;
}
