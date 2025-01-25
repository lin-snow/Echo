package cn.soopy.echo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemVO {
    private Long userId;

    private String name;

    private String email;

    private Long msgId;

    private String content;

    private LocalDateTime createTime;
}
