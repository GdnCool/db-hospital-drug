package me.zbl.app.dao;

import me.zbl.app.domain.Drug;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface DrugMapper {

  List<Drug> selectOverLowerLimit();

  List<Drug> selectByExpireDate(Date date);

  int increaseAndDecreaseQuantity(Map<String, Object> params);

  int deleteByPrimaryKey(String id);

  int insert(Drug record);

  int insertSelective(Drug record);

  Drug selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(Drug record);

  int updateByPrimaryKey(Drug record);
}