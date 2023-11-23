package com.example.todo.todoapi.dto.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoModifyRequestDTO { // 체크박스 눌렀을때 done의 상태 변경

    @NotBlank
    private String id;
    private boolean done;
    

}
