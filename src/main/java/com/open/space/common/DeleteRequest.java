package com.open.space.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author whq
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Integer id;

    private static final long serialVersionUID = 1L;
}