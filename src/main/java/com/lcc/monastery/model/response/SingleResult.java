package com.lcc.monastery.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SingleResult<T> extends CommonResult {
    private T data;
}
