package org.dsdaaa.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T>{
    /**
     * @Author DSD
     * @Create 4:58
     */
    private Integer code;//存状态码
    private String message;//返回的字符串信息
    private T data;//返回的数据

}
