package cn.soopy.echo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageVO {
    private Long id;

    private Long userId;

    private String content;

    private LocalDateTime createTime;
}
