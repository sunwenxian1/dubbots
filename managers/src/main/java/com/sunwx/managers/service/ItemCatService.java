package com.sunwx.managers.service;

import com.sunwx.dtscommon.model.EUTreeNode;

import java.util.List;


public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
