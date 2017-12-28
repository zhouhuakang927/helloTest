package com.jettech.tmp.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jettech.tmp.dao.SceneDao;
import com.jettech.tmp.model.TapScene;
import com.jettech.tmp.model.User;
/**
 * 
 *注释
* @ClassName: SceneService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author leiduo
* @date 2017年3月31日 下午8:16:04
*
*
 */
@Service
@Transactional
public class SceneService extends BaseService<TapScene> {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(SceneService.class);
	
	@Autowired
	private SceneDao sceneDao;
	
	@PostConstruct
	private void postConstruct() {
		baseDao = sceneDao;
	}

	public TapScene findByName(String name) {
		return sceneDao.findBytapName(name);
	}
	
}
