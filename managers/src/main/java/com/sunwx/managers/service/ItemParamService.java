package com.sunwx.managers.service;


import com.sunwx.dtscommon.model.TaotaoResult;
import com.sunwx.dtscommon.model.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
