package org.ywx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.ywx.common.utils.PageUtils;
import org.ywx.project.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author yewenxue
 * @email yewenxuewy@163.com
 * @date 2022-02-02 09:23:14
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

