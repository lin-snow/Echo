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
public class UserVO {

    private Long id;

    private String name;

    private String email;

    private LocalDateTime createTime;
}
