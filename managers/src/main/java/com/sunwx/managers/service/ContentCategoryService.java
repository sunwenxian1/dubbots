package com.sunwx.managers.service;

import java.util.List;

import com.sunwx.dtscommon.model.EUTreeNode;
import com.sunwx.dtscommon.model.TaotaoResult;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);
	TaotaoResult insertContentCategory(long parentId, String name);
}
