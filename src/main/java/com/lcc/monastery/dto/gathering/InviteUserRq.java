package com.lcc.monastery.dto.gathering;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "모임 모델")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class InviteUserRq {
    @ApiModelProperty(required = true, value = "사용자 이름", position = 0)
    private String username;
    @ApiModelProperty(required = true, value = "사용자 전화번호", position = 1)
    private String phoneNumber;
}