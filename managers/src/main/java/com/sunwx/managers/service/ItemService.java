package com.sunwx.managers.service;


import com.sunwx.dtscommon.model.EUDataGridResult;
import com.sunwx.dtscommon.model.TaotaoResult;
import com.sunwx.dtscommon.model.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
