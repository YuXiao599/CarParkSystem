package com.arthur.service;


import com.arthur.domain.Services;

import java.util.List;

public interface AddValueService {
    /** 查找增值服务 */
    List<Services> listAll();

    /** 添加增值服务 */
    Integer insert(Services service);

    /** 根据id删除增值服务 */
    Integer deleteById(Integer serviceid);

    /** 更新增值服务 */
    Integer update(Services service);

    /** 根据name查找增值服务 */
    List<Services> findByName(String servicename);
}
