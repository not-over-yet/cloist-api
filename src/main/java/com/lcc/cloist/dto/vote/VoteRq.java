package com.lcc.cloist.dto.vote;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lcc.cloist.entity.Vote;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "투표 모델")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
public class VoteRq {
    @ApiModelProperty(required = true, value = "모임 번호", position = 0)
    private long gatheringId;

    @ApiModelProperty(required = true, value = "투표 속성", position = 1)
    private Vote.VoteProperty voteProperty;

    @ApiModelProperty(required = true, value = "투표 대상", position = 2)
    private String receivedUserId;

    @ApiModelProperty(required = true, value = "투표 내용", position = 3)
    private boolean isAgreed;
}