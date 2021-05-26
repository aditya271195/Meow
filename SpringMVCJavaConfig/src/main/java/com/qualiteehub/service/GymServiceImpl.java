package com.qualiteehub.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qualiteehub.dao.IGymDao;
import com.qualiteehub.entity.Member;
@Service
public class GymServiceImpl implements IGymService {
	
	@Autowired
	private IGymDao gymdao;

	@Override
	public int registerMember(Member member) {
		
		return gymdao.registerMember(member);
	}

}
