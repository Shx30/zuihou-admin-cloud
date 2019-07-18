package com.github.zuihou.authority.service.auth;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zuihou.authority.entity.auth.MicroService;

/**
 * <p>
 * 业务接口
 * 服务表
 * </p>
 *
 * @author zuihou
 * @date 2019-07-03
 */
public interface MicroServiceService extends IService<MicroService> {
    /**
     * 同步
     */
    void sync();

    /**
     * 解析指定服务的uri 接口
     *
     */
    void parseUri();

}
